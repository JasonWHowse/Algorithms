/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._0_Data_Structures._2_Hash_Tables;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PossibleSums {

    /*
You have a collection of coins, and you know the values of the coins and the quantity of each type of coin in it. You want to know how many distinct sums you can make from non-empty groupings of these coins.
     */

    int possibleSums(int[] coins, int[] quantity) {
        HashSet<Integer> output = new HashSet<>();
        output.add(0);
        for(int i = 0; i < coins.length; i++) {
            List<Integer> list = new ArrayList<>(output);
            for(int o : list) {
                for(int j=0; j <= quantity[i]; j++) {
                    output.add(o + j * coins[i]);
                }//for(int j=0; j <= quantity[i]; j++) {
            }//for(int o : list) {
        }//for(int i = 0; i < coins.length; i++) {
        return output.size()-1;
    }//int possibleSums(int[] coins, int[] quantity) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer coins

An array containing the values of the coins in your collection.

Guaranteed constraints:
1 ≤ coins.length ≤ 20,
1 ≤ coins[i] ≤ 104.

[input] array.integer quantity

An array containing the quantity of each type of coin in your collection. quantity[i] indicates the number of coins that have a value of coins[i].

Guaranteed constraints:
quantity.length = coins.length,
1 ≤ quantity[i] ≤ 105,
(quantity[0] + 1) * (quantity[1] + 1) * ... * (quantity[quantity.length - 1] + 1) <= 106.

[output] integer

The number of different possible sums that can be created from non-empty groupings of your coins.
     */

}//public class PossibleSums {
