/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._07_diving_deeper;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class ExtractEachKthTest {

    @Test
    void test1() {
        int[] testCase1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int testCase2 = 3;
        int[] solution = {1, 2, 4, 5, 7, 8, 10};
        assertTimeout(Duration.ofSeconds(3), ()->
                new ExtractEachKth().extractEachKth(testCase1.clone(),testCase2));
        MatcherAssert.assertThat(new ExtractEachKth().extractEachKth(testCase1.clone(),testCase2),is(solution));
    }//void test1() {

    @Test
    void test2() {
        int[] testCase1 = {1, 1, 1, 1, 1};
        int testCase2 = 1;
        int[] solution = {};
        assertTimeout(Duration.ofSeconds(3), ()->
                new ExtractEachKth().extractEachKth(testCase1.clone(),testCase2));
        MatcherAssert.assertThat(new ExtractEachKth().extractEachKth(testCase1.clone(),testCase2),is(solution));
    }//void test2() {

    @Test
    void test3() {
        int[] testCase1 = {1, 2, 1, 2, 1, 2, 1, 2};
        int testCase2 = 2;
        int[] solution = {1, 1, 1, 1};
        assertTimeout(Duration.ofSeconds(3), ()->
                new ExtractEachKth().extractEachKth(testCase1.clone(),testCase2));
        MatcherAssert.assertThat(new ExtractEachKth().extractEachKth(testCase1.clone(),testCase2),is(solution));
    }//void test3() {

    @Test
    void test4() {
        int[] testCase1 = {1, 2, 1, 2, 1, 2, 1, 2};
        int testCase2 = 10;
        int[] solution = {1, 2, 1, 2, 1, 2, 1, 2};
        assertTimeout(Duration.ofSeconds(3), ()->
                new ExtractEachKth().extractEachKth(testCase1.clone(),testCase2));
        MatcherAssert.assertThat(new ExtractEachKth().extractEachKth(testCase1.clone(),testCase2),is(solution));
    }//void test4() {

    @Test
    void test5() {
        int[] testCase1 = {2, 4, 6, 8, 10};
        int testCase2 = 2;
        int[] solution = {2, 6, 10};
        assertTimeout(Duration.ofSeconds(3), ()->
                new ExtractEachKth().extractEachKth(testCase1.clone(),testCase2));
        MatcherAssert.assertThat(new ExtractEachKth().extractEachKth(testCase1.clone(),testCase2),is(solution));
    }//void test5() {
}//class ExtractEachKthTest {