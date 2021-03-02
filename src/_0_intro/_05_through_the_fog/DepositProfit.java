/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._05_through_the_fog;

public class DepositProfit {

/*
You have deposited a specific amount of money
 into your bank account. Each year your balance
 increases at the same growth rate. With the
 assumption that you don't make any additional
 deposits, find out how long it would take for
 your balance to pass a specific threshold.
 */

    int depositProfit(int deposit, int rate, int threshold) {
        int y=0;
        double d=deposit;
        while(d<threshold){
            d=(d*(rate/100.0d))+d;
            y++;
        }//while(d<threshold){
        return y;
    }//int depositProfit(int deposit, int rate, int threshold) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer deposit

The initial deposit, guaranteed to be a positive integer.

Guaranteed constraints:
1 ≤ deposit ≤ 100.

[input] integer rate

The rate of increase. Each year the balance increases by the rate percent of the current sum.

Guaranteed constraints:
1 ≤ rate ≤ 100.

[input] integer threshold

The target balance.

Guaranteed constraints:
deposit < threshold ≤ 200.

[output] integer

The number of years it would take to hit the threshold.
 */

}//public class DepositProfit {