package com.example.jcordingtest.명예의전당1;

import android.util.Log;

import java.util.ArrayList;
import java.util.Collections;

public class Solution1 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        ArrayList<Integer> intList = new ArrayList();


        for(int i = 0; i<score.length;i++){
            intList.add(score[i]);
            Collections.sort(intList,Collections.reverseOrder());
            if(intList.size()>k){
                intList.remove(intList.size()-1);
            }
            answer[i] = intList.get(intList.size()-1);
        }

        for(int i = 0 ;i< answer.length;i++){
            Log.e("cyc",String.format("answer[%d]-->%d",i,answer[i]));
        }

        return answer;
    }

    public void main() {
        int k = 3;
        int[] score ={10, 100, 20, 150, 1, 100, 200};
        solution(k,score);
    }
}
