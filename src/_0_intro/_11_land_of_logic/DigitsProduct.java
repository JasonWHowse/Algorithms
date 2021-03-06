/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._11_land_of_logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class DigitsProduct {

/*
Given an integer product, find the smallest
positive (i.e. greater than 0) integer the
product of whose digits is equal to product.
If there is no such integer, return -1
instead.
 */

    int digitsProduct(int product) {
        int output=0;
        int degree=1;
        if(product<2){
            return product==0?10:1;
        }//if(product<2){
        for(int i=9;i>1;i--){
            if(product%i==0){
                output=output+i*degree;
                degree*=10;
                product/=i;
                i++;
            }//if(product%i==0){
        }//for(int i=9;i>1;i--){
        return product==1?output:-1;
    }//int digitsProduct(int product) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer product

Guaranteed constraints:
0 ≤ product ≤ 600.

[output] integer
 */

}//public class DigitsProduct {
