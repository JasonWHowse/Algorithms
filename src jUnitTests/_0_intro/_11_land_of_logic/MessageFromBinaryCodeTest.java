/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._11_land_of_logic;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.*;

class MessageFromBinaryCodeTest {

    @Test
    void test1() {
        String testCase="010010000110010101101100011011000110111100100001";
        String solution="Hello!";
        assertTimeout(Duration.ofSeconds(3),()->
                new MessageFromBinaryCode().messageFromBinaryCode(testCase));
        assertEquals(new MessageFromBinaryCode().messageFromBinaryCode(testCase),solution);
    }//void test1() {

    @Test
    void test2() {
        String testCase="01001101011000010111100100100000011101000110100001100101001000000100011001101111011100100110001101100101001000000110001001100101001000000111011101101001011101000110100000100000011110010110111101110101";
        String solution="May the Force be with you";
        assertTimeout(Duration.ofSeconds(3),()->
                new MessageFromBinaryCode().messageFromBinaryCode(testCase));
        assertEquals(new MessageFromBinaryCode().messageFromBinaryCode(testCase),solution);
    }//void test2() {

    @Test
    void test3() {
        String testCase="010110010110111101110101001000000110100001100001011001000010000001101101011001010010000001100001011101000010000001100000011010000110010101101100011011000110111100101110";
        String solution="You had me at `hello.";
        assertTimeout(Duration.ofSeconds(3),()->
                new MessageFromBinaryCode().messageFromBinaryCode(testCase));
        assertEquals(new MessageFromBinaryCode().messageFromBinaryCode(testCase),solution);
    }//void test3() {

    @Test
    void test4() {
        String testCase="010001010110110001100101011011010110010101101110011101000110000101110010011110010010110000100000011011010111100100100000011001000110010101100001011100100010000001010111011000010111010001110011011011110110111000100001";
        String solution="Elementary, my dear Watson!";
        assertTimeout(Duration.ofSeconds(3),()->
                new MessageFromBinaryCode().messageFromBinaryCode(testCase));
        assertEquals(new MessageFromBinaryCode().messageFromBinaryCode(testCase),solution);
    }//void test4() {

    @Test
    void test5() {
        String testCase="010011000110111101110110011001010010000001000110011011110111001000100000010000010110110001101100001011000010000001001000011000010111010001110010011001010110010000100000010001100110111101110010001000000100111001101111011011100110010100101110";
        String solution="Love For All, Hatred For None.";
        assertTimeout(Duration.ofSeconds(3),()->
                new MessageFromBinaryCode().messageFromBinaryCode(testCase));
        assertEquals(new MessageFromBinaryCode().messageFromBinaryCode(testCase),solution);
    }//void test5() {

    @Test
    void test6() {
        String testCase="0100001101101000011000010110111001100111011001010010000001110100011010000110010100100000011101110110111101110010011011000110010000100000011000100111100100100000011000100110010101101001011011100110011100100000011110010110111101110101011100100111001101100101011011000110011000101110";
        String solution="Change the world by being yourself.";
        assertTimeout(Duration.ofSeconds(3),()->
                new MessageFromBinaryCode().messageFromBinaryCode(testCase));
        assertEquals(new MessageFromBinaryCode().messageFromBinaryCode(testCase),solution);
    }//void test6() {

    @Test
    void test7() {
        String testCase="01000101011101100110010101110010011110010010000001101101011011110110110101100101011011100111010000100000011010010111001100100000011000010010000001100110011100100110010101110011011010000010000001100010011001010110011101101001011011100110111001101001011011100110011100101110";
        String solution="Every moment is a fresh beginning.";
        assertTimeout(Duration.ofSeconds(3),()->
                new MessageFromBinaryCode().messageFromBinaryCode(testCase));
        assertEquals(new MessageFromBinaryCode().messageFromBinaryCode(testCase),solution);
    }//void test7() {

    @Test
    void test8() {
        String testCase="010011100110010101110110011001010111001000100000011100100110010101100111011100100110010101110100001000000110000101101110011110010111010001101000011010010110111001100111001000000111010001101000011000010111010000100000011011010110000101100100011001010010000001111001011011110111010100100000011100110110110101101001011011000110010100101110";
        String solution="Never regret anything that made you smile.";
        assertTimeout(Duration.ofSeconds(3),()->
                new MessageFromBinaryCode().messageFromBinaryCode(testCase));
        assertEquals(new MessageFromBinaryCode().messageFromBinaryCode(testCase),solution);
    }//void test8() {

    @Test
    void test9() {
        String testCase="010001000110100101100101001000000111011101101001011101000110100000100000011011010110010101101101011011110111001001101001011001010111001100101100001000000110111001101111011101000010000001100100011100100110010101100001011011010111001100101110";
        String solution="Die with memories, not dreams.";
        assertTimeout(Duration.ofSeconds(3),()->
                new MessageFromBinaryCode().messageFromBinaryCode(testCase));
        assertEquals(new MessageFromBinaryCode().messageFromBinaryCode(testCase),solution);
    }//void test9() {

    @Test
    void test10() {
        String testCase="0100000101110011011100000110100101110010011001010010000001110100011011110010000001101001011011100111001101110000011010010111001001100101001000000110001001100101011001100110111101110010011001010010000001110111011001010010000001100101011110000111000001101001011100100110010100101110";
        String solution="Aspire to inspire before we expire.";
        assertTimeout(Duration.ofSeconds(3),()->
                new MessageFromBinaryCode().messageFromBinaryCode(testCase));
        assertEquals(new MessageFromBinaryCode().messageFromBinaryCode(testCase),solution);
    }//void test10() {
}