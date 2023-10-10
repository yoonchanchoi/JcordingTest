package com.example.jcordingtest.추억점수;

import android.util.Log;

public class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Log.e("cyc","photo.length--->"+photo.length);
        int[] answer = new int[photo.length];

        for(int i =0; i<photo.length; i++){
                Log.e("cyc","");
                int temp=0;
            for(int j=0; j<photo[i].length;j++){
                for(int k =0; k<name.length;k++){
                    if(name[k].equals(photo[i][j])){
                        temp+=yearning[k];
                    }
                }
                Log.e("cyc",String.format("photo[%d][%d]-->%s",i,j,photo[i][j]));
            }
            answer[i]=temp;
        }


        for(int i = 0 ;i< answer.length;i++){
            Log.e("cyc",String.format("answer[%d]-->%d",i,answer[i]));

        }


        return answer;
    }

    public void main() {
        String[] name ={"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        solution(name, yearning, photo);
    }
}
