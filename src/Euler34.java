/*
Digit factorials
Problem 34
145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.

Find the sum of all numbers which are equal to the sum of the factorial of their digits.

Note: as 1! = 1 and 2! = 2 are not sums they are not included.
 */
public class Euler34 {
    public static void main(String[] args)
    {
        int sumOfFactorials, totalSum = 0;
        for(int i = 3; i < 1500000; i++)
        {
            String string = i + "";
            sumOfFactorials = 0;
            for(int j = 0; j < string.length(); j++)
                sumOfFactorials += factorial(Integer.parseInt(string.charAt(j) + ""));
            if(sumOfFactorials == i)
                totalSum += sumOfFactorials;
        }
        System.out.println("The sum of all numbers which are equal to the sum of the factorial of their digits is " + totalSum);
    }
    public static int factorial(int number)
    {
        int factorial = 1;
        for(int i = number; i >= 1; i--)
            factorial *= i;
        return factorial;
    }
}
