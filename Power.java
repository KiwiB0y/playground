package zada4ka;

public class Power {

    public static void main(String[] args) {

        int b = 3;

        System.out.println((int)pow(b, 4));

    }

    public static double pow(double a, int n) {

        double power = 1;

        if (n < 0){
            return -1;
        }
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return a;
        }

        for (int i = 1; i <= n; i++) {
            power = power * a;
        }
        return power;
    }

}
