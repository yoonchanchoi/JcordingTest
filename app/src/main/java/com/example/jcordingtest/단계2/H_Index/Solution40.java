package com.example.jcordingtest.단계2.H_Index;

import java.util.Arrays;

public class Solution40 {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for(int h=0; h<citations.length;h++){
            int count=0;
            for(int i=0; i<citations.length;i++){
                if(h<=citations[i]){
                    count++;
                }
            }
            if(count==h){
                answer=h;
            }
        }



        return answer;
    }
    public int solution2(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        for(int i = 0; i < citations.length; i++) {
            int h = citations.length - i; // 인용된 논문의 수

            if(citations[i] >= h) {
                answer = h;
                break;
            }
        }

        return answer;
    }
}
