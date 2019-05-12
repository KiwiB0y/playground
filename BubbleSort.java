package zada4ka;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = {2, 7, 62, 13, 4};

        printArray(array);
        System.out.println();
        printArray(bubbleSort(array));
    }

    public static void printArray(int[] array){

        for (int x : array){

            if (x == array[array.length - 1])
                System.out.print(x);
            else
                System.out.print(x + ", ");

        }

    }

    public static int[] bubbleSort(int[] array) {

        boolean swapped;

        do {

            swapped = false;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);


        return array;
    }
}
