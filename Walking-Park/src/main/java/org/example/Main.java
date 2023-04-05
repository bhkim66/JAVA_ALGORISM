package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] park = {"SOO","OOO","OOO"};
        String[] routes = {"E 2","S 2","W 1"};

        int[] result = sol.solution(park, routes);

        System.out.println("result : " + Arrays.toString(result));
        System.out.println("answer : [2,1]");

        String[] park2 = {"SOO","OXX","OOO"};
        String[] routes2 = {"E 2","S 2","W 1"};

        result = sol.solution(park2, routes2);

        System.out.println("result2 : " + Arrays.toString(result));
        System.out.println("answer : [0,1]");

        String[] park3 = {"OSO","OOO","OXO","OOO"};
        String[] routes3 = {"E 2","S 3","W 1"};

        result = sol.solution(park3, routes3);

        System.out.println("result3 : " + Arrays.toString(result));
        System.out.println("answer : [0,0]");
    }
}