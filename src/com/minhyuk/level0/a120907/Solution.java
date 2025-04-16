package com.minhyuk.level0.a120907;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public String[] Solution(String[] quiz) {
        List<String> answer = new ArrayList<>();
        
        // quiz 배열을 순회하면서 각 수식을 처리
        for (int i = 0; i < quiz.length; i++) {
            // 정규표현식에서 공백도 포함되도록 수정
            Pattern pattern = Pattern.compile("(-?\\d+)\\s*([+\\-*/])\\s*(-?\\d+)\\s*=\\s*(-?\\d+)");
            Matcher matcher = pattern.matcher(quiz[i]);
    
            if (matcher.matches()) {
                // 매칭된 값들을 추출
                int num1 = Integer.parseInt(matcher.group(1)); // 첫번째 숫자
                String operator = matcher.group(2); // 연산자
                int num2 = Integer.parseInt(matcher.group(3)); // 두번째 숫자
                int sum = Integer.parseInt(matcher.group(4)); // 정답
    
                int result = 0;
    
                // 연산 수행
                switch (operator) {
                    case "+": result = num1 + num2; break;
                    case "-": result = num1 - num2; break;
                }
    
                // 계산 결과가 맞으면 "O", 틀리면 "X"
                if (result == sum) {
                    answer.add("O");
                } else {
                    answer.add("X");
                }
            }
        }
        
        // List<String>을 String[]로 변환
        return answer.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트용 quiz 배열
        String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};

        // 결과 출력
        System.out.println(Arrays.toString(sol.Solution(quiz)));  // ["X", "O"]
    }
}
