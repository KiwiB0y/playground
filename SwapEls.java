public class SwapEls {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 5, 4, 6};
        print(array);
        System.out.println();
        swap(array,3,4);
    }

    public static void print(int[] array){

        for (int x : array) {
            if (x != array[array.length-1])
                System.out.print(x + ", ");
            else
                System.out.print(x);
        }

    }

    public static void swap (int[] array, int i1, int i2){

        int temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;

        for (int x : array) {
            if (x != array[array.length-1])
                System.out.print(x + ", ");
            else
                System.out.print(x);
        }

    }
}
