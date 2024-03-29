﻿using System.Collections.Generic;
using System.Linq;

namespace Algorithms.src._0_intro._02_smooth_sailing {
    public class ReverseInParentheses {

        /*

Write a function that reverses characters in (possibly nested) parentheses in the input string.

Input strings will always be well-formed with matching ()s.

Example

For inputString = "(bar)", the output should be
reverseInParentheses(inputString) = "rab";
For inputString = "foo(bar)baz", the output should be
reverseInParentheses(inputString) = "foorabbaz";
For inputString = "foo(bar)baz(blim)", the output should be
reverseInParentheses(inputString) = "foorabbazmilb";
For inputString = "foo(bar(baz))blim", the output should be
reverseInParentheses(inputString) = "foobazrabblim".
Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim".
Input/Output

[execution time limit] 3 seconds (cs)

[input] string inputString

A string consisting of lowercase English letters and the characters ( and ). It is guaranteed that all parentheses in inputString form a regular bracket sequence.

Guaranteed constraints:
0 ≤ inputString.length ≤ 50.

[output] string

Return inputString, with all the characters that were in parentheses reversed.


        */

        public
        string reverseInParentheses(string inputString) {
            Stack<int> stack = new Stack<int>();
            for (int i = 0; i < inputString.Length; i++) {
                if (inputString[i] == '(') {
                    stack.Push(i);
                }//if (inputString[i] == '(') {
                if (inputString[i] == ')') {
                    inputString = inputString.Substring(0, stack.Peek() + 1) + new string(inputString.Substring(stack.Peek() + 1, (i - stack.Pop()) - 1).ToCharArray().Reverse().ToArray()) + inputString[i..];
                }//if (inputString[i] == ')') {
            }//for (int i = 0; i <inputString.Length; i++) {
            return inputString.Replace("(", "").Replace(")", "");
        }//string reverseInParentheses(string inputString) {
    }//public class ReverseInParentheses {
}//namespace Algorithms.src._0_intro._02_smooth_sailing {