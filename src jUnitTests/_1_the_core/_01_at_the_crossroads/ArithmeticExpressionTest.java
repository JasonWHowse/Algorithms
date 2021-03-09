/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._01_at_the_crossroads;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArithmeticExpressionTest {

    @Test
    void test1() {
        int testCase1=2;
        int testCase2=3;
        int testCase3=5;
        assertTimeout(Duration.ofSeconds(3),()->
                new ArithmeticExpression().arithmeticExpression(testCase1,testCase2,testCase3));
        assertTrue(new ArithmeticExpression().arithmeticExpression(testCase1,testCase2,testCase3));
    }//void test1() {

    @Test
    void test2() {
        int testCase1=8;
        int testCase2=2;
        int testCase3=4;
        assertTimeout(Duration.ofSeconds(3),()->
                new ArithmeticExpression().arithmeticExpression(testCase1,testCase2,testCase3));
        assertTrue(new ArithmeticExpression().arithmeticExpression(testCase1,testCase2,testCase3));
    }//void test2() {

    @Test
    void test3() {
        int testCase1=8;
        int testCase2=3;
        int testCase3=2;
        assertTimeout(Duration.ofSeconds(3),()->
                new ArithmeticExpression().arithmeticExpression(testCase1,testCase2,testCase3));
        assertFalse(new ArithmeticExpression().arithmeticExpression(testCase1,testCase2,testCase3));
    }//void test3() {

    @Test
    void test4() {
        int testCase1=6;
        int testCase2=3;
        int testCase3=3;
        assertTimeout(Duration.ofSeconds(3),()->
                new ArithmeticExpression().arithmeticExpression(testCase1,testCase2,testCase3));
        assertTrue(new ArithmeticExpression().arithmeticExpression(testCase1,testCase2,testCase3));
    }//void test4() {

    @Test
    void test5() {
        int testCase1=18;
        int testCase2=2;
        int testCase3=9;
        assertTimeout(Duration.ofSeconds(3),()->
                new ArithmeticExpression().arithmeticExpression(testCase1,testCase2,testCase3));
        assertTrue(new ArithmeticExpression().arithmeticExpression(testCase1,testCase2,testCase3));
    }//void test5() {

    @Test
    void test6() {
        int testCase1=2;
        int testCase2=3;
        int testCase3=6;
        assertTimeout(Duration.ofSeconds(3),()->
                new ArithmeticExpression().arithmeticExpression(testCase1,testCase2,testCase3));
        assertTrue(new ArithmeticExpression().arithmeticExpression(testCase1,testCase2,testCase3));
    }//void test6() {

    @Test
    void test7() {
        int testCase1=5;
        int testCase2=2;
        int testCase3=0;
        assertTimeout(Duration.ofSeconds(3),()->
                new ArithmeticExpression().arithmeticExpression(testCase1,testCase2,testCase3));
        assertFalse(new ArithmeticExpression().arithmeticExpression(testCase1,testCase2,testCase3));
    }//void test7() {

    @Test
    void test8() {
        int testCase1=10;
        int testCase2=2;
        int testCase3=2;
        assertTimeout(Duration.ofSeconds(3),()->
                new ArithmeticExpression().arithmeticExpression(testCase1,testCase2,testCase3));
        assertFalse(new ArithmeticExpression().arithmeticExpression(testCase1,testCase2,testCase3));
    }//void test8() {

    @Test
    void test9() {
        int testCase1=5;
        int testCase2=2;
        int testCase3=2;
        assertTimeout(Duration.ofSeconds(3),()->
                new ArithmeticExpression().arithmeticExpression(testCase1,testCase2,testCase3));
        assertFalse(new ArithmeticExpression().arithmeticExpression(testCase1,testCase2,testCase3));
    }//void test9() {

    @Test
    void test10() {
        int testCase1=1;
        int testCase2=2;
        int testCase3=1;
        assertTimeout(Duration.ofSeconds(3),()->
                new ArithmeticExpression().arithmeticExpression(testCase1,testCase2,testCase3));
        assertFalse(new ArithmeticExpression().arithmeticExpression(testCase1,testCase2,testCase3));
    }//void test10() {

    @Test
    void test11() {
        int testCase1=1;
        int testCase2=2;
        int testCase3=2;
        assertTimeout(Duration.ofSeconds(3),()->
                new ArithmeticExpression().arithmeticExpression(testCase1,testCase2,testCase3));
        assertTrue(new ArithmeticExpression().arithmeticExpression(testCase1,testCase2,testCase3));
    }//void test11() {
}//class ArithmeticExpressionTest {