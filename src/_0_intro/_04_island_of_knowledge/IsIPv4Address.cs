using System.Text.RegularExpressions;

namespace Algorithms.src._0_intro._04_island_of_knowledge {
    public class IsIPv4Address {

        /*

An IP address is a numerical label assigned to each device (e.g., computer, printer) participating in a computer network that uses the Internet Protocol for communication. There are two versions of the Internet protocol, and thus two versions of addresses. One of them is the IPv4 address.

Given a string, find out if it satisfies the IPv4 address naming rules.

Example

For inputString = "172.16.254.1", the output should be
isIPv4Address(inputString) = true;

For inputString = "172.316.254.1", the output should be
isIPv4Address(inputString) = false.

316 is not in range [0, 255].

For inputString = ".254.255.0", the output should be
isIPv4Address(inputString) = false.

There is no first number.

Input/Output

[execution time limit] 3 seconds (cs)

[input] string inputString

A string consisting of digits, full stops and lowercase English letters.

Guaranteed constraints:
1 ≤ inputString.length ≤ 30.

[output] boolean

true if inputString satisfies the IPv4 address naming rules, false otherwise.

        */

        public
        bool isIPv4Address(string inputString) {
            string[] ipList = inputString.Split('.');
            for (int i = 0; i < 4; i++) {
                if (ipList.Length != 4 || ipList[i].Length == 0 || ipList[i].Length > 3 || (ipList[i].Length > 1 && (ipList[i])[0] == '0') || !Regex.IsMatch(ipList[i], "^[0-9]+$") || int.Parse(ipList[i]) > 255) { 
                    return false;
                }//if (ipList.Length != 4 || ipList[i].Length == 0 || ipList[i].Length > 3 || (ipList[i].Length > 1 && (ipList[i])[0] == '0') || !Regex.IsMatch(ipList[i], "^[0-9]+$") || int.Parse(ipList[i]) > 255) { 
            }//for (int i = 0; i < 4; i++) {
            return true;
        }//bool isIPv4Address(string inputString) {
    }//public class IsIPv4Address {
}//namespace Algorithms.src._0_intro._04_island_of_knowledge {
