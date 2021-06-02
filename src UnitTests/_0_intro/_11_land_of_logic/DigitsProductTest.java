/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._11_land_of_logic;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class DigitsProductTest {

    @Test
    public void test1() {
        var testCase = 12;
        var solution = 26;
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = 19;
        var solution = -1;
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = 450;
        var solution = 2559;
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = 0;
        var solution = 10;
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = 13;
        var solution = -1;
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = 1;
        var solution = 1;
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = 243;
        var solution = 399;
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = 576;
        var solution = 889;
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = 360;
        var solution = 589;
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = 7;
        var solution = 7;
        test(testCase, solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase = 112;
        var solution = 278;
        test(testCase, solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase = 20;
        var solution = 45;
        test(testCase, solution);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase = 10;
        var solution = 25;
        test(testCase, solution);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase = 600;
        var solution = 3558;
        test(testCase, solution);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase = 33;
        var solution = -1;
        test(testCase, solution);
    }//public void test15() {

    @Test
    public void test16() {
        var testCase = 512;
        var solution = 888;
        test(testCase, solution);
    }//public void test16() {

    @Test
    public void test17() {
        var testCase = 486;
        var solution = 699;
        test(testCase, solution);
    }//public void test17() {

    @Test
    public void test18() {
        var testCase = 484;
        var solution = -1;
        test(testCase, solution);
    }//public void test18() {

    private void test(int testCase, int solution){
        assertTimeout(Duration.ofSeconds(3),()->  new DigitsProduct().digitsProduct(testCase));
        assertEquals(new DigitsProduct().digitsProduct(testCase),solution);
    }//private void test(int testCase, int solution){
}//class DigitsProductTest {