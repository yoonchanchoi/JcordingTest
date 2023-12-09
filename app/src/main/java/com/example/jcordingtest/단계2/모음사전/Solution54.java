package com.example.jcordingtest.단계2.모음사전;

import java.util.*;

public class Solution54 {
    static List<String> list;
    static String [] words = {"A", "E", "I", "O", "U"};
    public int solution(String word) {
        int answer = 0;
        list = new ArrayList<>();
        dfs(0,"");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).equals(word)) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    static void dfs(int len, String str ) {
        list.add(str);
        if (len == 5) return;
        for (int i = 0; i < 5; i++) {
            dfs(len + 1,str + words[i]);
        }
    }
}
