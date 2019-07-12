/*
Creator: Justin Carlitti
Date Completed: 7/11/19
Difficulty: Easy
ID #: 258
Description: 
Given a non-negative integer num, repeatedly add 
all its digits until the result has only one digit.
*/

import java.util.*;

public class AddDigits{
    public static int addDigits(int num){

        if(num == 0){
            return 0;
        }

        while(num >= 10){ //Contiune until num is single digit
            int ten = num / 10; //Figure out the first digit
            int digit = num - ten * 10; //Figure out the second digit
            num = ten + digit; //Add the two seperated numbers 
        }

        return num;
    }

    public static void main(String[] args){
        System.out.println(addDigits(38));
    }
}