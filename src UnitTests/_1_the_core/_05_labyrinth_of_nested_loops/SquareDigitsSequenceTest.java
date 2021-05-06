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

class SquareDigitsSequenceTest {

    @Test
    void test1() {
        int testCase = 16;
        int solution = 9;
        test(testCase,solution);
    }//void test1() {

    @Test
    void test2() {
        int testCase = 103;
        int solution = 4;
        test(testCase,solution);
    }//void test2() {

    @Test
    void test3() {
        int testCase = 1;
        int solution = 2;
        test(testCase,solution);
    }//void test3() {

    @Test
    void test4() {
        int testCase = 13;
        int solution = 4;
        test(testCase,solution);
    }//void test4() {

    @Test
    void test5() {
        int testCase = 89;
        int solution = 9;
        test(testCase,solution);
    }//void test5() {

    @Test
    void test6() {
        int testCase = 612;
        int solution = 16;
        test(testCase,solution);
    }//void test6() {

    private void test(int testCase,int solution) {
        assertTimeout(Duration.ofSeconds(3), () ->
                new SquareDigitsSequence().squareDigitsSequence(testCase));
        assertEquals(solution, new SquareDigitsSequence().squareDigitsSequence(testCase));
    }//private void test(){
}//class SquareDigitsSequenceTest {