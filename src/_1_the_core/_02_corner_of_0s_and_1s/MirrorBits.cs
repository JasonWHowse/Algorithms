using System.Linq;

namespace Algorithms.src._1_the_core._02_corner_of_0s_and_1s {
    public class MirrorBits {

        /*

Reverse the order of the bits in a given integer.

Example

For a = 97, the output should be
mirrorBits(a) = 67.

97 equals to 1100001 in binary, which is 1000011 after mirroring, and that is 67 in base 10.

For a = 8, the output should be
mirrorBits(a) = 1.

Input/Output

[execution time limit] 3 seconds (java)

[input] integer a

Guaranteed constraints:
5 ≤ a ≤ 105.

[output] integer

        */

        public
        int mirrorBits(int a) {
            return System.Convert.ToInt32(new string(System.Convert.ToString(a, 2).ToCharArray().Reverse().ToArray()), 2);
        }//int mirrorBits(int a) {
    }//public class MirrorBits {
}//namespace Algorithms.src._1_the_core._02_corner_of_0s_and_1s {
