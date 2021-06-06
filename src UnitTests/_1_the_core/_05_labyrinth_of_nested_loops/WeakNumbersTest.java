/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._05_labyrinth_of_nested_loops;

import java.time.Duration;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.jupiter.api.Assertions.*;

class WeakNumbersTest {

    @Test
    public void test1() {
        var testCase = 9;
        int[] solution = { 2, 2 };
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = 1;
        int[] solution = { 0, 1 };
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = 2;
        int[] solution = { 0, 2 };
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = 7;
        int[] solution = { 2, 1 };
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = 500;
        int[] solution = { 403, 1 };
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = 4;
        int[] solution = { 0, 4 };
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = 239;
        int[] solution = { 186, 1 };
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = 10;
        int[] solution = { 2, 2 };
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = 88;
        int[] solution = { 59, 1 };
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = 876;
        int[] solution = { 712, 1 };
        test(testCase, solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase = 1000;
        int[] solution = { 828, 1 };
        test(testCase, solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase = 3;
        int[] solution = { 0, 3 };
        test(testCase, solution);
    }//public void test12() {

    private void test(int testCase,int[] solution) {
        assertTimeout(Duration.ofSeconds(3), () ->
                new WeakNumbers().weakNumbers(testCase));
        MatcherAssert.assertThat(new WeakNumbers().weakNumbers(testCase), is(solution));
    }//private void test(int testCase,int[] solution) {
}//class WeakNumbersTest {