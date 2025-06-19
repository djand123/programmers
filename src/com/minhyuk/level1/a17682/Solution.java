package com.minhyuk.level1.a17682;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    int solution(String dartResult) {
        int answer = 0;

        List<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile("(\\d{1,2}[SDT][*#]?)"); // 점수(1~2자리) + 보너스(S/D/T) + 옵션(*, # 중 0~1개)
                                                                   // //1D2S#10S
        Matcher matcher = pattern.matcher(dartResult);

        while (matcher.find()) {
            list.add(matcher.group());
        }

        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String token = list.get(i);
            Pattern pattern2 = Pattern.compile("(\\d+)([SDT])([*#]?)");
            Matcher m2 = pattern2.matcher(token);

            if (m2.matches()) {
                int first = Integer.parseInt(m2.group(1));
                char second = m2.group(2).charAt(0);
                int result = 0;

                switch (second) {
                    case 'S':
                        result = (int) Math.pow(first, 1);
                        break;

                    case 'D':
                        result = (int) Math.pow(first, 2);
                        break;

                    case 'T':
                        result = (int) Math.pow(first, 3);
                        break;

                    default:
                        break;
                }
                list2.add(result);

                if (token.length() > 2) {
                    char third = token.charAt(2);
                    switch (third) {
                        case '*':
                            if (i == 0) {
                                list2.set(0, list2.get(0) * 2);
                            } else {
                                list2.set(i, list2.get(i) * 2);
                                list2.set(i - 1, list2.get(i - 1) * 2);
                            }
                            break;

                        case '#':
                            list2.set(i, list2.get(i) * (-1));
                            break;

                        default:
                            break;
                    }
                    System.out.println(list2);
                }
            }
        }

        for (int j = 0; j < list2.size(); j++) {
            answer += list2.get(j);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution("t1D2S3T*"));

    }
}
