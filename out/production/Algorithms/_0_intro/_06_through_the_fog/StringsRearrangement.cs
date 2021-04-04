using System.Collections.Generic;

namespace Algorithms.src._0_intro._06_through_the_fog {
    public class StringsRearrangement {

        /*

Given an array of equal-length strings, you'd like to know if it's possible to rearrange the order of the elements in such a way that each consecutive pair of strings differ by exactly one character. Return true if it's possible, and false if not.

Note: You're only rearranging the order of the strings, not the order of the letters within the strings!

Example

For inputArray = ["aba", "bbb", "bab"], the output should be
stringsRearrangement(inputArray) = false.

There are 6 possible arrangements for these strings:

["aba", "bbb", "bab"]
["aba", "bab", "bbb"]
["bbb", "aba", "bab"]
["bbb", "bab", "aba"]
["bab", "bbb", "aba"]
["bab", "aba", "bbb"]
None of these satisfy the condition of consecutive strings differing by 1 character, so the answer is false.

For inputArray = ["ab", "bb", "aa"], the output should be
stringsRearrangement(inputArray) = true.

It's possible to arrange these strings in a way that each consecutive pair of strings differ by 1 character (eg: "aa", "ab", "bb" or "bb", "ab", "aa"), so return true.

Input/Output

[execution time limit] 3 seconds (cs)

[input] array.string inputArray

A non-empty array of strings of lowercase letters.

Guaranteed constraints:
2 ≤ inputArray.length ≤ 10,
1 ≤ inputArray[i].length ≤ 15.

[output] boolean

Return true if the strings can be reordered in such a way that each neighbouring pair of strings differ by exactly one character (false otherwise).

        */

        public
        bool stringsRearrangement(string[] inputArray) {
            Stack<int>[] stacks = new Stack<int>[inputArray.Length];
            for (int i = 0; i < inputArray.Length; i++) {
                stacks[i] = new Stack<int>();
                for (int j = 0; j < inputArray.Length; j++) {
                    if (IsSimilar(inputArray[i], inputArray[j])) {
                        stacks[i].Push(j);
                    }//if (IsSimilar(inputArray[i], inputArray[j])) {
                }//for (int j = 0; j < inputArray.Length; j++) {
                if (stacks[i].Count == 0) {
                    return false;
                }//if (stacks[i].Count==0) {
            }//for (int i = 0; i < inputArray.Length; i++) {
            for (int cIndex = 0; cIndex < inputArray.Length; cIndex++) {
                HashSet<int> hS = new HashSet<int>();
                hS.Add(cIndex);
                hS = CheckPath(new HashSet<int>(hS), StacksClone(stacks), cIndex);
                if (hS.Count == stacks.Length) {
                    return true;
                }//if (hS.Count == stacks.Length) {
            }//for (int cIndex = 0; cIndex < inputArray.Length; cIndex++) {
            return false;
        }//bool stringsRearrangement(string[] inputArray) {

        private HashSet<int> CheckPath(HashSet<int> hS, Stack<int>[] stacker, int index) {
            while (!(stacker[index].Count == 0)) {
                int cIndex = stacker[index].Pop();
                if (!hS.Contains(cIndex)) {
                    HashSet<int> nHS = new HashSet<int>(hS);
                    hS.Add(cIndex);
                    hS = CheckPath(new HashSet<int>(hS), StacksClone(stacker), cIndex);
                    if (hS.Count == stacker.Length) {
                        return hS;
                    } else {//if (hS.Count == stacker.Length) {
                        hS = new HashSet<int>(nHS); ;
                    }//else {
                }//if (!hS.Contains(cIndex)) {
            }//while (!(stacker[index].Count==0)) {
            return hS;
        }//private HashSet<int> CheckPath(HashSet<int> hS, Stack<int>[] stacker, int index) {

        private Stack<int>[] StacksClone(Stack<int>[] stackO) {
            Stack<int>[] stackNew = new Stack<int>[stackO.Length];
            Stack<int>[] stackOld = new Stack<int>[stackO.Length];
            for (int i = 0; i < stackO.Length; i++) {
                stackNew[i] = new Stack<int>();
                stackOld[i] = new Stack<int>();
                while (!(stackO[i].Count == 0)) {
                    int newItem = (int)stackO[i].Pop();
                    stackNew[i].Push(newItem);
                    stackOld[i].Push(newItem);
                }//while (!(stackO[i].Count==0)) {
                stackO[i] = stackOld[i];
            }//for (int i = 0; i < stackO.Length; i++) {
            return stackNew;
        }//private Stack<int>[] StacksClone(Stack<int>[] stackO) {

        private bool IsSimilar(string s1, string s2) {
            bool flag = false;
            for (int i = 0; i < s1.Length; i++) {
                if (s1[i] != s2[i]) {
                    if (flag) {
                        return false;
                    }//if (flag) {
                    flag = true;
                }//if (s1[i] != s2[i]) {
            }//for (int i = 0; i < s1.Length; i++) {
            return flag;
        }//private bool IsSimilar(string s1, string s2) {
    }//public class StringsRearrangement {
}//namespace Algorithms.src._0_intro._06_through_the_fog {
