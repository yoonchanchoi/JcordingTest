package com.example.jcordingtest.단계2.할인행사;

import java.util.*;

public class Solution38 {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> hashMap = new HashMap<>();
//        List<String> keyList = new ArrayList<>(hashMap.keySet());
        for(int i=0; i<want.length; i++){
            hashMap.put(want[i],number[i]);
        }
        for(int i=0; i<=discount.length-10;i++){

            for(int j=i; j<i+10;j++){
                answer =j;

                if(hashMap.get(discount[j])!=0){
                    hashMap.put(discount[j], hashMap.get(discount[j]) - 1);
                }else {
                    hashMap.remove(discount[j]);
                }
            }
            if(!hashMap.isEmpty()){
                answer=0;
            }
        }
        return answer;
    }




    public int solution2(String[] want, int[] number, String[] discount) {

        int answer = 0;

        for(int i=0; i<discount.length-9; i++) {
            int cntday = 0;
            for(int j=0; j<want.length; j++) {
                int cnt = 0;
                for(int k=i; k<i+10; k++) {
                    if(discount[k].equals(want[j])) cnt++;
                }
                if(cnt<number[j]) break;
                else cntday++;
            }
            if(cntday == want.length) answer++;
        }

        return answer;
    }

    public int solution3(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int days = 10;

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < want.length; i++){
            map.put(want[i], number[i]);
        }

        for(int i = 0; i < discount.length - days + 1; i++){
            Map<String, Integer> dMap = new HashMap<>();

            for(int j = 0; j < days; j++){
                dMap.put(discount[i + j], dMap.getOrDefault(discount[i + j], 0) + 1);
            }

            Boolean isIdentical = true;

            for(String key : map.keySet()){
                if(map.get(key) != dMap.get(key)){
                    isIdentical = false;
                    break;
                }
            }

            answer += isIdentical ? 1 : 0;
        }

        return answer;
    }





}
