﻿namespace Algorithms.src._0_intro._09_eruption_of_light {
    public class IsBeautifulString {

        /*

A string is said to be beautiful if each letter in the string appears at most as many times as the previous letter in the alphabet within the string; ie: b occurs no more times than a; c occurs no more times than b; etc. Note that letter a has no previous letter.

Given a string, check whether it is beautiful.

Example

For inputString = "bbbaacdafe", the output should be isBeautifulString(inputString) = true.

This string contains 3 as, 3 bs, 1 c, 1 d, 1 e, and 1 f (and 0 of every other letter), so since there aren't any letters that appear more frequently than the previous letter, this string qualifies as beautiful.

For inputString = "aabbb", the output should be isBeautifulString(inputString) = false.

Since there are more bs than as, this string is not beautiful.

For inputString = "bbc", the output should be isBeautifulString(inputString) = false.

Although there are more bs than cs, this string is not beautiful because there are no as, so therefore there are more bs than as.

Input/Output

[execution time limit] 3 seconds (cs)

[input] string inputString

A string of lowercase English letters.

Guaranteed constraints:
3 ≤ inputString.length ≤ 50.

[output] boolean

Return true if the string is beautiful, false otherwise.

        */

        public
        bool isBeautifulString(string inputString){
            int lastCount = inputString.Length;
            for (char i = 'a'; i <= 'z'; i++) {
                int i1 = inputString.Length - inputString.Replace(i+"", "").Length;
                if (lastCount < i1) {
                    return false;
                }//if(lastCount< i1){
                lastCount = i1;
            }//for(char i='a';i<='z';i++){
            return true;
        }//bool isBeautifulString(string inputString{
    }//public class IsBeautifulString {
}//namespace Algorithms.src._0_intro._09_eruption_of_light {