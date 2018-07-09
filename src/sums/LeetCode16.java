package sums;

import java.util.Arrays;

public class LeetCode16 {
//    Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
//
//Example:
//
//Given array nums = [-1, 2, 1, -4], and target = 1.
//
//The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
    // time O(n^2)
    // space O(1)
    public int threeSumClosest(int[] nums, int target) {
        int res = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            int low = i + 1, high = nums.length - 1;
            while(low < high){
                int temp = nums[i] + nums[low] + nums[high];
                if(temp < target){
                    low++;
                }
                else if(temp > target){
                    high--;
                }
                else return target;
                if(Math.abs(temp - target) < Math.abs(res - target)){
                    res = temp;
                }
            }
        }
        return res;
    }

    public static void main(String[]args){

    }
}
