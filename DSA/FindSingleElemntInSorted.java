import java.util.*;

public class FindSingleElemntInSorted {
    public static int findSingleElement(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // Ensure mid is even (start of a pair)
            if (mid % 2 == 1) {
                mid--;
            }

            // If the pair is valid, move right
            if (arr[mid] == arr[mid + 1]) {
                low = mid + 2;
            } else {
                // The single element is to the left or at mid
                high = mid;
            }
        }

        return arr[low];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(findSingleElement(arr));
    }
}
