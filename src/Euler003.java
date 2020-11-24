/**
 * @author Abhilash Kancharla
 * @project Euler Programs
 */

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * <p>
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Euler003 {
    private static final long number = 600851475143L;

    public static void main(String[] args) {
        // Starting from the highest possible factor of 600851475143L
        // which is the square root of the same.
        long start = (long) Math.sqrt(number);

        while (true) {
            // Factor AND Prime check in the "if" loop
            if(number % start == 0 && Prime(start)) {
                System.out.println("Answer is " + start);
                System.exit(0);
            }
            start--;
        }
    }

    /**
     * Functions returns whether the number is prime or not
     * @param checkPrime The number to be checked whether a prime or not
     * @return
     */
    private static boolean Prime(long checkPrime) {
        for (long i = 2; i < Math.sqrt(checkPrime); i++)
            if (checkPrime % i == 0)
                return false;
        return true;
    }
}
