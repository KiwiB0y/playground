public class Fibonacci {

    public static void main(String[] args) {

        System.out.println(fibIter(8));
        System.out.println();
        System.out.println(fibRec(8));

    }

    public static int fibIter(int n){

        int[] Fib = new int[n + 1];

        if (n == 0) {
            return 0;
        }
        if (n == 1){
            return 1;
        }

        Fib[0] = 0;
        Fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            Fib[i] = Fib[i-1] + Fib[i-2];
        }
        System.out.println();
        return Fib[n];
    }

    public static int fibRec(int n){

        if (n == 0) {
            return 0;
        }
        if (n == 1){
            return 1;
        }

        return (fibRec(n-1)+fibRec(n-2));
    }

}
