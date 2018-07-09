package sums;

import java.util.HashMap;

public class LeetCode167 {
//    Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
//
//The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
//
//Note:
//
//Your returned answers (both index1 and index2) are not zero-based.
//You may assume that each input would have exactly one solution and you may not use the same element twice.
//Example:
//
//Input: numbers = [2,7,11,15], target = 9
//Output: [1,2]
//Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
    public static int[] twoSum(int[] nums, int target){
        //time O(n)
        //space O(1)
        if(nums == null || nums.length < 2)
            return null;
        int[] res = new int[2];
        int low = 0, high = nums.length - 1;
        while(low < high){
            if(nums[low] + nums[high] < target){
                low++;
            }
            else if(nums[low] + nums[high] > target){
                high--;
            }
            else{
                res[0] = low+1;
                res[1] = high+1;
                break;
            }
        }
        return res;

        //time O(n)
        //space O(n)

        // this is to use the hashmap, which is not practical as we already sort the array
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i = 0 ; i < nums.length; i++){
//            if(map.containsKey(target - nums[i])){
//                res[0] = map.get(target - nums[i]) + 1;
//                res[1] = i + 1;
//                break;
//            }
//
//            map.put(nums[i], i);
//        }
//        return res;
    }

}
