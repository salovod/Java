public class Fibonacci
{
    public static void main(String[] args)
    {
        int a = 1;
        int b = 1;
        int c;
        System.out.println(a + "\n" + b);
        for (int i = 3; i < 12; i++)
        {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}
