/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._0_Data_Structures._2_Hash_Tables;

import java.util.Hashtable;

public class AreFollowingPatterns {

    /*
Given an array strings, determine whether it follows the sequence given in the patterns array. In other words, there should be no i and j for which strings[i] = strings[j] and patterns[i] ≠ patterns[j] or for which strings[i] ≠ strings[j] and patterns[i] = patterns[j].
     */

    boolean areFollowingPatterns(String[] strings, String[] patterns) {
        Hashtable<String, String> dict1 = new Hashtable<>();
        Hashtable<String, String> dict2 = new Hashtable<>();
        for(int i=0; i<strings.length;i++){
            if(dict1.putIfAbsent(strings[i],patterns[i])!=null && !dict1.get(strings[i]).equals(patterns[i])|| dict2.putIfAbsent(patterns[i],strings[i])!=null && !dict2.get(patterns[i]).equals(strings[i])){
                return false;
            }//if(dict1.putIfAbsent(strings[i],patterns[i])!=null && !dict1.get(strings[i]).equals(patterns[i])|| dict2.putIfAbsent(patterns[i],strings[i])!=null && !dict2.get(patterns[i]).equals(strings[i])){
        }//for(int i=0; i<strings.length;i++){
        return true;
    }//boolean areFollowingPatterns(String[] strings, String[] patterns) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

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

}//public class AreFollowingPatterns {
