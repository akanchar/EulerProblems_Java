public class Euler40Incomplete {
    public static void main(String[] args)
    {
        String string = "";
        int n = 200000, count = 0;
        for(int i = 0; i <= 9 * n; i++)
        {
            count += (i + "").length();
        }
        System.out.println(count);
    }

}
