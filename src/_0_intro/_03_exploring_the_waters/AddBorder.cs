namespace Algorithms.src._0_intro._03_exploring_the_waters {
    public class AddBorder {

        /*

Given a rectangular matrix of characters, add a border of asterisks(*) to it.

Example

For

picture = ["abc",
           "ded"]
the output should be

addBorder(picture) = ["*****",
                      "*abc*",
                      "*ded*",
                      "*****"]
Input/Output

[execution time limit] 3 seconds (cs)

[input] array.string picture

A non-empty array of non-empty equal-length strings.

Guaranteed constraints:
1 ≤ picture.length ≤ 100,
1 ≤ picture[i].length ≤ 100.

[output] array.string

The same matrix of characters, framed with a border of asterisks of width 1.

        */

        public
        string[] addBorder(string[] picture) {
            string[] output = new string[picture.Length + 2];
            output[0] = "";
            output[output.Length - 1] = "";
            for(int i = 0; i < picture[0].Length+2; i++) {
                output[0] += "*";
                output[output.Length - 1] += "*";
            }//for(int i = 0; i < picture[0].Length; i++) {
            for (int i = 0; i < picture.Length; i++) {
                output[i+1]="*"+picture[i]+"*";
            }//for (int i = 0; i < picture.Length; i++) {
            return output;
        }//string[] addBorder(string[] picture) {
    }//public class AddBorder {
}//namespace Algorithms.src._0_intro._03_exploring_the_waters {
