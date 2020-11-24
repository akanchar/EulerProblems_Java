/**
 * @author Abhilash Kancharla
 * @project Euler Programs
 */

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 */
public class Euler007 {
    public static void main(String[] args) {
        int number = 2;
        // Count is 1, as 2 is prime
        int count = 1;
        while (count < 10001) {
            number++;
            if (IsPrime(number))
                count++;
        }
        System.out.println("Answer is " + number);
    }
    /**
     * Functions returns whether the number is prime or not
     * @param checkPrime The number to be checked whether a prime or not
     * @return Boolean
     */
    private static boolean IsPrime(long checkPrime) {
        for (long i = 2; i <= Math.sqrt(checkPrime); i++)
            if (checkPrime % i == 0)
                return false;
        return true;
    }
}
