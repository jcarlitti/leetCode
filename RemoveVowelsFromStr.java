/*
Creator: Justin Carlitti
Date Completed: 7/13/19
Difficulty: Easy
ID #: 1119
Description: 
Given a string S, remove the vowels 'a', 'e', 'i', 'o', 
and 'u' from it, and return the new string.

NOTE: I could of done a one liner where I use the 
string method s.replaceAll("[aeiou]", "") but I wanted to 
become more familiar with StringBuilder.
*/

import java.util.*;

public class RemoveVowelsFromStr{

    public static String removeVowels(String s){

        StringBuilder newStr = new StringBuilder();
        int len = s.length();

        for(int i = 0; i < len; i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                continue;
            }else{
                newStr.append(s.charAt(i));
            }   
            
        }
        String r = newStr.toString();
        return r;
    }

    public static void main(String[] args){
        System.out.println(removeVowels("leetcodeisacommunityforcoders"));
    }
}