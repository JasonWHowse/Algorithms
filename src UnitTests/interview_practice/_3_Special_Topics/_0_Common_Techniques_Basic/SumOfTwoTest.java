/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._3_Special_Topics._0_Common_Techniques_Basic;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class SumOfTwoTest {

    @Test
    public void test1() {
        int[] testCase1 = new int[] { 1, 2, 3 };
        int[] testCase2 = new int[] { 10, 20, 30, 40 };
        var testCase3 = 42;
        test(testCase1, testCase2, testCase3, true);
    }//public void test1() {

    @Test
    public void test2() {
        int[] testCase1 = new int[] { 1, 2, 3 };
        int[] testCase2 = new int[] { 10, 20, 30, 40 };
        var testCase3 = 50;
        test(testCase1, testCase2, testCase3, false);
    }//public void test2() {

    @Test
    public void test3() {
        int[] testCase1 = new int[] { };
        int[] testCase2 = new int[] { 1, 2, 3, 4 };
        var testCase3 = 4;
        test(testCase1, testCase2, testCase3, false);
    }//public void test3() {

    @Test
    public void test4() {
        int[] testCase1 = new int[] { 10, 1, 5, 3, 8 };
        int[] testCase2 = new int[] { 100, 6, 3, 1, 5 };
        var testCase3 = 4;
        test(testCase1, testCase2, testCase3, true);
    }//public void test4() {

    @Test
    public void test5() {
        int[] testCase1 = new int[] { 1, 4, 3, 6, 10, 1, 0, 1, 6, 5 };
        int[] testCase2 = new int[] { 9, 5, 6, 9, 0, 1, 2, 1, 6, 10 };
        var testCase3 = 8;
        test(testCase1, testCase2, testCase3, true);
    }//public void test5() {

    @Test
    public void test6() {
        int[] testCase1 = new int[] { 3, 2, 3, 7, 5, 0, 3, 0, 4, 2 };
        int[] testCase2 = new int[] { 6, 8, 2, 9, 7, 10, 3, 8, 6, 0 };
        var testCase3 = 2;
        test(testCase1, testCase2, testCase3, true);
    }//public void test6() {

    @Test
    public void test7() {
        int[] testCase1 = new int[] { 4, 6, 4, 2, 9, 6, 6, 2, 9, 2 };
        int[] testCase2 = new int[] { 3, 4, 5, 1, 4, 10, 9, 9, 6, 4 };
        var testCase3 = 5;
        test(testCase1, testCase2, testCase3, true);
    }//public void test7() {

    @Test
    public void test8() {
        int[] testCase1 = new int[] { 6, 10, 25, 13, 20, 21, 11, 10, 18, 21 };
        int[] testCase2 = new int[] { 21, 10, 6, 0, 29, 25, 1, 17, 19, 25 };
        var testCase3 = 37;
        test(testCase1, testCase2, testCase3, true);
    }//public void test8() {

    @Test
    public void test9() {
        int[] testCase1 = new int[] { 22, 26, 6, 22, 17, 11, 9, 22, 7, 12 };
        int[] testCase2 = new int[] { 14, 25, 22, 27, 22, 30, 6, 26, 30, 27 };
        var testCase3 = 56;
        test(testCase1, testCase2, testCase3, true);
    }//public void test9() {

    @Test
    public void test10() {
        int[] testCase1 = new int[] { 17, 72, 18, 72, 73, 15, 83, 90, 8, 18 };
        int[] testCase2 = new int[] { 100, 27, 33, 51, 2, 71, 76, 19, 16, 43 };
        var testCase3 = 37;
        test(testCase1, testCase2, testCase3, true);
    }//public void test10() {

    @Test
    public void test11() {
        int[] testCase1 = new int[] { 75, 38, 10, 57, 67, 39, 26, 14, 53, 80 };
        int[] testCase2 = new int[] { 3, 19, 28, 92, 92, 47, 98, 30, 71, 21 };
        var testCase3 = 61;
        test(testCase1, testCase2, testCase3, true);
    }//public void test11() {

    @Test
    public void test12() {
        int[] testCase1 = new int[] { 1, 2, 3 };
        int[] testCase2 = new int[] { };
        var testCase3 = 1;
        test(testCase1, testCase2, testCase3, false);
    }//public void test12() {

    private void test(int[] testCase1, int[] testCase2, int testCase3, boolean solution) {
        if(solution){
            assertTrue(new SumOfTwo().sumOfTwo(testCase1.clone(),testCase2.clone(),testCase3));
        }else {//if(solution){
            assertFalse(new SumOfTwo().sumOfTwo(testCase1.clone(),testCase2.clone(),testCase3));
        }//else {
        assertTimeout(Duration.ofSeconds(3),()->new SumOfTwo().sumOfTwo(testCase1,testCase2,testCase3));
    }//private void test((int[] testCase1, int[] testCase2, int testCase3, boolean solution) {

}//class SumOfTwoTest {