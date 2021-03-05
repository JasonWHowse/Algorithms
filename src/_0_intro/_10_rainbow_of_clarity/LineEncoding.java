/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._10_rainbow_of_clarity;

public class LineEncoding {

/*
Given a string, return its encoding defined as follows:

First, the string is divided into the least possible
number of disjoint substrings consisting of identical
characters
    for example, "aabbbc" is divided into
["aa", "bbb", "c"]

Next, each substring with length greater than one is
replaced with a concatenation of its length and the
repeating character
    for example, substring "bbb" is replaced by "3b"

Finally, all the new strings are concatenated together
in the same order and a new string is returned.
 */

    String lineEncoding(String s) {
        String outS="";
        int encoder=1;
        char lastChar=s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==lastChar){
                encoder++;
            }else{//if(s.charAt(i)==lastChar){
                outS=(encoder==1)?outS+lastChar:outS+encoder+lastChar;
                lastChar=s.charAt(i);
                encoder=1;
            }//else{
        }//for(int i=1;i<s.length();i++){
        outS=(encoder==1)?outS+lastChar:outS+encoder+lastChar;
        return outS;
    }//String lineEncoding(String s) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] string s

String consisting of lowercase English letters.

Guaranteed constraints:
4 ≤ s.length ≤ 15.

[output] string

Encoded version of s.
 */

}//public class LineEncoding {
