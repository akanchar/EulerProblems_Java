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

public class Euler26CompletedNew
{
    public static void main(String[] args)
    {
        final BigDecimal ONE = new BigDecimal(1.0);
        int longestLength = 0, start, position, intD = 0;
        for(int i = 2; i <= 983; i++)
        {
            BigDecimal d = ONE.divide(new BigDecimal(i),10000,RoundingMode.HALF_UP);
            String dString = d.toString();
            String decimalPart = dString.split("\\.")[1];
            position = 0;
            O: for(int j = 0;j < decimalPart.length()/2; j++, position++)
            {
                start = 3;
                for(int k = 0; k < decimalPart.length()/2; k++, start++)
                {
                    if((position + start - 1) < decimalPart.length() && (start * 2 < decimalPart.length())) {
                        String repeatedPart = decimalPart.substring(position, start),
                                repeatedPart2 = decimalPart.substring(position + start, start + start);
                        if (repeatedPart.equals(repeatedPart2)) {
                            if(repeatedPart.length() >= longestLength){
                                longestLength = repeatedPart.length();
                                intD = i;
                            }
                            break O;
                        }
                    }

                }
            }
        }
        System.out.println("The value of d < 1000 for which 1/d contains the longest recurring cycle in its decimal fraction part is " + intD);
    }
}
