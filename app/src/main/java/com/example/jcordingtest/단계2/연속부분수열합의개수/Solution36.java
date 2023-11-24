package com.example.jcordingtest.단계2.연속부분수열합의개수;

import java.util.*;


public class Solution36 {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        int len = elements.length;

        for (int size = 1; size <= len; size++) {
            for (int i = 0; i < len; i++) {
                int sum = 0;
                for (int j = i; j < i + size; j++) {
                    sum += elements[j % len];
                }
                set.add(sum);
            }
        }
        return set.size();
    }
}
