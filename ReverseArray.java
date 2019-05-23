public class ReverseArray {

    public static int[] reverseArray(int[] array){

        for (int i = 0; i <= array.length - 1; i++) {

            array[i] = array[array.length - 1] - i;

        }

        return array;
    }

    public static void display(int[] array){

        for (int i : array){
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};

        display(reverseArray(array));
    }

}
