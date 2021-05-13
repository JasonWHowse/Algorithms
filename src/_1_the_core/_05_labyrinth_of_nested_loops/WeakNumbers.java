/*
 * Authored by: Jason Wesley Howse
 */

/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._05_labyrinth_of_nested_loops;

public class WeakNumbers {

    /*
We define the weakness of number x as the number of positive
integers smaller than x that have more divisors than x.

It follows that the weaker the number, the greater overall
weakness it has. For the given integer n, you need to answer
two questions:

    what is the weakness of the weakest numbers in the range
    [1, n]?

    how many numbers in the range [1, n] have this weakness?

Return the answer as an array of two elements, where the
first element is the answer to the first question, and the
second element is the answer to the second question.
     */

    int[] weakNumbers(int n) {
        int[] output = new int[] { 0, 0 };
        for (int i = 1; i <= n; i++) {
            int weak = Weakness(i);
            if (output[0] == weak) {
                output[1]++;
            } else if (output[0] < weak) {//if (output[0] == weak) {
                output[0] = weak;
                output[1] = 1;
            }//else if (output[0] < weak) {
        }//for (int i = 1; i <= n; i++) {
        return output;
    }//int[] weakNumbers(int n) {

    private int Weakness(int input) {
        int div = NumberOfDivisors(input);
        int output = 0;
        for (int i = 1; i < input; i++) {
            if (NumberOfDivisors(i) > div) {
                output++;
            }//if (NumberOfDivisors(i) > div) {
        }//for (int i = 1; i < input; i++) {
        return output;
    }//private int Weakness(int input) {

    private int NumberOfDivisors(int input) {
        int output = 1;
        for (int i = 1; i <= input/ 2; i++) {
            if (input % i == 0) {
                output++;
            }//if (input % i == 0) {
        }//for (int i = 1; i <= input/ 2; i++) {
        return output;
    }//private int NumberOfDivisors(int input) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

Guaranteed constraints:
1 ≤ n ≤ 1000.

[output] array.integer

Array of two elements: the weakness of the weakest number, and the number of integers in range [1, n] with this weakness.
     */

}//public class WeakNumbers {
