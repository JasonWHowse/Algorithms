/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._03_loop_tunnel;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LeastFactorialTest {

    @Test
    void test1() {
        int testCase = 17;
        int solution = 24;
        test(testCase,solution);
    }//void test1() {

    @Test
    void test2() {
        int testCase = 1;
        int solution = 1;
        test(testCase,solution);
    }//void test2() {

    @Test
    void test3() {
        int testCase = 5;
        int solution = 6;
        test(testCase,solution);
    }//void test3() {

    @Test
    void test4() {
        int testCase = 25;
        int solution = 120;
        test(testCase,solution);
    }//void test4() {

    @Test
    void test5() {
        int testCase = 18;
        int solution = 24;
        test(testCase,solution);
    }//void test5() {

    @Test
    void test6() {
        int testCase = 109;
        int solution = 120;
        test(testCase,solution);
    }//void test6() {

    @Test
    void test7() {
        int testCase = 106;
        int solution = 120;
        test(testCase,solution);
    }//void test7() {

    @Test
    void test8() {
        int testCase = 11;
        int solution = 24;
        test(testCase,solution);
    }//void test8() {

    @Test
    void test9() {
        int testCase = 55;
        int solution = 120;
        test(testCase,solution);
    }//void test9() {

    @Test
    void test10() {
        int testCase = 24;
        int solution = 24;
        test(testCase,solution);
    }//void test10() {

    private void test(int testCase, int solution) {
        assertTimeout(Duration.ofSeconds(3), () ->
                new LeastFactorial().leastFactorial(testCase));
        assertEquals(solution, new LeastFactorial().leastFactorial(testCase));
    }//private void test(){
}//class LeastFactorialTest {