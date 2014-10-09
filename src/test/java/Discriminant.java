import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Discriminant {
    public static void main(String args[]) throws Exception {
        Scanner read = new Scanner(System.in);
        System.out.println("Input a");
        int a = Integer.parseInt(read.nextLine());
        System.out.println("Input b");
        int b = Integer.parseInt(read.nextLine());
        System.out.println("Input c");
        int c = Integer.parseInt(read.nextLine());
        double d = Math.pow(b, 2) - (4 * a * c);

        System.out.println(d);

        if (d == 0) {
            float e = -b / 2 * a;
            System.out.println("One result: " + e);
        } else if (d > 0) {
            float x1 = (float) ((-b + (sqrt(d))) / 2 * a);
            float x2 = (float) ((-b - (sqrt(d))) / 2 * a);
            System.out.println("2 results: " + x1 + "and " + x2);
        } else {
            System.out.println("Failed to compile");
        }
    }

}
