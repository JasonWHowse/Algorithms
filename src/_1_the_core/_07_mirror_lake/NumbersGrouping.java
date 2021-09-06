/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._07_mirror_lake;

import java.util.HashSet;

public class NumbersGrouping {

    /*
You are given an array of integers that you want distribute between several groups. The first group should contain numbers from 1 to 104, the second should contain those from 104 + 1 to 2 * 104, ..., the 100th one should contain numbers from 99 * 104 + 1 to 106 and so on.

All the numbers will then be written down in groups to the text file in such a way that:

the groups go one after another;
each non-empty group has a header which occupies one line;
each number in a group occupies one line.
Calculate how many lines the resulting text file will have.
     */

    int numbersGrouping(int[] a) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i : a) {
            hs.add((i - 1) / 10000);
        }//for (int i : a) {
        return hs.size() + a.length;
    }//int numbersGrouping(int[] a) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer a

Guaranteed constraints:
1 ≤ a.length ≤ 105,
1 ≤ a[i] ≤ 109.

[output] integer

The number of lines needed to store the grouped numbers.
     */

}//public class NumbersGrouping {
