/*
 * Authored by: Jason Wesley Howse
 */

package intro.edge_of_the_ocean;

import java.util.ArrayList;
import java.util.List;

public class AlmostIncreasingSequence {

/*
Given a sequence of integers as an array, determine
whether it is possible to obtain a strictly increasing
sequence by removing no more than one element from the
array.

Note: sequence a0, a1, ..., an is considered to be a
strictly increasing if a0 < a1 < ... < an. Sequence
containing only one element is also considered to be
strictly increasing.
 */

    boolean almostIncreasingSequence(int[] sequence) {
        boolean flag=false;
        for(int i=0;i<sequence.length-1;i++) {
            if (!flag && sequence[i] >= sequence[i + 1]) {//sequence error
                if (i + 2 >= sequence.length || sequence[i] < (sequence[i + 2])) {
                    i++;
                    flag = true;
                } else if (i - 1 < 0 || sequence[i - 1] < sequence[i + 1]) {//if (i + 2 >= sequence.length || sequence[i] < (sequence[i + 2])) {
                    flag = true;
                } else{//else if (i - 1 < 0 || sequence[i - 1] < sequence[i + 1]) {
                    return false;
                }//else{
            } else if (flag && sequence[i] >= sequence[i + 1]) {//if (!flag && sequence[i] >= sequence[i + 1]) {
                return false;
            }//else if (flag && sequence[i] >= sequence[i + 1]) {
        }//for(int i=0;i<sequence.length-1;i++) {
        return true;
    }//boolean almostIncreasingSequence(int[] sequence) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer sequence

Guaranteed constraints:
2 ≤ sequence.length ≤ 105,
-105 ≤ sequence[i] ≤ 105.

[output] boolean

Return true if it is possible to remove one
element from the array in order to get a
strictly increasing sequence, otherwise return false.
 */

}//public class AlmostIncreasingSequence {
