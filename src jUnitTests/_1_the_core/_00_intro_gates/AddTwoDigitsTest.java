/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._00_intro_gates;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddTwoDigitsTest {

    @Test
    void test1() {
        int testCase=29;
        int solution=11;
        assertTimeout(Duration.ofSeconds(3),()->
                new AddTwoDigits().addTwoDigits(testCase));
        assertEquals(solution,new AddTwoDigits().addTwoDigits(testCase));
    }//void test1() {

    @Test
    void test2() {
        int testCase=48;
        int solution=12;
        assertTimeout(Duration.ofSeconds(3),()->
                new AddTwoDigits().addTwoDigits(testCase));
        assertEquals(solution,new AddTwoDigits().addTwoDigits(testCase));
    }//void test2() {

    @Test
    void test3() {
        int testCase=10;
        int solution=1;
        assertTimeout(Duration.ofSeconds(3),()->
                new AddTwoDigits().addTwoDigits(testCase));
        assertEquals(solution,new AddTwoDigits().addTwoDigits(testCase));
    }//void test3() {

    @Test
    void test4() {
        int testCase=25;
        int solution=7;
        assertTimeout(Duration.ofSeconds(3),()->
                new AddTwoDigits().addTwoDigits(testCase));
        assertEquals(solution,new AddTwoDigits().addTwoDigits(testCase));
    }//void test4() {

    @Test
    void test5() {
        int testCase=52;
        int solution=7;
        assertTimeout(Duration.ofSeconds(3),()->
                new AddTwoDigits().addTwoDigits(testCase));
        assertEquals(solution,new AddTwoDigits().addTwoDigits(testCase));
    }//void test5() {

    @Test
    void test6() {
        int testCase=99;
        int solution=18;
        assertTimeout(Duration.ofSeconds(3),()->
                new AddTwoDigits().addTwoDigits(testCase));
        assertEquals(solution,new AddTwoDigits().addTwoDigits(testCase));
    }//void test6() {

    @Test
    void test7() {
        int testCase=44;
        int solution=8;
        assertTimeout(Duration.ofSeconds(3),()->
                new AddTwoDigits().addTwoDigits(testCase));
        assertEquals(solution,new AddTwoDigits().addTwoDigits(testCase));
    }//void test7() {

    @Test
    void test8() {
        int testCase=50;
        int solution=5;
        assertTimeout(Duration.ofSeconds(3),()->
                new AddTwoDigits().addTwoDigits(testCase));
        assertEquals(solution,new AddTwoDigits().addTwoDigits(testCase));
    }//void test8() {

    @Test
    void test9() {
        int testCase=39;
        int solution=12;
        assertTimeout(Duration.ofSeconds(3),()->
                new AddTwoDigits().addTwoDigits(testCase));
        assertEquals(solution,new AddTwoDigits().addTwoDigits(testCase));
    }//void test9() {

    @Test
    void test10() {
        int testCase=26;
        int solution=8;
        assertTimeout(Duration.ofSeconds(3),()->
                new AddTwoDigits().addTwoDigits(testCase));
        assertEquals(solution,new AddTwoDigits().addTwoDigits(testCase));
    }//void test10() {
}//class AddTwoDigitsTest {