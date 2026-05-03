// import java.util.HashMap;

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for (int i = 0; i < nums.length; i++) {
//             for(int j=i+1; j<nums.length; j++){
//                 if(nums[i]+nums[j]==target){
//                     return new int[]{i, j};
//                 }
//             }
//         }
//         return new int[]{};
            

    // public static void main(String[] args) {
    //     Solution sol = new Solution();
    //     int arr[] = {2, 7, 11, 15};
    //     int target = 9;
    //     int result[] = sol.twoSum(arr, target);

    //     System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
//     }
// }


import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            
            map.put(nums[i], i);
        }
        
        return new int[]{};
    }
}