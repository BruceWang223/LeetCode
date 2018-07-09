package sums;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class LeetCode18 {
//    Given an array nums of n integers and an integer target, are there elements a, b, c, and d in nums such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.
//
//Note:
//
//The solution set must not contain duplicate quadruplets.
//
//Example:
//
//Given array nums = [1, 0, -1, 0, -2, 2], and target = 0.
//
//A solution set is:
//[
//  [-1,  0, 0, 1],
//  [-2, -1, 1, 2],
//  [-2,  0, 0, 2]
//]
    //time O(n^3)
    //space O(1)
    public static List<List<Integer>>fourSum(int[]nums, int target){
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length < 4) return res;
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 3; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1; j < nums.length - 2; j++){
                if(j > i+1 && nums[j] == nums[j-1]) continue;
                int low = j + 1, high = nums.length - 1;
                while(low < high){
                    int temp = nums[i] + nums[j] + nums[low] + nums[high];
                    if(temp < target){
                        low++;
                    }
                    else if(temp > target){
                        high--;
                    }
                    else{
                        res.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
                        while(low < high && nums[low+1] == nums[low]) low++;
                        while(low < high && nums[high-1] == nums[high]) high--;
                        low++;
                        high--;
                    }
                }
            }
        }
        return res;

    }

    public static void main(String[]args){
        int[] temp = new int[]{1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> result = fourSum(temp,target);
        for(int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }

    }
}
