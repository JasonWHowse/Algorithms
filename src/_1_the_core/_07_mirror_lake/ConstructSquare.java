/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._07_mirror_lake;

import java.util.*;
import java.util.stream.Collectors;

public class ConstructSquare {

    /*
Given a String consisting of lowercase English letters, find the largest square number which can be obtained by reordering the String's characters and replacing them with any digits you need (leading zeros are not allowed) where same characters always map to the same digits and different characters always map to different digits.

If there is no solution, return -1.
     */

    int constructSquare(String s) {
        final String temp = s;
        s = Arrays.stream(s.split("")).sorted((d, c) -> ((int) c.charAt(0)) * (" " + temp + " ").split(c).length - (int) d.charAt(0) * (" " + temp + " ").split(d).length).collect(Collectors.joining(""));
        int max = (int) Math.pow(10.0, s.length());
        double sqrtMax = Math.sqrt(max);
        for (int i = (int) (sqrtMax % 10 == 0 ? sqrtMax - 1 : sqrtMax); i * i >= max / 10; i--) {
            final String temp2 = Integer.toString(i * i);
            if (isSubstitutionCipher(s, Arrays.stream(temp2.split("")).sorted((d, c) -> ((int) c.charAt(0)) * (" " + temp2 + " ").split(c).length - (int) d.charAt(0) * (" " + temp2 + " ").split(d).length).collect(Collectors.joining("")))) {
                return i * i;
            }//if (isSubstitutionCipher(s, reorderString(Integer.toString(i * i)))) {
        }//for (int i = (int)(sqrtMax % 10 == 0 ? sqrtMax - 1 : sqrtMax); i * i >= max / 10; i--) {
        return -1;
    }//int constructSquare(String s) {

    private boolean isSubstitutionCipher(String String1, String String2) {
        Hashtable<Character, Character> ht = new Hashtable<>();
        Hashtable<Character, Character> th = new Hashtable<>();
        for (int i = 0; i < String1.length(); i++) {
            if ((null != ht.putIfAbsent(String1.charAt(i), String2.charAt(i)) && ht.get(String1.charAt(i)) != String2.charAt(i)) | (null != th.putIfAbsent(String2.charAt(i), String1.charAt(i)) && th.get(String2.charAt(i)) != String1.charAt(i))) {
                return false;
            }//if((null!=ht.putIfAbsent(String1.charAt(i),String2.charAt(i)) && ht.get(String1.charAt(i)) != String2.charAt(i))|(null!=th.putIfAbsent(String2.charAt(i),String1.charAt(i)) && th.get(String2.charAt(i)) != String1.charAt(i))){
        }//for(int i=0; i<String1.length();i++){
        return true;
    }//bool isSubstitutionCipher(String String1, String String2) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] String s

Guaranteed constraints:
1 ≤ s.length < 10.

[output] integer
     */

}//public class ConstructSquare {
