import java.util.Scanner;

public class SortArray {

    public static void sortInAscendingOrder(int[] array) {
        /*
         * for (int i = 0; i < array.length - 1; i++) {
         * 
         * for (int j = 0; j < array.length - 1 - i; j++) {
         * 
         * if (array[j] > array[j + 1]) {
         * 
         * int temp = array[j];
         * array[j] = array[j + 1];
         * array[j + 1] = temp;
         * }
         * }
         * 
         * }
         */

        int low = 0;
        int mid = 0;
        int high = array.length - 1;
        while (mid <= high) {
            if (array[mid] == 0) {
                int temp = array[mid];
                array[mid] = array[low];
                array[low] = temp;
                low++;
                mid++;
            } else if (array[mid] == 1) {
                mid++;
            } else if (array[mid] == 2) {
                int temp = array[mid];
                array[mid] = array[high];
                array[high] = temp;
                high--;
            }
        }
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        sortInAscendingOrder(array);
    }
}