/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._10_rainbow_of_clarity;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class DeleteDigitTest {

    @Test
    public void test1() {
        var testCase = 152;
        var solution = 52;
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = 1001;
        var solution = 101;
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = 10;
        var solution = 1;
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = 222219;
        var solution = 22229;
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = 109;
        var solution = 19;
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = 222250;
        var solution = 22250;
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = 44435;
        var solution = 4445;
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = 12;
        var solution = 2;
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = 218616;
        var solution = 28616;
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = 861452;
        var solution = 86452;
        test(testCase, solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase = 527964;
        var solution = 57964;
        test(testCase, solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase = 807418;
        var solution = 87418;
        test(testCase, solution);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase = 433757;
        var solution = 43757;
        test(testCase, solution);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase = 748541;
        var solution = 78541;
        test(testCase, solution);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase = 909912;
        var solution = 99912;
        test(testCase, solution);
    }//public void test15() {

    @Test
    public void test16() {
        var testCase = 864200;
        var solution = 86420;
        test(testCase, solution);
    }//public void test16() {

    @Test
    public void test17() {
        var testCase = 812520;
        var solution = 82520;
        test(testCase, solution);
    }//public void test17() {

    @Test
    public void test18() {
        var testCase = 1000000;
        var solution = 100000;
        test(testCase, solution);
    }//public void test18() {

    @Test
    public void test19() {
        var testCase = 987654;
        var solution = 98765;
        test(testCase, solution);
    }//public void test19() {

    @Test
    public void test20() {
        var testCase = 872048;
        var solution = 87248;
        test(testCase, solution);
    }//public void test20() {

    private void test(int testCase, int solution){
        assertTimeout(Duration.ofSeconds(3),()-> new DeleteDigit().deleteDigit(testCase));
        assertEquals(solution,new DeleteDigit().deleteDigit(testCase));
    }//private void test(int testCase, int solution){
}//class DeleteDigitTest {