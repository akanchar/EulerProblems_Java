/**
 * @author Abhilash Kancharla
 * @project Euler Programs
 */
/**
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 * <p>
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * <p>
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */
public class Euler002 {
    public static void main(String[] args) {
        long fib1 = 1, fib2 = 2, fib3 = 0, sum = 0;
        sum = fib2;
        while (fib3 < 4_000_000) {
            fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
            sum += fib3 % 2 == 0 ? fib3 : 0;
        }
        System.out.println("Answer is " + sum);
    }
}
