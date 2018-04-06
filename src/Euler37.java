/*
Truncatable primes
Problem 37
The number 3797 has an interesting property. Being prime itself, it is possible to continuously remove digits from left
to right, and remain prime at each stage: 3797, 797, 97, and 7. Similarly we can work from right to left: 3797, 379, 37, and 3.

Find the sum of the only eleven primes that are both truncatable from left to right and right to left.

NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.
 */
public class Euler37 {
    public static void main(String[] args)
    {
        for(int i = 3797; i<= 3797; i++)
        {
            System.out.println(isPrime(i));
        }
    }
    private static boolean isPrime(int number) {
        for(int i = 2; i < number / 2; i++)
            if (number % i == 0)
                return false;
        return true;
    }
}
