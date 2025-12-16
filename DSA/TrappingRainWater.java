import java.util.Scanner;

public class TrappingRainWater {

    static int calucateTrapWater(int[] a) {
        int result = 0;

        for (int i = 1; i <= a.length - 2; i++) {
            int lb = 0;
            for (int j = 0; j < i; j++) {
                if (a[j] > lb) {
                    lb = a[j];
                }           
            }
            int rb = 0;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > rb) {
                    rb = a[j];
                }
            }
            int wl = Math.min(lb, rb);
            int tw = wl - a[i];
            if (tw > 0)
                result += tw;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int trappedWater = calucateTrapWater(arr);
        System.out.println("Trapped water = " + trappedWater);

    }
}
