/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._00_intro_gates;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class SeatsInTheaterTest {

    @Test
    void test1() {
        int testCase1=16;
        int testCase2=11;
        int testCase3=5;
        int testCase4=3;
        int solution=96;
        assertTimeout(Duration.ofSeconds(3),()->
                new SeatsInTheater().seatsInTheater(testCase1,testCase2,testCase3,testCase4));
        assertEquals(solution,new SeatsInTheater().seatsInTheater(testCase1,testCase2,testCase3,testCase4));
    }//void test1() {

    @Test
    void test2() {
        int testCase1=1;
        int testCase2=1;
        int testCase3=1;
        int testCase4=1;
        int solution=0;
        assertTimeout(Duration.ofSeconds(3),()->
                new SeatsInTheater().seatsInTheater(testCase1,testCase2,testCase3,testCase4));
        assertEquals(solution,new SeatsInTheater().seatsInTheater(testCase1,testCase2,testCase3,testCase4));
    }//void test2() {

    @Test
    void test3() {
        int testCase1=13;
        int testCase2=6;
        int testCase3=8;
        int testCase4=3;
        int solution=18;
        assertTimeout(Duration.ofSeconds(3),()->
                new SeatsInTheater().seatsInTheater(testCase1,testCase2,testCase3,testCase4));
        assertEquals(solution,new SeatsInTheater().seatsInTheater(testCase1,testCase2,testCase3,testCase4));
    }//void test3() {

    @Test
    void test4() {
        int testCase1=60;
        int testCase2=100;
        int testCase3=60;
        int testCase4=1;
        int solution=99;
        assertTimeout(Duration.ofSeconds(3),()->
                new SeatsInTheater().seatsInTheater(testCase1,testCase2,testCase3,testCase4));
        assertEquals(solution,new SeatsInTheater().seatsInTheater(testCase1,testCase2,testCase3,testCase4));
    }//void test4() {

    @Test
    void test5() {
        int testCase1=1000;
        int testCase2=1000;
        int testCase3=1000;
        int testCase4=1000;
        int solution=0;
        assertTimeout(Duration.ofSeconds(3),()->
                new SeatsInTheater().seatsInTheater(testCase1,testCase2,testCase3,testCase4));
        assertEquals(solution,new SeatsInTheater().seatsInTheater(testCase1,testCase2,testCase3,testCase4));
    }//void test5() {
}//class SeatsInTheaterTest {