/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._05_labyrinth_of_nested_loops;

public class CrosswordFormation {

    /*
You're a crossword fanatic, and have finally decided to try
and create your own. However, you also love symmetry and
good design, so you come up with a set of rules they should
follow:
    the crossword must contain exactly four words;
    these four words should form four pairwise intersections;
    all words must be written either left-to-right or
    top-to-bottom;
    the area of the rectangle formed by empty cells inside
    the intersections isn't equal to zero.
Given 4 words, find the number of ways to make a crossword
following the above-described rules. Note that two crosswords
which differ by rotation are considered different.
     */

    int crosswordFormation(String[] words) {
        return partialFormation( words[0], words[1], words[2], words[3] ) + partialFormation( words[0], words[1], words[3], words[2] ) + partialFormation( words[0], words[2], words[1], words[3] ) + partialFormation( words[0], words[2], words[3], words[1] ) + partialFormation( words[0], words[3], words[2], words[1] ) + partialFormation( words[0], words[3], words[1], words[2] );
    }//int crosswordFormation(String[] words) {

    private int partialFormation(String word0, String word1, String word2, String word3) {
        int output = 0;
        for(int i0 = 0; i0 < word0.length(); i0++) {
            for (int i1 = 0; i1 < word1.length(); i1++) {
                if (word0.charAt(i0) == word1.charAt(i1)) {
                    for (int j1 = 0; j1 < word1.length(); j1++) {
                        if (Math.abs(j1 - i1) <= 1) {
                            continue;
                        }//if (Math.abs(j1 - i1) <= 1) {
                        for (int i2 = 0; i2 < word2.length(); i2++) {
                            if (word1.charAt(j1) == word2.charAt(i2)) {
                                for(int j2 = 0; j2 < word2.length(); j2++) {
                                    if (Math.abs(j2 - i2) <= 1) {
                                        continue;
                                    }//if (Math.abs(j2 - i2) <= 1) {
                                    for (int i3 = 0; i3 < word3.length(); i3++) {
                                        if (word2.charAt(j2) == word3.charAt(i3) && i0 - (i2 - j2) >= 0 && i0 - (i2 - j2) < word0.length() && i3 - (j1 - i1) < word3.length() && i3 - (j1 - i1) >= 0 && word0.charAt(i0 - (i2 - j2)) == word3.charAt(i3 - (j1 - i1))) {
                                            output++;
                                        }//if (word2.charAt(j2) == word3.charAt(i3) && i0 - (i2 - j2) >= 0 && i0 - (i2 - j2) < word0.length() && i3 - (j1 - i1) < word3.length() && i3 - (j1 - i1) >= 0 && word0.charAt(i0 - (i2 - j2)) == word3.charAt(i3 - (j1 - i1))) {
                                    }//for (int i3 = 0; i3 < word3.length(); i3++) {
                                }//for(int j2 = 0; j2 < word2.length(); j2++) {
                            }//if (word1.charAt(j1) == word2.charAt(i2)) {
                        }//for (int i2 = 0; i2 < word2.length(); i2++) {
                    }//for (int j1 = 0; j1 < word1.length(); j1++) {
                }//if (word0.charAt(i0) == word1.charAt(i1)) {
            }//for (int i1 = 0; i1 < word1.length(); i1++) {
        }//for(int i0 = 0; i0 < word0.length(); i0++) {
        return output;
    }//private int partialFormation(String word0, String word1, String word2, String word3) {

    /*
Input/Output
[execution time limit] 3 seconds (java)
[input] array.String words
An array of distinct Strings, the words you need to use in your crossword.
Guaranteed constraints:
words.length = 4,
3 ≤ words[i].length < 15.
[output] integer
The number of ways to make a correct crossword of the desired formation.
     */

}//public class CrosswordFormation {