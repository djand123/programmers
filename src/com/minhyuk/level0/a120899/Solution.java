package com.minhyuk.level0.a120899;

import java.util.Arrays;

public class Solution {
    public int[] sou(int[] array){
        int x = 0;
        int y = 0;

        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            if(a>x){
                x = a;
                y = i;
            }
        }
        int[] answer = {x,y};
        return answer;
    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] array = {9,10,11,8};
        System.out.println(Arrays.toString(sol.sou(array)));

    }
    
}
