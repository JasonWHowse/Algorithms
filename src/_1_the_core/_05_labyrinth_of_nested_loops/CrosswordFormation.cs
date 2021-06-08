namespace Algorithms.src._1_the_core._05_labyrinth_of_nested_loops {
    public class CrosswordFormation {

        /*

You're a crossword fanatic, and have finally decided to try and create your own. However, you also love symmetry and good design, so you come up with a set of rules they should follow:

the crossword must contain exactly four words;
these four words should form four pairwise intersections;
all words must be written either left-to-right or top-to-bottom;
the area of the rectangle formed by empty cells inside the intersections isn't equal to zero.
Given 4 words, find the number of ways to make a crossword following the above-described rules. Note that two crosswords which differ by rotation are considered different.

Example

For words = ["crossword", "square", "formation", "something"], the output should be
crosswordFormation(words) = 6.

The six crosswords can be formed as shown below:

  f                         f                             f
  o                     c r o s s w o r d     c r o s s w o r d
c r o s s w o r d           r   o                   q     r
  m   q                     m   m                   u     m
  a   u            ;  s q u a r e          ;        a     a
  t   a                     t   t                   r     t
  i   r                     i   h             s o m e t h i n g
s o m e t h i n g           o   i                         o
  n                         n   n                         n
                                g                               
                                                              
    c         s               s                                      
f o r m a t i o n       c     q               c         s          
    o         m         r     u               r         o      
    s q u a r e       f o r m a t i o n       o         m            
    s         t    ;    s     r            ;  s q u a r e                  
    w         h         s o m e t h i n g     s         t         
    o         i         w                     w         h     
    r         n         o                   f o r m a t i o n            
    d         g         r                     r         n         
                        d                     d         g             
Input/Output

[execution time limit] 3 seconds (cs)

[input] array.string words

An array of distinct strings, the words you need to use in your crossword.

Guaranteed constraints:
words.length = 4,
3 ≤ words[i].length < 15.

[output] integer

The number of ways to make a correct crossword of the desired formation.

        */

        public
        int crosswordFormation(string[] words) {
            return PartialFormation( words[0], words[1], words[2], words[3] ) + PartialFormation( words[0], words[1], words[3], words[2] ) + PartialFormation( words[0], words[2], words[1], words[3] ) + PartialFormation( words[0], words[2], words[3], words[1] ) + PartialFormation( words[0], words[3], words[2], words[1] ) + PartialFormation( words[0], words[3], words[1], words[2] );
        }//int crosswordFormation(string[] words) {

        private int PartialFormation(string word0, string word1, string word2, string word3) {
            int output = 0;
            for(int i0 = 0; i0 < word0.Length; i0++) {
                for (int i1 = 0; i1 < word1.Length; i1++) {
                    if (word0[i0] == word1[i1]) {
                        for (int j1 = 0; j1 < word1.Length; j1++) {
                            if (System.Math.Abs(j1 - i1) <= 1) {
                                continue;
                            }//if (System.Math.Abs(j1 - i1) <= 1) {
                            for (int i2 = 0; i2 < word2.Length; i2++) {
                                if (word1[j1] == word2[i2]) {
                                    for(int j2 = 0; j2 < word2.Length; j2++) {
                                        if (System.Math.Abs(j2 - i2) <= 1) {
                                            continue;
                                        }//if (System.Math.Abs(j2 - i2) <= 1) {
                                        for (int i3 = 0; i3 < word3.Length; i3++) {
                                            if (word2[j2] == word3[i3] && i0 - (i2 - j2) >= 0 && i0 - (i2 - j2) < word0.Length && i3 - (j1 - i1) < word3.Length && i3 - (j1 - i1) >= 0 && word0[i0 - (i2 - j2)] == word3[i3 - (j1 - i1)]) {
                                                output++;
                                            }//if (word2[j2] == word3[i3] && i0 - (i2 - j2) >= 0 && i0 - (i2 - j2) < word0.Length && i3 - (j1 - i1) < word3.Length && i3 - (j1 - i1) >= 0 && word0[i0 - (i2 - j2)] == word3[i3 - (j1 - i1)]) {
                                        }//for(int i3 = 0; i3 < word3.Length; i3++) {
                                    }//for(int j2 = 0; j2 < word2.Length; j2++) {
                                }//if (word1[j1] == word2[i2]) {
                            }//for (int i2 = 0; i2 < word2.Length; i2++) {
                        }//for (int j1 = 0; j1 < word1.Length; j1++) {
                    }//if (word0[i0] == word1[i1]) {
                }//for (int i1 = 0; i1 < word1.Length; i1++) {
            }//for(int i0 = 0; i0 < word0.Length; i0++) {
            return output;
        }//private int PartialFormation(string word0, string word1, string word2, string word3) {
    }//public class CrosswordFormation {
}//namespace Algorithms.src._1_the_core._05_labyrinth_of_nested_loops {
