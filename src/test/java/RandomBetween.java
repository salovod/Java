public class RandomBetween {

    public static void main(String args[]) throws Exception {
        int a = 6;
        int b = 8;
        int c = (int) (Math.random() * (b - a) + 1) + a;
        System.out.println("Случайное число из отрезка " + a + "," + b + " равно " + c);
    }
}
