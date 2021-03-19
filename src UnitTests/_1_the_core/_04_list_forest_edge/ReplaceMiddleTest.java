/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._04_list_forest_edge;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class ReplaceMiddleTest {

    @Test
    void test1() {
        int[] testCase =  {7, 2, 2, 5, 10, 7};
        int[] solution =  {7, 2, 7, 10, 7};
        test(testCase,solution);
    }//void test1() {

    @Test
    void test2() {
        int[] testCase =  {-5, -5, 10};
        int[] solution =  {-5, -5, 10};
        test(testCase,solution);
    }//void test2() {

    @Test
    void test3() {
        int[] testCase =  {45, 23, 12, 33, 12, 453, -234, -45};
        int[] solution =  {45, 23, 12, 45, 453, -234, -45};
        test(testCase,solution);
    }//void test3() {

    @Test
    void test4() {
        int[] testCase =  {2, 8};
        int[] solution =  {10};
        test(testCase,solution);
    }//void test4() {

    @Test
    void test5() {
        int[] testCase =  {-12, 34, 40, -5, -12, 4, 0, 0, -12};
        int[] solution =  {-12, 34, 40, -5, -12, 4, 0, 0, -12};
        test(testCase,solution);
    }//void test5() {

    @Test
    void test6() {
        int[] testCase =  {9, 0, 15, 9};
        int[] solution =  {9, 15, 9};
        test(testCase,solution);
    }//void test6() {

    @Test
    void test7() {
        int[] testCase =  {-6, 6, -6};
        int[] solution =  {-6, 6, -6};
        test(testCase,solution);
    }//void test7() {

    @Test
    void test8() {
        int[] testCase =  {26, 26, -17};
        int[] solution =  {26, 26, -17};
        test(testCase,solution);
    }//void test8() {

    @Test
    void test9() {
        int[] testCase =  {-7, 5, 5, 10};
        int[] solution =  {-7, 10, 10};
        test(testCase,solution);
    }//void test9() {

    private void test(int[] testCase,int[] solution) {
        assertTimeout(Duration.ofSeconds(3), () ->
                new ReplaceMiddle().replaceMiddle(testCase.clone()));
        MatcherAssert.assertThat(new ReplaceMiddle().replaceMiddle(testCase.clone()), is(solution));
    }//private void test(){
}//class ReplaceMiddleTest {