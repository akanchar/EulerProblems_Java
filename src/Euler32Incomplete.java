/*
Pandigital products
Problem 32
We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once; for example, the 5-digit number, 15234, is 1 through 5 pandigital.

The product 7254 is unusual, as the identity, 39 × 186 = 7254, containing multiplicand, multiplier, and product is 1 through 9 pandigital.

Find the sum of all products whose multiplicand/multiplier/product identity can be written as a 1 through 9 pandigital.

HINT: Some products can be obtained in more than one way so be sure to only include it once in your sum.
 */

import java.util.ArrayList;

public class Euler32Incomplete
{
    public static void main(String[] args)
    {
        boolean isPanDigital;
        long sum = 0;
        A: for(long i = 3; i <= 70000; i++)
        {
            for(long j = 2; j < i; j++)
            {
                isPanDigital = true;
                if(i % j == 0)
                {
                    String string = i + "" + j + "" + i/j;
                    ArrayList<Integer> digits = new ArrayList<>();
                    for(int k = 0; k < string.length(); k++)
                    {
                        if(digits.contains((Integer.parseInt(string.charAt(k) + ""))))
                        {
                            isPanDigital = false;
                            break;
                        }
                        digits.add(Integer.parseInt(string.charAt(k) + ""));
                    }
                    if(isPanDigital)
                    {
                        System.out.println(i + "  " + j);
                        sum += i;
                        continue A;
                    }
                }
            }
        }
        System.out.println("Sum of all products whose multiplicand/multiplier/product identity can be written as a 1 through 9 pandigital " + sum);
    }
}
