/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._07_diving_deeper;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class FirstDigitTest {

    @Test
    void test1() {
        String testCase="var_1__Int";
        char solution = '1';
        assertTimeout(Duration.ofSeconds(3),()->
                new FirstDigit().firstDigit(testCase));
        assertEquals(new FirstDigit().firstDigit(testCase),solution);
    }//void test1() {

    @Test
    void test2() {
        String testCase="q2q-q";
        char solution = '2';
        assertTimeout(Duration.ofSeconds(3),()->
                new FirstDigit().firstDigit(testCase));
        assertEquals(new FirstDigit().firstDigit(testCase),solution);
    }//void test2() {

    @Test
    void test3() {
        String testCase="0ss";
        char solution = '0';
        assertTimeout(Duration.ofSeconds(3),()->
                new FirstDigit().firstDigit(testCase));
        assertEquals(new FirstDigit().firstDigit(testCase),solution);
    }//void test3() {

    @Test
    void test4() {
        String testCase="_Aas_23";
        char solution = '2';
        assertTimeout(Duration.ofSeconds(3),()->
                new FirstDigit().firstDigit(testCase));
        assertEquals(new FirstDigit().firstDigit(testCase),solution);
    }//void test4() {

    @Test
    void test5() {
        String testCase="a a_933";
        char solution = '9';
        assertTimeout(Duration.ofSeconds(3),()->
                new FirstDigit().firstDigit(testCase));
        assertEquals(new FirstDigit().firstDigit(testCase),solution);
    }//void test5() {

    @Test
    void test6() {
        String testCase="ok0";
        char solution = '0';
        assertTimeout(Duration.ofSeconds(3),()->
                new FirstDigit().firstDigit(testCase));
        assertEquals(new FirstDigit().firstDigit(testCase),solution);
    }//void test6() {
}