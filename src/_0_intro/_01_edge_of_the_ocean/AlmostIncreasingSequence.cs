namespace Algorithms.src._0_intro._01_edge_of_the_ocean {
    public class AlmostIncreasingSequence {

        /*

Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence by removing no more than one element from the array.

Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... < an. Sequence containing only one element is also considered to be strictly increasing.

Example

For sequence = [1, 3, 2, 1], the output should be
almostIncreasingSequence(sequence) = false.

There is no one element in this array that can be removed in order to get a strictly increasing sequence.

For sequence = [1, 3, 2], the output should be
almostIncreasingSequence(sequence) = true.

You can remove 3 from the array to get the strictly increasing sequence [1, 2]. Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].

Input/Output

[execution time limit] 3 seconds (cs)

[input] array.integer sequence

Guaranteed constraints:
2 ≤ sequence.length ≤ 105,
-105 ≤ sequence[i] ≤ 105.

[output] boolean

Return true if it is possible to remove one element from the array in order to get a strictly increasing sequence, otherwise return false.

        */

        public
        bool almostIncreasingSequence(int[] sequence) {
            bool flag = false;
            for (int i = 0; i < sequence.Length - 1; i++) {
                if (!flag && sequence[i] >= sequence[i + 1]) {
                    if (i + 2 >= sequence.Length || sequence[i] < sequence[i + 2]) {
                        i++;
                        flag = true;
                    } else if (i - 1 < 0 || sequence[i - 1] < sequence[i + 1]) {//if (i + 2 >= sequence.Length || sequence[i] < (sequence[i + 2])) {
                        flag = true;
                    } else {//else if (i - 1 < 0 || sequence[i - 1] < sequence[i + 1]) {
                        return false;
                    }//else{
                } else if (flag && sequence[i] >= sequence[i + 1]) {//if (!flag && sequence[i] >= sequence[i + 1]) {
                    return false;
                }//else if (flag && sequence[i] >= sequence[i + 1]) {
            }//for(int i=0;i<sequence.Length-1;i++) {
            return true;
        }//bool almostIncreasingSequence(int[] sequence) {
    }//public class AlmostIncreasingSequence {
}//namespace Algorithms.src._0_intro._01_edge_of_the_ocean {