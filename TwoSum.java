
/** 
 * 
 *
 *  Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
*/


public class TwoSum {
    public static void main(String[] args) {
        int[] num={2,7,11,15};
        int target=26;
        int[] result=twoSum(num,target);
        for(int resultNum:result){
            System.out.println(resultNum);
        }
        
    }

    static int[] twoSum(int[] nums, int target) {
        int[] resultArr=new int[2];
        for(int i=0;i<nums.length;i++){

            for(int j=1;j<nums.length;j++){
                if(i==j)break;
            if (nums[i]+nums[j]==target){
                resultArr[0]=i;
                resultArr[1]=j;
            }
        }
        }
        return resultArr;
    }
}
/**
 * 
Two Sum
Roman to Integer
Palindrome Number
Maximum Subarray
Remove Element
Contains Duplicate
Add Two Numbers
Majority Element
Remove Duplicates from Sorted Array
 */