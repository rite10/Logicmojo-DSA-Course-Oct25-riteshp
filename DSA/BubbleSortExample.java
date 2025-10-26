public class BubbleSortExample {

    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 1 };
        int n = arr.length;
        System.out.println("Original array:");
        printArray(arr);
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.print("After pass " + (i + 1) + ": ");
            printArray(arr);
        }

    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
