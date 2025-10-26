public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = { 5, 3, 4, 1 };
        int n = arr.length;
        printArray(arr);

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }

            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            System.out.print("After pass " + (i + 1) + ": ");
            printArray(arr);
        }
        System.out.println("Sorted array:");
        printArray(arr);

    }

    static void printArray(int[] array) {

        for (int i : array) {
            System.out.println(i);
        }
        System.out.println();
    }
}
