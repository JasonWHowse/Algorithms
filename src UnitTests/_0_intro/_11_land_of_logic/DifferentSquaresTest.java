/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._11_land_of_logic;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static helper_functions.Helpers.deepClone;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class DifferentSquaresTest {

    @Test
    void test1() {
        int[][] testCase={{1,2,1},
                {2,2,2},
                {2,2,2},
                {1,2,3},
                {2,2,1}};
        int solution=6;
        assertTimeout(Duration.ofSeconds(3),()->
                new DifferentSquares().differentSquares(deepClone(testCase)));
        assertEquals(new DifferentSquares().differentSquares(deepClone(testCase)),solution);
    }//void test1() {

    @Test
    void test2() {
        int[][] testCase={{9,9,9,9,9},
                {9,9,9,9,9},
                {9,9,9,9,9},
                {9,9,9,9,9},
                {9,9,9,9,9},
                {9,9,9,9,9}};
        int solution=1;
        assertTimeout(Duration.ofSeconds(3),()->
                new DifferentSquares().differentSquares(deepClone(testCase)));
        assertEquals(new DifferentSquares().differentSquares(deepClone(testCase)),solution);
    }//void test2() {

    @Test
    void test3() {
        int[][] testCase={{3}};
        int solution=0;
        assertTimeout(Duration.ofSeconds(3),()->
                new DifferentSquares().differentSquares(deepClone(testCase)));
        assertEquals(new DifferentSquares().differentSquares(deepClone(testCase)),solution);
    }//void test3() {

    @Test
    void test4() {
        int[][] testCase={{3,4,5,6,7,8,9}};
        int solution=0;
        assertTimeout(Duration.ofSeconds(3),()->
                new DifferentSquares().differentSquares(deepClone(testCase)));
        assertEquals(new DifferentSquares().differentSquares(deepClone(testCase)),solution);
    }//void test4() {

    @Test
    void test5() {
        int[][] testCase={{3},
                {4},
                {5},
                {6},
                {7}};
        int solution=0;
        assertTimeout(Duration.ofSeconds(3),()->
                new DifferentSquares().differentSquares(deepClone(testCase)));
        assertEquals(new DifferentSquares().differentSquares(deepClone(testCase)),solution);
    }//void test5() {

    @Test
    void test6() {
        int[][] testCase={{2,5,3,4,3,1,3,2},
                {4,5,4,1,2,4,1,3},
                {1,1,2,1,4,1,1,5},
                {1,3,4,2,3,4,2,4},
                {1,5,5,2,1,3,1,1},
                {1,2,3,3,5,1,2,4},
                {3,1,4,4,4,1,5,5},
                {5,1,3,3,1,5,3,5},
                {5,4,4,3,5,4,4,4}};
        int solution=54;
        assertTimeout(Duration.ofSeconds(3),()->
                new DifferentSquares().differentSquares(deepClone(testCase)));
        assertEquals(new DifferentSquares().differentSquares(deepClone(testCase)),solution);
    }//void test6() {

    @Test
    void test7() {
        int[][] testCase={{1,1,1,1,1,1,2,2,2,3,3,3,9,9,9,2,3,9}};
        int solution=0;
        assertTimeout(Duration.ofSeconds(3),()->
                new DifferentSquares().differentSquares(deepClone(testCase)));
        assertEquals(new DifferentSquares().differentSquares(deepClone(testCase)),solution);
    }//void test7() {
}//class DifferentSquaresTest {