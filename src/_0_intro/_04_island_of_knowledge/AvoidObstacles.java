/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._04_island_of_knowledge;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class AvoidObstacles {

    /*
You are given an array of integers representing
coordinates of obstacles situated on a straight
line.

Assume that you are jumping from the point with
coordinate 0 to the right. You are allowed only
to make jumps of the same length represented by
some integer.

Find the minimal length of the jump enough to
avoid all the obstacles.
     */

    int avoidObstacles(int[] inputArray) {
        HashSet<Integer> hS=new HashSet<>();
        for (int a:inputArray) {
            hS.add(a);
        }//for (int a:inputArray) {
        for (int i=1;i<= Collections.max(hS)+1;i++){
            boolean flag=false;
            if(!hS.contains(i)){
                for (int a:inputArray) {
                    if(a%i==0){
                        flag=false;
                        break;
                    }else{//if(a%i==0){
                        flag=true;
                    }//else{
                }//for (int a:inputArray) {
                if(flag){
                    return i;
                }//if(flag){
            }//if(!hS.contains(i)){
        }//for (int i=1;i<= Collections.max(hS)+1;i++){
        return -1;
    }//int avoidObstacles(int[] inputArray) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer inputArray

Non-empty array of positive integers.

Guaranteed constraints:
2 ≤ inputArray.length ≤ 1000,
1 ≤ inputArray[i] ≤ 1000.

[output] integer

The desired length.
     */

}//public class AvoidObstacles {
