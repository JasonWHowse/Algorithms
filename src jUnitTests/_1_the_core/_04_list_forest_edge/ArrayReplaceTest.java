/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._04_list_forest_edge;

import java.time.Duration;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.jupiter.api.Assertions.*;

class ArrayReplaceTest {

    @Test
    void test1() {
        int[] testCase1 = {1, 2, 1};
        int testCase2 = 1;
        int testCase3 = 3;
        int[] solution = {3, 2, 3};
        test(testCase1, testCase2, testCase3, solution);
    }//void test1() {

    @Test
    void test2() {
        int[] testCase1 = {1, 2, 3, 4, 5};
        int testCase2 = 3;
        int testCase3 = 0;
        int[] solution = {1, 2, 0, 4, 5};
        test(testCase1, testCase2, testCase3, solution);
    }//void test2() {

    @Test
    void test3() {
        int[] testCase1 = {1, 1, 1};
        int testCase2 = 1;
        int testCase3 = 10;
        int[] solution = {10, 10, 10};
        test(testCase1, testCase2, testCase3, solution);
    }//void test3() {

    @Test
    void test4() {
        int[] testCase1 = {1, 2, 1, 2, 1};
        int testCase2 = 2;
        int testCase3 = 1;
        int[] solution = {1, 1, 1, 1, 1};
        test(testCase1, testCase2, testCase3, solution);
    }//void test4() {

    @Test
    void test5() {
        int[] testCase1 = {1, 2, 1, 2, 1};
        int testCase2 = 2;
        int testCase3 = 2;
        int[] solution = {1, 2, 1, 2, 1};
        test(testCase1, testCase2, testCase3, solution);
    }//void test5() {

    @Test
    void test6() {
        int[] testCase1 = {3, 1};
        int testCase2 = 3;
        int testCase3 = 9;
        int[] solution = {9, 1};
        test(testCase1, testCase2, testCase3, solution);
    }//void test6() {

    @Test
    void test7() {
        int[] testCase1 = {10, 10};
        int testCase2 = 0;
        int testCase3 = 9;
        int[] solution = {10, 10};
        test(testCase1, testCase2, testCase3, solution);
    }//void test7() {

    @Test
    void test8() {
        int[] testCase1 = {2, 1};
        int testCase2 = 3;
        int testCase3 = 9;
        int[] solution = {2, 1};
        test(testCase1, testCase2, testCase3, solution);
    }//void test8() {

    private void test(int[] testCase1, int testCase2, int testCase3,int[] solution) {
        assertTimeout(Duration.ofSeconds(3), () ->
                new ArrayReplace().arrayReplace(testCase1.clone(),testCase2,testCase3));
        MatcherAssert.assertThat(new ArrayReplace().arrayReplace(testCase1.clone(),testCase2,testCase3), is(solution));
    }//private void test(){
}//class ArrayReplaceTest {