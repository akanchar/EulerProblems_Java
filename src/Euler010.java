/**
 * @author Abhilash Kancharla
 * @project Euler Programs
 */

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * <p>
 * Find the sum of all the primes below two million.
 */
public class Euler010 {
    private final static int MAX = 2_000_000;

    public static void main(String[] args) {
        long sum = 2,
                start = 3;
        while (start < MAX) {
            if (IsPrime(start))
                sum += start;
            start++;
        }
        System.out.println("Answer is " + sum);
    }

    /**
     * Functions returns whether the number is prime or not
     *
     * @param checkPrime The number to be checked whether a prime or not
     * @return
     */
    private static boolean IsPrime(long checkPrime) {
        for (long i = 2; i <= Math.sqrt(checkPrime); i++)
            if (checkPrime % i == 0)
                return false;
        return true;
    }
}
