package com.minhyuk.level0.a120909;

public class Solution {
    public int solution(int n){
        // int answer = 2;
        // for (long i = 0; i < 1001; i++) {
        //     if(i*i == n){
        //         answer = 1;
        //     }
        // }
        // return answer;

        Math.sqrt(n);
        if(n % Math.sqrt(n) == 0){
            return 1;
        }else {
            return 2;
        }
    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(19));
        
    }
    
}
