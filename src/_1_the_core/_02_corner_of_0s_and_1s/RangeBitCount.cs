namespace Algorithms.src._1_the_core._02_corner_of_0s_and_1s {
    public class RangeBitCount {

        /*

You are given two numbers a and b where 0 ≤ a ≤ b. Imagine you construct an array of all the integers from a to b inclusive. You need to count the number of 1s in the binary representations of all the numbers in the array.

Example

For a = 2 and b = 7, the output should be
rangeBitCount(a, b) = 11.

Given a = 2 and b = 7 the array is: [2, 3, 4, 5, 6, 7]. Converting the numbers to binary, we get [10, 11, 100, 101, 110, 111], which contains 1 + 2 + 1 + 2 + 2 + 3 = 11 1s.

Input/Output

[execution time limit] 3 seconds (cs)

[input] integer a

Guaranteed constraints:
0 ≤ a ≤ b.

[input] integer b

Guaranteed constraints:
a ≤ b ≤ 10.

[output] integer

        */

        public
        int rangeBitCount(int a, int b) {
            int output= 0;
            for (; a <= b; a++) {
                int c = a;
                while (c != 0) {
                    output+= c != (c >> 1) << 1 ? 1 : 0;
                    c = c >> 1;
                }//while(c!=0){
            }//for(;a<=b;a++){
            return output;
        }//int rangeBitCount(int a, int b) {
    }//public class RangeBitCount {
}//namespace Algorithms.src._1_the_core._02_corner_of_0s_and_1s {
