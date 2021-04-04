namespace Algorithms.src._1_the_core._03_loop_tunnel {
    public class CountSumOfTwoRepresentations2 {

        /*

Given integers n, l and r, find the number of ways to represent n as a sum of two integers A and B such that l ≤ A ≤ B ≤ r.

Example

For n = 6, l = 2, and r = 4, the output should be
countSumOfTwoRepresentations2(n, l, r) = 2.

There are just two ways to write 6 as A + B, where 2 ≤ A ≤ B ≤ 4: 6 = 2 + 4 and 6 = 3 + 3.

Input/Output

[execution time limit] 3 seconds (cs)

[input] integer n

A positive integer.

Guaranteed constraints:
5 ≤ n ≤ 109.

[input] integer l

A positive integer.

Guaranteed constraints:
1 ≤ l ≤ r.

[input] integer r

A positive integer.

Guaranteed constraints:
l ≤ r ≤ 109,
r - l ≤ 106.

[output] integer

        */

        public
        int countSumOfTwoRepresentations2(int n, int l, int r) {
            int output= 0;
            for (int i = l; i <= r; i++) {
                for (int j = i; j <= r && i + j <= n; j++) {
                    if (j + i == n) {
                        output++;
                    }//if(j+i==n){
                }//for(int j=i;j<=r&&i+j<=n;j++){
            }//for(int i=l;i<=r;i++){
            return output;
        }//int countSumOfTwoRepresentations2(int n, int l, int r) {
    }//public class CountSumOfTwoRepresentations2 {
}//namespace Algorithms.src._1_the_core._03_loop_tunnel {
