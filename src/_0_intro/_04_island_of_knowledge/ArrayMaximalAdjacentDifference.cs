namespace Algorithms.src._0_intro._04_island_of_knowledge {
    public class ArrayMaximalAdjacentDifference {

        /*

Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.

Example

For inputArray = [2, 4, 1, 0], the output should be
arrayMaximalAdjacentDifference(inputArray) = 3.

Input/Output

[execution time limit] 3 seconds (cs)

[input] array.integer inputArray

Guaranteed constraints:
3 ≤ inputArray.length ≤ 10,
-15 ≤ inputArray[i] ≤ 15.

[output] integer

The maximal absolute difference.

        */

        public
        int arrayMaximalAdjacentDifference(int[] inputArray) {
            int max = 0;
            for (int i = 0; i < inputArray.Length - 1; i++) {
                if (System.Math.Abs(inputArray[i] - inputArray[i + 1]) > max) {
                    max = System.Math.Abs(inputArray[i] - inputArray[i + 1]);
                }//if(System.Math.Abs(inputArray[i]-inputArray[i+1]);>max){
            }//for(int i=0;i<inputArray.Length-1;i++){
            return max;
        }//int arrayMaximalAdjacentDifference(int[] inputArray) {
    }//public class ArrayMaximalAdjacentDifference {
}//namespace Algorithms.src._0_intro._04_island_of_knowledge {
