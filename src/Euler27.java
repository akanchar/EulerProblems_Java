
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
