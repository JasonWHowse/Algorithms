/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._04_list_forest_edge;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class IsSmoothTest {

    @Test
    void test1() {
        int[] testCase = {7, 2, 2, 5, 10, 7};
        test(testCase,true);
    }//void test1() {

    @Test
    void test2() {
        int[] testCase = {-5, -5, 10};
        test(testCase,false);
    }//void test2() {

    @Test
    void test3() {
        int[] testCase = {4, 2};
        test(testCase,false);
    }//void test3() {

    @Test
    void test4() {
        int[] testCase = {45, 23, 12, 33, 12, 453, -234, -45};
        test(testCase,false);
    }//void test4() {

    @Test
    void test5() {
        int[] testCase = {-12, 34, 40, -5, -12, 4, 0, 0, -12};
        test(testCase,true);
    }//void test5() {

    @Test
    void test6() {
        int[] testCase = {9, 0, 15, 9};
        test(testCase,false);
    }//void test6() {

    @Test
    void test7() {
        int[] testCase = {-6, 6, -6};
        test(testCase,false);
    }//void test7() {

    @Test
    void test8() {
        int[] testCase = {26, 26, -17};
        test(testCase,false);
    }//void test8() {

    @Test
    void test9() {
        int[] testCase = {-7, 5, 5, 10};
        test(testCase,false);
    }//void test9() {

    @Test
    void test10() {
        int[] testCase = {3, 4, 5};
        test(testCase,false);
    }//void test10() {

    @Test
    void test11() {
        int[] testCase = {-5, 3, -1, 9};
        test(testCase,false);
    }//void test11() {

    private void test(int[] testCase,boolean solution) {
        assertTimeout(Duration.ofSeconds(3), () ->
                new IsSmooth().isSmooth(testCase.clone()));
        if(solution) {
            assertTrue(new IsSmooth().isSmooth(testCase.clone()));
        }else {//if(solution) {
            assertFalse(new IsSmooth().isSmooth(testCase.clone()));
        }//else {
    }//private void test(){
}//class IsSmoothTest {