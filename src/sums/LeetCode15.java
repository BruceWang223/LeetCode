package sums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode15 {
//    Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
//
//Note:
//
//The solution set must not contain duplicate triplets.
//
//Example:
//
//Given array nums = [-1, 0, 1, 2, -1, -4],
//
//A solution set is:
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]

    public static List<List<Integer>>threeSum(int[] nums){
        if(nums == null || nums.length < 3){
            return null;
        }
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-2; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int low = i + 1, hi = nums.length - 1, sum = 0 - nums[i];
            while(low < hi){
                if(nums[low] + nums[hi] == sum){
                    res.add(Arrays.asList(nums[hi],nums[low],nums[i]));
                    while(low < hi && nums[low+1] == nums[low]) low++;
                    while(low < hi && nums[hi-1] == nums[hi]) hi--;
                    low++;
                    hi--;
                }
                else if(nums[low] + nums[hi] < sum)
                    low++;
                else
                    hi--;
            }
        }
        return res;
    }

    public static void main(String[]args){

    }
}
