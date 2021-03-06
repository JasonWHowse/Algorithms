/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._11_land_of_logic;

public class MessageFromBinaryCode {

/*
You are taking part in an Escape Room challenge
designed specifically for programmers. In your
efforts to find a clue, you've found a binary
code written on the wall behind a vase, and
realized that it must be an encrypted message.
After some thought, your first guess is that
each consecutive 8 bits of the code stand for
the character with the corresponding extended
ASCII code.

Assuming that your hunch is correct, decode the
message.
 */

    String messageFromBinaryCode(String code) {
        StringBuilder output= new StringBuilder();
        while(code.length()>0){
            output.append((char) Integer.parseInt(code.substring(0, 8), 2));
            code=code.substring(8);
        }//while(code.length()>0){
        return output.toString();
    }//String messageFromBinaryCode(String code) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] string code

A string, the encrypted message consisting of characters '0' and '1'.

Guaranteed constraints:
0 < code.length < 800.

[output] string

The decrypted message.


 */

}//public class MessageFromBinaryCode {
