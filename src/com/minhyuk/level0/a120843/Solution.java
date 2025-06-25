package com.minhyuk.level0.a120843;

public class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int target = 0; 

        for (int i = 1; i < k; i++) {
            int length = (numbers.length)-1;  
            target = target + 2;
            if(target > length){ 
                target = (target - length)-1;
                answer = numbers[target];
            }else{
                answer = numbers[target];
            }
        }
        return answer;
    }





    public static void main(String[] args) {
        Solution solution = new Solution();
        // solution.solution(new int[]{1, 2, 3, 4, 5, 6}, 5);
        System.out.println(solution.solution(new int[]{1, 2, 3, 4, 5, 6}, 5));
        System.out.println(solution.solution(new int[]{1, 2, 3, 4}, 2));
        System.out.println(solution.solution(new int[]{1, 2, 3}, 3));
        
    }
}
