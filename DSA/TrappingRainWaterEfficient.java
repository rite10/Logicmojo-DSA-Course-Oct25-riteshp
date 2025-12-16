class TrappingRainWaterEfficient {
    public int trap(int[] height) {
        int left = 0;                       // left pointer
        int right = height.length - 1;      // right pointer
        int leftMax = 0;                    // max height on the left side so far
        int rightMax = 0;                   // max height on the right side so far
        int totalWater = 0;                 // total trapped water

        while (left < right) {
            // Move the pointer with the smaller height
            if (height[left] < height[right]) {
                // If the current left bar is taller than any before, update leftMax
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    // Water trapped = leftMax - current height
                    totalWater += leftMax - height[left];
                }
                left++;
            } else {
                // If the current right bar is taller than any before, update rightMax
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    // Water trapped = rightMax - current height
                    totalWater += rightMax - height[right];
                }
                right--;
            }
        }
        return totalWater;
    }
}
