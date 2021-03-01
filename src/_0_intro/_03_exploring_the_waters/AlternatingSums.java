/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._03_exploring_the_waters;

public class AlternatingSums {

/*
    You are given an array of positive integers - the
    weights of the people. Return an array of two
    integers, where the first element is the total
    weight of team 1, and the second element is the
    total weight of team 2 after the division is
    complete.
 */

    int[] alternatingSums(int[] a) {
        int t1C, t2C;
        t1C=t2C=0;
        for(int i=0;i<a.length;i++){
            if(i%2==0){
                t1C+=a[i];
            }else{//if(i%2==0){
                t2C+=a[i];
            }//else{
        }//for(int i=0;i<a.length;i++){
        return new int[] {t1C,t2C};
    }//int[] alternatingSums(int[] a) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer a

Guaranteed constraints:
1 ≤ a.length ≤ 105,
45 ≤ a[i] ≤ 100.

[output] array.integer
 */

}//public class AlternatingSums {