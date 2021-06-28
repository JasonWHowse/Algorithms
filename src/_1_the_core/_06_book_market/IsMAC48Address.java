/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._06_book_market;

public class IsMAC48Address {

    /*
A media access control address (MAC address) is a unique identifier assigned to network interfaces for communications on the physical network segment.

The standard (IEEE 802) format for printing MAC-48 addresses in human-friendly form is six groups of two hexadecimal digits (0 to 9 or A to F), separated by hyphens (e.g. 01-23-45-67-89-AB).

Your task is to check by given string inputString whether it corresponds to MAC-48 address or not.
     */

    boolean isMAC48Address(String inputString) {
        return inputString.matches("[\\da-fA-F][\\da-fA-F]-[\\da-fA-F][\\da-fA-F]-[\\da-fA-F][\\da-fA-F]-[\\da-fA-F][\\da-fA-F]-[\\da-fA-F][\\da-fA-F]-[\\da-fA-F][\\da-fA-F]");
    }//boolean isMAC48Address(String inputString) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] string inputString

Guaranteed constraints:
15 ≤ inputString.length ≤ 20.

[output] boolean

true if inputString corresponds to MAC-48 address naming rules, false otherwise.
     */

}//public class IsMAC48Address {
