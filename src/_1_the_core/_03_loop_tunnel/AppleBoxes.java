/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._03_loop_tunnel;

public class AppleBoxes {

    /*
You have k apple boxes full of apples. Each square box of
 size m contains m × m apples. You just noticed two
 interesting properties about the boxes:

    The smallest box is size 1, the next one is size 2,...,
     all the way up to size k.

    Boxes that have an odd size contain only yellow apples.
    Boxes that have an even size contain only red apples.

Your task is to calculate the difference between the number
of red apples and the number of yellow apples.
     */

    int appleBoxes(int k) {
        int out=0;
        for(int i=1;i<=k;i++){
            if(i%2==0){
                out+=i*i;
            }else{//if(i%2==0){
                out-=i*i;
            }//else{
        }//for(int i=1;i<=k;i++){
        return out;
    }//int appleBoxes(int k) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer k

A positive integer.

Guaranteed constraints:
1 ≤ k ≤ 40.

[output] integer

The difference between the two types of apples.
     */

}//public class AppleBoxes {
