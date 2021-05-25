using System.Collections.Generic;

namespace Algorithms.src.interview_practice._0_Data_Structures._2_Hash_Tables {
    public class AreFollowingPatterns {

        /*

Given an array strings, determine whether it follows the sequence given in the patterns array. In other words, there should be no i and j for which strings[i] = strings[j] and patterns[i] ≠ patterns[j] or for which strings[i] ≠ strings[j] and patterns[i] = patterns[j].

Example

For strings = ["cat", "dog", "dog"] and patterns = ["a", "b", "b"], the output should be
areFollowingPatterns(strings, patterns) = true;
For strings = ["cat", "dog", "doggy"] and patterns = ["a", "b", "b"], the output should be
areFollowingPatterns(strings, patterns) = false.
Input/Output

[execution time limit] 3 seconds (cs)

[input] array.string strings

An array of strings, each containing only lowercase English letters.

Guaranteed constraints:
1 ≤ strings.length ≤ 105,
1 ≤ strings[i].length ≤ 10.

[input] array.string patterns

An array of pattern strings, each containing only lowercase English letters.

Guaranteed constraints:
patterns.length = strings.length,
1 ≤ patterns[i].length ≤ 10.

[output] boolean

Return true if strings follows patterns and false otherwise.

        */

        public
        bool areFollowingPatterns(string[] a, string[] b) {
            var dict1 = new Dictionary<string, string>();
            var dict2 = new Dictionary<string, string>();
            for (int i = 0; i < a.Length; i++) {
                if (!dict1.TryAdd(a[i], b[i]) && !dict1[a[i]].Equals(b[i]) || !dict2.TryAdd(b[i], a[i]) && !dict2[b[i]].Equals(a[i])) {
                    return false;
                }//if (!dict1.TryAdd(a[i], b[i]) && !dict1[a[i]].Equals(b[i]) || !dict2.TryAdd(b[i], a[i]) && !dict2[b[i]].Equals(a[i])) {
            }//for (int i = 0; i < a.Length; i++) {
            return true;
        }//bool areFollowingPatterns(string[] a, string[] b) {
    }//public class AreFollowingPatterns {
}//namespace Algorithms.src.interview_practice._0_Data_Structures._2_Hash_Tables {
