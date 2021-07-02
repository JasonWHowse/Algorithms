/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._07_mirror_lake;

public class CreateAnagram {

    /*
You are given two strings s and t of the same length, consisting of uppercase English letters. Your task is to find the minimum number of "replacement operations" needed to get some anagram of the string t from the string s. A replacement operation is performed by picking exactly one character from the string s and replacing it by some other character.
     */

    int createAnagram(String s, String t) {
        for(int i = 0; i<s.length();i++){
            t=t.replaceFirst(""+s.charAt(i),"");
        }//for(int i = 0; i<s.length();i++){
        return t.length();
    }//int createAnagram(String s, String t) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] string s

Guaranteed constraints:
5 ≤ s.length ≤ 35.

[input] string t

Guaranteed constraints:
t.length = s.length.

[output] integer

The minimum number of replacement operations needed to get an anagram of the string t from the string s.
     */

}//public class CreateAnagram {
