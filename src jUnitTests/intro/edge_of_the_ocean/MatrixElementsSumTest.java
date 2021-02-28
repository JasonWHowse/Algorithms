/*
 * Authored by: Jason Wesley Howse
 */

package intro.edge_of_the_ocean;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class MatrixElementsSumTest {

    @Test
    void test1() {
        int[][] testCase=new int[][]{   {0,1,1,2},
                                        {0,5,0,0},
                                        {2,0,3,3}};
        assertTimeout(Duration.ofSeconds(3),()->
                new MatrixElementsSum().matrixElementsSum(
                        testCase));
        assertEquals(new MatrixElementsSum().
                matrixElementsSum(testCase),9);
    }//void test1() {

    @Test
    void test2() {
        int[][] testCase=new int[][]{   {1,1,1,0},
                                        {0,5,0,1},
                                        {2,1,3,10}};
        assertTimeout(Duration.ofSeconds(3),()->
                new MatrixElementsSum().matrixElementsSum(
                        testCase));
        assertEquals(new MatrixElementsSum().
                matrixElementsSum(testCase),9);
    }//void test2() {

    @Test
    void test3() {
        int[][] testCase=new int[][]{   {1,1,1},
                                        {2,2,2},
                                        {3,3,3}};
        assertTimeout(Duration.ofSeconds(3),()->
                new MatrixElementsSum().matrixElementsSum(
                        testCase));
        assertEquals(new MatrixElementsSum().
                matrixElementsSum(testCase),18);
    }//void test3() {

    @Test
    void test4() {
        int[][] testCase=new int[][]{{0}};
        assertTimeout(Duration.ofSeconds(3),()->
                new MatrixElementsSum().matrixElementsSum(
                        testCase));
        assertEquals(new MatrixElementsSum().
                matrixElementsSum(testCase),0);
    }//void test4() {

    @Test
    void test5() {
        int[][] testCase=new int[][]{   {1,0,3},
                                        {0,2,1},
                                        {1,2,0}};
        assertTimeout(Duration.ofSeconds(3),()->
                new MatrixElementsSum().matrixElementsSum(
                        testCase));
        assertEquals(new MatrixElementsSum().
                matrixElementsSum(testCase),5);
    }//void test5() {

    @Test
    void test6() {
        int[][] testCase=new int[][]{   {1},
                                        {5},
                                        {0},
                                        {2}};
        assertTimeout(Duration.ofSeconds(3),()->
                new MatrixElementsSum().matrixElementsSum(
                        testCase));
        assertEquals(new MatrixElementsSum().
                matrixElementsSum(testCase),6);
    }//void test6() {

    @Test
    void test7() {
        int[][] testCase=new int[][]{   {1,2,3,4,5}};
        assertTimeout(Duration.ofSeconds(3),()->
                new MatrixElementsSum().matrixElementsSum(
                        testCase));
        assertEquals(new MatrixElementsSum().
                matrixElementsSum(testCase),15);
    }//void test7() {

    @Test
    void test8() {
        int[][] testCase=new int[][]{   {2},
                                        {5},
                                        {10}};
        assertTimeout(Duration.ofSeconds(3),()->
                new MatrixElementsSum().matrixElementsSum(
                        testCase));
        assertEquals(new MatrixElementsSum().
                matrixElementsSum(testCase),17);
    }//void test8() {

    @Test
    void test9() {
        int[][] testCase=new int[][]{   {4,0,1},
                                        {10,7,0},
                                        {0,0,0},
                                        {9,1,2}};
        assertTimeout(Duration.ofSeconds(3),()->
                new MatrixElementsSum().matrixElementsSum(
                        testCase));
        assertEquals(new MatrixElementsSum().
                matrixElementsSum(testCase),15);
    }//void test9() {

    @Test
    void test10() {
        int[][] testCase=new int[][]{{1}};
        assertTimeout(Duration.ofSeconds(3),()->
                new MatrixElementsSum().matrixElementsSum(
                        testCase));
        assertEquals(new MatrixElementsSum().
                matrixElementsSum(testCase),1);
    }//void test10() {
}