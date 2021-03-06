/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._11_land_of_logic;

public class LongestWord {

/*
Define a word as a sequence of consecutive
English letters. Find the longest word from
the given string.
 */

    String longestWord(String text) {
        String out="";
        text=text.replaceAll("[^ A-Za-z]"," ");
        for(String s:text.split("[ ]")){
            if(out.length()<s.length()){
                out=s;
            }//if(out.length()<s.length()){
        }//for(String s:text.split("\\s")){
        return out;
    }//String longestWord(String text) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] string text

Guaranteed constraints:
4 ≤ text.length ≤ 50.

[output] string

The longest word from text. It's guaranteed that there is a unique output.
 */

}//public class LongestWord {
