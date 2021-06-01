using System.Collections.Generic;
using System.Text;

namespace Algorithms.src.interview_practice._0_Data_Structures._2_Hash_Tables {
    public class SwapLexOrder {

        /*

Given a string str and array of pairs that indicates which indices in the string can be swapped, return the lexicographically largest string that results from doing the allowed swaps. You can swap indices any number of times.

Example

For str = "abdc" and pairs = [[1, 4], [3, 4]], the output should be
swapLexOrder(str, pairs) = "dbca".

By swapping the given indices, you get the strings: "cbda", "cbad", "dbac", "dbca". The lexicographically largest string in this list is "dbca".

Input/Output

[execution time limit] 3 seconds (cs)

[input] string str

A string consisting only of lowercase English letters.

Guaranteed constraints:
1 ≤ str.length ≤ 104.

[input] array.array.integer pairs

An array containing pairs of indices that can be swapped in str (1-based). This means that for each pairs[i], you can swap elements in str that have the indices pairs[i][0] and pairs[i][1].

Guaranteed constraints:
0 ≤ pairs.length ≤ 5000,
pairs[i].length = 2.

[output] string

        */

        public
        string swapLexOrder(string str, int[][] pairs) {
            List<List<int>> list = new List<List<int>>();
            List<char> holder = new List<char>();
            char[] strCharArr = str.ToCharArray();
            foreach (var pair in pairs) {
                list.Add(new List<int>(new int[] { pair[0] - 1, pair[1] - 1 }));
            }//foreach (var pair in pairs) {
            for (int i = 0; i < list.Count; i++) {
                for (int j = i + 1; j < list.Count; j++) {
                    if (list[i].Contains(list[j][0])) {
                        if (!list[i].Contains(list[j][1])) {
                            list[i].Add(list[j][1]);
                        }//if (!list[i].Contains(list[j][1])) {
                        list.RemoveAt(j);
                        j = i;
                    } else if (list[i].Contains(list[j][1])) {//if (list[i].Contains(list[j][0])) {
                        if (!list[i].Contains(list[j][0])) {
                            list[i].Add(list[j][0]);
                        }//if (!list[i].Contains(list[j][0])) {
                        list.RemoveAt(j);
                        j = i;
                    }//else if (list[i].Contains(list[j][1])) {
                }
                list[i].Sort();
                for(int j = 0; j < list[i].Count; j++) {
                    holder.Add(strCharArr[list[i][j]]);
                }//for(int j = 0; j < list[i].Count; j++) {
                holder.Sort();
                for(int j = 0; j < holder.Count; j++) {
                    strCharArr[list[i][j]] = holder[^(j+1)];
                }//for(int j = 0; j < holder.Count; j++) {
                holder = new List<char>();
            }//for (int i = 0; i < list.Count; i++) {
            return new string(strCharArr);
        }//string swapLexOrder(string str, int[][] pairs)
    }//public class SwapLexOrder {
}//namespace Algorithms.src.interview_practice._0_Data_Structures._2_Hash_Tables {
