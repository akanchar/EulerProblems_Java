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
        boolean allPrimes;
        int sum = 0, count = 0;
        for(int i = 8; count < 11; i++)
        {
            String numberString = i +"";
            allPrimes = true;
            if(!isPrime(i))
                continue;
            for(int j = 1; j < numberString.length(); j++)
            {
                String truncatedNumber = numberString.substring(0,j);
                if(!isPrime(Integer.parseInt(truncatedNumber))) {
                    allPrimes = false;
                    break;
                }
                truncatedNumber = numberString.substring(j,numberString.length());
                if(!isPrime(Integer.parseInt(truncatedNumber))) {
                    allPrimes = false;
                    break;
                }
            }
            if(allPrimes) {
                sum += i;
                count++;
            }
        }
        System.out.println("The sum of the only eleven primes that are both truncatable from left to right and right to left is " + sum);
    }
    private static boolean isPrime(int number) {
        if(number == 1 || number == 4 )
            return false;
        for(int i = 2; i < number / 2; i++)
            if (number % i == 0)
                return false;
        return true;
    }
}