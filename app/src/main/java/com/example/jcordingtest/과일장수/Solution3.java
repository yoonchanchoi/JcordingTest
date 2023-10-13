package com.example.jcordingtest.과일장수;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution3 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        for(int i = score.length; i >= m; i -= m){
            answer += m * score[i - m];
        }
        return answer;
    }

}
