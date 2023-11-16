package com.example.jcordingtest.단계2.숫자표현;

public class Solution24 {

    //다시 생각해볼것

    //1. 반환할 값의 초깃값 1로 설정
    //예시를 보면 자기 자신의 수도 연속된 수로 포함하기에 자신의 수를 미리 더한 상태에서 시작

    //2. for문 n/2만큼 반복
    //예시에서 7 + 8 = 15처럼, 15 절반의 수인 7은 8과 더했을 때 15를 얻을 수 있지만, 8 이상의 수의 연속된 숫자는 15의 수를 넘기에 n/2만큼만 반복했다.


    //3. 더해진 값 저장할 변수와 더해질 변수 선언
    //더해질 값인 i의 초깃값은 k로 잡는다. 처음 수인 1부터 연속된 숫자를 구하고, 다음 반복에선 2부터 연속된 수, ...로 15를 만들 수 있는 수를 구하기에 초깃값을 1부터 시작하였다.


    //4. sum이 n보다 작을 때까지 반복하여 i 더하기
    //연속된 숫자의 합이 15이상이면 조건과 불일치해 15보다 작을 때까지만 반복한다.
    //만약 i가 4이고 sum이 0이라면,

    //5. sum과 i가 같으면 반환값에 1 더함
    //while문 반복을 마쳤을 때 sum이 15이므로 반환할 변수 answer에 1을 더함

    //https://developerm.tistory.com/186
    public int solution(int n) {
        int answer = 1;

        for (int k = 1; k <= n / 2; k++) {
            int sum = 0;
            int i = k;
            while (sum < n) {
                sum += i++;
            }
            if (sum == n)
                answer++;
        }
        return answer;
    }



    //문제를 읽었을때 중요한 포인트가 '연속한 자연수들로 표현 하는 방법' 이 부분이라 생각했습니다.
    // 꼼꼼히 문제를 다시 읽어보다가 이 문장을 보자마자 방법을 생각해냈습니다. 모든 경우의 수를 따져보도록 했습니다(완전탐색).
    // 그래서 더해진 값(sum)과 n의 값이 일치 할 경우 answer값을 증가시켰습니다.

    public int solution2(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = i; j <= n; j++) {
                sum += j;

                if (sum == n) {
                    answer++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }
        }
        return answer;
    }


}
