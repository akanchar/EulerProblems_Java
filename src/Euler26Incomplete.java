/*
A unit fraction contains 1 in the numerator. The decimal representation of the unit fractions with denominators 2 to 10 are given:

1/2	= 	0.5
1/3	= 	0.(3)
1/4	= 	0.25
1/5	= 	0.2
1/6	= 	0.1(6)
1/7	= 	0.(142857)
1/8	= 	0.125
1/9	= 	0.(1)
1/10	= 	0.1
Where 0.1(6) means 0.166666..., and has a 1-digit recurring cycle. It can be seen that 1/7 has a 6-digit recurring cycle.

Find the value of d < 1000 for which 1/d contains the longest recurring cycle in its decimal fraction part.
 */
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Euler26Incomplete
{
    public static void main(String[] args)
    {
        final BigDecimal ONE = new BigDecimal(1.0);
        int longestLength = 0;
        for(int i = 7; i <= 17; i++)
        {
            BigDecimal d = ONE.divide(new BigDecimal(i),1000,RoundingMode.HALF_UP);
            String dString = d.toString();
            String[] split = dString.split("\\.");
            System.out.println(split[1]);





//            System.out.println(d.toString() + "   --    " + decimalNumber);

        }
    }

}
