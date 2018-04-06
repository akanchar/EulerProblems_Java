/*
Double-base palindromes
Problem 36
The decimal number, 585 = 1001001001 (binary), is palindromic in both bases.

Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.

(Please note that the palindromic number, in either base, may not include leading zeros.)
 */
public class Euler36 {
    public static void main(String[] args)
    {
        long sum = 0;
        for(int i = 0; i <= 1000000; i++)
        {
            if(bothPalindrome(i + "", binary(i)))
            {
                sum += i;
                System.out.println(i);
                System.out.println(binary(i));

            }
        }
        System.out.println("The sum of all numbers, less than one million, which are palindromic in base 10 and base 2 is " + sum);
    }
    private static boolean bothPalindrome(String decimalNumber, String binaryNumber) {
        for(int i = 0; i < decimalNumber.length() / 2; i++)
            if(!(decimalNumber.charAt(i) == decimalNumber.charAt(decimalNumber.length() - i - 1)))
                return false;
        for(int i = 0; i < binaryNumber.length() / 2; i++)
            if(!(binaryNumber.charAt(i) == binaryNumber.charAt(binaryNumber.length() - i - 1)))
                return false;
        return true;
    }

    private static String binary(int number)
    {
        String binary = "";
        for(int i;;)
        {
            i = number % 2;
            number = number / 2;
            binary = i + binary;
            if(number == 0)
                break;
        }
        return binary;
    }
}
