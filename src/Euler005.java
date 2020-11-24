/**
 * @author Abhilash Kancharla
 * @project Euler Programs
 */

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Euler005 {
    public static void main(String[] args) {
        long start = 21L;
        // Rest of the numbers are already covered in the if loop
        // For example, if the number if divisble by 20, 18 and 16. Then the number
        // should definitely be divisble by 2,3,4,5,6,8,9 and 10
        while (start % 20 != 0 ||
                start % 19 != 0 ||
                start % 18 != 0 ||
                start % 17 != 0 ||
                start % 16 != 0 ||
                start % 14 != 0 ||
                start % 13 != 0 ||
                start % 11 != 0) {
            start++;
        }
        System.out.println("Answer is " + start);
    }
}
