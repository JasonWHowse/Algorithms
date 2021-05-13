/*
 * Authored by: Jason Wesley Howse
 */

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
    void test1() {
        int testCase = 9;
        int[] solution = {2,2};
        test(testCase,solution);
    }//void test1() {

    @Test
    void test2() {
        int testCase = 1;
        int[] solution = {0,1};
        test(testCase,solution);
    }//void test2() {

    @Test
    void test3() {
        int testCase = 2;
        int[] solution = {0,2};
        test(testCase,solution);
    }//void test3() {

    @Test
    void test4() {
        int testCase = 7;
        int[] solution = {2,1};
        test(testCase,solution);
    }//void test4() {

    @Test
    void test5() {
        int testCase = 500;
        int[] solution = {403,1};
        test(testCase,solution);
    }//void test5() {

    @Test
    void test6() {
        int testCase = 4;
        int[] solution = {0,4};
        test(testCase,solution);
    }//void test6() {

    private void test(int testCase,int[] solution) {
        assertTimeout(Duration.ofSeconds(3), () ->
                new WeakNumbers().weakNumbers(testCase));
        MatcherAssert.assertThat(new WeakNumbers().weakNumbers(testCase), is(solution));
    }//private void test(){
}//class WeakNumbersTest {