package com.minhyuk.level0.a120924;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        
    }

    class Solution {
        public int solution(int[] common) {
            int n = common.length;
            
            int diff = common[1] - common[0]; // 공차
            int ratio = common[1] / common[0]; // 공비
    
            // 등차수열인지 확인
            if (common[2] - common[1] == diff) {
                return common[n - 1] + diff; // 다음 항 = 마지막 원소 + 공차
            } 
            // 등비수열이면
            else {
                return common[n - 1] * ratio; // 다음 항 = 마지막 원소 * 공비
            }
        }
    }
    
}
