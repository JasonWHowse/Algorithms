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
    public void test1() {
        int[] testCase1 = { 2, 2, 1 };
        int[] testCase2 = { 10, 11 };
        int[] solution = { 2, 2, 1, 10, 11 };
        test(testCase1, testCase2, solution);
    }//public void test1() {

    @Test
    public void test2() {
        int[] testCase1 = { 1, 2 };
        int[] testCase2 = { 3, 1, 2 };
        int[] solution = { 1, 2, 3, 1, 2 };
        test(testCase1, testCase2, solution);
    }//public void test2() {

    @Test
    public void test3() {
        int[] testCase1 = { 1 };
        int[] testCase2 = { };
        int[] solution = { 1 };
        test(testCase1, testCase2, solution);
    }//public void test3() {

    @Test
    public void test4() {
        int[] testCase1 = { 2, 10, 3, 9, 5, 11, 11 };
        int[] testCase2 = { 4, 8, 1, 13, 3, 1, 14};
        int[] solution = { 2, 10, 3, 9, 5, 11, 11, 4, 8, 1, 13, 3, 1, 14 };
        test(testCase1, testCase2, solution);
    }//public void test4() {

    @Test
    public void test5() {
        int[] testCase1 = { 9, 6, 6, 9, 8, 14 };
        int[] testCase2 = { 3, 2, 2, 5, 3, 11, 12, 9, 7, 7 };
        int[] solution = { 9, 6, 6, 9, 8, 14, 3, 2, 2, 5, 3, 11, 12, 9, 7, 7 };
        test(testCase1, testCase2, solution);
    }//public void test5() {

    @Test
    public void test6() {
        int[] testCase1 = { 11, 13, 10 };
        int[] testCase2 = { 8 };
        int[] solution = { 11, 13, 10, 8 };
        test(testCase1, testCase2, solution);
    }//public void test6() {

    @Test
    public void test7() {
        int[] testCase1 = { 1, 5, 4, 3 };
        int[] testCase2 = { 9 };
        int[] solution = { 1, 5, 4, 3, 9 };
        test(testCase1, testCase2, solution);
    }//public void test7() {

    @Test
    public void test8() {
        int[] testCase1 = { 15, 9, 11, 4, 12, 3, 2, 14, 6, 4 };
        int[] testCase2 = { 4, 12, 1, 13, 15 };
        int[] solution = { 15, 9, 11, 4, 12, 3, 2, 14, 6, 4, 4, 12, 1, 13, 15 };
        test(testCase1, testCase2, solution);
    }//public void test8() {

    @Test
    public void test9() {
        int[] testCase1 = { 10, 7, 8 };
        int[] testCase2 = { 1 };
        int[] solution = { 10, 7, 8, 1 };
        test(testCase1, testCase2, solution);
    }//public void test9() {

    @Test
    public void test10() {
        int[] testCase1 = { 7, 10, 1, 11, 8, 8, 11, 5, 7, 9 };
        int[] testCase2 = { 8, 2, 13, 15, 5, 11, 10, 6, 14, 2 };
        int[] solution = { 7, 10, 1, 11, 8, 8, 11, 5, 7, 9, 8, 2, 13, 15, 5, 11, 10, 6, 14, 2 };
        test(testCase1, testCase2, solution);
    }//public void test10() {

    private void test(int[] testCase1, int[] testCase2, int[] solution) {
        assertTimeout(Duration.ofSeconds(3), () -> new ConcatenateArrays().concatenateArrays(testCase1.clone(),testCase2.clone()));
        MatcherAssert.assertThat(new ConcatenateArrays().concatenateArrays(testCase1.clone(),testCase2.clone()), is(solution));
    }//private void test(int[] testCase1, int[] testCase2, int[] solution) {
}//class ConcatenateArraysTest {