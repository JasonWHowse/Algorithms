/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._07_mirror_lake;

import java.util.*;

public class IsSubstitutionCipher {

    /*
A ciphertext alphabet is obtained from the plaintext alphabet by means of rearranging some characters. For example "bacdef...xyz" will be a simple ciphertext alphabet where a and b are rearranged.

A substitution cipher is a method of encoding where each letter of the plaintext alphabet is replaced with the corresponding (i.e. having the same index) letter of some ciphertext alphabet.

Given two strings, check whether it is possible to obtain them from each other using some (possibly, different) substitution ciphers.
     */

    boolean isSubstitutionCipher(String string1, String string2) {
        Hashtable<Character,Character> ht = new Hashtable<>();
        Hashtable<Character,Character> th = new Hashtable<>();
        for(int i=0; i<string1.length();i++){
            if((null!=ht.putIfAbsent(string1.charAt(i),string2.charAt(i)) && ht.get(string1.charAt(i)) != string2.charAt(i))|(null!=th.putIfAbsent(string2.charAt(i),string1.charAt(i)) && th.get(string2.charAt(i)) != string1.charAt(i))){
                return false;
            }//if((null!=ht.putIfAbsent(string1.charAt(i),string2.charAt(i)) && ht.get(string1.charAt(i)) != string2.charAt(i))|(null!=th.putIfAbsent(string2.charAt(i),string1.charAt(i)) && th.get(string2.charAt(i)) != string1.charAt(i))){
        }//for(int i=0; i<string1.length();i++){
        return true;
    }//bool isSubstitutionCipher(string string1, string string2) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] string string1

A string consisting of lowercase English characters.

Guaranteed constraints:
1 ≤ string1.length ≤ 10.

[input] string string2

A string consisting of lowercase English characters of the same length as string1.

Guaranteed constraints:
string2.length = string1.length.

[output] boolean
     */

}//public class IsSubstitutionCipher {
