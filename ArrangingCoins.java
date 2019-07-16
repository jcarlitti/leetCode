/*
Creator: Justin Carlitti
Date Completed: 7/12/19
Difficulty: Easy
ID #: 441
Description:
You have a total of n coins that you want to form in a staircase shape, 
where every k-th row must have exactly k coins. Given n, find 
the total number of full staircase rows that can be formed.  
n is a non-negative integer and fits within the range of a 
32-bit signed integer.
*/

public class ArrangingCoins{

    public static int arrangingCoins(int n){
        int howManyPerRow = 0;
        while(n > 0){
            howManyPerRow += 1;
            n -= howManyPerRow;
            System.out.println("howManyPerRow :" + howManyPerRow);
            System.out.println("n :" + n);
        }

        return n == 0 ? howManyPerRow : howManyPerRow - 1;
    }

    public static void main(String[] args){
        System.out.printf("\n\n%d: ", arrangingCoins(3));
    }
}