/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._07_diving_deeper;

import java.util.HashSet;

public class DifferentSymbolsNaive {

/*
Given a string, find the number of different characters in it.
 */

    int differentSymbolsNaive(String s) {
        HashSet<Character> hS=new HashSet<>();
        for(int i=0;i<s.length();i++){
            hS.add(s.charAt(i));
        }//for(int i=0;i<s.length();i++){
        return hS.size();
    }//int differentSymbolsNaive(String s) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] string s

A string of lowercase English letters.

Guaranteed constraints:
3 ≤ s.length ≤ 1000.

[output] integer
 */

}//public class DifferentSymbolsNaive {
