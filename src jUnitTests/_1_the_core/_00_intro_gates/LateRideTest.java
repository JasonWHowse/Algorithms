/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._00_intro_gates;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LateRideTest {

    @Test
    void test1() {
        int testCase=240;
        int solution=4;
        assertTimeout(Duration.ofSeconds(3),()->
                new LateRide().lateRide(testCase));
        assertEquals(solution,new LateRide().lateRide(testCase));
    }//void test1() {

    @Test
    void test2() {
        int testCase=808;
        int solution=14;
        assertTimeout(Duration.ofSeconds(3),()->
                new LateRide().lateRide(testCase));
        assertEquals(solution,new LateRide().lateRide(testCase));
    }//void test2() {

    @Test
    void test3() {
        int testCase=1439;
        int solution=19;
        assertTimeout(Duration.ofSeconds(3),()->
                new LateRide().lateRide(testCase));
        assertEquals(solution,new LateRide().lateRide(testCase));
    }//void test3() {

    @Test
    void test4() {
        int testCase=0;
        int solution=0;
        assertTimeout(Duration.ofSeconds(3),()->
                new LateRide().lateRide(testCase));
        assertEquals(solution,new LateRide().lateRide(testCase));
    }//void test4() {

    @Test
    void test5() {
        int testCase=23;
        int solution=5;
        assertTimeout(Duration.ofSeconds(3),()->
                new LateRide().lateRide(testCase));
        assertEquals(solution,new LateRide().lateRide(testCase));
    }//void test5() {

    @Test
    void test6() {
        int testCase=8;
        int solution=8;
        assertTimeout(Duration.ofSeconds(3),()->
                new LateRide().lateRide(testCase));
        assertEquals(solution,new LateRide().lateRide(testCase));
    }//void test6() {
}//class LateRideTest {