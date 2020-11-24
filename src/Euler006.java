/**
 * @author Abhilash Kancharla
 * @project Euler Programs
 */

/**
 * The sum of the squares of the first ten natural numbers is,
 *
 * The square of the sum of the first ten natural numbers is,
 *
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .
 *
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class Euler006 {
    public static void main(String[] args) {
        long sumOfSquares = 0L;
        long squareOfSums = 0L;
        for(int i = 1 ; i <= 100; i++) {
            sumOfSquares += Math.pow(i, 2);
            squareOfSums += i;
        }
        squareOfSums = (long) Math.pow(squareOfSums, 2);
        System.out.println("Answer is " + (squareOfSums - sumOfSquares));
    }
}
