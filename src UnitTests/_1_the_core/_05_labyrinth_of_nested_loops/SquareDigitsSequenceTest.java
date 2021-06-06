/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._05_labyrinth_of_nested_loops;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquareDigitsSequenceTest {

    @Test
    public void test1() {
        var testCase = 16;
        var solution = 9;
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = 103;
        var solution = 4;
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = 1;
        var solution = 2;
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = 13;
        var solution = 4;
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = 89;
        var solution = 9;
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = 612;
        var solution = 16;
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = 12;
        var solution = 14;
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = 95;
        var solution = 11;
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = 460;
        var solution = 13;
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = 3309;
        var solution = 18;
        test(testCase, solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase = 4458;
        var solution = 20;
        test(testCase, solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase = 100000;
        var solution = 3;
        test(testCase, solution);
    }//public void test12() {

    private void test(int testCase,int solution) {
        assertTimeout(Duration.ofSeconds(3), () -> new SquareDigitsSequence().squareDigitsSequence(testCase));
        assertEquals(solution, new SquareDigitsSequence().squareDigitsSequence(testCase));
    }//private void test(int testCase,int solution) {
}//class SquareDigitsSequenceTest {