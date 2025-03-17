package com.minhyuk.level0.a120923;

import java.util.Arrays;

class Soultion {
    public int[] Soultion(int num, int total){
        // n n-1 n-2 n-3  =

        int start = (total - (num * (num-1)/2)) /num;
        int[] answer = new int[num];

        for (int i = 0; i < num; i++) {
            answer[i] = start + i;
        }

        return answer;
    }

    public static void main(String[] args) {
        Soultion sol = new Soultion();
        System.out.println(Arrays.toString(sol.Soultion(5, 5)));
    }
    
}
