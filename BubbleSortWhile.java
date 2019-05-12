public class BubbleSortWhile {

    public static void main(String[] args) {

        int[] array1 = {53, 8, 72, 34};

        printArr(array1);
        System.out.println();
        printArr(bubbleSortWhile(array1));
        System.out.println();



    }

    public static void printArr(int[] arr){

        for (int i : arr) {
            if (i != arr[arr.length - 1])
                System.out.print(i + ", ");
            else
                System.out.print(i);
        }

    }

    public static int[] bubbleSortWhile(int[] array){

        int iterations = 0;

        if (array.length == 0)
            System.out.println("Empty");

        while (iterations <= array.length - 1){

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]){
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            iterations++;
        }


        return array;
    }

}
