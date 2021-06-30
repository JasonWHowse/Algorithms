/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._06_book_market;

public class IsUnstablePair {

    /*
Some file managers sort filenames taking into account case of the letters, others compare strings as if all of the letters are of the same case. That may lead to different ways of filename ordering.

Call two filenames an unstable pair if their ordering depends on the case.

To compare two filenames a and b, find the first position i at which a[i] ≠ b[i]. If a[i] < b[i], then a < b. Otherwise a > b. If such position doesn't exist, the shorter string goes first.

Given two filenames, check whether they form an unstable pair.
     */

    boolean isUnstablePair(String filename1, String filename2) {
        return filename1.compareTo(filename2)*filename1.compareToIgnoreCase(filename2)<0;
    }//boolean isUnstablePair(String filename1, String filename2) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] string filename1

A non-empty string of English letters and digits.

Guaranteed constraints:
1 ≤ filename1.length ≤ 10.

[input] string filename2

A non-empty string of English letters and digits. It's guaranteed that there is no ambiguity, i.e. even being considered in the same case strings are never equal.

Guaranteed constraints:
1 ≤ filename2.length ≤ 10.

[output] boolean

true if filename1 and filename2 form an unstable pair, false otherwise.
     */

}//public class IsUnstablePair {
