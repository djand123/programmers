package com.minhyuk.level0.a120910;

public class Solution {
    public int solution(int n, int t){
        int answer = n;

        for (int i = 0; i < t; i++) {
            answer *= 2;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(2, 1));


        
    }
    
}
