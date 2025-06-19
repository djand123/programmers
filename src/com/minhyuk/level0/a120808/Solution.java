package com.minhyuk.level0.a120808;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    //분수의 덧셈 각 분모의 값 비교
    // a ,b if문으로 비교
    public int[] solution(int number1, int denom1, int number2, int denom2) {
        int sumnumber = 0;
        int sumdenom = 0;
        boolean done = false;
        List<Integer> answer = new ArrayList<>();

        // 분모 비교하면서 처리
        if (denom1 > denom2) {
            for (int i = 1; i <= denom1; i++) {
                if (denom2 * i == denom1) {
                    sumnumber = number1 + (number2 * i);
                    sumdenom = denom1;
                    done = true;
                    break;
                }
            }
        } else if (denom1 < denom2) {
            for (int i = 1; i <= denom2; i++) { // 수정된 부분!
                if (denom1 * i == denom2) {
                    sumnumber = number2 + (number1 * i);
                    sumdenom = denom2;
                    done = true;
                    break;
                }
            }
        } else { // 같을 경우
            sumnumber = number1 + number2;
            sumdenom = denom1;
            done = true;
        }

        // 공통 분모 못 찾았을 경우 → 두 분모 곱
        if (!done) {
            sumdenom = denom1 * denom2;
            sumnumber = (number1 * denom2) + (number2 * denom1);
        }

        // 약분 처리
        int gcd = getGCD(sumnumber, sumdenom);
        sumnumber /= gcd;
        sumdenom /= gcd;

        answer.add(sumnumber);
        answer.add(sumdenom);

        return answer.stream().mapToInt(i -> i).toArray();
    }

    // 최대공약수 구하기 (유클리드 호제법)
    private int getGCD(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(9, 2, 1, 3)));
        
    }
}
