﻿namespace Algorithms.src._1_the_core._03_loop_tunnel {
    public class Candles {

        /*

When a candle finishes burning it leaves a leftover. makeNew leftovers can be combined to make a new candle, which, when burning down, will in turn leave another leftover.

You have candlesNumber candles in your possession. What's the total number of candles you can burn, assuming that you create new candles as soon as you have enough leftovers?

Example

For candlesNumber = 5 and makeNew = 2, the output should be
candles(candlesNumber, makeNew) = 9.

Here is what you can do to burn 9 candles:

burn 5 candles, obtain 5 leftovers;
create 2 more candles, using 4 leftovers (1 leftover remains);
burn 2 candles, end up with 3 leftovers;
create another candle using 2 leftovers (1 leftover remains);
burn the created candle, which gives another leftover (2 leftovers in total);
create a candle from the remaining leftovers;
burn the last candle.
Thus, you can burn 5 + 2 + 1 + 1 = 9 candles, which is the answer.

Input/Output

[execution time limit] 3 seconds (cs)

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

        public
        int candles(int candlesNumber, int makeNew) {
            int R = 0;
            int output= candlesNumber;
            while (candlesNumber > 0) {
                int BurntCandles = candlesNumber + R;
                R = BurntCandles % makeNew;
                candlesNumber = BurntCandles / makeNew;
                output+= candlesNumber;
            }//while(candlesNumber>0) {
            return output;
        }//int candles(int candlesNumber, int makeNew) {
    }//public class Candles {
}//namespace Algorithms.src._1_the_core._03_loop_tunnel {
