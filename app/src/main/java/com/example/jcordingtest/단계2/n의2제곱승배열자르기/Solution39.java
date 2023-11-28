package com.example.jcordingtest.단계2.n의2제곱승배열자르기;

import java.util.ArrayList;

public class Solution39 {
    public int[] solution(int n, long left, long right) {
        int len = (int) right - (int) left;
        int[] answer = new int[len + 1];

        int[] temp1 = new int[n*n];
        int[][] temp2 = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                temp2[i][j]=Math.max(i,j)+1;
            }
        }

        for(int i=0; i<temp2.length;i++){
            for(int j=0; j<temp2[i].length;j++){
                temp1[temp2[i].length*i+j]=temp2[i][j];
            }
        }

        for(int i=0; i<len+1;i++){
            answer[i]=temp1[(int)left++];
        }


        return answer;
    }

    //정답
    public int[] solution2(int n, long left, long right) {
        int len = (int) right - (int) left;
        int[] answer = new int[len + 1];

        int idx = 0;
        for (long i = left; i <= right; i++) {
            long row = i / n;
            long col = i % n;
            answer[idx++] = Math.max((int)row, (int)col) + 1;
        }

        return answer;
    }
}
