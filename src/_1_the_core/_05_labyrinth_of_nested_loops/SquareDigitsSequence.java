/*
 * Authored by: Jason Wesley Howse
 */

/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._05_labyrinth_of_nested_loops;

import java.util.HashSet;

public class SquareDigitsSequence {

    /*
Consider a sequence of numbers a0, a1, ..., an, in
which an element is equal to the sum of squared
digits of the previous element. The sequence ends
once an element that has already been in the sequence
appears again.

Given the first element a0, find the length of the
sequence.
     */

    int squareDigitsSequence(int a0) {
        HashSet<Integer> hS=new HashSet<>();
        int out=1;
        while(!hS.contains(a0)){
            hS.add(a0);
            out++;
            int outa=0;
            while(a0!=0){
                outa+=Math.pow(a0%10,2);
                a0/=10;
            }//while(a0!=0){
            a0=outa;
        }//while(!hS.contains(a0)){
        return out;
    }//int squareDigitsSequence(int a0) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer a0

First element of a sequence, positive integer.

Guaranteed constraints:
1 ≤ a0 ≤ 105.

[output] integer
     */

}//public class SquareDigitsSequence {
