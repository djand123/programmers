package com.minhyuk.level0.a120906;

import java.util.Scanner;

public class Solution {

    public int solution1(int n){
        int answer = 0;

        String str = String.valueOf(n);

        for (int i = 0; i < str.length(); i++) {
            answer += str.charAt(i) - '0';
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        int n = sc.nextInt();

        System.out.println(sol.solution1(n));
    }

    
    
}
