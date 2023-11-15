package com.example.jcordingtest.단계2.최솟값만들기;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution21 {


    //한개의 효율성문제에서 걸림.

    public int solution(int[] A, int[] B) {
        int answer = 0;
        //int배열 to Integer배열
        Integer b[] = Arrays.stream(B).boxed().toArray(Integer[]::new);

        Arrays.sort(A);
        Arrays.sort(b, Collections.reverseOrder());

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * b[i];
        }
        return answer;
    }

    //정답 풀이
    public int solution2(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length - 1 - i];
        }

        return answer;
    }

}
