package com.minhyuk.level0.a120908;

public class Solution {
    public int solution(String str1, String str2){
        int answer = 2;
        //str의 입력받은 값을 배열로 저장?
        //
        boolean contain = str1.contains(String.valueOf(str2));
        if(contain == true){
            answer = 1;
        }else{
            
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("ab6CDE443fgh22iJKlmn1o", "6CD"));
        
    }
    
}
