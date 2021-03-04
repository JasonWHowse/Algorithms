/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._09_eruption_of_light;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class IsMAC48AddressTest {

    @Test
    void test1() {
        String testCase="00-1B-63-84-45-E6";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsMAC48Address().isMAC48Address(testCase));
        assertTrue(new IsMAC48Address().isMAC48Address(testCase));
    }//void test1() {

    @Test
    void test2() {
        String testCase="Z1-1B-63-84-45-E6";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsMAC48Address().isMAC48Address(testCase));
        assertFalse(new IsMAC48Address().isMAC48Address(testCase));
    }//void test2() {

    @Test
    void test3() {
        String testCase="not a MAC-48 address";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsMAC48Address().isMAC48Address(testCase));
        assertFalse(new IsMAC48Address().isMAC48Address(testCase));
    }//void test3() {

    @Test
    void test4() {
        String testCase="FF-FF-FF-FF-FF-FF";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsMAC48Address().isMAC48Address(testCase));
        assertTrue(new IsMAC48Address().isMAC48Address(testCase));
    }//void test4() {

    @Test
    void test5() {
        String testCase="00-00-00-00-00-00";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsMAC48Address().isMAC48Address(testCase));
        assertTrue(new IsMAC48Address().isMAC48Address(testCase));
    }//void test5() {

    @Test
    void test6() {
        String testCase="G0-00-00-00-00-00";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsMAC48Address().isMAC48Address(testCase));
        assertFalse(new IsMAC48Address().isMAC48Address(testCase));
    }//void test6() {

    @Test
    void test7() {
        String testCase="02-03-04-05-06-07-";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsMAC48Address().isMAC48Address(testCase));
        assertFalse(new IsMAC48Address().isMAC48Address(testCase));
    }//void test7() {

    @Test
    void test8() {
        String testCase="12-34-56-78-9A-BC";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsMAC48Address().isMAC48Address(testCase));
        assertTrue(new IsMAC48Address().isMAC48Address(testCase));
    }//void test8() {

    @Test
    void test9() {
        String testCase="FF-FF-AB-CD-EA-BC";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsMAC48Address().isMAC48Address(testCase));
        assertTrue(new IsMAC48Address().isMAC48Address(testCase));
    }//void test9() {

    @Test
    void test10() {
        String testCase="12-34-56-78-9A-BG";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsMAC48Address().isMAC48Address(testCase));
        assertFalse(new IsMAC48Address().isMAC48Address(testCase));
    }//void test10() {
}