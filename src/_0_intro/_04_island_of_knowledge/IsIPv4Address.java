/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._04_island_of_knowledge;

public class IsIPv4Address {

    /*
An IP address is a numerical label assigned to each
device (e.g., computer, printer) participating in a
computer network that uses the Internet Protocol for
. There are two versions of the Internet protocol,
and thus two versions of addresses. One of them is
the IPv4 address.

Given a string, find out if it satisfies the IPv4
address naming rules.
     */

    boolean isIPv4Address(String inputString) {
        String[] ipList=inputString.split("\\.");
        for(int i=0;i<4;i++){
            if(ipList.length!=4||
                    ipList[i].length()==0 ||
                    ipList[i].length()>3||
                    (ipList[i].length()>1&& ipList[i].charAt(0)=='0') ||
                    !ipList[i].matches("[0-9]+") ||
                    Integer.parseInt(ipList[i])>255
            )
                return false;
        }//for(int i=0;i<4;i++){
        return true;
    }//boolean isIPv4Address(String inputString) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] string inputString

A string consisting of digits, full stops and lowercase English letters.

Guaranteed constraints:
1 ≤ inputString.length ≤ 30.

[output] boolean

true if inputString satisfies the IPv4 address naming rules, false otherwise.
     */

}//public class IsIPv4Address {
