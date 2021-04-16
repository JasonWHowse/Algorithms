/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._0_Data_Structures;
import java.util.HashSet;

public class FirstDuplicate {

    /*
Given an array a that contains only numbers in the range from 1 to a.length, find the first duplicate number for which the second occurrence has the minimal index. In other words, if there are more than 1 duplicated numbers, return the number for which the second occurrence has a smaller index than the second occurrence of the other number does. If there are no such elements, return -1.
   */

    int firstDuplicate(int[] a){
        HashSet<Integer> b=new HashSet<>();
        for (int j : a) {
            if (b.contains(j)) {
                return j;
            }//if (b.contains(j)) {
            b.add(j);
        }//for (int j : a) {
        return -1;
    }//int firstDuplicate(int[] a){

    /*
Input/Output

[execution time limit] 3 seconds (cs)

[input] array.integer a

Guaranteed constraints:
1 ≤ a.length ≤ 105,
1 ≤ a[i] ≤ a.length.

[output] integer

The element in a that occurs in the array more than once and has the minimal index for its second occurrence. If there are no such elements, return -1.
     */

}//public class FirstDuplicate {
