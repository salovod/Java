import java.util.Scanner;

public class FirstTest {


    public static void main(String args[]) throws Exception
    {
        Scanner read = new Scanner(System.in);
        System.out.println("Type number:");
        String i = read.nextLine();
        System.out.println("Your number is:" + i);
        int k = Integer.parseInt(i);
        int summa = k/100 + ((k-(k/100)*100)/10) + ((k- (k/100)*100) - ((((k- (k/100)*100)/10))*10));
        System.out.println(summa);
    }



}
