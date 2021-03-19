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

class BoxBlurTest {

    @Test
    void test1() {
        int[][] testCase={{1,1,1},
                {1,7,1},
                {1,1,1}};
        int[][] solution= {{1}} ;
        assertTimeout(Duration.ofSeconds(3),()->
                new BoxBlur().boxBlur(deepCopy(testCase)));
        MatcherAssert.assertThat(new BoxBlur().boxBlur(deepCopy(testCase)),is(solution));
    }//void test1() {

    @Test
    void test2() {
        int[][] testCase= {{0,18,9},
                {27,9,0},
                {81,63,45}} ;
        int[][] solution= {{28}} ;
        assertTimeout(Duration.ofSeconds(3),()->
                new BoxBlur().boxBlur(deepCopy(testCase)));
        MatcherAssert.assertThat(new BoxBlur().boxBlur(deepCopy(testCase)),is(solution));
    }//void test2() {

    @Test
    void test3() {
        int[][] testCase= {{36,0,18,9},
                {27,54,9,0},
                {81,63,72,45}} ;
        int[][] solution= {{40,30}} ;
        assertTimeout(Duration.ofSeconds(3),()->
                new BoxBlur().boxBlur(deepCopy(testCase)));
        MatcherAssert.assertThat(new BoxBlur().boxBlur(deepCopy(testCase)),is(solution));
    }//void test3() {

    @Test
    void test4() {
        int[][] testCase= {{7,4,0,1},
                {5,6,2,2},
                {6,10,7,8},
                {1,4,2,0}} ;
        int[][] solution= {{5,4},
                {4,4}} ;
        assertTimeout(Duration.ofSeconds(3),()->
                new BoxBlur().boxBlur(deepCopy(testCase)));
        MatcherAssert.assertThat(new BoxBlur().boxBlur(deepCopy(testCase)),is(solution));
    }//void test4() {

    @Test
    void test5() {
        int[][] testCase= {{36,0,18,9,9,45,27},
                {27,0,54,9,0,63,90},
                {81,63,72,45,18,27,0},
                {0,0,9,81,27,18,45},
                {45,45,27,27,90,81,72},
                {45,18,9,0,9,18,45},
                {27,81,36,63,63,72,81}} ;
        int[][] solution= {{39,30,26,25,31},
                {34,37,35,32,32},
                {38,41,44,46,42},
                {22,24,31,39,45},
                {37,34,36,47,59}} ;
        assertTimeout(Duration.ofSeconds(3),()->
                new BoxBlur().boxBlur(deepCopy(testCase)));
        MatcherAssert.assertThat(new BoxBlur().boxBlur(deepCopy(testCase)),is(solution));
    }//void test5() {

    @Test
    void test6() {
        int[][] testCase= {{36,0,18,9,9,45,27},
                {27,0,254,9,0,63,90},
                {81,255,72,45,18,27,0},
                {0,0,9,81,27,18,45},
                {45,45,227,227,90,81,72},
                {45,18,9,255,9,18,45},
                {27,81,36,127,255,72,81}} ;
        int[][] solution= {{82,73,48,25,31},
                {77,80,57,32,32},
                {81,106,88,68,42},
                {44,96,103,89,45},
                {59,113,137,126,80}} ;
        assertTimeout(Duration.ofSeconds(3),()->
                new BoxBlur().boxBlur(deepCopy(testCase)));
        MatcherAssert.assertThat(new BoxBlur().boxBlur(deepCopy(testCase)),is(solution));
    }//void test6() {
}//class BoxBlurTest {