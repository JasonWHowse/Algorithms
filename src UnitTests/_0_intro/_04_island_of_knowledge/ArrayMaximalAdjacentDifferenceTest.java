/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._04_island_of_knowledge;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class ArrayMaximalAdjacentDifferenceTest {

    @Test
    public void test1() {
        int[] testCase = { 2, 4, 1, 0 };
        var solution = 3;
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        int[] testCase = { 1, 1, 1, 1 };
        var solution = 0;
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        int[] testCase = { -1, 4, 10, 3, -2 };
        var solution = 7;
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        int[] testCase = { 10, 11, 13 };
        var solution = 2;
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        int[] testCase = { -2, -2, -2, -2, -2 };
        var solution = 0;
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        int[] testCase = { -1, 1, -3, -4 };
        var solution = 4;
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        int[] testCase = { -14, 15, -15 };
        var solution = 30;
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        int[] testCase = { 1, 5, 9, -3, 7, 1, 10 };
        var solution = 12;
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        int[] testCase = { 10, 7, -2, -5, -15 };
        var solution = 10;
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        int[] testCase = { 0, 15, -10 };
        var solution = 25;
        test(testCase, solution);
    }//public void test10() {

    @Test
    public void test11() {
        int[] testCase = { -1, 1, -1, 1, -4, 4, 3, -3, 3, -3 };
        var solution = 8;
        test(testCase, solution);
    }//public void test11() {

    @Test
    public void test12() {
        int[] testCase = { 0, 10, 2, -1 };
        var solution = 10;
        test(testCase, solution);
    }//public void test12() {

    @Test
    public void test13() {
        int[] testCase = { 2, 2, 2, 2 };
        var solution = 0;
        test(testCase, solution);
    }//public void test13() {

    private void test(int[] testCase, int solution){
        assertTimeout(Duration.ofSeconds(3),()->new ArrayMaximalAdjacentDifference().arrayMaximalAdjacentDifference(testCase.clone()));
        assertEquals(solution,new ArrayMaximalAdjacentDifference().arrayMaximalAdjacentDifference(testCase));
    }//private void test(int[] testCase, int solution){
}//class ArrayMaximalAdjacentDifferenceTest {