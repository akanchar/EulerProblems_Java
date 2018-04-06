/*
Coin sums
        Problem 31
        In England the currency is made up of pound, £, and pence, p, and there are eight coins in general circulation:

        1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
        It is possible to make £2 in the following way:

        1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p
        How many different ways can £2 be made using any number of coins?
*/
public class Euler31 {
    public static void main(String[] args)
    {
        int ways = 1; // Default way - 200p
        for(int one = 0; one <= 200; one++)
            for(int two = 0; two <= 100; two++)
                for(int five = 0; five <= 40; five++)
                    for(int ten = 0; ten <= 20;ten++)
                        for(int twenty = 0; twenty <= 10; twenty++)
                            for(int fifty = 0; fifty <= 4; fifty++)
                                for(int hundred = 0; hundred <= 2; hundred++)
                                    if((one + two * 2 + five * 5 + ten * 10 + twenty * 20 + fifty * 50 + hundred * 100) == 200)
                                        ways++;
        System.out.println("Different ways can £2 be made using any number of coins are " + ways);
    }
}
