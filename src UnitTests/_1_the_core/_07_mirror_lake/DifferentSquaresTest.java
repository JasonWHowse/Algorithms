/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._07_mirror_lake;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static helper_functions.Helpers.deepClone;
import static org.junit.jupiter.api.Assertions.*;

class DifferentSquaresTest {

    @Test
    public void test1() {
        int[][] testCase = {new int[]{1, 2, 1}, new int[]{2, 2, 2}, new int[]{2, 2, 2}, new int[]{1, 2, 3}, new int[]{2, 2, 1}};
        var solution = 6;
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        int[][] testCase = {new int[]{9, 9, 9, 9, 9}, new int[]{9, 9, 9, 9, 9}, new int[]{9, 9, 9, 9, 9}, new int[]{9, 9, 9, 9, 9}, new int[]{9, 9, 9, 9, 9}, new int[]{9, 9, 9, 9, 9}};
        var solution = 1;
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        int[][] testCase = {new int[]{3}};
        var solution = 0;
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        int[][] testCase = {new int[]{3, 4, 5, 6, 7, 8, 9}};
        var solution = 0;
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        int[][] testCase = {new int[]{3}, new int[]{4}, new int[]{5}, new int[]{6}, new int[]{7}};
        var solution = 0;
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        int[][] testCase = {new int[]{2, 5, 3, 4, 3, 1, 3, 2}, new int[]{4, 5, 4, 1, 2, 4, 1, 3}, new int[]{1, 1, 2, 1, 4, 1, 1, 5}, new int[]{1, 3, 4, 2, 3, 4, 2, 4}, new int[]{1, 5, 5, 2, 1, 3, 1, 1}, new int[]{1, 2, 3, 3, 5, 1, 2, 4}, new int[]{3, 1, 4, 4, 4, 1, 5, 5}, new int[]{5, 1, 3, 3, 1, 5, 3, 5}, new int[]{5, 4, 4, 3, 5, 4, 4, 4}};
        var solution = 54;
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        int[][] testCase = {new int[]{1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 9, 9, 9, 2, 3, 9}};
        var solution = 0;
        test(testCase, solution);
    }//public void test7() {

    private void test(int[][] testCase, int solution) {
        assertEquals(new DifferentSquares().differentSquares(deepClone(testCase)), solution);
        assertTimeout(Duration.ofSeconds(3), () -> new DifferentSquares().differentSquares(testCase));
    }//private void test(int[][] testCase, int solution){
}//class DifferentSquaresTest {