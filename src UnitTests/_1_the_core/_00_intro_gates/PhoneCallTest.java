/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._00_intro_gates;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class PhoneCallTest {

    @Test
    void test1() {
        int testCase1=3;
        int testCase2=1;
        int testCase3=2;
        int testCase4=20;
        int solution=14;
        assertTimeout(Duration.ofSeconds(3),()->
                new PhoneCall().phoneCall(testCase1,testCase2,testCase3,testCase4));
        assertEquals(solution,new PhoneCall().phoneCall(testCase1,testCase2,testCase3,testCase4));
    }//void test1() {

    @Test
    void test2() {
        int testCase1=2;
        int testCase2=2;
        int testCase3=1;
        int testCase4=2;
        int solution=1;
        assertTimeout(Duration.ofSeconds(3),()->
                new PhoneCall().phoneCall(testCase1,testCase2,testCase3,testCase4));
        assertEquals(solution,new PhoneCall().phoneCall(testCase1,testCase2,testCase3,testCase4));
    }//void test2() {

    @Test
    void test3() {
        int testCase1=10;
        int testCase2=1;
        int testCase3=2;
        int testCase4=22;
        int solution=11;
        assertTimeout(Duration.ofSeconds(3),()->
                new PhoneCall().phoneCall(testCase1,testCase2,testCase3,testCase4));
        assertEquals(solution,new PhoneCall().phoneCall(testCase1,testCase2,testCase3,testCase4));
    }//void test3() {

    @Test
    void test4() {
        int testCase1=2;
        int testCase2=2;
        int testCase3=1;
        int testCase4=24;
        int solution=14;
        assertTimeout(Duration.ofSeconds(3),()->
                new PhoneCall().phoneCall(testCase1,testCase2,testCase3,testCase4));
        assertEquals(solution,new PhoneCall().phoneCall(testCase1,testCase2,testCase3,testCase4));
    }//void test4() {

    @Test
    void test5() {
        int testCase1=1;
        int testCase2=2;
        int testCase3=1;
        int testCase4=6;
        int solution=3;
        assertTimeout(Duration.ofSeconds(3),()->
                new PhoneCall().phoneCall(testCase1,testCase2,testCase3,testCase4));
        assertEquals(solution,new PhoneCall().phoneCall(testCase1,testCase2,testCase3,testCase4));
    }//void test5() {

    @Test
    void test6() {
        int testCase1=10;
        int testCase2=10;
        int testCase3=10;
        int testCase4=8;
        int solution=0;
        assertTimeout(Duration.ofSeconds(3),()->
                new PhoneCall().phoneCall(testCase1,testCase2,testCase3,testCase4));
        assertEquals(solution,new PhoneCall().phoneCall(testCase1,testCase2,testCase3,testCase4));
    }//void test6() {
}//class PhoneCallTest {