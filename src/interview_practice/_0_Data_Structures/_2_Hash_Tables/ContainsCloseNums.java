/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._0_Data_Structures._2_Hash_Tables;

import java.util.Hashtable;

public class ContainsCloseNums {

    /*
Given an array of integers nums and an integer k, determine whether there are two distinct indices i and j in the array where nums[i] = nums[j] and the absolute difference between i and j is less than or equal to k.
     */

    boolean containsCloseNums(int[] nums, int k) {
        var dict = new Hashtable<Integer,Integer>();
        for(int i = 0;i<nums.length;i++){
            if(dict.putIfAbsent(nums[i],i)!=null){
                if(i-dict.get(nums[i])<=k){
                    return true;
                }//if(i-dict.get(nums[i])<=k){
                dict.put(nums[i],i);
            }//if(dict.putIfAbsent(nums[i],i)!=null){
        }//for(int i = 0;i<nums.length;i++){
        return false;
    }//boolean containsCloseNums(int[] nums, int k) {

    /*
Input/Output

[execution time limit] 3 seconds (cs)

[input] array.integer nums

Guaranteed constraints:
0 ≤ nums.length ≤ 55000,
-231 - 1 ≤ nums[i] ≤ 231 - 1.

[input] integer k

Guaranteed constraints:
0 ≤ k ≤ 35000.

[output] boolean
     */

}//public class ContainsCloseNums {
