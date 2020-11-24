/**
 * @author Abhilash Kancharla
 * @project Euler Programs
 */

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * <p>
 * a2 + b2 = c2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * <p>
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class Euler009 {
    private static final int sum = 1000;

    public static void main(String[] args) {
        for (int i = sum; i >= 1; i--)
            for (int j = sum - i; j >= 1; j--)
                for (int k = sum - (i + j); k >= 1; k--)
                    if ((i + j + k == sum) && (Math.pow(i, 2) == Math.pow(j, 2) + Math.pow(k, 2))) {
                        System.out.println("Answer is " + i * j * k);
                        return;
                    }
    }
}
