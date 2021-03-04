/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._09_eruption_of_light;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.*;

class IsBeautifulStringTest {

    @Test
    void test1() {
        String testCase="bbbaacdafe";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsBeautifulString().isBeautifulString(testCase));
        assertTrue(new IsBeautifulString().isBeautifulString(testCase));
    }//void test1() {

    @Test
    void test2() {
        String testCase="aabbb";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsBeautifulString().isBeautifulString(testCase));
        assertFalse(new IsBeautifulString().isBeautifulString(testCase));
    }//void test1() {

    @Test
    void test3() {
        String testCase="bbc";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsBeautifulString().isBeautifulString(testCase));
        assertFalse(new IsBeautifulString().isBeautifulString(testCase));
    }//void test1() {

    @Test
    void test4() {
        String testCase="bbbaa";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsBeautifulString().isBeautifulString(testCase));
        assertFalse(new IsBeautifulString().isBeautifulString(testCase));
    }//void test1() {

    @Test
    void test5() {
        String testCase="abcdefghijklmnopqrstuvwxyzz";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsBeautifulString().isBeautifulString(testCase));
        assertFalse(new IsBeautifulString().isBeautifulString(testCase));
    }//void test1() {

    @Test
    void test6() {
        String testCase="abcdefghijklmnopqrstuvwxyz";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsBeautifulString().isBeautifulString(testCase));
        assertTrue(new IsBeautifulString().isBeautifulString(testCase));
    }//void test1() {

    @Test
    void test7() {
        String testCase="abcdefghijklmnopqrstuvwxyzqwertuiopasdfghjklxcvbnm";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsBeautifulString().isBeautifulString(testCase));
        assertTrue(new IsBeautifulString().isBeautifulString(testCase));
    }//void test1() {

    @Test
    void test8() {
        String testCase="fyudhrygiuhdfeis";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsBeautifulString().isBeautifulString(testCase));
        assertFalse(new IsBeautifulString().isBeautifulString(testCase));
    }//void test1() {

    @Test
    void test9() {
        String testCase="zaa";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsBeautifulString().isBeautifulString(testCase));
        assertFalse(new IsBeautifulString().isBeautifulString(testCase));
    }//void test1() {

    @Test
    void test10() {
        String testCase="zyy";
        assertTimeout(Duration.ofSeconds(3),()->
                new IsBeautifulString().isBeautifulString(testCase));
        assertFalse(new IsBeautifulString().isBeautifulString(testCase));
    }//void test1() {
}