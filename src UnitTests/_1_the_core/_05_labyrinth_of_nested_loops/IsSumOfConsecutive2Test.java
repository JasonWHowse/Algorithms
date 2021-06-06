/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._05_labyrinth_of_nested_loops;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsSumOfConsecutive2Test {

    @Test
    public void test1() {
        var testCase = 9;
        var solution = 2;
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = 8;
        var solution = 0;
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = 15;
        var solution = 3;
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = 24;
        var solution = 1;
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = 13;
        var solution = 1;
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = 25;
        var solution = 2;
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = 99;
        var solution = 5;
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = 880;
        var solution = 3;
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = 693;
        var solution = 11;
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = 4376;
        var solution = 1;
        test(testCase, solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase = 1233;
        var solution = 5;
        test(testCase, solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase = 1;
        var solution = 0;
        test(testCase, solution);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase = 4096;
        var solution = 0;
        test(testCase, solution);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase = 10000;
        var solution = 4;
        test(testCase, solution);
    }//public void test14() {

    private void test(int testCase,int solution) {
        assertTimeout(Duration.ofSeconds(3), () -> new IsSumOfConsecutive2().isSumOfConsecutive2(testCase));
        assertEquals(solution, new IsSumOfConsecutive2().isSumOfConsecutive2(testCase));
    }//private void test(int testCase,int solution) {
}//class IsSumOfConsecutive2Test {