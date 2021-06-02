/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._01_at_the_crossroads;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class ArithmeticExpressionTest {

    @Test
    public void test1() {
        var testCase1 = 2;
        var testCase2 = 3;
        var testCase3 = 5;
        test(testCase1, testCase2, testCase3, true);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase1 = 8;
        var testCase2 = 2;
        var testCase3 = 4;
        test(testCase1, testCase2, testCase3, true);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase1 = 8;
        var testCase2 = 3;
        var testCase3 = 2;
        test(testCase1, testCase2, testCase3, false);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase1 = 6;
        var testCase2 = 3;
        var testCase3 = 3;
        test(testCase1, testCase2, testCase3, true);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase1 = 18;
        var testCase2 = 2;
        var testCase3 = 9;
        test(testCase1, testCase2, testCase3, true);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase1 = 2;
        var testCase2 = 3;
        var testCase3 = 6;
        test(testCase1, testCase2, testCase3, true);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase1 = 5;
        var testCase2 = 2;
        var testCase3 = 0;
        test(testCase1, testCase2, testCase3, false);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase1 = 10;
        var testCase2 = 2;
        var testCase3 = 2;
        test(testCase1, testCase2, testCase3, false);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase1 = 5;
        var testCase2 = 2;
        var testCase3 = 2;
        test(testCase1, testCase2, testCase3, false);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase1 = 1;
        var testCase2 = 2;
        var testCase3 = 1;
        test(testCase1, testCase2, testCase3, false);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase1 = 1;
        var testCase2 = 2;
        var testCase3 = 2;
        test(testCase1, testCase2, testCase3, true);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase1 = 3;
        var testCase2 = 4;
        var testCase3 = 7;
        test(testCase1, testCase2, testCase3, true);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase1 = 7;
        var testCase2 = 2;
        var testCase3 = 5;
        test(testCase1, testCase2, testCase3, true);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase1 = 6;
        var testCase2 = 3;
        var testCase3 = 2;
        test(testCase1, testCase2, testCase3, true);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase1 = 7;
        var testCase2 = 3;
        var testCase3 = 2;
        test(testCase1, testCase2, testCase3, false);
    }//public void test15() {

    @Test
    public void test16() {
        var testCase1 = 12;
        var testCase2 = 4;
        var testCase3 = 6;
        test(testCase1, testCase2, testCase3, false);
    }//public void test16() {

    @Test
    public void test17() {
        var testCase1 = 20;
        var testCase2 = 4;
        var testCase3 = 5;
        test(testCase1, testCase2, testCase3, true);
    }//public void test17() {

    @Test
    public void test18() {
        var testCase1 = 8;
        var testCase2 = 2;
        var testCase3 = 16;
        test(testCase1, testCase2, testCase3, true);
    }//public void test18() {

    @Test
    public void test19() {
        var testCase1 = 9;
        var testCase2 = 2;
        var testCase3 = 4;
        test(testCase1, testCase2, testCase3, false);
    }//public void test19() {

    @Test
    public void test20() {
        var testCase1 = 18;
        var testCase2 = 4;
        var testCase3 = 4;
        test(testCase1, testCase2, testCase3, false);
    }//public void test20() {

    @Test
    public void test21() {
        var testCase1 = 1;
        var testCase2 = 1;
        var testCase3 = 1;
        test(testCase1, testCase2, testCase3, true);
    }//public void test21() {

    @Test
    public void test22() {
        var testCase1 = 1;
        var testCase2 = 20;
        var testCase3 = 20;
        test(testCase1, testCase2, testCase3, true);
    }//public void test22() {

    private void test(int testCase1, int testCase2, int testCase3, boolean solution){
        assertTimeout(Duration.ofSeconds(3),()-> new ArithmeticExpression().arithmeticExpression(testCase1,testCase2,testCase3));
        if(solution) {
            assertTrue(new ArithmeticExpression().arithmeticExpression(testCase1, testCase2, testCase3));
        }else {//if(solution){
            assertFalse(new ArithmeticExpression().arithmeticExpression(testCase1, testCase2, testCase3));
        }//else{
    }//private void test(int testCase1, int testCase2, int testCase3, boolean solution){
}//class ArithmeticExpressionTest {