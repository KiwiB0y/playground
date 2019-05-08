public class BinSearch {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};


        System.out.println(binSearch(array, 4));
    }
    
    //INCOMPLETE ALGORITHM ***

    public static int[] sortedArray(int[] array){

        // Sorting MergeSort!!!

        int[] newArr = new int[array.length];

        int left = array[0];
        int right = array.length - 1;
        int pivot;

        while (l) { // To be continued!!!


        }

        return newArr;
    }

    public static boolean binSearch(int[] array, int num) {

        int l = array[0];
        int r = array[array.length - 1];
        int median;

        while (r >= l) {
            median = (l + r) / 2;

            if (num == median) {
                System.out.print("found: " + num + " = ");
                return true;
            } else {
                if (num < median) {
                    r = median - 1;
                } else {
                    l = median + 1;
                }
            }
            System.out.println("iteration");
        }
        return false;
    }
}
