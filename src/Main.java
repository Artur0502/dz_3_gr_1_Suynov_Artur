public class Main {
    public static void main(String[] args) {
        double[] day = {-1.3, -1.4, 1.6, 1.9, -2.6, 5.8, 3.6, -6.4, 8.3, 4.7, -4.6, 2.6, 4.9, 2.4, -4.4};
        double a = 0;
        int b  = 0;
        boolean bool = false;
        for (double f : day) {
            if (f < 0) {
                bool = true;
            } else if (bool) {
                a++;
                b += f;
            }
        }
        System.out.println(a / b);
    }

}