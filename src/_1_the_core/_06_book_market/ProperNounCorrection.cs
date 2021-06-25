namespace Algorithms.src._1_the_core._06_book_market {
    public class ProperNounCorrection {

        /*

Proper nouns always begin with a capital letter, followed by small letters.

Correct a given proper noun so that it fits this statement.

Example

For noun = "pARiS", the output should be
properNounCorrection(noun) = "Paris";
For noun = "John", the output should be
properNounCorrection(noun) = "John".
Input/Output

[execution time limit] 3 seconds (cs)

[input] string noun

A string representing a proper noun with a mix of capital and small English letters.

Guaranteed constraints:
1 ≤ noun.length ≤ 10.

[output] string

Corrected (if needed) noun.

        */

        public
        string properNounCorrection(string noun) {
            return noun[0].ToString().ToUpper() + noun[1..].ToLower();
        }//string properNounCorrection(string noun) {
    }//public class ProperNounCorrection {
}//namespace Algorithms.src._1_the_core._06_book_market {
