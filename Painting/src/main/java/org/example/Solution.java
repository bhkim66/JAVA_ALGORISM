package org.example;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int point  = section[0];

        for(int i = 0; i < section.length; i++) {
            if(section[i] > point - 1) {
                point = (m + point);
                answer++;
            }
        }
        return answer;
    }
}
