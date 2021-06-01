/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._01_edge_of_the_ocean;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class ShapeAreaTest {

    @Test
    public void test1() {
        var testCase = 2;
        var solution = 5;
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = 3;
        var solution = 13;
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = 1;
        var solution = 1;
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = 5;
        var solution = 41;
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = 7000;
        var solution = 97986001;
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = 8000;
        var solution = 127984001;
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = 9999;
        var solution = 199940005;
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = 9998;
        var solution = 199900013;
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = 8999;
        var solution = 161946005;
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = 100;
        var solution = 19801;
        test(testCase, solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase = 10;
        var solution = 181;
        test(testCase, solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase = 1111;
        var solution = 2466421;
        test(testCase, solution);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase = 1212;
        var solution = 2935465;
        test(testCase, solution);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase = 11;
        var solution = 221;
        test(testCase, solution);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase = 489;
        var solution = 477265;
        test(testCase, solution);
    }//public void test15() {

    @Test
    public void test16() {
        var testCase = 999;
        var solution = 1994005;
        test(testCase, solution);
    }//public void test16() {

    @Test
    public void test17() {
        var testCase = 91;
        var solution = 16381;
        test(testCase, solution);
    }//public void test17() {

    @Test
    public void test18() {
        var testCase = 93;
        var solution = 17113;
        test(testCase, solution);
    }//public void test18() {

    @Test
    public void test19() {
        var testCase = 43;
        var solution = 3613;
        test(testCase, solution);
    }//public void test19() {

    @Test
    public void test20() {
        var testCase = 6334;
        var solution = 80226445;
        test(testCase, solution);
    }//public void test20() {

    private void test(int testCase, int solution){
        assertTimeout(Duration.ofSeconds(3),()-> new ShapeArea().shapeArea(testCase));
        assertEquals(solution, new ShapeArea().shapeArea(testCase));
    }//private void test(int testCase, int solution){
}//class ShapeAreaTest {