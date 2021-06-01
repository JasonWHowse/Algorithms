/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._08_dark_wilderness;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class DigitDegreeTest {

    @Test
    public void test1() {
        var testCase = 5;
        var solution = 0;
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = 100;
        var solution = 1;
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = 91;
        var solution = 2;
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = 99;
        var solution = 2;
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = 1000000000;
        var solution = 1;
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = 9;
        var solution = 0;
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = 73;
        var solution = 2;
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = 877;
        var solution = 2;
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = 777773;
        var solution = 3;
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = 304;
        var solution = 1;
        test(testCase, solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase = 11;
        var solution = 1;
        test(testCase, solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase = 7;
        var solution = 0;
        test(testCase, solution);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase = 816;
        var solution = 2;
        test(testCase, solution);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase = 523;
        var solution = 2;
        test(testCase, solution);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase = 463;
        var solution = 2;
        test(testCase, solution);
    }//public void test15() {

    @Test
    public void test16() {
        var testCase = 20421;
        var solution = 1;
        test(testCase, solution);
    }//public void test16() {

    @Test
    public void test17() {
        var testCase = 22546;
        var solution = 3;
        test(testCase, solution);
    }//public void test17() {

    @Test
    public void test18() {
        var testCase = 263;
        var solution = 2;
        test(testCase, solution);
    }//public void test18() {

    @Test
    public void test19() {
        var testCase = 999999999;
        var solution = 2;
        test(testCase, solution);
    }//public void test19() {

    @Test
    public void test20() {
        var testCase = 535649;
        var solution = 2;
        test(testCase, solution);
    }//public void test20() {

    private void test(int testCase, int solution){
        assertTimeout(Duration.ofSeconds(3),()-> new DigitDegree().digitDegree(testCase));
        assertEquals(new DigitDegree().digitDegree(testCase),solution);
    }//private void test(int testCase, int solution){
}//class DigitDegreeTest {