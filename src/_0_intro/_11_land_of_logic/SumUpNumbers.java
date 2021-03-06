/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._11_land_of_logic;

public class SumUpNumbers {

/*
CodeMaster has just returned from shopping. He
scanned the check of the items he bought and
gave the resulting string to Ratiorg to figure
out the total number of purchased items. Since
Ratiorg is a bot he is definitely going to
automate it, so he needs a program that sums up
all the numbers which appear in the given input.

Help Ratiorg by writing a function that returns
the sum of numbers that appear in the given
inputString.
 */

    int sumUpNumbers(String inputString) {
        int out=0;
        for(String s:inputString.split("\\D")){
            if(!s.isBlank()) {
                out += Integer.parseInt(s);
            }//if(!s.isBlank()) {
        }//for(String s:inputString.split("\\D")){
        return out;
    }//int sumUpNumbers(String inputString) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] string inputString

Guaranteed constraints:
0 ≤ inputString.length ≤ 105.

[output] integer
 */

}//public class SumUpNumbers {
