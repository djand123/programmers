package com.minhyuk.level0.a120921;

import java.util.Scanner;

public class Solution {

    public int solution(String A, String B) {
        String rotated = A;
        int answer = 0;
    
        for (int i = 0; i < A.length(); i++) {
            if (rotated.equals(B)) {
                return answer; 
            }
            rotated = rotated.charAt(rotated.length() - 1) + rotated.substring(0, rotated.length() - 1); 
            answer++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();

        Solution solution = new Solution();
        System.out.println(solution.solution(A, B));

        
    }
    
}
