/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._04_list_forest_edge;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class FirstReverseTryTest {

    @Test
    void test1() {
        int[] testCase = {1, 2, 3, 4, 5};
        int[] solution = {5, 2, 3, 4, 1};
        test(testCase,solution);
    }//void test1() {

    @Test
    void test2() {
        int[] testCase = {};
        int[] solution = {};
        test(testCase,solution);
    }//void test2() {

    @Test
    void test3() {
        int[] testCase = {239};
        int[] solution = {239};
        test(testCase,solution);
    }//void test3() {

    @Test
    void test4() {
        int[] testCase = {23, 54, 12, 3, 4, 56, 23, 12, 5, 324};
        int[] solution = {324, 54, 12, 3, 4, 56, 23, 12, 5, 23};
        test(testCase,solution);
    }//void test4() {

    @Test
    void test5() {
        int[] testCase = {-1, 1};
        int[] solution = {1, -1};
        test(testCase,solution);
    }//void test5() {

    @Test
    void test6() {
        int[] testCase = {88, -101, -310, 818, 747, -888, -183, -687, -723, 188, -611, 677, -597, 293, -295, -162, -265, 368, 346, 81, -831, 198, -94, 685, -434, -241, -566, -397, 501, -183, 366, -669, 96, -592, 358, 598, 444, -929, 769, -361, -754, 218, -464, 332, 893, 422, -192, -287, -850, 543};
        int[] solution = {543, -101, -310, 818, 747, -888, -183, -687, -723, 188, -611, 677, -597, 293, -295, -162, -265, 368, 346, 81, -831, 198, -94, 685, -434, -241, -566, -397, 501, -183, 366, -669, 96, -592, 358, 598, 444, -929, 769, -361, -754, 218, -464, 332, 893, 422, -192, -287, -850, 88};
        test(testCase,solution);
    }//void test6() {

    private void test(int[] testCase,int[] solution) {
        assertTimeout(Duration.ofSeconds(3), () ->
                new FirstReverseTry().firstReverseTry(testCase.clone()));
        MatcherAssert.assertThat(new FirstReverseTry().firstReverseTry(testCase.clone()), is(solution));
    }//private void test(){
}//class FirstReverseTryTest {