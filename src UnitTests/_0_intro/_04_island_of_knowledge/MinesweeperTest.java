/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._04_island_of_knowledge;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static helper_functions.Helpers.deepCopy;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class MinesweeperTest {

    @Test
    void test1() {
        boolean[][] testCase = {{true,false,false},
                {false,true,false},
                {false,false,false}};
        int[][] solution = {{1,2,1},
                {2,1,1},
                {1,1,1}};
        assertTimeout(Duration.ofSeconds(3),()->
                new Minesweeper().minesweeper(deepCopy(testCase)));
        MatcherAssert.assertThat(new Minesweeper().minesweeper(deepCopy(testCase)),is(solution));
    }//void test1() {

    @Test
    void test2() {
        boolean[][] testCase = {{false,false,false},
                {false,false,false}};
        int[][] solution = {{0,0,0},
                {0,0,0}};
        assertTimeout(Duration.ofSeconds(3),()->
                new Minesweeper().minesweeper(deepCopy(testCase)));
        MatcherAssert.assertThat(new Minesweeper().minesweeper(deepCopy(testCase)),is(solution));
    }//void test2() {

    @Test
    void test3() {
        boolean[][] testCase = {{true,false,false,true},
                {false,false,true,false},
                {true,true,false,true}};
        int[][] solution = {{0,2,2,1},
                {3,4,3,3},
                {1,2,3,1}};
        assertTimeout(Duration.ofSeconds(3),()->
                new Minesweeper().minesweeper(deepCopy(testCase)));
        MatcherAssert.assertThat(new Minesweeper().minesweeper(deepCopy(testCase)),is(solution));
    }//void test3() {

    @Test
    void test4() {
        boolean[][] testCase = {{true,true,true},
                {true,true,true},
                {true,true,true}};
        int[][] solution = {{3,5,3},
                {5,8,5},
                {3,5,3}};
        assertTimeout(Duration.ofSeconds(3),()->
                new Minesweeper().minesweeper(deepCopy(testCase)));
        MatcherAssert.assertThat(new Minesweeper().minesweeper(deepCopy(testCase)),is(solution));
    }//void test4() {

    @Test
    void test5() {
        boolean[][] testCase = {{false,true,true,false},
                {true,true,false,true},
                {false,false,true,false}};
        int[][] solution = {{3,3,3,2},
                {2,4,5,2},
                {2,3,2,2}};
        assertTimeout(Duration.ofSeconds(3),()->
                new Minesweeper().minesweeper(deepCopy(testCase)));
        MatcherAssert.assertThat(new Minesweeper().minesweeper(deepCopy(testCase)),is(solution));
    }//void test5() {

    @Test
    void test6() {
        boolean[][] testCase = {{true,false},
                {true,false},
                {false,true},
                {false,false},
                {false,false}};
        int[][] solution = {{1,2},
                {2,3},
                {2,1},
                {1,1},
                {0,0}};
        assertTimeout(Duration.ofSeconds(3),()->
                new Minesweeper().minesweeper(deepCopy(testCase)));
        MatcherAssert.assertThat(new Minesweeper().minesweeper(deepCopy(testCase)),is(solution));
    }//void test6() {
}