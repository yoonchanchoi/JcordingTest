package com.example.jcordingtest.키패드누르기;

public class Solution12 {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        //*은 10, 0은 11, #은 12로 놓고
        //패드 전체가 위 아래로는 3차이 좌 우로는 1차이가 나기 때문에
        //Math.abs(tmp-left)/3+Math.abs(tmp-left)%3 로 거리를 구함

        int left =10;
        int right =12;

        for(int tmp: numbers){
            if(tmp==1||tmp==4||tmp==7){
                answer+="L";
                left = tmp;
            }else if(tmp==3||tmp==6||tmp==9){
                answer+="R";
                right = tmp;
            }else {
                if(tmp==0) tmp=11;
                int leftdist = Math.abs(tmp-left)/3+Math.abs(tmp-left)%3;
                int rightdist = Math.abs(tmp-right)/3+Math.abs(tmp-right)%3;

                if(leftdist<rightdist){
                    answer+="L";
                    left = tmp;
                }else if(leftdist>rightdist){
                    answer+="R";
                    right = tmp;
                }else{
                    if(hand.equals("left")){
                        answer+="L";
                        left = tmp;
                    }else{
                        answer+="R";
                        right = tmp;
                    }
                }
            }
        }
        return answer;
    }
}
