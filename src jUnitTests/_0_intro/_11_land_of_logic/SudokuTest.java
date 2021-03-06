/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._11_land_of_logic;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import java.time.Duration;

import static helper_functions.Helpers.deepCopy;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.*;

class SudokuTest {

    @Test
    void test1() {
        int[][] testCase={{1,3,2,5,4,6,9,8,7},
                {4,6,5,8,7,9,3,2,1},
                {7,9,8,2,1,3,6,5,4},
                {9,2,1,4,3,5,8,7,6},
                {3,5,4,7,6,8,2,1,9},
                {6,8,7,1,9,2,5,4,3},
                {5,7,6,9,8,1,4,3,2},
                {2,4,3,6,5,7,1,9,8},
                {8,1,9,3,2,4,7,6,5}};
        assertTimeout(Duration.ofSeconds(3),()->
                new Sudoku().sudoku(deepCopy(testCase)));
        assertTrue(new Sudoku().sudoku(deepCopy(testCase)));
    }//void test1() {

    @Test
    void test2() {
        int[][] testCase={{1,3,2,5,4,6,9,2,7},
                {4,6,5,8,7,9,3,8,1},
                {7,9,8,2,1,3,6,5,4},
                {9,2,1,4,3,5,8,7,6},
                {3,5,4,7,6,8,2,1,9},
                {6,8,7,1,9,2,5,4,3},
                {5,7,6,9,8,1,4,3,2},
                {2,4,3,6,5,7,1,9,8},
                {8,1,9,3,2,4,7,6,5}};
        assertTimeout(Duration.ofSeconds(3),()->
                new Sudoku().sudoku(deepCopy(testCase)));
        assertFalse(new Sudoku().sudoku(deepCopy(testCase)));
    }//void test2() {

    @Test
    void test3() {
        int[][] testCase={{1,2,3,4,5,6,7,8,9},
                {1,2,3,4,5,6,7,8,9},
                {1,2,3,4,5,6,7,8,9},
                {1,2,3,4,5,6,7,8,9},
                {1,2,3,4,5,6,7,8,9},
                {1,2,3,4,5,6,7,8,9},
                {1,2,3,4,5,6,7,8,9},
                {1,2,3,4,5,6,7,8,9},
                {1,2,3,4,5,6,7,8,9}};
        assertTimeout(Duration.ofSeconds(3),()->
                new Sudoku().sudoku(deepCopy(testCase)));
        assertFalse(new Sudoku().sudoku(deepCopy(testCase)));
    }//void test3() {

    @Test
    void test4() {
        int[][] testCase={{1,3,4,2,5,6,9,8,7},
                {4,6,8,5,7,9,3,2,1},
                {7,9,2,8,1,3,6,5,4},
                {9,2,3,1,4,5,8,7,6},
                {3,5,7,4,6,8,2,1,9},
                {6,8,1,7,9,2,5,4,3},
                {5,7,6,9,8,1,4,3,2},
                {2,4,5,6,3,7,1,9,8},
                {8,1,9,3,2,4,7,6,5}};
        assertTimeout(Duration.ofSeconds(3),()->
                new Sudoku().sudoku(deepCopy(testCase)));
        assertFalse(new Sudoku().sudoku(deepCopy(testCase)));
    }//void test4() {

    @Test
    void test5() {
        int[][] testCase={{1,3,2,5,4,6,9,8,7},
                {4,6,5,8,7,9,3,2,1},
                {7,9,8,2,1,3,6,5,4},
                {9,2,1,4,3,5,8,7,6},
                {3,5,4,7,6,8,2,1,9},
                {6,8,7,1,9,2,5,4,3},
                {5,4,6,9,8,1,4,3,2},
                {2,7,3,6,5,7,1,9,8},
                {8,1,9,3,2,4,7,6,5}};
        assertTimeout(Duration.ofSeconds(3),()->
                new Sudoku().sudoku(deepCopy(testCase)));
        assertFalse(new Sudoku().sudoku(deepCopy(testCase)));
    }//void test5() {

