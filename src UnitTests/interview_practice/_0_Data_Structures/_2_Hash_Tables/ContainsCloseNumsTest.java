/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._0_Data_Structures._2_Hash_Tables;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class ContainsCloseNumsTest {

    @Test
    void test1(){
        int[] testCase1 = { 0, 1, 2, 3, 5, 2 };
        int testCase2 = 3;
        test(testCase1,testCase2, true);
    }//void test1(){

    @Test
    void test2(){
        int[] testCase1 = { 0, 1, 2, 3, 5, 2 };
        int testCase2 = 2;
        test(testCase1,testCase2, false);
    }//void test2(){

    @Test
    void test3(){
        int[] testCase1 = {  };
        int testCase2 = 0;
        test(testCase1,testCase2, false);
    }//void test3(){

    @Test
    void test4(){
        int[] testCase1 = { 99, 99 };
        int testCase2 = 2;
        test(testCase1,testCase2, true);
    }//void test4(){

    @Test
    void test5(){
        int[] testCase1 = { 2, 2 };
        int testCase2 = 3;
        test(testCase1,testCase2, true);
    }//void test5(){

    @Test
    void test6(){
        int[] testCase1 = { 1, 2 };
        int testCase2 = 2;
        test(testCase1,testCase2, false);
    }//void test6(){

    @Test
    void test7(){
        int[] testCase1 = { 1, 2, 1 };
        int testCase2 = 2;
        test(testCase1,testCase2, true);
    }//void test7(){

    @Test
    void test8(){
        int[] testCase1 = { 1, 0, 1, 1 };
        int testCase2 = 1;
        test(testCase1,testCase2, true);
    }//void test8(){

    @Test
    void test9(){
        int[] testCase1 = { 1, 2, 1 };
        int testCase2 = 0;
        test(testCase1,testCase2, false);
    }//void test9(){

    @Test
    void test10(){
        int[] testCase1 = { 1, 2, 1 };
        int testCase2 = 1;
        test(testCase1,testCase2, false);
    }//void test10(){

    @Test
    void test11(){
        int[] testCase1 = { 1 };
        int testCase2 = 1;
        test(testCase1,testCase2, false);
    }//void test11(){

    @Test
    void test12(){
        int[] testCase1 = { -1, -1 };
        int testCase2 = 1;
        test(testCase1,testCase2, true);
    }//void test12(){

    @Test
    void test13(){
        int[] testCase1 = { 1, 2, 3, 1 };
        int testCase2 = 3;
        test(testCase1,testCase2, true);
    }//void test13(){

    @Test
    void test14(){
        int[] testCase1 = { 2147483647, -2147483648, 2147483647, -2147483648 };
        int testCase2 = 2;
        test(testCase1,testCase2, true);
    }//void test14(){

    @Test
    void test15(){
        int[] testCase1 = { 13, 23, 1, 2, 3 };
        int testCase2 = 5;
        test(testCase1,testCase2, false);
    }//void test15(){

    @Test
    void test16(){
        int[] testCase1 = { 1, 2, 3, 1, 2, 3 };
        int testCase2 = 2;
        test(testCase1,testCase2, false);
    }//void test16(){

    @Test
    void test17(){
        int[] testCase1 = { 1, 2, 3, 1, 1, 2, 3 };
        int testCase2 = 0;
        test(testCase1,testCase2, false);
    }//void test17(){

    @Test
    void test18(){
        int[] testCase1 = { 0, 1, 2, 3, 4, 5, 0 };
        int testCase2 = 5;
        test(testCase1,testCase2, false);
    }//void test18(){

    @Test
    void test19(){
        int[] testCase1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int testCase2 = 15;
        test(testCase1,testCase2, false);
    }//void test19(){

    @Test
    void test20(){
        int[] testCase1 = { 4, 1, 2, 3, 1, 5 };
        int testCase2 = 3;
        test(testCase1,testCase2, true);
    }//void test20(){

    @Test
    void test21(){
        int[] testCase1 = { 0, 1, 2, 3, 4, 5, 0 };
        int testCase2 = 6;
        test(testCase1,testCase2, true);
    }//void test21(){

    @Test
    void test22(){
        int[] testCase1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 9 };
        int testCase2 = 3;
        test(testCase1,testCase2, true);
    }//void test22(){

    @Test
    void test23(){
        int[] testCase1 = { 0, 1, 2, 3, 4, 0, 0, 7, 8, 9, 10, 11, 12, 0 };
        int testCase2 = 1;
        test(testCase1,testCase2, true);
    }//void test23(){

    void test(int[] testCase1, int testCase2, boolean solution){
        assertTimeout(Duration.ofSeconds(3), ()-> new ContainsCloseNums().containsCloseNums(testCase1.clone(),testCase2));
        if(solution){
            assertTrue(new ContainsCloseNums().containsCloseNums(testCase1,testCase2));
        }else{//if(solution){
            assertFalse(new ContainsCloseNums().containsCloseNums(testCase1,testCase2));
        }//}else
    }//void test(String[] testCase1, String[] testCase2, boolean solution){
}//class ContainsCloseNumsTest {