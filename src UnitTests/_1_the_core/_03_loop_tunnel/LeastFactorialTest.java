/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._03_loop_tunnel;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class LeastFactorialTest {

    @Test
    public void test1() {
        var testCase = 17;
        var solution = 24;
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = 1;
        var solution = 1;
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = 5;
        var solution = 6;
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = 25;
        var solution = 120;
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = 18;
        var solution = 24;
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = 109;
        var solution = 120;
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = 106;
        var solution = 120;
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = 11;
        var solution = 24;
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = 55;
        var solution = 120;
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = 24;
        var solution = 24;
        test(testCase, solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase = 34;
        var solution = 120;
        test(testCase, solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase = 108;
        var solution = 120;
        test(testCase, solution);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase = 4;
        var solution = 6;
        test(testCase, solution);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase = 36;
        var solution = 120;
        test(testCase, solution);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase = 101;
        var solution = 120;
        test(testCase, solution);
    }//public void test15() {

    @Test
    public void test16() {
        var testCase = 43;
        var solution = 120;
        test(testCase, solution);
    }//public void test16() {

    @Test
    public void test17() {
        var testCase = 70;
        var solution = 120;
        test(testCase, solution);
    }//public void test17() {

    @Test
    public void test18() {
        var testCase = 31;
        var solution = 120;
        test(testCase, solution);
    }//public void test18() {

    @Test
    public void test19() {
        var testCase = 82;
        var solution = 120;
        test(testCase, solution);
    }//public void test19() {

    @Test
    public void test20() {
        var testCase = 120;
        var solution = 120;
        test(testCase, solution);
    }//public void test20() {

    private void test(int testCase, int solution) {
        assertTimeout(Duration.ofSeconds(3), () -> new LeastFactorial().leastFactorial(testCase));
        assertEquals(solution, new LeastFactorial().leastFactorial(testCase));
    }//private void test(int testCase, int solution) {
}//class LeastFactorialTest {