/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._11_land_of_logic;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class ValidTimeTest {

    @Test
    void test1() {
        String testCase="13:58";
        assertTimeout(Duration.ofSeconds(3),()->
                new ValidTime().validTime(testCase));
        assertTrue(new ValidTime().validTime(testCase));
    }//void test1() {

    @Test
    void test2() {
        String testCase="25:51";
        assertTimeout(Duration.ofSeconds(3),()->
                new ValidTime().validTime(testCase));
        assertFalse(new ValidTime().validTime(testCase));
    }//void test2() {

    @Test
    void test3() {
        String testCase="02:76";
        assertTimeout(Duration.ofSeconds(3),()->
                new ValidTime().validTime(testCase));
        assertFalse(new ValidTime().validTime(testCase));
    }//void test3() {

    @Test
    void test4() {
        String testCase="24:00";
        assertTimeout(Duration.ofSeconds(3),()->
                new ValidTime().validTime(testCase));
        assertFalse(new ValidTime().validTime(testCase));
    }//void test4() {

    @Test
    void test5() {
        String testCase="02:61";
        assertTimeout(Duration.ofSeconds(3),()->
                new ValidTime().validTime(testCase));
        assertFalse(new ValidTime().validTime(testCase));
    }//void test5() {

    @Test
    void test6() {
        String testCase="27:00";
        assertTimeout(Duration.ofSeconds(3),()->
                new ValidTime().validTime(testCase));
        assertFalse(new ValidTime().validTime(testCase));
    }//void test6() {

    @Test
    void test7() {
        String testCase="19:66";
        assertTimeout(Duration.ofSeconds(3),()->
                new ValidTime().validTime(testCase));
        assertFalse(new ValidTime().validTime(testCase));
    }//void test7() {

    @Test
    void test8() {
        String testCase="12:31";
        assertTimeout(Duration.ofSeconds(3),()->
                new ValidTime().validTime(testCase));
        assertTrue(new ValidTime().validTime(testCase));
    }//void test8() {

    @Test
    void test9() {
        String testCase="25:73";
        assertTimeout(Duration.ofSeconds(3),()->
                new ValidTime().validTime(testCase));
        assertFalse(new ValidTime().validTime(testCase));
    }//void test9() {

    @Test
    void test10() {
        String testCase="09:56";
        assertTimeout(Duration.ofSeconds(3),()->
                new ValidTime().validTime(testCase));
        assertTrue(new ValidTime().validTime(testCase));
    }//void test10() {

    @Test
    void test11() {
        String testCase="03:29";
        assertTimeout(Duration.ofSeconds(3),()->
                new ValidTime().validTime(testCase));
        assertTrue(new ValidTime().validTime(testCase));
    }//void test11() {
}