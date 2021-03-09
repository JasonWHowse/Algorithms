/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._01_at_the_crossroads;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WillYouTest {

    @Test
    void test1() {
        boolean testCase1=true;
        boolean testCase2=true;
        boolean testCase3=true;
        assertTimeout(Duration.ofSeconds(3),()->
                new WillYou().willYou(testCase1,testCase2,testCase3));
        assertFalse(new WillYou().willYou(testCase1,testCase2,testCase3));
    }//void test1() {

    @Test
    void test2() {
        boolean testCase1=true;
        boolean testCase2=false;
        boolean testCase3=true;
        assertTimeout(Duration.ofSeconds(3),()->
                new WillYou().willYou(testCase1,testCase2,testCase3));
        assertTrue(new WillYou().willYou(testCase1,testCase2,testCase3));
    }//void test2() {

    @Test
    void test3() {
        boolean testCase1=false;
        boolean testCase2=false;
        boolean testCase3=false;
        assertTimeout(Duration.ofSeconds(3),()->
                new WillYou().willYou(testCase1,testCase2,testCase3));
        assertFalse(new WillYou().willYou(testCase1,testCase2,testCase3));
    }//void test3() {

    @Test
    void test4() {
        boolean testCase1=false;
        boolean testCase2=false;
        boolean testCase3=true;
        assertTimeout(Duration.ofSeconds(3),()->
                new WillYou().willYou(testCase1,testCase2,testCase3));
        assertTrue(new WillYou().willYou(testCase1,testCase2,testCase3));
    }//void test4() {
}//class WillYouTest {