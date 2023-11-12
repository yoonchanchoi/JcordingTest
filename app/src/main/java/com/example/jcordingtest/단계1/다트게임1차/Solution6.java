package com.example.jcordingtest.단계1.다트게임1차;

public class Solution6 {









//
//    public int solution(String dartResult) {
//        int answer = 0;
//        int[] dart = new int[3];
//
//        int n=0,idx=0;
//        String numstr="";
//
//        for(int i=0;i<dartResult.length();i++){
//            char c = dartResult.charAt(i);
//
//            //숫자일 때
//            if(c>='0'&&c<='9'){
//                numstr+=String.valueOf(c);
//
//            }
//            //보너스일 때
//            else if(c=='S'||c=='D'||c=='T'){
//                n=Integer.parseInt(numstr);
//                if(c=='S'){
//                    dart[idx++]=(int)Math.pow(n,1);
//                }
//                else if(c=='D'){
//                    dart[idx++]=(int)Math.pow(n,2);
//                }
//                else{
//                    dart[idx++]=(int)Math.pow(n,3);
//                }
//                numstr="";
//            }
//            //옵션일 때
//            else {
//                if(c=='*'){
//                    dart[idx-1]*=2;
//                    if(idx-2>=0) dart[idx-2]*=2;
//                }
//                else {
//                    dart[idx-1]*=(-1);
//                }
//            }
//        }
//
//        answer=dart[0]+dart[1]+dart[2];
//
//        return answer;
//    }

//    public int solution(String dartResult) {
//        int answer = 0;
//
//        String[] dart = dartResult.split("");
//        int[] score = new int[3]; // 점수
//
//        int index = -1; // score index
//        for(int i=0; i<dart.length; i++) {
//            if(dart[i].matches("[0-9]")) {
//                index++;
//                score[index] = Integer.parseInt(dart[i]);
//                if(dart[i+1].matches("[0-9]")) {
//                    score[index] *= 10;
//                    i++;
//                }
//            }
//
//            switch(dart[i]) {
//                case "D":
//                    score[index] = (int)Math.pow(score[index], 2);
//                    break;
//                case "T" :
//                    score[index] = (int)Math.pow(score[index], 3);
//                    break;
//                case "*" :
//                    score[index] *= 2;
//                    if(index - 1 >= 0) score[index-1] *= 2;
//                    break;
//                case "#" :
//                    score[index] *= -1;
//            }
//
//        }
//
//        for(int s : score) {
//            answer += s;
//        }
//
//        return answer;
//    }
}
