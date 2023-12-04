package com.example.jcordingtest.단계2.전화번호목록;

import java.util.*;

public class Solution49 {

    //처음 오답
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        int tempLen = 0;

        for(int i =0; i<phone_book.length;i++){
            tempLen=phone_book.length;
            for(int j = i; j<phone_book.length;j++){
                boolean tempCheck = false;
                for(int k=0; k<tempLen;k++){
                    if(phone_book[i].charAt(k)!=phone_book[j].charAt(k)){
                        tempCheck=true;
                    }
                }
                if(!tempCheck){
                    answer=false;
                }else{
                    answer=true;
                }
            }
        }
        return answer;
    }



    //정답
    public boolean solution2(String[] phoneBook) {
        // 1. HashMap을 선언한다.
        Map<String, Integer> map = new HashMap<>();

        // 2. 모든 전화번호를 HashMap에 넣는다.
        for (int i = 0; i < phoneBook.length; i++)
            map.put(phoneBook[i], i);

        // 3. 모든 전화번호의 substring이 HashMap에 존재하는지 확인한다.
        for (int i = 0; i < phoneBook.length; i++)
            for (int j = 0; j < phoneBook[i].length(); j++)
                if (map.containsKey(phoneBook[i].substring(0, j)))
                    return false;

        return true;
    }
}
