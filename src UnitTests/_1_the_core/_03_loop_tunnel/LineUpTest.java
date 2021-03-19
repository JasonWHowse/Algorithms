/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._03_loop_tunnel;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class LineUpTest {

    @Test
    void test1() {
        String testCase = "LLARL";
        int solution = 3;
        test(testCase,solution);
    }//void test1() {

    @Test
    void test2() {
        String testCase = "RLR";
        int solution = 1;
        test(testCase,solution);
    }//void test2() {

    @Test
    void test3() {
        String testCase = "";
        int solution = 0;
        test(testCase,solution);
    }//void test3() {

    @Test
    void test4() {
        String testCase = "L";
        int solution = 0;
        test(testCase,solution);
    }//void test4() {

    @Test
    void test5() {
        String testCase = "A";
        int solution = 1;
        test(testCase,solution);
    }//void test5() {

    @Test
    void test6() {
        String testCase = "AAAAAAAAAAAAAAA";
        int solution = 15;
        test(testCase,solution);
    }//void test6() {

    @Test
    void test7() {
        String testCase = "RRRRRRRRRRLLLLLLLLLRRRRLLLLLLLLLL";
        int solution = 16;
        test(testCase,solution);
    }//void test7() {

    @Test
    void test8() {
        String testCase = "AALAAALARAR";
        int solution = 5;
        test(testCase,solution);
    }//void test8() {

    private void test(String testCase, int solution) {
        assertTimeout(Duration.ofSeconds(3), () ->
                new LineUp().lineUp(testCase));
        assertEquals(solution, new LineUp().lineUp(testCase));
    }//private void test(){
}//class LineUpTest {