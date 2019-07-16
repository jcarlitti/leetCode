/*
Creator: Justin Carlitti
Date Completed: 7/12/19
Difficulty: Easy
ID #: 989
Description: 
For a non-negative integer X, the array-form of X is an array 
of its digits in left to right order.  For example, if X = 1231, 
then the array form is [1,2,3,1].  Given the array-form A of a 
non-negative integer X, return the array-form of the integer X+K.
*/

import java.util.*;

public class ArrayFormInt{

    public static List<Integer> addToArrayForm(int[] a, int k){
        
        StringBuilder strNum = new StringBuilder();
        int[] test = new int[4];
        List<Integer> test1 = new ArrayList<Integer>();

        int result = 0;
        String sum;
    
        for(int i = 0; i < a.length; i++){
            strNum.append(a[i]);
        }

        result = Integer.valueOf(strNum.toString());

        sum = String.valueOf(result + k);

        for(int j = 0; j <= sum.length()-1; j++){

            test[j] = Character.getNumericValue(sum.charAt(j));
            test1.add(test[j]);
        }
        return test1;
    }

    public static void main(String[] args){
        int[] a = {1, 2, 0, 0};
        int k = 44;
        System.out.println(addToArrayForm(a,k));
    }
}