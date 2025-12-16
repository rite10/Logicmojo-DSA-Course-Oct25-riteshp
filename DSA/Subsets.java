import java.util.*;

public class Subsets {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {

        // Debug: show entry into this recursive call
        System.out.println("ENTER → index=" + index + " current=" + current);

        // Line 2 — add current subset
        result.add(new ArrayList<>(current));
        System.out.println("  ADD SUBSET → " + current);

        // Line 3 — loop
        for (int i = index; i < nums.length; i++) {

            System.out.println("  LOOP i=" + i + " index=" + index + " current=" + current);

            // Line 4 — choose
            current.add(nums[i]);
            System.out.println("    ADD → " + nums[i] + " → current=" + current);

            // Line 5 — recurse deeper
            backtrack(i + 1, nums, current, result);

            // Line 6 — backtrack
            System.out.println("    REMOVE → " + current.get(current.size() - 1));
            current.remove(current.size() - 1);
            System.out.println("    AFTER REMOVE → current=" + current);
        }

        // Debug: leaving this recursion level
        System.out.println("EXIT ← index=" + index + " current=" + current);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> res = subsets(nums);
        System.out.println("\nFINAL RESULT:");
        System.out.println(res);
    }
}
