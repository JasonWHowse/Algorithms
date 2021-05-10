/*
 * Authored by: Jason Wesley Howse
 */

/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._05_labyrinth_of_nested_loops;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComfortableNumbersTest {

    @Test
    void test1() {
        int testCase1 = 10;
        int testCase2 = 12;
        int solution = 2;
        test(testCase1, testCase2, solution);
    }//void test1() {

    @Test
    void test2() {
        int testCase1 = 1;
        int testCase2 = 9;
        int solution = 20;
        test(testCase1, testCase2, solution);
    }//void test2() {

    @Test
    void test3() {
        int testCase1 = 13;
        int testCase2 = 13;
        int solution = 0;
        test(testCase1, testCase2, solution);
    }//void test3() {

    @Test
    void test4() {
        int testCase1 = 12;
        int testCase2 = 108;
        int solution = 707;
        test(testCase1, testCase2, solution);
    }//void test4() {

    @Test
    void test5() {
        int testCase1 = 239;
        int testCase2 = 777;
        int solution = 6166;
        test(testCase1, testCase2, solution);
    }//void test5() {

    @Test
    void test6() {
        int testCase1 = 1;
        int testCase2 = 1000;
        int solution = 11435;
        test(testCase1, testCase2, solution);
    }//void test6() {

    private void test(int testCase1, int testCase2, int solution) {
        assertTimeout(Duration.ofSeconds(3), () ->
                new ComfortableNumbers().comfortableNumbers(testCase1,testCase2));
        assertEquals(solution, new ComfortableNumbers().comfortableNumbers(testCase1,testCase2));
    }//private void test(){
}//class ComfortableNumbersTest {