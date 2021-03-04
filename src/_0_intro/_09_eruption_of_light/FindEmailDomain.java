/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._09_eruption_of_light;

public class FindEmailDomain {

/*
An email address such as "John.Smith@example.com"
is made up of a local part ("John.Smith"), an "@"
symbol, then a domain part ("example.com").

The domain name part of an email address may only
consist of letters, digits, hyphens and dots. The
local part, however, also allows a lot of different
special characters. Here you can look at several
examples of correct and incorrect email addresses.

Given a valid email address, find its domain part.
 */

    //todo: finish class
    String findEmailDomain(String address) {
        return address.split("@")[address.split("@").length-1];
    }//String findEmailDomain(String address) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] string address

Guaranteed constraints:
10 ≤ address.length ≤ 50.

[output] string
 */

}//public class FindEmailDomain {
