/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._09_eruption_of_light;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class ElectionsWinnersTest {

    @Test
    void test1() {
        int[] testCase1={2, 3, 5, 2};
        int testCase2=3;
        int solution=2;
        assertTimeout(Duration.ofSeconds(3),()->
                new ElectionsWinners().electionsWinners(testCase1.clone(),testCase2));
        assertEquals(new ElectionsWinners().electionsWinners(testCase1.clone(),testCase2),solution);
    }//void test1() {

    @Test
    void test2() {
        int[] testCase1={1, 3, 3, 1, 1};
        int testCase2=0;
        int solution=0;
        assertTimeout(Duration.ofSeconds(3),()->
                new ElectionsWinners().electionsWinners(testCase1.clone(),testCase2));
        assertEquals(new ElectionsWinners().electionsWinners(testCase1.clone(),testCase2),solution);
    }//void test2() {

    @Test
    void test3() {
        int[] testCase1={5, 1, 3, 4, 1};
        int testCase2=0;
        int solution=1;
        assertTimeout(Duration.ofSeconds(3),()->
                new ElectionsWinners().electionsWinners(testCase1.clone(),testCase2));
        assertEquals(new ElectionsWinners().electionsWinners(testCase1.clone(),testCase2),solution);
    }//void test3() {

    @Test
    void test4() {
        int[] testCase1={1, 1, 1, 1};
        int testCase2=1;
        int solution=4;
        assertTimeout(Duration.ofSeconds(3),()->
                new ElectionsWinners().electionsWinners(testCase1.clone(),testCase2));
        assertEquals(new ElectionsWinners().electionsWinners(testCase1.clone(),testCase2),solution);
    }//void test4() {

    @Test
    void test5() {
        int[] testCase1={1, 1, 1, 1};
        int testCase2=0;
        int solution=0;
        assertTimeout(Duration.ofSeconds(3),()->
                new ElectionsWinners().electionsWinners(testCase1.clone(),testCase2));
        assertEquals(new ElectionsWinners().electionsWinners(testCase1.clone(),testCase2),solution);
    }//void test5() {

    @Test
    void test6() {
        int[] testCase1={3, 1, 1, 3, 1};
        int testCase2=2;
        int solution=2;
        assertTimeout(Duration.ofSeconds(3),()->
                new ElectionsWinners().electionsWinners(testCase1.clone(),testCase2));
        assertEquals(new ElectionsWinners().electionsWinners(testCase1.clone(),testCase2),solution);
    }//void test6() {
}