/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._00_intro_gates;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class AddTwoDigitsTest {

    @Test
    public void test1() {
        var testCase = 29;
        var solution = 11;
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = 48;
        var solution = 12;
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
        var testCase = 25;
        var solution = 7;
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = 52;
        var solution = 7;
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = 99;
        var solution = 18;
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = 44;
        var solution = 8;
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = 50;
        var solution = 5;
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = 39;
        var solution = 12;
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = 26;
        var solution = 8;
        test(testCase, solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase = 11;
        var solution = 2;
        test(testCase, solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase = 21;
        var solution = 3;
        test(testCase, solution);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase = 78;
        var solution = 15;
        test(testCase, solution);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase = 90;
        var solution = 9;
        test(testCase, solution);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase = 19;
        var solution = 10;
        test(testCase, solution);
    }//public void test15() {

    @Test
    public void test16() {
        var testCase = 62;
        var solution = 8;
        test(testCase, solution);
    }//public void test16() {

    @Test
    public void test17() {
        var testCase = 68;
        var solution = 14;
        test(testCase, solution);
    }//public void test17() {

    @Test
    public void test18() {
        var testCase = 33;
        var solution = 6;
        test(testCase, solution);
    }//public void test18() {

    @Test
    public void test19() {
        var testCase = 92;
        var solution = 11;
        test(testCase, solution);
    }//public void test19() {

    @Test
    public void test20() {
        var testCase = 73;
        var solution = 10;
        test(testCase, solution);
    }//public void test20() {

    private void test(int testCase, int solution){
        assertTimeout(Duration.ofSeconds(3),()-> new AddTwoDigits().addTwoDigits(testCase));
        assertEquals(solution,new AddTwoDigits().addTwoDigits(testCase));
    }//private void test(int testCase, int solution){
}//class AddTwoDigitsTest {