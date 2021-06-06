using System.Collections.Generic;

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
        //TODO: Finish the class
        int crosswordFormation(string[] words) {
            HashSet<char>[] Word = new HashSet<char>[4];
            CrosswordWordCrossSection word0 = new CrosswordWordCrossSection(words);
            CrosswordWordCrossSection word1 = new CrosswordWordCrossSection(words[1], words[2], words[3]);
            CrosswordWordCrossSection word2 = new CrosswordWordCrossSection(words[2], words[3], words[1]);
            CrosswordWordCrossSection word3 = new CrosswordWordCrossSection(words[3], words[2], words[1]);
            string output = word0.primaryWord;
            for(int i = 0; i < 4; i++) {
                if (word0.GetDictionary().ContainsKey(words[i])) {
                    output += "\r\n\t" + words[i];
                    for (int j = 0; j < words[i].Length; j++) {
                        if (word0.GetDictionary()[words[i]].ContainsKey(j)) {
                            output += "\r\n\t\t" + j + ":";
                            foreach (int item in word0.GetDictionary()[words[i]][j]) {
                                output += item + ",";
                            }
                        }
                    }
                }
            }
            output += "\r\n" + word1.primaryWord;
            for (int i = 0; i < 4; i++) {
                if (word1.GetDictionary().ContainsKey(words[i])) {
                    output += "\r\n\t" + words[i];
                    for (int j = 0; j < words[i].Length; j++) {
                        if (word1.GetDictionary()[words[i]].ContainsKey(j)) {
                            output += "\r\n\t\t" + j + ":";
                            foreach (int item in word1.GetDictionary()[words[i]][j]) {
                                output += item + ",";
                            }
                        }
                    }
                }
            }
            output += "\r\n" + word2.primaryWord;
            for (int i = 0; i < 4; i++) {
                if (word2.GetDictionary().ContainsKey(words[i])) {
                    output += "\r\n\t" + words[i];
                    for (int j = 0; j < words[i].Length; j++) {
                        if (word2.GetDictionary()[words[i]].ContainsKey(j)) {
                            output += "\r\n\t\t" + j + ":";
                            foreach (int item in word2.GetDictionary()[words[i]][j]) {
                                output += item + ",";
                            }
                        }
                    }
                }
            }
            output += "\r\n" + word3.primaryWord;
            for (int i = 0; i < 4; i++) {
                if (word3.GetDictionary().ContainsKey(words[i])) {
                    output += "\r\n\t" + words[i];
                    for (int j = 0; j < words[i].Length; j++) {
                        if (word3.GetDictionary()[words[i]].ContainsKey(j)) {
                            output += "\r\n\t\t" + j + ":";
                            foreach (int item in word3.GetDictionary()[words[i]][j]) {
                                output += item + ",";
                            }
                        }
                    }
                }
            }
            return 0;

        }//int crosswordFormation(string[] words) {

        private class CrosswordWordCrossSection {
            public readonly string primaryWord = "";
            private readonly string[] xSectionWords = new string[0];
            private Dictionary<string, Dictionary<int, List<int>>> listOfXsections = new Dictionary<string, Dictionary<int, List<int>>>();
            public readonly int Length;
            public Dictionary<string,Dictionary<int,List<int>>> GetDictionary() {
                return listOfXsections;
            }
            public List<int> GetPathByWordAndLocation (string key,int index) {
                return listOfXsections[key][index];
            }
            public CrosswordWordCrossSection(params string[] args) {
                primaryWord = args[0];
                xSectionWords = new string[args.Length - 1];
                for(int i = 1; i < args.Length; i++) {
                    xSectionWords[i - 1] = args[i];
                }
                Length = args.Length - 1;
                WriteDictionary();
            }
            private void WriteDictionary() {
                foreach(string word in xSectionWords) {
                    if (!listOfXsections.ContainsKey(word)) {
                        listOfXsections.Add(word,new Dictionary<int, List<int>>());
                        for(int i = 0; i < primaryWord.Length; i++) {
                            for(int j = 0; j < word.Length; j++) {
                                if (primaryWord[i] == word[j]) {
                                    if (!listOfXsections[word].ContainsKey(i)) {
                                        listOfXsections[word].Add(i, new List<int>());
                                    }
                                    listOfXsections[word][i].Add(j);
                                }
                            }
                        }
                    }
                }
            }
        }
    }//public class CrosswordFormation {
}//namespace Algorithms.src._1_the_core._05_labyrinth_of_nested_loops {
