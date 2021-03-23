namespace Algorithms.src._1_the_core._03_loop_tunnel {
    public class LeastFactorial {

        /*

Given an integer n, find the minimal k such that

k = m! (where m! = 1 * 2 * ... * m) for some integer m;
k >= n.
In other words, find the smallest factorial which is not less than n.

Example

For n = 17, the output should be
leastFactorial(n) = 24.

17 < 24 = 4! = 1 * 2 * 3 * 4, while 3! = 1 * 2 * 3 = 6 < 17).

Input/Output

[execution time limit] 3 seconds (cs)

[input] integer n

A positive integer.

Guaranteed constraints:
1 ≤ n ≤ 120.

[output] integer

        */

        public
        int leastFactorial(int n) {
            int fac = 1;
            int i = 1;
            while (true) {
                fac *= i++;
                if (fac >= n || fac < 0) {
                    return fac;
                }//if(fac>=n){
            }//while(true){
        }//int leastFactorial(int n) 
    }//public class LeastFactorial {
}//namespace Algorithms.src._1_the_core._03_loop_tunnel {
