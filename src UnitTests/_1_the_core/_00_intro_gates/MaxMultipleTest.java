/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._00_intro_gates;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class MaxMultipleTest {

    @Test
    public void test1() {
        var testCase1 = 3;
        var testCase2 = 10;
        var solution = 9;
        test(testCase1, testCase2, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase1 = 2;
        var testCase2 = 7;
        var solution = 6;
        test(testCase1, testCase2, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase1 = 10;
        var testCase2 = 50;
        var solution = 50;
        test(testCase1, testCase2, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase1 = 7;
        var testCase2 = 100;
        var solution = 98;
        test(testCase1, testCase2, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase1 = 7;
        var testCase2 = 20;
        var solution = 14;
        test(testCase1, testCase2, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase1 = 5;
        var testCase2 = 13;
        var solution = 10;
        test(testCase1, testCase2, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase1 = 8;
        var testCase2 = 88;
        var solution = 88;
        test(testCase1, testCase2, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase1 = 10;
        var testCase2 = 100;
        var solution = 100;
        test(testCase1, testCase2, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase1 = 2;
        var testCase2 = 5;
        var solution = 4;
        test(testCase1, testCase2, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase1 = 3;
        var testCase2 = 5;
        var solution = 3;
        test(testCase1, testCase2, solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase1 = 9;
        var testCase2 = 11;
        var solution = 9;
        test(testCase1, testCase2, solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase1 = 8;
        var testCase2 = 15;
        var solution = 8;
        test(testCase1, testCase2, solution);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase1 = 9;
        var testCase2 = 60;
        var solution = 54;
        test(testCase1, testCase2, solution);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase1 = 8;
        var testCase2 = 8;
        var solution = 8;
        test(testCase1, testCase2, solution);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase1 = 5;
        var testCase2 = 5;
        var solution = 5;
        test(testCase1, testCase2, solution);
    }//public void test15() {

    @Test
    public void test16() {
        var testCase1 = 6;
        var testCase2 = 19;
        var solution = 18;
        test(testCase1, testCase2, solution);
    }//public void test16() {

    @Test
    public void test17() {
        var testCase1 = 2;
        var testCase2 = 100;
        var solution = 100;
        test(testCase1, testCase2, solution);
    }//public void test17() {

    @Test
    public void test18() {
        var testCase1 = 5;
        var testCase2 = 100;
        var solution = 100;
        test(testCase1, testCase2, solution);
    }//public void test18() {

    @Test
    public void test19() {
        var testCase1 = 2;
        var testCase2 = 95;
        var solution = 94;
        test(testCase1, testCase2, solution);
    }//public void test19() {

    @Test
    public void test20() {
        var testCase1 = 6;
        var testCase2 = 99;
        var solution = 96;
        test(testCase1, testCase2, solution);
    }//public void test20() {

    @Test
    public void test21() {
        var testCase1 = 5;
        var testCase2 = 48;
        var solution = 45;
        test(testCase1, testCase2, solution);
    }//public void test21() {

    @Test
    public void test22() {
        var testCase1 = 7;
        var testCase2 = 73;
        var solution = 70;
        test(testCase1, testCase2, solution);
    }//public void test22() {

    @Test
    public void test23() {
        var testCase1 = 8;
        var testCase2 = 62;
        var solution = 56;
        test(testCase1, testCase2, solution);
    }//public void test23() {

    @Test
    public void test24() {
        var testCase1 = 4;
        var testCase2 = 39;
        var solution = 36;
        test(testCase1, testCase2, solution);
    }//public void test24() {

    @Test
    public void test25() {
        var testCase1 = 6;
        var testCase2 = 71;
        var solution = 66;
        test(testCase1, testCase2, solution);
    }//public void test25() {

    @Test
    public void test26() {
        var testCase1 = 6;
        var testCase2 = 67;
        var solution = 66;
        test(testCase1, testCase2, solution);
    }//public void test26() {

    private void test(int testCase1, int testCase2, int solution){
        assertTimeout(Duration.ofSeconds(3),()-> new MaxMultiple().maxMultiple(testCase1,testCase2));
        assertEquals(solution,new MaxMultiple().maxMultiple(testCase1,testCase2));
    }//private void test(int testCase1, int testCase2, int solution){
}//class MaxMultipleTest {