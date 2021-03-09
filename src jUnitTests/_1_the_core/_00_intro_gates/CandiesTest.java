/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._00_intro_gates;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CandiesTest {

    @Test
    void test1() {
        int testCase1=3;
        int testCase2=10;
        int solution=9;
        assertTimeout(Duration.ofSeconds(3),()->
                new Candies().candies(testCase1,testCase2));
        assertEquals(solution,new Candies().candies(testCase1,testCase2));
    }//void test1() {

    @Test
    void test2() {
        int testCase1=1;
        int testCase2=2;
        int solution=2;
        assertTimeout(Duration.ofSeconds(3),()->
                new Candies().candies(testCase1,testCase2));
        assertEquals(solution,new Candies().candies(testCase1,testCase2));
    }//void test2() {

    @Test
    void test3() {
        int testCase1=10;
        int testCase2=5;
        int solution=0;
        assertTimeout(Duration.ofSeconds(3),()->
                new Candies().candies(testCase1,testCase2));
        assertEquals(solution,new Candies().candies(testCase1,testCase2));
    }//void test3() {

    @Test
    void test4() {
        int testCase1=4;
        int testCase2=4;
        int solution=4;
        assertTimeout(Duration.ofSeconds(3),()->
                new Candies().candies(testCase1,testCase2));
        assertEquals(solution,new Candies().candies(testCase1,testCase2));
    }//void test4() {

    @Test
    void test5() {
        int testCase1=4;
        int testCase2=15;
        int solution=12;
        assertTimeout(Duration.ofSeconds(3),()->
                new Candies().candies(testCase1,testCase2));
        assertEquals(solution,new Candies().candies(testCase1,testCase2));
    }//void test5() {

    @Test
    void test6() {
        int testCase1=9;
        int testCase2=100;
        int solution=99;
        assertTimeout(Duration.ofSeconds(3),()->
                new Candies().candies(testCase1,testCase2));
        assertEquals(solution,new Candies().candies(testCase1,testCase2));
    }//void test6() {

    @Test
    void test7() {
        int testCase1=8;
        int testCase2=2;
        int solution=0;
        assertTimeout(Duration.ofSeconds(3),()->
                new Candies().candies(testCase1,testCase2));
        assertEquals(solution,new Candies().candies(testCase1,testCase2));
    }//void test7() {

    @Test
    void test8() {
        int testCase1=3;
        int testCase2=3;
        int solution=3;
        assertTimeout(Duration.ofSeconds(3),()->
                new Candies().candies(testCase1,testCase2));
        assertEquals(solution,new Candies().candies(testCase1,testCase2));
    }//void test8() {

    @Test
    void test9() {
        int testCase1=7;
        int testCase2=10;
        int solution=7;
        assertTimeout(Duration.ofSeconds(3),()->
                new Candies().candies(testCase1,testCase2));
        assertEquals(solution,new Candies().candies(testCase1,testCase2));
    }//void test9() {

    @Test
    void test10() {
        int testCase1=3;
        int testCase2=23;
        int solution=21;
        assertTimeout(Duration.ofSeconds(3),()->
                new Candies().candies(testCase1,testCase2));
        assertEquals(solution,new Candies().candies(testCase1,testCase2));
    }//void test10() {
}//class CandiesTest {