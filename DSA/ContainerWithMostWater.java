import java.util.Scanner;

public class ContainerWithMostWater {

    public static int maxUnitOfWater(int[] array) {
        int left = 0;
        int right = array.length - 1;

        int maxWater = 0;

        while (left < right) {
            int width = right - left;
            int currentHeight = Math.min(array[left], array[right]);
            int area = width * currentHeight;
            maxWater = Math.max(maxWater, area);
            if (array[left] < array[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {

        // int[] array = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("The max water unit is : " + maxUnitOfWater(array));
    }
}
