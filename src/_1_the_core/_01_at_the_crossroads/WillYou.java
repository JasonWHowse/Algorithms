/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._01_at_the_crossroads;

public class WillYou {

    /*
Once Mary heard a famous song, and a line from it stuck in
her head. That line was "Will you still love me when I'm no
longer young and beautiful?". Mary believes that a person
is loved if and only if he/she is both young and beautiful,
but this is quite a depressing thought, so she wants to put
her belief to the test.

Knowing whether a person is young, beautiful and loved, find
out if they contradict Mary's belief.

A person contradicts Mary's belief if one of the following
statements is true:

they are young and beautiful but not loved;
they are loved but not young or not beautiful.
     */

    boolean willYou(boolean young, boolean beautiful, boolean loved) {
        return (young&&beautiful)!=loved;
    }//boolean willYou(boolean young, boolean beautiful, boolean loved) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] boolean young

[input] boolean beautiful

[input] boolean loved

[output] boolean

true if the person contradicts Mary's belief, false otherwise.
     */

}//public class WillYou {
