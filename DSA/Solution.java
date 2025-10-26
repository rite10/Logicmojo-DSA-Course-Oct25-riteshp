import java.util.HashMap;
import java.util.Scanner;

class Solution {

    public static int[] findArrayElements(int[] arr, int target) {
        HashMap<Integer, Integer> h = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int need = target - arr[i];
            if (h.containsKey(need)) {
                return new int[] { h.get(need), i };
            }
            // store current value -> index
            h.put(arr[i], i);
        }

        return null; // per problem there's always exactly one solution
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read length
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        // Read target
        if (!sc.hasNextInt()) return;
        int target = sc.nextInt();

        // Read array elements (may be on one line or across lines)
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (!sc.hasNextInt()) {
                // Not enough numbers provided; exit gracefully
                return;
            }
            arr[i] = sc.nextInt();
        }

        sc.close();

        int[] foundArray = findArrayElements(arr, target);
        if (foundArray != null) {
            // print as "index1 index2" (space separated) to match expected output
            System.out.println(foundArray[0] + " " + foundArray[1]);
        }
    }
}
