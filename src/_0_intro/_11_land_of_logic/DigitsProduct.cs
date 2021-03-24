namespace Algorithms.src._0_intro._11_land_of_logic {
    public class DigitsProduct {

        /*

Given an integer product, find the smallest positive (i.e. greater than 0) integer the product of whose digits is equal to product. If there is no such integer, return -1 instead.

Example

For product = 12, the output should be
digitsProduct(product) = 26;
For product = 19, the output should be
digitsProduct(product) = -1.
Input/Output

[execution time limit] 3 seconds (cs)

[input] integer product

Guaranteed constraints:
0 ≤ product ≤ 600.

[output] integer

        */

        public
        int digitsProduct(int product) {
            int output = 0;
            int degree = 1;
            if (product < 2) {
                return product == 0 ? 10 : 1;
            }//if(product<2){
            for (int i = 9; i > 1; i--) {
                if (product % i == 0) {
                    output += i * degree;
                    degree *= 10;
                    product /= i;
                    i++;
                }//if(product%i==0){
            }//for(int i=9;i>1;i--){
            return product == 1 ? output : -1;
        }//int digitsProduct(int product) {
    }//public class DigitsProduct {
}//namespace Algorithms.src._0_intro._11_land_of_logic {
