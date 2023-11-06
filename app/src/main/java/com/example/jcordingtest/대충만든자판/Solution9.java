package com.example.jcordingtest.대충만든자판;

import java.util.HashMap;

public class Solution9 {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character,Integer> keypad = new HashMap<>();

        for(int i=0; i<keymap.length;i++){
            for(int j=0; j<keymap[i].length();j++){
                char cur = keymap[i].charAt(j);
                if(keypad.containsKey(cur)){
                    int idx = keypad.get(cur);
                    keypad.put(cur, Math.min(idx, j+1));
                }else{
                    keypad.put(cur, j+1);
                }
            }
        }
        for(int i=0; i<targets.length;i++){
            boolean check = true;
            int sum =0;
            for(int j= 0; j<targets[i].length();j++){
                if(keypad.containsKey(targets[i].charAt(j))){
                    sum+=keypad.get(targets[i].charAt(j));
                }else{
                    check=false;
                    break;
                }
            }
            answer[i] = check == false? -1 : sum;
        }


        return answer;
    }
}
