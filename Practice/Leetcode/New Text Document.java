// //Contain Duplicate 
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//        Set<Integer> dup = new HashSet<>();

//        for (int i = 0 ; i <= nums.length-1 ; i++){
//         if(dup.contains(nums[i])){
//             return true;
//         }
//         dup.add(nums[i]);
//        }
//        return false;
//     }
// }


// class Solution {
//     public int[] twoSum(int[] nums, int target) {

//         for(int i = 0; i < nums.length ; i++){
//             for(int j = 0 ; j < nums.length; j++){
//                 if(i != j && target == nums[i] + nums[j])
//                 return new int[]{i,j};
//         }
//     }
//     return new int[]{};
//     }
// }



