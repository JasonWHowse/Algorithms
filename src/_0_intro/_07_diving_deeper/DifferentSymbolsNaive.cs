using System.Collections.Generic;

namespace Algorithms.src._0_intro._07_diving_deeper {
    public class DifferentSymbolsNaive {

        /*

Given a string, find the number of different characters in it.

Example

For s = "cabca", the output should be
differentSymbolsNaive(s) = 3.

There are 3 different characters a, b and c.

Input/Output

[execution time limit] 3 seconds (cs)

[input] string s

A string of lowercase English letters.

Guaranteed constraints:
3 ≤ s.length ≤ 1000.

[output] integer

        */

        public
        int differentSymbolsNaive(string s) {
            return new HashSet<char>(s).Count;
        }//int differentSymbolsNaive(string s) {
    }//public class DifferentSymbolsNaive {
}//namespace Algorithms.src._0_intro._07_diving_deeper {
