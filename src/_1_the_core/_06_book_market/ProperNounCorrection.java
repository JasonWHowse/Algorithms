/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._06_book_market;

import java.util.Locale;

public class ProperNounCorrection {

    /*
Proper nouns always begin with a capital letter, followed by small letters.

Correct a given proper noun so that it fits this statement.
     */

    String properNounCorrection(String noun) {
        return noun.toUpperCase().charAt(0)+noun.substring(1).toLowerCase();
    }//String properNounCorrection(String noun) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] string noun

A string representing a proper noun with a mix of capital and small English letters.

Guaranteed constraints:
1 ≤ noun.length ≤ 10.

[output] string

Corrected (if needed) noun.
     */

}//public class ProperNounCorrection {
