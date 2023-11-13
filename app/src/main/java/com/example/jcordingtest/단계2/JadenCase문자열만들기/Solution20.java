package com.example.jcordingtest.단계2.JadenCase문자열만들기;

public class Solution20 {

    //틀린답
//    public String solution(String s) {
//        String answer = "";
//        String[] str = s.split(" ");
//
//        for(int i = 0; i<str.length; i++){
//            if(str[i].length() == 0) {
//                answer += " ";
//                break;
//            }
//            if(str[i].charAt(0)<48 || str[i].charAt(0) > 58){
//                str[i] = str[i].substring(0, 1).toUpperCase() + str[i].substring(1).toLowerCase();
//            }
//            if(i==0){
//                answer+=str[i];
//            }else{
//                answer+=" "+ str[i];
//            }
//        }
//        return answer;
//    }


    //제일좋은 답
    //모두 자르고
    //해당 값이 공백인지 확인해서 플래그로 공백일경우 대문자로 바꾸고 넣기 즉 문자하나하나확인해서 넣기
    public String solution1(String s) {
        String answer = "";
        String[] words = s.toLowerCase().split("");

        boolean flag = true;

        for (String word : words) {
            answer += flag ? word.toUpperCase() : word;
            flag = word.equals(" ") ? true : false;
        }

        return answer;
    }

    //공백기준으로 자르고 첫번째문자를 대문자로 바꾸서 처리 뒤에 문자는 소문자로 처리
    public String solution2(String s) {
        String answer = "";
        String[] sp = s.split(" "); // 공백을 기준으로 문자열 자르기

        // 공백을 기준으로 잘려진 문자열의 수만큼 반복
        for(int i = 0; i < sp.length; i++){
            if(sp[i].length() == 0) answer += " "; // 단어가 공백일 경우 반환값에 공백 더하기
            else{
                answer += sp[i].substring(0, 1).toUpperCase(); // 단어 첫번째 대문자로 변환하여 더하기
                answer += sp[i].substring(1, sp[i].length()).toLowerCase(); // 첫글자를 제외하고 소문자로 변환하여 더하기
                answer += " "; // 띄어쓰기
            }

        }

        //원래 문자열 마지막이 공백일 경우 그대로 answer 반환
        if(s.substring(s.length() -1, s.length()).equals(" ")) return answer;
        //마지막에 공백이 더해져서 그 공백을 제외한 answer값 반환
        return answer.substring(0, answer.length() - 1);
    }
}
