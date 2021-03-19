/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._04_island_of_knowledge;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class IsIPv4AddressTest {

    @Test
    void test1() {
        String testCase="172.16.254.1";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsIPv4Address().isIPv4Address(testCase));
        assertTrue(new IsIPv4Address().isIPv4Address(testCase));
    }//void test1() {

    @Test
    void test2() {
        String testCase="172.316.254.1";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsIPv4Address().isIPv4Address(testCase));
        assertFalse(new IsIPv4Address().isIPv4Address(testCase));
    }//void test2() {

    @Test
    void test3() {
        String testCase=".254.255.0";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsIPv4Address().isIPv4Address(testCase));
        assertFalse(new IsIPv4Address().isIPv4Address(testCase));
    }//void test3() {

    @Test
    void test4() {
        String testCase="1.1.1.1a";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsIPv4Address().isIPv4Address(testCase));
        assertFalse(new IsIPv4Address().isIPv4Address(testCase));
    }//void test4() {

    @Test
    void test5() {
        String testCase="1";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsIPv4Address().isIPv4Address(testCase));
        assertFalse(new IsIPv4Address().isIPv4Address(testCase));
    }//void test5() {

    @Test
    void test6() {
        String testCase="0.254.255.0";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsIPv4Address().isIPv4Address(testCase));
        assertTrue(new IsIPv4Address().isIPv4Address(testCase));
    }//void test6() {

    @Test
    void test7() {
        String testCase="1.23.256.255";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsIPv4Address().isIPv4Address(testCase));
        assertFalse(new IsIPv4Address().isIPv4Address(testCase));
    }//void test7() {

    @Test
    void test8() {
        String testCase="1.23.256..";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsIPv4Address().isIPv4Address(testCase));
        assertFalse(new IsIPv4Address().isIPv4Address(testCase));
    }//void test8() {

    @Test
    void test9() {
        String testCase="0..1.0";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsIPv4Address().isIPv4Address(testCase));
        assertFalse(new IsIPv4Address().isIPv4Address(testCase));
    }//void test9() {

    @Test
    void test10() {
        String testCase="64.233.161.00";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsIPv4Address().isIPv4Address(testCase));
        assertFalse(new IsIPv4Address().isIPv4Address(testCase));
    }//void test10() {

    @Test
    void test11() {
        String testCase="64.00.161.131";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsIPv4Address().isIPv4Address(testCase));
        assertFalse(new IsIPv4Address().isIPv4Address(testCase));
    }//void test11() {

    @Test
    void test12() {
        String testCase="01.233.161.131";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsIPv4Address().isIPv4Address(testCase));
        assertFalse(new IsIPv4Address().isIPv4Address(testCase));
    }//void test12() {

    @Test
    void test13() {
        String testCase="35..36.9.9.0";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsIPv4Address().isIPv4Address(testCase));
        assertFalse(new IsIPv4Address().isIPv4Address(testCase));
    }//void test13() {

    @Test
    void test14() {
        String testCase="1.1.1.1.1";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsIPv4Address().isIPv4Address(testCase));
        assertFalse(new IsIPv4Address().isIPv4Address(testCase));
    }//void test14() {

    @Test
    void test15() {
        String testCase="1.256.1.1";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsIPv4Address().isIPv4Address(testCase));
        assertFalse(new IsIPv4Address().isIPv4Address(testCase));
    }//void test15() {

    @Test
    void test16() {
        String testCase="a0.1.1.1";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsIPv4Address().isIPv4Address(testCase));
        assertFalse(new IsIPv4Address().isIPv4Address(testCase));
    }//void test16() {

    @Test
    void test17() {
        String testCase="0.1.1.256";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsIPv4Address().isIPv4Address(testCase));
        assertFalse(new IsIPv4Address().isIPv4Address(testCase));
    }//void test17() {

    @Test
    void test18() {
        String testCase="129380129831213981.255.255.255";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsIPv4Address().isIPv4Address(testCase));
        assertFalse(new IsIPv4Address().isIPv4Address(testCase));
    }//void test18() {

    @Test
    void test19() {
        String testCase="255.255.255.255abcdekjhf";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsIPv4Address().isIPv4Address(testCase));
        assertFalse(new IsIPv4Address().isIPv4Address(testCase));
    }//void test19() {

    @Test
    void test20() {
        String testCase="7283728";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsIPv4Address().isIPv4Address(testCase));
        assertFalse(new IsIPv4Address().isIPv4Address(testCase));
    }//void test20() {

    @Test
    void test21() {
        String testCase="0..1.0.0";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsIPv4Address().isIPv4Address(testCase));
        assertFalse(new IsIPv4Address().isIPv4Address(testCase));
    }//void test21() {
}