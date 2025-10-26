class RotateArray {
    public static void main(String[] args) {
        // Example input
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;

        // Create a RotateSolution object
        RotateSolution sol = new RotateSolution();

        // Call the rotate method
        sol.rotate(nums, k);

        // Print the result
        System.out.print("Rotated Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println(); // for new line
    }
}

// Your RotateSolution class (same as LeetCode)
class RotateSolution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // handle cases where k >= n

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    // Helper function to reverse part of the array
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
