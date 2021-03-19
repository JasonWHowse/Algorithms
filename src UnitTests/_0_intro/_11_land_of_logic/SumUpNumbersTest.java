/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._11_land_of_logic;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class SumUpNumbersTest {

    @Test
    void test1() {
        String testCase="2 apples, 12 oranges";
        int solution=14;
        assertTimeout(Duration.ofSeconds(3),()->
                new SumUpNumbers().sumUpNumbers(testCase));
        assertEquals(new SumUpNumbers().sumUpNumbers(testCase),solution);
    }//void test1() {

    @Test
    void test2() {
        String testCase="123450";
        int solution=123450;
        assertTimeout(Duration.ofSeconds(3),()->
                new SumUpNumbers().sumUpNumbers(testCase));
        assertEquals(new SumUpNumbers().sumUpNumbers(testCase),solution);
    }//void test2() {

    @Test
    void test3() {
        String testCase="Your payment method is invalid";
        int solution=0;
        assertTimeout(Duration.ofSeconds(3),()->
                new SumUpNumbers().sumUpNumbers(testCase));
        assertEquals(new SumUpNumbers().sumUpNumbers(testCase),solution);
    }//void test3() {

    @Test
    void test4() {
        String testCase="no digits at all";
        int solution=0;
        assertTimeout(Duration.ofSeconds(3),()->
                new SumUpNumbers().sumUpNumbers(testCase));
        assertEquals(new SumUpNumbers().sumUpNumbers(testCase),solution);
    }//void test4() {

    @Test
    void test5() {
        String testCase="there are some (12) digits 5566 in this 770 string 239";
        int solution=6587;
        assertTimeout(Duration.ofSeconds(3),()->
                new SumUpNumbers().sumUpNumbers(testCase));
        assertEquals(new SumUpNumbers().sumUpNumbers(testCase),solution);
    }//void test5() {

    @Test
    void test6() {
        String testCase="42+781";
        int solution=823;
        assertTimeout(Duration.ofSeconds(3),()->
                new SumUpNumbers().sumUpNumbers(testCase));
        assertEquals(new SumUpNumbers().sumUpNumbers(testCase),solution);
    }//void test6() {

    @Test
    void test7() {
        String testCase="abc abc 4 abc 0 abc";
        int solution=4;
        assertTimeout(Duration.ofSeconds(3),()->
                new SumUpNumbers().sumUpNumbers(testCase));
        assertEquals(new SumUpNumbers().sumUpNumbers(testCase),solution);
    }//void test7() {

    @Test
    void test8() {
        String testCase="abcdefghijklmnopqrstuvwxyz1AbCdEfGhIjKlMnOpqrstuvwxyz23,74 -";
        int solution=98;
        assertTimeout(Duration.ofSeconds(3),()->
                new SumUpNumbers().sumUpNumbers(testCase));
        assertEquals(new SumUpNumbers().sumUpNumbers(testCase),solution);
    }//void test8() {
}