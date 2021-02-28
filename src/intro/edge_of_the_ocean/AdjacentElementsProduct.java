/*
 * Authored by: Jason Wesley Howse
 */

package intro.edge_of_the_ocean;

public class AdjacentElementsProduct {

/*
Given an array of integers, find the pair of adjacent elements
that has the largest product and return that product.
 */

    public int adjacentElementsProduct(int[] inputArray) {
        int highProduct=inputArray[0]*inputArray[1];
        for(int i=1;i<inputArray.length-1;i++){
            if(inputArray[i]*inputArray[i+1]>highProduct){
                highProduct=inputArray[i]*inputArray[i+1];
            }//if(inputArray[i]*inputArray[i+1]>HighProduct){
        }//for(int i=1;i<inputArray.length-1;i++){
        return highProduct;
    }//public int adjacentElementsProduct(int[] inputArray) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer inputArray

An array of integers containing at least two elements.

Guaranteed constraints:
2 ≤ inputArray.length ≤ 10,
-1000 ≤ inputArray[i] ≤ 1000.
*/

}//public class AdjacentElementsProduct {