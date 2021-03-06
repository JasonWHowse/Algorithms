/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._11_land_of_logic;

public class ValidTime {

/*
Check if the given string is a correct
time representation of the 24-hour clock.
 */

    boolean validTime(String time) {
        return Integer.parseInt(time.split(":")[0])<24&&Integer.parseInt(time.split(":")[1])<60;
    }//boolean validTime(String time) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] string time

A string representing time in HH:MM format. It is guaranteed that the first two characters, as well as the last two characters, are digits.

[output] boolean

true if the given representation is correct, false otherwise.
 */

}//public class ValidTime {
