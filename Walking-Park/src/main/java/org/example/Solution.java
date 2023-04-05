package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] point = {0 ,0};
        ArrayList<int[]> abs = new ArrayList<int[]>();
        char[][] map = new char[park.length][park[0].length()];

        for (int i = 0; i < park.length; i++) {
           for(int j = 0; j < park[i].length(); j++) {
               map[i][j] = park[i].charAt(j);
               if(park[i].charAt(j) == 'S') {
                   point[0] = j;
                   point[1] = i;
               }
               if(park[i].charAt(j) == 'X') {
                   int[] ary = {j,i};
                   abs.add(ary);
               }
           }
        }

        for (String n : routes) {
            String way = n.split(" ")[0];
            int range = Integer.parseInt(n.split(" ")[1]);

            switch (way) {
                case "N" :
                    if(point[1] - range >= 0) {
                         point = returnPoint(range, point, abs, -1, 1);
                    }
                break;
                case "S" :
                    if(point[1] + range < park.length) {
                        point = returnPoint(range, point, abs, 1, 1);
                    }
                break;
                case "W" :
                    if(point[0] - range >= 0) {
                        point = returnPoint(range, point, abs, -1, 0);
                    }
                break;
                case "E" :
                    if(point[0] + range < park[0].length()) {
                         point = returnPoint(range, point, abs, 1, 0);
                    }
                break;
            }
        }
        int i = point[0];
        point[0] = point[1];
        point[1] = i;
        return point;

    }

    public int[] returnPoint(int range, int[] point, ArrayList<int[]> abs, int way, int goXy) {
        int[] origin = point;
        boolean cantGo = true;

        if(abs.size() == 0) {
            point[goXy] += way*range;
        } else {
            for(int i = 0; i < range; i++) {
                for(int j = 0; j < abs.size(); j++) {
                    if(goXy == 0 && point[1] == abs.get(j)[1] && point[0] + (way * (i+1)) == abs.get(j)[0]) {
                       cantGo = !cantGo;
                       break;
                    }
                    if(goXy == 1 && point[1] + (way * (i+1)) == abs.get(j)[1] && point[0] == abs.get(j)[0]) {
                        cantGo = !cantGo;
                       break;
                    }
                }
            }
            if(cantGo) {
                point[goXy] += way*range;
            } else {
                point = origin;
            }
        }
        return point;
    }

}
