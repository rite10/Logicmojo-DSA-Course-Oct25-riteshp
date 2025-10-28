import java.util.Scanner;

public class MoveZeroProblem {

    public static void moveZeroToEnd(int[] nums) {
        int n = nums.length;
        if (n == 0 || n == 1) {
            return;
        }
        int nz = 0;
        int z = 0;
        while (nz < n) {

            if (nums[nz] != 0) {
                int temp = nums[nz];
                nums[nz] = nums[z];
                nums[z] = temp;
                nz++;
                z++;
            } else {
                nz++;
            }
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        moveZeroToEnd(array);

    }

}
