/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._04_list_forest_edge;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class ConcatenateArraysTest {

    @Test
    void test1() {
        int[] testCase1 = {2, 2, 1};
        int[] testCase2 = {10, 11};
        int[] solution =  {2, 2, 1, 10, 11};
        test(testCase1, testCase2, solution);
    }//void test1() {

    @Test
    void test2() {
        int[] testCase1 = {1, 2};
        int[] testCase2 = {3, 1, 2};
        int[] solution =  {1, 2, 3, 1, 2};
        test(testCase1, testCase2, solution);
    }//void test2() {

    @Test
    void test3() {
        int[] testCase1 = {1};
        int[] testCase2 = {};
        int[] solution =  {1};
        test(testCase1, testCase2, solution);
    }//void test3() {

    @Test
    void test4() {
        int[] testCase1 = {2, 10, 3, 9, 5, 11, 11};
        int[] testCase2 = {4, 8, 1, 13, 3, 1, 14};
        int[] solution =  {2, 10, 3, 9, 5, 11, 11, 4, 8, 1, 13, 3, 1, 14};
        test(testCase1, testCase2, solution);
    }//void test4() {

    @Test
    void test5() {
        int[] testCase1 = {9, 6, 6, 9, 8, 14};
        int[] testCase2 = {3, 2, 2, 5, 3, 11, 12, 9, 7, 7};
        int[] solution =  {9, 6, 6, 9, 8, 14, 3, 2, 2, 5, 3, 11, 12, 9, 7, 7};
        test(testCase1, testCase2, solution);
    }//void test5() {

    private void test(int[] testCase1, int[] testCase2, int[] solution) {
        assertTimeout(Duration.ofSeconds(3), () ->
                new ConcatenateArrays().concatenateArrays(testCase1.clone(),testCase2.clone()));
        MatcherAssert.assertThat(new ConcatenateArrays().concatenateArrays(testCase1.clone(),testCase2.clone()), is(solution));
    }//private void test(){
}//class ConcatenateArraysTest {