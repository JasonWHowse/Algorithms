/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._01_at_the_crossroads;

public class ArithmeticExpression {

    /*
Consider an arithmetic expression of the form a#b=c.
Check whether it is possible to replace # with one
of the four signs: +, -, * or / to obtain a correct
expression.
     */

    boolean arithmeticExpression(int a, int b, int c) {
        return a+b==c||a-b==c||a*b==c||a/(float)b==c;
    }//boolean arithmeticExpression(int a, int b, int c) {

    /*
Input/Output

[execution time limit] 3 seconds (cs)

[input] integer a

Guaranteed constraints:
1 ≤ a ≤ 20.

[input] integer b

Guaranteed constraints:
1 ≤ b ≤ 20.

[input] integer c

Guaranteed constraints:
0 ≤ c ≤ 20.

[output] boolean

true if the desired replacement is possible, false otherwise.
     */

}//public class ArithmeticExpression {
