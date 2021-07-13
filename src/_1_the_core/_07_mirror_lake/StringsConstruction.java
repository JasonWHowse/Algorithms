/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._07_mirror_lake;

public class StringsConstruction {

    /*
Given two strings a and b, both consisting only of lowercase English letters, your task is to calculate how many strings equal to a can be constructed using only letters from the string b? Each letter can be used only once and in one string only.
     */

    int stringsConstruction(String a, String b){
        a=" "+a+" ";
        b=" "+b+" ";
        int output = b.split(""+a.charAt(1)).length - 1;
        for(char i = 'a'; i <= 'z'; i++) {
            if (a.split(""+i).length > 1) {
                int tempOut = (b.split(""+i).length - 1) / (a.split(""+i).length - 1);
                if (output > tempOut) {
                    output = tempOut;
                }//if (output > tempOut) {
            }//if (a.split(""+i).length > 1) {
        }//for(char i = 'a'; i <= 'z'; i++) {
        return output;
    }//int stringsConstruction(String a, String b){

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] string a

String to construct, containing only lowercase English letters.

Guaranteed constraints:
1 ≤ a.length ≤ 105.

[input] string b

String containing needed letters, containing only lowercase English letters.

Guaranteed constraints:
1 ≤ b.length ≤ 105.

[output] integer

The number of strings a that can be constructed from the string b.
     */

}//public class StringsConstruction {
