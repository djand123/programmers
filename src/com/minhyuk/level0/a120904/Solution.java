package com.minhyuk.level0.a120904;

import java.util.Scanner;

public class Solution {
    // 숫자가 존재하면 그 자리수를, 없으면 -1을 리턴

    public int sol(int num, int k){
        int answer = -1;

        //int num을 String으로 변환
        String str = String.valueOf(num);
     

        //str을 int[]로 변환
        int[] intArray = new int[str.length()];


        for (int i = 0; i < str.length(); i++) {
            intArray[i] = str.charAt(i)-'0';
        
        }
        //num의 각 자리수의 위치를 확인
        for (int i = 0; i < intArray.length; i++) {
            if(k == intArray[i]){
                answer = i+1;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Solution solution = new Solution();

        int num = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(solution.sol(num, k));
    }


    
}
