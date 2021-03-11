/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._03_loop_tunnel;

public class AdditionWithoutCarrying {

    /*
A little boy is studying arithmetic. He has just
learned how to add two integers, written one below
another, column by column. But he always forgets
about the important part - carrying.

Given two integers, your task is to find the
result which the little boy will get.

Note: The boy had learned from this site, so feel
free to check it out too if you are not familiar
with column addition.
     */

    int additionWithoutCarrying(int param1, int param2) {
        int m=1;
        int out=0;
        while(param1!=0||param2!=0){
            out=out+((param1%10+param2%10)%10)*m;
            m*=10;
            param1/=10;
            param2/=10;
        }
        return out;
    }//int additionWithoutCarrying(int param1, int param2) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer param1

A non-negative integer.

Guaranteed constraints:
0 ≤ param1 < 105.

[input] integer param2

A non-negative integer.

Guaranteed constraints:
0 ≤ param2 < 6 · 104.

[output] integer

The result that the little boy will get by using column addition without carrying.


     */

}//public class AdditionWithoutCarrying {
