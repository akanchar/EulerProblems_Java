/*
Digit fifth powers
Problem 30
Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:

1634 = 14 + 64 + 34 + 44
8208 = 84 + 24 + 04 + 84
9474 = 94 + 44 + 74 + 44
As 1 = 14 is not a sum it is not included.

The sum of these numbers is 1634 + 8208 + 9474 = 19316.

Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
 */

import java.util.ArrayList;

public class Euler30 {
    final private static int power = 5;
    public static void main(String[] args)
    {
        int totalSum = 0;
        for(int i = 20; i <= 2000000; i++)
        {
            String string = i + "";
            int sum = 0;
            for(int j = 0; j < string.length(); j++)
            {
                int number = Integer.parseInt(string.charAt(string.length() - j - 1) + "");
                sum = sum + (int)Math.pow(number,power);
            }

            if(sum == i)
                totalSum += sum;
        }
        System.out.println("The sum of all the numbers that can be written as the sum of fifth powers of their digits is " + totalSum);
    }
}