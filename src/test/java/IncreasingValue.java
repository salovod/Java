import java.util.Scanner;

public class IncreasingValue
{
    public static void main(String args[]) throws Exception {
        Scanner read = new Scanner(System.in);
        System.out.println("Input a");
        int a = Integer.parseInt(read.nextLine());
        System.out.println("Input b");
        int b = Integer.parseInt(read.nextLine());
        System.out.println("Input c");
        int c = Integer.parseInt(read.nextLine());

        if (a <= b && a <= c)
        {
            System.out.println(a);
            if (b <= c)
            {
                System.out.println(b);
                System.out.println(c);
            }
            else
            {
                System.out.println(c);
                System.out.println(b);
            }
        }
        else if (b <= a && b <= c)
        {
            System.out.println(b);
            if (a <=c)
            {
                System.out.println(a);
                System.out.println(c);
            }
            else
            {
                System.out.println(c);
                System.out.println(a);
            }
        }
        else if (c <= a && c <=b )
        {
            System.out.println(c);
            if (a <= b)
            {
                System.out.println(a);
                System.out.println(b);
            }
            else
            {
                System.out.println(b);
                System.out.println(a);
            }
        }
    }
}
