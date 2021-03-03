/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._04_island_of_knowledge;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class AreEquallyStrongTest {

    @Test
    void test1() {
        int testCase1=10;
        int testCase2=15;
        int testCase3=15;
        int testCase4=10;
        assertTimeout(Duration.ofSeconds(3),()->
                new AreEquallyStrong().areEquallyStrong(testCase1,testCase2,testCase3,testCase4));
        assertTrue(new AreEquallyStrong().areEquallyStrong(testCase1,testCase2,testCase3,testCase4));
    }//void test1() {

    @Test
    void test2() {
        int testCase1=15;
        int testCase2=10;
        int testCase3=15;
        int testCase4=10;
        assertTimeout(Duration.ofSeconds(3),()->
                new AreEquallyStrong().areEquallyStrong(testCase1,testCase2,testCase3,testCase4));
        assertTrue(new AreEquallyStrong().areEquallyStrong(testCase1,testCase2,testCase3,testCase4));
    }//void test2() {

    @Test
    void test3() {
        int testCase1=15;
        int testCase2=10;
        int testCase3=15;
        int testCase4=9;
        assertTimeout(Duration.ofSeconds(3),()->
                new AreEquallyStrong().areEquallyStrong(testCase1,testCase2,testCase3,testCase4));
        assertFalse(new AreEquallyStrong().areEquallyStrong(testCase1,testCase2,testCase3,testCase4));
    }//void test3() {

    @Test
    void test4() {
        int testCase1=10;
        int testCase2=5;
        int testCase3=5;
        int testCase4=10;
        assertTimeout(Duration.ofSeconds(3),()->
                new AreEquallyStrong().areEquallyStrong(testCase1,testCase2,testCase3,testCase4));
        assertTrue(new AreEquallyStrong().areEquallyStrong(testCase1,testCase2,testCase3,testCase4));
    }//void test4() {

    @Test
    void test5() {
        int testCase1=10;
        int testCase2=15;
        int testCase3=5;
        int testCase4=20;
        assertTimeout(Duration.ofSeconds(3),()->
                new AreEquallyStrong().areEquallyStrong(testCase1,testCase2,testCase3,testCase4));
        assertFalse(new AreEquallyStrong().areEquallyStrong(testCase1,testCase2,testCase3,testCase4));
    }//void test5() {

    @Test
    void test6() {
        int testCase1=10;
        int testCase2=20;
        int testCase3=10;
        int testCase4=20;
        assertTimeout(Duration.ofSeconds(3),()->
                new AreEquallyStrong().areEquallyStrong(testCase1,testCase2,testCase3,testCase4));
        assertTrue(new AreEquallyStrong().areEquallyStrong(testCase1,testCase2,testCase3,testCase4));
    }//void test6() {

    @Test
    void test7() {
        int testCase1=5;
        int testCase2=20;
        int testCase3=20;
        int testCase4=5;
        assertTimeout(Duration.ofSeconds(3),()->
                new AreEquallyStrong().areEquallyStrong(testCase1,testCase2,testCase3,testCase4));
        assertTrue(new AreEquallyStrong().areEquallyStrong(testCase1,testCase2,testCase3,testCase4));
    }//void test7() {

    @Test
    void test8() {
        int testCase1=20;
        int testCase2=15;
        int testCase3=5;
        int testCase4=20;
        assertTimeout(Duration.ofSeconds(3),()->
                new AreEquallyStrong().areEquallyStrong(testCase1,testCase2,testCase3,testCase4));
        assertFalse(new AreEquallyStrong().areEquallyStrong(testCase1,testCase2,testCase3,testCase4));
    }//void test8() {

    @Test
    void test9() {
        int testCase1=5;
        int testCase2=10;
        int testCase3=5;
        int testCase4=10;
        assertTimeout(Duration.ofSeconds(3),()->
                new AreEquallyStrong().areEquallyStrong(testCase1,testCase2,testCase3,testCase4));
        assertTrue(new AreEquallyStrong().areEquallyStrong(testCase1,testCase2,testCase3,testCase4));
    }//void test9() {

    @Test
    void test10() {
        int testCase1=1;
        int testCase2=10;
        int testCase3=10;
        int testCase4=0;
        assertTimeout(Duration.ofSeconds(3),()->
                new AreEquallyStrong().areEquallyStrong(testCase1,testCase2,testCase3,testCase4));
        assertFalse(new AreEquallyStrong().areEquallyStrong(testCase1,testCase2,testCase3,testCase4));
    }//void test10() {

    @Test
    void test11() {
        int testCase1=5;
        int testCase2=5;
        int testCase3=10;
        int testCase4=10;
        assertTimeout(Duration.ofSeconds(3),()->
                new AreEquallyStrong().areEquallyStrong(testCase1,testCase2,testCase3,testCase4));
        assertFalse(new AreEquallyStrong().areEquallyStrong(testCase1,testCase2,testCase3,testCase4));
    }//void test11() {

    @Test
    void test12() {
        int testCase1=10;
        int testCase2=5;
        int testCase3=10;
        int testCase4=6;
        assertTimeout(Duration.ofSeconds(3),()->
                new AreEquallyStrong().areEquallyStrong(testCase1,testCase2,testCase3,testCase4));
        assertFalse(new AreEquallyStrong().areEquallyStrong(testCase1,testCase2,testCase3,testCase4));
    }//void test12() {

    @Test
    void test13() {
        int testCase1=1;
        int testCase2=1;
        int testCase3=1;
        int testCase4=1;
        assertTimeout(Duration.ofSeconds(3),()->
                new AreEquallyStrong().areEquallyStrong(testCase1,testCase2,testCase3,testCase4));
        assertTrue(new AreEquallyStrong().areEquallyStrong(testCase1,testCase2,testCase3,testCase4));
    }//void test13() {

    @Test
    void test14() {
        int testCase1=0;
        int testCase2=10;
        int testCase3=10;
        int testCase4=0;
        assertTimeout(Duration.ofSeconds(3),()->
                new AreEquallyStrong().areEquallyStrong(testCase1,testCase2,testCase3,testCase4));
        assertTrue(new AreEquallyStrong().areEquallyStrong(testCase1,testCase2,testCase3,testCase4));
    }//void test14() {
}