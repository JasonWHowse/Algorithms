/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._01_edge_of_the_ocean;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static helper_functions.Helpers.deepClone;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class MatrixElementsSumTest {

    @Test
    public void test1() {
        int[][] testCase = {new int[]{ 0, 1, 1, 2 }, new int[]{ 0, 5, 0, 0 }, new int[]{ 2, 0, 3, 3 } };
        var solution = 9;
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        int[][] testCase = {new int[]{ 1, 1, 1, 0 }, new int[]{ 0, 5, 0, 1 }, new int[]{ 2, 1, 3, 10 } };
        var solution = 9;
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        int[][] testCase = {new int[]{ 1, 1, 1 }, new int[]{ 2, 2, 2 }, new int[]{ 3, 3, 3 } };
        var solution = 18;
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        int[][] testCase = {new int[]{ 0 } };
        var solution = 0;
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        int[][] testCase = {new int[]{ 1, 0, 3 }, new int[]{ 0, 2, 1 }, new int[]{ 1, 2, 0 } };
        var solution = 5;
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        int[][] testCase = {new int[]{ 1 }, new int[]{ 5 }, new int[]{ 0 }, new int[]{ 2 } };
        var solution = 6;
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        int[][] testCase = {new int[]{ 1, 2, 3, 4, 5 } };
        var solution = 15;
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        int[][] testCase = {new int[]{ 2 }, new int[]{ 5 }, new int[]{ 10 } };
        var solution = 17;
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        int[][] testCase = {new int[]{ 4, 0, 1 }, new int[]{ 10, 7, 0 }, new int[]{ 0, 0, 0 }, new int[]{ 9, 1, 2 } };
        var solution = 15;
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        int[][] testCase = { new int[] { 1 } };
        var solution = 1;
        test(testCase, solution);
    }//public void test10() {

    @Test
    public void test11() {
        int[][] testCase = { new int[] { 2, 4, 0 } };
        var solution = 6;
        test(testCase, solution);
    }//public void test11() {

    @Test
    public void test12() {
        int[][] testCase = { new int[] { 7, 0, 0 }, new int[] { 9, 0, 0 }, new int[] { 5, 9, 0 }, new int[] { 0, 0, 0 } };
        var solution = 21;
        test(testCase, solution);
    }//public void test12() {

    @Test
    public void test13() {
        int[][] testCase = { new int[] { 9, 2 }, new int[] { 9, 1 } };
        var solution = 21;
        test(testCase, solution);
    }//public void test13() {

    @Test
    public void test14() {
        int[][] testCase = { new int[] { 0, 3, 0, 9, 6 } };
        var solution = 18;
        test(testCase, solution);
    }//public void test14() {

    @Test
    public void test15() {
        int[][] testCase = { new int[] { 1, 0 }, new int[] { 0, 0 }, new int[] { 0, 8 }, new int[] { 9, 8 } };
        var solution = 1;
        test(testCase, solution);
    }//public void test15() {

    @Test
    public void test16() {
        int[][] testCase = { new int[] { 4, 0, 0, 0 }, new int[] { 8, 4, 0, 1 }, new int[] { 5, 0, 0, 4 }, new int[] { 0, 0, 1, 2 } };
        var solution = 17;
        test(testCase, solution);
    }//public void test16() {

    @Test
    public void test17() {
        int[][] testCase = { new int[] { 4 }, new int[] { 0 }, new int[] { 0 }, new int[] { 7 } };
        var solution = 4;
        test(testCase, solution);
    }//public void test17() {

    @Test
    public void test18() {
        int[][] testCase = { new int[] { 3, 9 }, new int[] { 10, 0 }, new int[] { 0, 0 }, new int[] { 3, 4 } };
        var solution = 22;
        test(testCase, solution);
    }//public void test18() {

    @Test
    public void test19() {
        int[][] testCase = { new int[] { 0 }, new int[] { 0 }, new int[] { 0 }, new int[] { 9 } };
        var solution = 0;
        test(testCase, solution);
    }//public void test19() {

    @Test
    public void test20() {
        int[][] testCase = { new int[] { 2, 7 }, new int[] { 0, 2 }, new int[] { 0, 1 } };
        var solution = 12;
        test(testCase, solution);
    }//public void test20() {

    private void test(int[][] testCase, int solution){
        assertTimeout(Duration.ofSeconds(3),()->new MatrixElementsSum().matrixElementsSum(deepClone(testCase)));
        assertEquals(solution,new MatrixElementsSum().matrixElementsSum(testCase));
    }//private void test(int[][] testCase, int solution){
}//class MatrixElementsSumTest {