package org.example;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int n = 8;
        int m = 4;
        int[] selection = {2,3,6};

        int result = sol.solution(n, m, selection);
        System.out.println("result : "  + result);
    }
}