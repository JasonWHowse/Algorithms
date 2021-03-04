/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._06_through_the_fog;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class CircleOfNumbersTest {

    @Test
    void test1() {
        int testCase1=10;
        int testCase2=2;
        int solution=7;
        assertTimeout(Duration.ofSeconds(3),()->
                new CircleOfNumbers().circleOfNumbers(testCase1,testCase2));
        assertEquals(solution,new CircleOfNumbers().circleOfNumbers(testCase1,testCase2));
    }//void test1() {

    @Test
    void test2() {
        int testCase1=10;
        int testCase2=7;
        int solution=2;
        assertTimeout(Duration.ofSeconds(3),()->
                new CircleOfNumbers().circleOfNumbers(testCase1,testCase2));
        assertEquals(solution,new CircleOfNumbers().circleOfNumbers(testCase1,testCase2));
    }//void test2() {

    @Test
    void test3() {
        int testCase1=4;
        int testCase2=1;
        int solution=3;
        assertTimeout(Duration.ofSeconds(3),()->
                new CircleOfNumbers().circleOfNumbers(testCase1,testCase2));
        assertEquals(solution,new CircleOfNumbers().circleOfNumbers(testCase1,testCase2));
    }//void test3() {

    @Test
    void test4() {
        int testCase1=6;
        int testCase2=3;
        int solution=0;
        assertTimeout(Duration.ofSeconds(3),()->
                new CircleOfNumbers().circleOfNumbers(testCase1,testCase2));
        assertEquals(solution,new CircleOfNumbers().circleOfNumbers(testCase1,testCase2));
    }//void test4() {

    @Test
    void test5() {
        int testCase1=18;
        int testCase2=6;
        int solution=15;
        assertTimeout(Duration.ofSeconds(3),()->
                new CircleOfNumbers().circleOfNumbers(testCase1,testCase2));
        assertEquals(solution,new CircleOfNumbers().circleOfNumbers(testCase1,testCase2));
    }//void test5() {

    @Test
    void test6() {
        int testCase1=12;
        int testCase2=10;
        int solution=4;
        assertTimeout(Duration.ofSeconds(3),()->
                new CircleOfNumbers().circleOfNumbers(testCase1,testCase2));
        assertEquals(solution,new CircleOfNumbers().circleOfNumbers(testCase1,testCase2));
    }//void test6() {

    @Test
    void test7() {
        int testCase1=18;
        int testCase2=5;
        int solution=14;
        assertTimeout(Duration.ofSeconds(3),()->
                new CircleOfNumbers().circleOfNumbers(testCase1,testCase2));
        assertEquals(solution,new CircleOfNumbers().circleOfNumbers(testCase1,testCase2));
    }//void test7() {
}