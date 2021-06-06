/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._08_dark_wilderness;

public class KnapsackLight {

/*
You found two items in a treasure chest! The
first item weighs weight1 and is worth value1,
and the second item weighs weight2 and is
worth value2. What is the total maximum value
of the items you can take with you, assuming
that your max weight capacity is maxW and you
can't come back for the items later?

Note that there are only two items and you
can't bring more than one item of each type,
i.e. you can't take two first items or two
second items.
 */

    int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
        return (weight1+weight2<=maxW)?value1+value2:
                (weight1<=maxW && (value1>value2||weight2>maxW))?value1:
                (weight2<=maxW)?value2:0;
    }//int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer value1

Guaranteed constraints:
2 ≤ value1 ≤ 20.

[input] integer weight1

Guaranteed constraints:
2 ≤ weight1 ≤ 10.

[input] integer value2

Guaranteed constraints:
2 ≤ value2 ≤ 20.

[input] integer weight2

Guaranteed constraints:
2 ≤ weight2 ≤ 10.

[input] integer maxW

Guaranteed constraints:
1 ≤ maxW ≤ 20.

[output] integer
 */

}//public class KnapsackLight {
