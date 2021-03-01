/*
 * Authored by: Jason Wesley Howse
 */

/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._02_smooth_sailing;

import java.util.ArrayList;
import java.util.Stack;

public class ReverseInParentheses {

/*
Write a function that reverses characters in
(possibly nested) parentheses in the input string.

Input strings will always be well-formed with
matching ()s.
 */

    String reverseInParentheses(String inputString) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder is=new StringBuilder(inputString);
        for(int i=0;i<is.length();i++){
            if(is.charAt(i)=='('){
                stack.push(i);
            }//if(is.charAt(i)=='('){
            if(is.charAt(i)==')'){
                is.replace(stack.peek()+1,i,
                        new StringBuilder(is.substring(
                        stack.pop()+1,i)).reverse().toString());
            }//if(is.charAt(i)==')'){
        }//for(int i=0;i<is.length();i++){
        return is.toString().replace("(","")
                .replace(")","");
    }//String reverseInParentheses(String inputString) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] string inputString

A string consisting of lowercase English letters and the characters ( and ). It is guaranteed that all parentheses in inputString form a regular bracket sequence.

Guaranteed constraints:
0 ≤ inputString.length ≤ 50.

[output] string

Return inputString, with all the characters that were in parentheses reversed.
 */

}
