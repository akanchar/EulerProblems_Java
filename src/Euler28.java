import javax.annotation.processing.SupportedSourceVersion;

/*
Starting with the number 1 and moving to the right in a clockwise direction a 5 by 5 spiral is formed as follows:

21 22 23 24 25
20  7  8  9 10
19  6  1  2 11
18  5  4  3 12
17 16 15 14 13

It can be verified that the sum of the numbers on the diagonals is 101.

What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?
 */
public class Euler28 {
    private final static int sizeOfArray = 1001;
    public static void main(String[] args)
    {
        int[][] numbers = new int[sizeOfArray][sizeOfArray];
        int startNumber = sizeOfArray / 2, count = 0, arrayTraverseCount = 0, col, row, number = 1, times = 1, sum = 0;
        numbers[startNumber][startNumber] = 1;

        String[] directions = {"right", "down", "left", "up"};
        col = row = startNumber;
        for(int i = 0; i < sizeOfArray * sizeOfArray - 1; i++)
        {
            //Calculate the new index of the 2-d array to insert number
            switch (directions[arrayTraverseCount]) {
                case "right":
                    count++;
                    col++;
                    number++;
                    numbers[row][col] = number;
                    break;
                case "down":
                    count++;
                    row++;
                    number++;
                    numbers[row][col] = number;
                    break;
                case "left":
                    col--;
                    count++;
                    number++;
                    numbers[row][col] = number;
                    break;
                case "up":
                    row--;
                    count++;
                    number++;
                    numbers[row][col] = number;
                    break;
            }
            if(count == times)
                arrayTraverseCount = arrayTraverseCount == 3 ? 0 : arrayTraverseCount + 1;
            if(count == 2 * times)
            {
                count = 0;
                times++;
                arrayTraverseCount = arrayTraverseCount == 3 ? 0 : arrayTraverseCount + 1;
            }
        }

        for(int k = 0; k < numbers.length; k++)
        {
            for(int j = 0; j < numbers.length; j++)
            {
                if(k == j || j + k == sizeOfArray - 1)
                    sum += numbers[k][j];
            }
        }
        System.out.println("The sum of the numbers on the diagonals in a 1001 by 1001 spiral formed is " + sum);
    }
}