    @Test
    void test6() {
        int[][] testCase={{1,2,3,4,5,6,7,8,9},
                {4,6,5,8,7,9,3,2,1},
                {7,9,8,2,1,3,6,5,4},
                {1,2,3,4,5,6,7,8,9},
                {4,6,5,8,7,9,3,2,1},
                {7,9,8,2,1,3,6,5,4},
                {1,2,3,4,5,6,7,8,9},
                {4,6,5,8,7,9,3,2,1},
                {7,9,8,2,1,3,6,5,4}};
        assertTimeout(Duration.ofSeconds(3),()->
                new Sudoku().sudoku(deepCopy(testCase)));
        assertFalse(new Sudoku().sudoku(deepCopy(testCase)));
    }//void test6() {

    @Test
    void test7() {
        int[][] testCase={{5,3,4,6,7,8,9,1,2},
                {6,7,2,1,9,5,3,4,8},
                {1,9,8,3,4,2,5,6,7},
                {8,5,9,9,6,1,4,2,3},
                {4,2,6,8,5,3,7,9,1},
                {7,1,3,7,2,4,8,5,6},
                {9,6,1,5,3,7,2,8,4},
                {2,8,7,4,1,9,6,3,5},
                {3,4,5,2,8,6,1,7,9}};
        assertTimeout(Duration.ofSeconds(3),()->
                new Sudoku().sudoku(deepCopy(testCase)));
        assertFalse(new Sudoku().sudoku(deepCopy(testCase)));
    }//void test7() {

    @Test
    void test8() {
        int[][] testCase={{5,5,5,5,5,5,5,5,5},
                {5,5,5,5,5,5,5,5,5},
                {5,5,5,5,5,5,5,5,5},
                {5,5,5,5,5,5,5,5,5},
                {5,5,5,5,5,5,5,5,5},
                {5,5,5,5,5,5,5,5,5},
                {5,5,5,5,5,5,5,5,5},
                {5,5,5,5,5,5,5,5,5},
                {5,5,5,5,5,5,5,5,5}};
        assertTimeout(Duration.ofSeconds(3),()->
                new Sudoku().sudoku(deepCopy(testCase)));
        assertFalse(new Sudoku().sudoku(deepCopy(testCase)));
    }//void test8() {

    @Test
    void test9() {
        int[][] testCase={{5,3,4,6,7,8,9,1,2},
                {6,7,2,3,9,5,3,4,8},
                {1,9,8,1,4,2,5,6,7},
                {8,5,9,7,6,1,4,2,3},
                {4,2,6,8,5,3,7,9,1},
                {7,1,3,9,2,4,8,5,6},
                {9,6,1,5,3,7,2,8,4},
                {2,8,7,4,1,9,6,3,5},
                {3,4,5,2,8,6,1,7,9}};
        assertTimeout(Duration.ofSeconds(3),()->
                new Sudoku().sudoku(deepCopy(testCase)));
        assertFalse(new Sudoku().sudoku(deepCopy(testCase)));
    }//void test9() {

    @Test
    void test10() {
        int[][] testCase={{5,3,4,6,7,8,9,1,2},
                {6,7,2,1,9,5,3,4,8},
                {1,9,8,3,4,2,5,6,7},
                {8,5,9,7,6,1,4,2,3},
                {4,2,6,8,5,3,7,9,1},
                {7,1,3,9,2,4,8,5,6},
                {9,6,1,5,3,7,2,8,4},
                {2,5,7,4,1,9,6,3,5},
                {3,4,5,2,8,6,1,7,9}};
        assertTimeout(Duration.ofSeconds(3),()->
                new Sudoku().sudoku(deepCopy(testCase)));
        assertFalse(new Sudoku().sudoku(deepCopy(testCase)));
    }//void test10() {

    @Test
    void test11() {
        int[][] testCase={{1,2,3,4,5,6,7,8,9},
                {4,5,6,7,8,9,1,2,3},
                {7,8,9,1,2,3,4,5,6},
                {2,3,4,5,6,7,8,9,1},
                {3,4,5,6,7,8,9,1,2},
                {5,6,7,8,9,1,2,3,4},
                {6,7,8,9,1,2,3,4,5},
                {8,9,1,2,3,4,5,6,7},
                {9,1,2,3,4,5,6,7,8}};
        assertTimeout(Duration.ofSeconds(3),()->
                new Sudoku().sudoku(deepCopy(testCase)));
        assertFalse(new Sudoku().sudoku(deepCopy(testCase)));
    }//void test11() {
}