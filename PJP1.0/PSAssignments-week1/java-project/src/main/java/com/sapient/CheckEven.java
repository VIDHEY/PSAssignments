package com.sapient;
//import java.util.Scanner;
/**
 * Test Even number
 *
 */
public class CheckEven 
{
    // public static void main( String[] args )
    // {
    // 	Scanner reader = new Scanner(System.in);

    //     System.out.print("Enter a number: ");
    //     int num = reader.nextInt();

    //     System.out.println(checkEven(num));
    // }

    public boolean checkEven(int n)
    {
        if(n % 2 == 0)
        {
            System.out.println(n + " is even");
            return true;
        }
        else{
           System.out.println(n + " is odd");
           return false;
        }
    }
}