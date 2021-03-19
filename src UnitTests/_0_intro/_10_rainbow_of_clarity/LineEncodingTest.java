/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._10_rainbow_of_clarity;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class LineEncodingTest {

    @Test
    void test1() {
        String testCase="aabbbc";
        String solution="2a3bc";
        assertTimeout(Duration.ofSeconds(3),()->
                new LineEncoding().lineEncoding(testCase));
        assertEquals(new LineEncoding().lineEncoding(testCase),solution);
    }//void test1() {

    @Test
    void test2() {
        String testCase="abbcabb";
        String solution="a2bca2b";
        assertTimeout(Duration.ofSeconds(3),()->
                new LineEncoding().lineEncoding(testCase));
        assertEquals(new LineEncoding().lineEncoding(testCase),solution);
    }//void test2() {

    @Test
    void test3() {
        String testCase="abcd";
        String solution="abcd";
        assertTimeout(Duration.ofSeconds(3),()->
                new LineEncoding().lineEncoding(testCase));
        assertEquals(new LineEncoding().lineEncoding(testCase),solution);
    }//void test3() {

    @Test
    void test4() {
        String testCase="zzzz";
        String solution="4z";
        assertTimeout(Duration.ofSeconds(3),()->
                new LineEncoding().lineEncoding(testCase));
        assertEquals(new LineEncoding().lineEncoding(testCase),solution);
    }//void test4() {

    @Test
    void test5() {
        String testCase="wwwwwwwawwwwwww";
        String solution="7wa7w";
        assertTimeout(Duration.ofSeconds(3),()->
                new LineEncoding().lineEncoding(testCase));
        assertEquals(new LineEncoding().lineEncoding(testCase),solution);
    }//void test5() {

    @Test
    void test6() {
        String testCase="ccccccccccccccc";
        String solution="15c";
        assertTimeout(Duration.ofSeconds(3),()->
                new LineEncoding().lineEncoding(testCase));
        assertEquals(new LineEncoding().lineEncoding(testCase),solution);
    }//void test6() {

    @Test
    void test7() {
        String testCase="qwertyuioplkjhg";
        String solution="qwertyuioplkjhg";
        assertTimeout(Duration.ofSeconds(3),()->
                new LineEncoding().lineEncoding(testCase));
        assertEquals(new LineEncoding().lineEncoding(testCase),solution);
    }//void test7() {

    @Test
    void test8() {
        String testCase="ssiiggkooo";
        String solution="2s2i2gk3o";
        assertTimeout(Duration.ofSeconds(3),()->
                new LineEncoding().lineEncoding(testCase));
        assertEquals(new LineEncoding().lineEncoding(testCase),solution);
    }//void test8() {

    @Test
    void test9() {
        String testCase="adfaaa";
        String solution="adf3a";
        assertTimeout(Duration.ofSeconds(3),()->
                new LineEncoding().lineEncoding(testCase));
        assertEquals(new LineEncoding().lineEncoding(testCase),solution);
    }//void test9() {

    @Test
    void test10() {
        String testCase="bbjaadlkjdl";
        String solution="2bj2adlkjdl";
        assertTimeout(Duration.ofSeconds(3),()->
                new LineEncoding().lineEncoding(testCase));
        assertEquals(new LineEncoding().lineEncoding(testCase),solution);
    }//void test10() {
}