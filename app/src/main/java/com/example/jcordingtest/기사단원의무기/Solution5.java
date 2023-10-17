package com.example.jcordingtest.기사단원의무기;

import android.util.Log;

import java.util.ArrayList;

public class Solution5 {


//    그럼 어떻게 해야 약수 구하는 알고리즘을 최적화할 수 있을까요? 먼저 약수의 특징이 대해서 살펴보면 아래와 같습니다.
//
//    약수는 두 수의 곱이 자기 자신이 되는 것이기 때문에 제곱수를 제외하면 한 쌍으로 갖는다.
//    약수 개수가 홀수개일 경우 약수의 개수는 가운데 수를 기준으로 같은 값을 같는다.
//    약수 개수가 짝수개일 경우 약수의 개수는 서로 대응된다.
//            1로 인해 약수는 크게 제곱수와 제곱수가 아닌 경우로 나뉠 수 있으며, 2,3번으로 인해 중간 지점까지, 즉 위의 코드에서 j의 제곱이 i보다 작거나 같을때까지 탐색한 후 제곱수의 경우 1번만 카운트하고 나머지 수는 2번 카운트하면 됩니다.
//    이 방식을 적용하면 기존에 하나의 약수를 구하는데 O(n)만큼 소요되었다면 (O root(n))만큼 시간 복잡도를 감소시킬 수 있습니다.

    //답 코드
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for(int i=1;i<=number;i++){
            int cnt = 0;
            for(int j=1;j*j<=i;j++){
                if(j*j==i) cnt++;
                else if(i%j==0) cnt+=2;
            }

            if(cnt>limit) cnt = power;
            answer += cnt;
        }

        return answer;
    }


    //내가 풀었던 코드(런타임 오류)
    public int solution2(int number, int limit, int power) {
        int answer = 0;
        ArrayList<Integer> arrayListInt = new ArrayList<>();

        for(int i=1; i<=number; i++){
            int count=0;

            for(int j=1; j<=i; j++){
                if(i % j == 0){
                    count++;
                }
            }
            arrayListInt.add(count);
        }
        for(int i =0; i<arrayListInt.size();i++){
            if(arrayListInt.get(i)>limit){
                answer+=power;
            }else{
                answer+=arrayListInt.get(i);
            }
        }


        return answer;
    }

    //내가 풀었던 코드(런타임 오류)
    public int solution3(int number, int limit, int power) {
        int answer = 0;
        ArrayList<Integer> arrayListInt = new ArrayList<>();

        for(int i=1; i<=number; i++){
            int count=0;

            for(int j=1; j<=i; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count>limit){
                count = power;
            }
            answer +=count;
        }

        return answer;
    }


    public void main() {
        int number = 5;
        int limit = 3;
        int power = 2;
        solution(number,limit,power);
    }
}
