/*
Euler discovered the remarkable quadratic formula:

n2+n+41
It turns out that the formula will produce 40 primes for the consecutive integer values 0≤n≤39.
 However, when n=40,402+40+41=40(40+1)+41 is divisible by 41, and certainly when n=41,412+41+41 is clearly divisible by 41.

The incredible formula n2−79n+1601 was discovered, which produces 80 primes for the consecutive
values 0≤n≤79. The product of the coefficients, −79 and 1601, is −126479.

Considering quadratics of the form:

n2+an+b, where |a|<1000 and |b|≤1000

where |n| is the modulus/absolute value of n
e.g. |11|=11 and |−4|=4
Find the product of the coefficients, a and b, for the quadratic expression that produces the
maximum number of primes for consecutive values of n, starting with n=0.
 */

public class Euler27
{
    public static void main(String[] args)
    {
        int a, b, count, saveA = 0, saveB = 0, saveCount = 0;
        boolean isPrime;
        // Looping for different values of a and b coefficients
        for(a = -1000;a <= 1000; a++) {
            for (b = -1000; b <= 1000; b++) {
                count = 0;
                isPrime = true;
                for (int n = 0;; n++) {
                    int number = (n * n) + (a * n) + b;
                    isPrime = true;
                    if (number <= 2)
                        continue;
                    for (int i = 2; i < number / 2; i++) {
                        if (number % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        count++;
                    } else {
                        break;
                    }
                }
                if (count > saveCount) {
                    saveA = a;
                    saveB = b;
                    saveCount = count;
                }
            }
        }
        // Printing the final output, prouct of the coefficients in the equation
        System.out.println("Product of coeffecients in the equation that produces the maximum number of primes for consecutive values of n is " + saveA * saveB);
    }
}
