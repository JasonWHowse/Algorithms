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

class IsSumOfConsecutive2Test {

    @Test
    void test1() {
        int testCase = 9;
        int solution = 2;
        test(testCase,solution);
    }//void test1() {

    @Test
    void test2() {
        int testCase = 8;
        int solution = 0;
        test(testCase,solution);
    }//void test2() {

    @Test
    void test3() {
        int testCase = 15;
        int solution = 3;
        test(testCase,solution);
    }//void test3() {

    @Test
    void test4() {
        int testCase = 24;
        int solution = 1;
        test(testCase,solution);
    }//void test4() {

    @Test
    void test5() {
        int testCase = 13;
        int solution = 1;
        test(testCase,solution);
    }//void test5() {

    @Test
    void test6() {
        int testCase = 25;
        int solution = 2;
        test(testCase,solution);
    }//void test6() {

    @Test
    void test7() {
        int testCase = 99;
        int solution = 5;
        test(testCase,solution);
    }//void test7() {

    private void test(int testCase,int solution) {
        assertTimeout(Duration.ofSeconds(3), () ->
                new IsSumOfConsecutive2().isSumOfConsecutive2(testCase));
        assertEquals(solution, new IsSumOfConsecutive2().isSumOfConsecutive2(testCase));
    }//private void test(){
}//class IsSumOfConsecutive2Test {