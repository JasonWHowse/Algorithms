/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._01_at_the_crossroads;

import java.time.Duration;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.jupiter.api.Assertions.*;

class MetroCardTest {

    @Test
    void test1() {
        int testCase=30;
        int[] solution= {31};
        assertTimeout(Duration.ofSeconds(3),()->
                new MetroCard().metroCard(testCase));
        MatcherAssert.assertThat(new MetroCard().metroCard(testCase),is(solution));
    }//void test1() {

    @Test
    void test2() {
        int testCase=31;
        int[] solution= {28, 30, 31};
        assertTimeout(Duration.ofSeconds(3),()->
                new MetroCard().metroCard(testCase));
        MatcherAssert.assertThat(new MetroCard().metroCard(testCase),is(solution));
    }//void test2() {
}//class MetroCardTest {