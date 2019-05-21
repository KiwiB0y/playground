public class Factorial {

    public static int factorialRec(int n){

        if (n == 0)
            return 1;
        if (n == 1)
            return n;
        else
            return factorialRec(n-1) * n;
    }

    public static int factorialIter(int n){

        int product = n;

        if (n == 0){
            return 1;
        } else {
            for (int i = 1; i < n; i++) {
                product = product * i;
            }
        }
        return product;
    }


    public static void main(String[] args) {

        if (args.length == 0){
            return;
        }

        int friends = Integer.parseInt(args[0]);

        System.out.println(factorialRec(friends));

        System.out.println(factorialIter(friends));

    }
}
