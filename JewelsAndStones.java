/*
Creator: Justin Carlitti
Date Completed: 7/13/19
Difficulty: Easy
ID #: 771
Description: 
You're given strings J representing the types of stones that 
are jewels, and S representing the stones you have.  
Each character in S is a type of stone you have.  
You want to know how many of the stones you have are also jewels.
The letters in J are guaranteed distinct, and all 
characters in J and S are letters. Letters are case sensitive, 
so "a" is considered a different type of stone from "A".
*/

public class JewelsAndStones{

    public static int numJewelsInStones(String j, String s){
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            if(j.indexOf(s.charAt(i)) != -1){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }
}