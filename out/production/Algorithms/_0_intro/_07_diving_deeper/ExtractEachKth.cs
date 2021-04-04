namespace Algorithms.src._0_intro._07_diving_deeper {
    public class ExtractEachKth {

        /*

Given array of integers, remove each kth element from it.

Example

For inputArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] and k = 3, the output should be
extractEachKth(inputArray, k) = [1, 2, 4, 5, 7, 8, 10].

Input/Output

[execution time limit] 3 seconds (cs)

[input] array.integer inputArray

Guaranteed constraints:
5 ≤ inputArray.length ≤ 15,
-20 ≤ inputArray[i] ≤ 20.

[input] integer k

Guaranteed constraints:
1 ≤ k ≤ 10.

[output] array.integer

inputArray without elements k - 1, 2k - 1, 3k - 1 etc.

        */

        public
        int[] extractEachKth(int[] inputArray, int k) {
            int[] outputArray = new int[inputArray.Length - (inputArray.Length / k)];
            int count = 0;
            for (int i = 0; i < inputArray.Length; i++) {
                if ((i + 1) % k != 0) {
                    outputArray[count] = inputArray[i];
                    count++;
                }//if((i+1)%k!=0){
            }//for(int i=0;i<inputArray.Length;i++){
            return outputArray;
        }//int[] extractEachKth(int[] inputArray, int k) {
    }//public class ExtractEachKth {
}//namespace Algorithms.src._0_intro._07_diving_deeper {
