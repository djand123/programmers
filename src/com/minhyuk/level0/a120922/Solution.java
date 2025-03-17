package com.minhyuk.level0.a120922;

import java.util.Scanner;

public class Solution {  // <== 클래스 이름 수정
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        Solution sol = new Solution();  // <== 클래스 이름 일치
        int result = sol.solution(M, N);
        System.out.println(result);

        sc.close();  // 리소스 해제
    }

    public int solution(int M, int N) {
        return (M * N) - 1;
    }
}

