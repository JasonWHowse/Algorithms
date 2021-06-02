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
    public void test1() {
        int[] testCase = {6, 2, 3, 8};
        int solution = 3;
        test(testCase,solution);
    }//void test1() {

    @Test
    public void test2() {
        int[] testCase = {0, 3};
        int solution = 2;
        test(testCase,solution);
    }//void test2() {

    @Test
    public void test3() {
        int[] testCase = {5, 4, 6};
        int solution = 0;
        test(testCase,solution);
    }//void test3() {

    @Test
    public void test4() {
        int[] testCase = {6, 3};
        int solution = 2;
        test(testCase,solution);
    }//void test4() {

    @Test
    public void test5() {
        int[] testCase = {1};
        int solution = 0;
        test(testCase,solution);
    }//void test5() {

    @Test
    public void test6() {
        int[] testCase = { 8, 1, 0, 4, 7 };
        var solution = 4;
        test(testCase,solution);
    }//public void test6() {

    @Test
    public void test7() {
        int[] testCase = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        var solution = 0;
        test(testCase,solution);
    }//public void test7() {

    @Test
    public void test8() {
        int[] testCase = { 10 };
        var solution = 0;
        test(testCase,solution);
    }//public void test8() {

    @Test
    public void test9() {
        int[] testCase = { 4, 2, 7, 18 };
        var solution = 13;
        test(testCase,solution);
    }//public void test9() {

    @Test
    public void test10() {
        int[] testCase = { 4, 2, 9 };
        var solution = 5;
        test(testCase,solution);
    }//public void test10() {

    private void test(int[] testCase,int solution) {
        assertTimeout(Duration.ofSeconds(3), () -> new MakeArrayConsecutive2().makeArrayConsecutive2(testCase.clone()));
        assertEquals(solution, new MakeArrayConsecutive2().makeArrayConsecutive2(testCase));
    }//private void test(int[] testCase,int solution) {
}//class MakeArrayConsecutive2Test {