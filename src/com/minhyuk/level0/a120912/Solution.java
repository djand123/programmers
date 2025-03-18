package com.minhyuk.level0.a120912;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            // 각 숫자에서 7의 등장 횟수를 센다.
            while (num > 0) {
                if (num % 10 == 7) {  // 일의 자리 숫자가 7이면
                    answer++;         // 7 등장 횟수 증가
                }
                num /= 10;            // 다음 자리 숫자를 검사하기 위해 10으로 나눔
            }
        }
        
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution so = new Solution();
        // sc.nextLine();

        int[] arr = {17, 77};
        System.out.println(so.solution(arr));
    }
}
