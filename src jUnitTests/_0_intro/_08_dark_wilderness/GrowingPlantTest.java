/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._08_dark_wilderness;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class GrowingPlantTest {

    @Test
    void test1() {
        int testCase1=100;
        int testCase2=10;
        int testCase3=910;
        int solution=10;
        assertTimeout(Duration.ofSeconds(3),()->
                new GrowingPlant().growingPlant(testCase1,testCase2,testCase3));
        assertEquals(new GrowingPlant().growingPlant(testCase1,testCase2,testCase3),solution);
    }//void test1() {

    @Test
    void test2() {
        int testCase1=10;
        int testCase2=9;
        int testCase3=4;
        int solution=1;
        assertTimeout(Duration.ofSeconds(3),()->
                new GrowingPlant().growingPlant(testCase1,testCase2,testCase3));
        assertEquals(new GrowingPlant().growingPlant(testCase1,testCase2,testCase3),solution);
    }//void test2() {

    @Test
    void test3() {
        int testCase1=5;
        int testCase2=2;
        int testCase3=7;
        int solution=2;
        assertTimeout(Duration.ofSeconds(3),()->
                new GrowingPlant().growingPlant(testCase1,testCase2,testCase3));
        assertEquals(new GrowingPlant().growingPlant(testCase1,testCase2,testCase3),solution);
    }//void test3() {

    @Test
    void test4() {
        int testCase1=7;
        int testCase2=3;
        int testCase3=443;
        int solution=110;
        assertTimeout(Duration.ofSeconds(3),()->
                new GrowingPlant().growingPlant(testCase1,testCase2,testCase3));
        assertEquals(new GrowingPlant().growingPlant(testCase1,testCase2,testCase3),solution);
    }//void test4() {

    @Test
    void test5() {
        int testCase1=6;
        int testCase2=5;
        int testCase3=10;
        int solution=5;
        assertTimeout(Duration.ofSeconds(3),()->
                new GrowingPlant().growingPlant(testCase1,testCase2,testCase3));
        assertEquals(new GrowingPlant().growingPlant(testCase1,testCase2,testCase3),solution);
    }//void test5() {
}//class GrowingPlantTest {