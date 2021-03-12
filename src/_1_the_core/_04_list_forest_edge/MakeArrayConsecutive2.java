/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._04_list_forest_edge;

public class MakeArrayConsecutive2 {

    /*
Ratiorg got statues of different sizes as a present
from CodeMaster for his birthday, each statue
having an non-negative integer size. Since he likes
to make things perfect, he wants to arrange them
from smallest to largest so that each statue will
be bigger than the previous one exactly by 1. He
may need some additional statues to be able to
accomplish that. Help him figure out the minimum
number of additional statues needed.
     */

    int makeArrayConsecutive2(int[] statues) {
        java.util.Arrays.sort(statues);
        int count=0;
        for(int i =1; i<statues.length;i++){
            count+=(statues[i]-(statues[i-1]+1));
        }//for(int i =1; i<statues.length;i++){
        return count;
    }//int makeArrayConsecutive2(int[] statues) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer statues

An array of distinct non-negative integers.

Guaranteed constraints:
1 ≤ statues.length ≤ 10,
0 ≤ statues[i] ≤ 20.

[output] integer

The minimal number of statues that need to be added to existing statues such that it contains every integer size from an interval [L, R] (for some L, R) and no other sizes.
     */

}//public class MakeArrayConsecutive2 {
