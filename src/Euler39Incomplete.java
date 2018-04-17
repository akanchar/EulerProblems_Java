
/*
Integer right triangles
Problem 39
If p is the perimeter of a right angle triangle with integral length sides, {a,b,c}, there are exactly three solutions for p = 120.

{20,48,52}, {24,45,51}, {30,40,50}

For which value of p ≤ 1000, is the number of solutions maximised?
 */
public class Euler39Incomplete {
    public static void main(String[] args) {
        int p, count = 0, longest = 0, pValue = 0;
        for (p = 1000; p >= 90; p--) {
            if(p % 2 != 0)
                continue;
            count = 0;
            for (int a = 1; a < p; a++) {
                for (int b = 1; b < p; b++) {
                    for (int c = 1; c < p; c++) {
                        if (((Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))) && (a + b + c == p)) {
                                    System.out.println("A - " + a + "B - " + b + "C - " + c);
                                    count++;
                                }
                    }
                }
            }
            if(count > longest) {
                longest = count;
                pValue = p;
            }
        }
        System.out.println("Value of p ≤ 1000 for which the number of solutions is maximised is " +  pValue);
    }
}
