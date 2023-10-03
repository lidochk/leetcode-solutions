package org.example;

import java.util.regex.Pattern;
//task 557 https://leetcode.com/problems/reverse-words-in-a-string-iii/submissions/?envType=daily-question&envId=2023-10-01
public class ReverseWords {


    public String reverseWords(String str) {
        String words[]=str.split("\\s");
        StringBuilder reverseWord= new StringBuilder();
        for(String w:words){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseWord.append(sb.toString()).append(" ");
        }
        return reverseWord.toString().trim();
    }

    public static void main(String[] args) {
        ReverseWords reverseWords = new ReverseWords();
        System.out.println(reverseWords.reverseWords("I love"));
    }
}
