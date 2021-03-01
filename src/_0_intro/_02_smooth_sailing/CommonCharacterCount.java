/*
 * Authored by: Jason Wesley Howse
 */

/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._02_smooth_sailing;

public class CommonCharacterCount {

/*
Given two strings, find the number of common characters
between them.
 */

    int commonCharacterCount(String s1, String s2) {
        int count=0;
        for(int i=0; i<s1.length();i++){
            int index=s2.indexOf(s1.charAt(i));
            if(index!=-1){
                s2=s2.replaceFirst(""+s2.charAt(index),"");
                count++;
            }//if(index!=-1){
        }//for(int i=0; i<s1.length();i++){
        return count;
    }//int commonCharacterCount(String s1, String s2) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] string s1

A string consisting of lowercase English letters.

Guaranteed constraints:
1 ≤ s1.length < 15.

[input] string s2

A string consisting of lowercase English letters.

Guaranteed constraints:
1 ≤ s2.length < 15.
 */

}//public class CommonCharacterCount {