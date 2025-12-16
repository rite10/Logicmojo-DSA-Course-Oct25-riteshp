import java.util.Arrays;
import java.util.Scanner;

public class PairSmallestMaximum {

    public static int findSmallestMaximumPair(int[] array) {
        Arrays.sort(array);
        int maxSum = 0;
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int pairSum = array[left] + array[right];
            maxSum = Math.max(maxSum, pairSum);
            left++;
            right--;
        }
        return maxSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inputArraySize = sc.nextInt();
        int[] array = new int[inputArraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int maxSum = findSmallestMaximumPair(array);
        System.out.println(maxSum + " ");

    }
}

// Trick
/*
 * Sort the Arary
 * add smallest number with bigest number.
 */
