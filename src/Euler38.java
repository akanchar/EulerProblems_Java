import java.util.ArrayList;

/*
Take the number 192 and multiply it by each of 1, 2, and 3:

192 × 1 = 192
192 × 2 = 384
192 × 3 = 576
By concatenating each product we get the 1 to 9 pandigital, 192384576. We will call 192384576 the concatenated product of 192 and (1,2,3)

The same can be achieved by starting with 9 and multiplying by 1, 2, 3, 4, and 5, giving the pandigital, 918273645, which is the concatenated product of 9 and (1,2,3,4,5).

What is the largest 1 to 9 pandigital 9-digit number that can be formed as the concatenated product of an integer with (1,2, ... , n) where n > 1?
 */
public class Euler38 {
    public static void main(String[] args)
    {
        boolean isPanDigital;
        long longestNumber = 0;

        Loop: for(long i = 3; i <= 9487; i++)
        {
            String string = "";
            isPanDigital = true;
            for(int n = 1;;n++)
            {
                if((string + (i * n)).length() > 9)
                    break;
                if(n == 2 && (string + (i * n)).length() > 9)
                    continue Loop;
                string = string + (i * n);

            }
            if(string.length() == 9) {
                ArrayList<Integer> singleDigits = new ArrayList<>();
                for(int j = 0; j < string.length(); j++) {
                    if(singleDigits.contains(Integer.parseInt(string.charAt(j) + ""))) {
                        isPanDigital = false;
                        break;
                    }
                        singleDigits.add(Integer.parseInt(string.charAt(j) + ""));
                }
            }
            else
                continue;
            if(isPanDigital && Long.parseLong(string) > longestNumber)
                longestNumber = Long.parseLong(string);
        }
        System.out.println("Largest 1 to 9 pandigital 9-digit number that can be formed as the concatenated product of an integer with (1,2, ... , n) where n > 1 is " + longestNumber);
    }
}
