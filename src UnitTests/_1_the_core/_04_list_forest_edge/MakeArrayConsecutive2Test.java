/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._04_list_forest_edge;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class MakeArrayConsecutive2Test {

    @Test
    void test1() {
        int[] testCase = {6, 2, 3, 8};
        int solution = 3;
        test(testCase,solution);
    }//void test1() {

    @Test
    void test2() {
        int[] testCase = {0, 3};
        int solution = 2;
        test(testCase,solution);
    }//void test2() {

    @Test
    void test3() {
        int[] testCase = {5, 4, 6};
        int solution = 0;
        test(testCase,solution);
    }//void test3() {

    @Test
    void test4() {
        int[] testCase = {6, 3};
        int solution = 2;
        test(testCase,solution);
    }//void test4() {

    @Test
    void test5() {
        int[] testCase = {1};
        int solution = 0;
        test(testCase,solution);
    }//void test5() {

    private void test(int[] testCase,int solution) {
        assertTimeout(Duration.ofSeconds(3), () ->
                new MakeArrayConsecutive2().makeArrayConsecutive2(testCase.clone()));
        assertEquals(solution, new MakeArrayConsecutive2().makeArrayConsecutive2(testCase.clone()));
    }//private void test(){
}//class MakeArrayConsecutive2Test {