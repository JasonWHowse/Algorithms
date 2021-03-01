/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._03_exploring_the_waters;

import org.junit.platform.commons.util.StringUtils;

public class PalindromeRearranging {

/*
Given a string, find out if its characters can
be rearranged to form a palindrome.
 */

    boolean palindromeRearranging(String inputString) {
        char oddChar='0';
        for(int i=0;i<inputString.length();i++){
            if(charCounter(inputString,inputString.charAt(i))%2!=0){
                if(oddChar=='0'){
                    oddChar=inputString.charAt(i);
                }else if(oddChar!=inputString.charAt(i)){//if(oddChar=='0'){
                    return false;
                }//else if(oddChar!=inputString.charAt(i)){
            }//if(charCounter(inputString,inputString.charAt(i))%2!=0){
        }//for(int i=0;i<inputString.length();i++){
        return true;
    }//boolean palindromeRearranging(String inputString) {

    private int charCounter(String iS,char iC){
        int count=0;
        for(int i=0;i<iS.length();i++){
            if(iC==iS.charAt(i)){
                count++;
            }//if(iC==iS.charAt(i)){
        }//for(int i=0;i<iS.length();i++){
        return count;
    }//private int charCounter(String iS,char iC){

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] string inputString

A string consisting of lowercase English letters.

Guaranteed constraints:
1 ≤ inputString.length ≤ 50.

[output] boolean

true if the characters of the inputString can be rearranged to form a palindrome, false otherwise.
 */

}//public class PalindromeRearranging {