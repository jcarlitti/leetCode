/*
Creator: Justin Carlitti
Date Completed: 7/11/19
Difficulty: Easy
ID #: 415
Description: 
Given two non-negative integers num1 and num2 represented as string, 
return the sum of num1 and num2.
*/

import java.util.Arrays;

public class AddString{
    public static String addString(String num1, String num2){
        int len1 = num1.length();
        int len2 = num2.length();
        
        char[] val = new char[Math.max(len1, len2) + 1];

        int carry = 0 ;
        int sum = 0;

        for(int i = 0;  i < val.length; i++){
            int c1 = len1 <= i ? 0 : num1.charAt(len1 - 1 - i) - '0';
            int c2 = len2 <= i ? 0 : num2.charAt(len2 - 1 - i) - '0';
            sum = c1 + c2 + carry;
            carry = sum / 10;
            sum %= 10;
            val[val.length - i - 1] = (char)(sum + '0');
        }
        String sumString = String.valueOf(val);
        return val[0] == '0' ? sumString.substring(1) : sumString;
    }
    public static void main(String[] args){
        System.out.println(addString("210", "1"));
    }
}