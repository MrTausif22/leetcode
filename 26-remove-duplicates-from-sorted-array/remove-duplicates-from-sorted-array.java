class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;   // correct size

        if (n == 0) return 0;

        int i = 0;  // slow pointer

        for (int j = 1; j < n; j++) {  // fast pointer
            if (nums[i] != nums[j]) {  // new unique element found
                i++;
                nums[i] = nums[j];     // place unique element at correct position
            }
        }
        return i + 1;  // number of unique elements
    }
}
