package org.example;

import java.util.HashMap;

public class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        HashMap<String, Integer> map = new HashMap<>();
        int i = 0;

        for (String n: name) {
            map.put(n, yearning[i]);
            i++;
        }


        for(int j = 0; j < photo.length; j++) {
            int score = 0;
            for (String n : photo[j]) {
                if(map.get(n) != null && map.get(n) != 0) {
                    score += map.get(n);
                }
            }
            answer[j] = score;
        }
        return answer;
    }
}
