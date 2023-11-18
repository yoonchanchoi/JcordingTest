package com.example.jcordingtest.단계2.카펫;

public class Solution28 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2]; // [가로, 세로]

        for(int i = 1; i <= yellow; i++){
            int yellow_width = Math.max(i, yellow/i);
            int yellow_height = Math.min(i, yellow/i);

            int answer_width = yellow_width + 2;
            int answer_height = yellow_height + 2;

            if((answer_width + answer_height) * 2 - 4 == brown && answer_height * answer_width == brown + yellow ){
                answer[0] = answer_width;
                answer[1] = answer_height;
                break;
            }

        }
        return answer;
    }
}
