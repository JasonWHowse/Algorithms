/*
 * Authored by: Jason Wesley Howse
 */

/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._02_smooth_sailing;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.*;

class SortByHeightTest {

    @Test
    void Test1() {
        int[] testCase = new int[]{-1, 150, 190, 170, -1, -1, 160, 180};
        int[] solution = new int[]{-1, 150, 160, 170, -1, -1, 180, 190};
        assertTimeout(Duration.ofSeconds(3),()->
                (new SortByHeight().sortByHeight(testCase)));
        MatcherAssert.assertThat(new SortByHeight().sortByHeight(testCase),is(solution));
    }//void Test1() {

    @Test
    void Test2() {
        int[] testCase = new int[]{-1, -1, -1, -1, -1};
        int[] solution = new int[]{-1, -1, -1, -1, -1};
        assertTimeout(Duration.ofSeconds(3),()->
                (new SortByHeight().sortByHeight(testCase)));
        MatcherAssert.assertThat(new SortByHeight().sortByHeight(testCase),is(solution));
    }//void Test2() {

    @Test
    void Test3() {
        int[] testCase = new int[]{-1};
        int[] solution = new int[]{-1};
        assertTimeout(Duration.ofSeconds(3),()->
                (new SortByHeight().sortByHeight(testCase)));
        MatcherAssert.assertThat(new SortByHeight().sortByHeight(testCase),is(solution));
    }//void Test3() {

    @Test
    void Test4() {
        int[] testCase = new int[]{4, 2, 9, 11, 2, 16};
        int[] solution = new int[]{2, 2, 4, 9, 11, 16};
        assertTimeout(Duration.ofSeconds(3),()->
                (new SortByHeight().sortByHeight(testCase)));
        MatcherAssert.assertThat(new SortByHeight().sortByHeight(testCase),is(solution));
    }//void Test4() {

    @Test
    void Test5() {
        int[] testCase = new int[]{2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1};
        int[] solution = new int[]{1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 2};
        assertTimeout(Duration.ofSeconds(3),()->
                (new SortByHeight().sortByHeight(testCase)));
        MatcherAssert.assertThat(new SortByHeight().sortByHeight(testCase),is(solution));
    }//void Test5() {

    @Test
    void Test6() {
        int[] testCase = new int[]{23, 54, -1, 43, 1, -1, -1, 77, -1, -1, -1, 3};
        int[] solution = new int[]{1, 3, -1, 23, 43, -1, -1, 54, -1, -1, -1, 77};
        assertTimeout(Duration.ofSeconds(3),()->
                (new SortByHeight().sortByHeight(testCase)));
        MatcherAssert.assertThat(new SortByHeight().sortByHeight(testCase),is(solution));
    }//void Test6() {
}//class SortByHeightTest {