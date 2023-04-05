package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Solution sol = new Solution();
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        int[] answer = sol.solution(name, yearning, photo);

        for (int n : answer) {
            System.out.println("result : "  + n);
        }
    }
}