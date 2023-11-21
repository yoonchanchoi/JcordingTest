package com.example.jcordingtest.단계2.예상대진표;

public class Solution32 {
    public int solution(int n, int a, int b) {

        int answer = 0;
        while(a != b) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            answer++;
        }

        return answer;
    }
}

