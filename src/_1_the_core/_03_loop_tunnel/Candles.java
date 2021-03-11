/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._03_loop_tunnel;

public class Candles {

    /*
When a candle finishes burning it leaves a leftover.
makeNew leftovers can be combined to make a new candle,
which, when burning down, will in turn leave another
leftover.

You have candlesNumber candles in your possession.
What's the total number of candles you can burn,
assuming that you create new candles as soon as you
have enough leftovers?
     */

    int candles(int candlesNumber, int makeNew) {
        int R=0;
        int out=candlesNumber;
        while(candlesNumber>0) {
            int BurntCandles = candlesNumber + R;
            R = BurntCandles % makeNew;
            candlesNumber = BurntCandles / makeNew;
            out+= candlesNumber;
        }//while(candlesNumber>0) {
        return out;
    }//int candles(int candlesNumber, int makeNew) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer candlesNumber

The number of candles you have in your possession.

Guaranteed constraints:
1 ≤ candlesNumber ≤ 15.

[input] integer makeNew

The number of leftovers that you can use up to create a new candle.

Guaranteed constraints:
2 ≤ makeNew ≤ 5.

[output] integer


     */

}//public class Candles {
