/**
 * @author Abhilash Kancharla
 * @project Euler Programs
 */

/**
 * 91 × 99.
 * <p>
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Euler004 {
    public static void main(String[] args) {
        int largestPalindrom = 1;
        for (int i = 999; i >= 100; i--)
            for (int j = 999; j >= 100; j--)
                if (PalindromeCheck(i * j) && (i * j) > largestPalindrom)
                    largestPalindrom = i * j;
        System.out.println("Answer is " + largestPalindrom);
    }

    /**
     * Function that checks whether a number is palindrom or not by converting the number into char Array
     * and comparing from either side of the array for equality.
     *
     * @param number
     * @return Boolean
     */
    private static boolean PalindromeCheck(int number) {
        char[] numberInChar = String.valueOf(number).toCharArray();
        for (int i = 0, j = numberInChar.length - 1; i < numberInChar.length / 2; i++, j--) {
            if (numberInChar[i] != numberInChar[j])
                return false;
        }
        return true;
    }
}
