/*
Problem 41
We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once.
For example, 2143 is a 4-digit pandigital and is also prime.

What is the largest n-digit pandigital prime that exists?
 */
public class Euler41Incomplete {
    public static void main(String[] args)
    {
        boolean isPrime = true;
        for(int i = 3;i <= 8000000 ; i++)
        {
            isPrime = true;
            if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0)
                continue;
            for(int j = 4; j < i/2; j++)
            {
                if(i % j == 0)
                    isPrime = false;
            }
            if(isPrime)
                System.out.println(i);
        }
    }
}
