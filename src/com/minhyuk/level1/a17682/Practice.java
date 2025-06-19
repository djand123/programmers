package com.minhyuk.level1.a17682;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice {
    public static void main(String[] args) {
        
        String token = "10D*"; // or "2D#", "1S", etc.
        //정규표현식으로 분해

        // Pattern pattern  = Pattern.compile("(//d+)([SDT])(*#)?");
        // Matcher matcher = pattern.matcher(token);

        //     (//d+)([SDT])(*#)?

        Pattern pattern = Pattern.compile("(//d+)([SDT])(*#)?");
        Matcher matcher = pattern.matcher(token);

        if(matcher.matches()){
            int number = Integer.parseInt(matcher.group(1));
            // char 
        }


    }
    
}
