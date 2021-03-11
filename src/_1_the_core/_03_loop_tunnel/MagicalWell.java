/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._03_loop_tunnel;

public class MagicalWell {

    /*
You are standing at a magical well. It has two positive
integers written on it: a and b. Each time you cast a
magic marble into the well, it gives you a * b dollars
and then both a and b increase by 1. You have n magic
marbles. How much money will you make?
     */

    int magicalWell(int a, int b, int n) {
        int out=0;
        for(int i=0;i<n;i++){
            out+=(a+i)*(b+i);
        }//for(int i=0;i<n;i++){
        return out;
    }//int magicalWell(int a, int b, int n) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer a

Guaranteed constraints:
1 ≤ a ≤ 2000.

[input] integer b

Guaranteed constraints:
1 ≤ b ≤ 2000.

[input] integer n

The number of magic marbles in your possession, a non-negative integer.

Guaranteed constraints:
0 ≤ n ≤ 5.

[output] integer


     */

}//public class MagicalWell {
