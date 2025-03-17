package com.minhyuk.level0.a120913;

import java.util.Scanner;

public class Solution {
    public String[] solution(String my_str, int n) {
        int length = my_str.length(); //입력한 문자열의 길이
        int size = (int) Math.ceil((double) length / n); //올림 처리하여 배열 크기 계산

        String[] answer = new String[size]; //결과를 담을 배열 생성

        for (int i = 0; i < size; i++) {
            int start = i * n; // 각 부분 문자열의 시작 인덱스
            int end = Math.min(start + n, length); // 각 부분 문자열의 끝 인덱스 (범위 처리)
            answer[i] = my_str.substring(start, end); //부분 문자열을 배열에 저장
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        String my_str = sc.nextLine();
        int n = sc.nextInt();
        String[] result = solution.solution(my_str, n);

        // 결과 출력
        for (String str : result) {
            System.out.println(str);
        }
    }
}
