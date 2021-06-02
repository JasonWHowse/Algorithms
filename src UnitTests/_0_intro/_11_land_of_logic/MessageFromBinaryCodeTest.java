/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._11_land_of_logic;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class MessageFromBinaryCodeTest {

    @Test
    public void test1() {
        var testCase = "010010000110010101101100011011000110111100100001";
        var solution = "Hello!";
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = "01001101011000010111100100100000011101000110100001100101001000000100011001101111011100100110001101100101001000000110001001100101001000000111011101101001011101000110100000100000011110010110111101110101";
        var solution = "May the Force be with you";
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = "010110010110111101110101001000000110100001100001011001000010000001101101011001010010000001100001011101000010000001100000011010000110010101101100011011000110111100101110";
        var solution = "You had me at `hello.";
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = "010001010110110001100101011011010110010101101110011101000110000101110010011110010010110000100000011011010111100100100000011001000110010101100001011100100010000001010111011000010111010001110011011011110110111000100001";
        var solution = "Elementary, my dear Watson!";
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = "010011000110111101110110011001010010000001000110011011110111001000100000010000010110110001101100001011000010000001001000011000010111010001110010011001010110010000100000010001100110111101110010001000000100111001101111011011100110010100101110";
        var solution = "Love For All, Hatred For None.";
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = "0100001101101000011000010110111001100111011001010010000001110100011010000110010100100000011101110110111101110010011011000110010000100000011000100111100100100000011000100110010101101001011011100110011100100000011110010110111101110101011100100111001101100101011011000110011000101110";
        var solution = "Change the world by being yourself.";
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = "01000101011101100110010101110010011110010010000001101101011011110110110101100101011011100111010000100000011010010111001100100000011000010010000001100110011100100110010101110011011010000010000001100010011001010110011101101001011011100110111001101001011011100110011100101110";
        var solution = "Every moment is a fresh beginning.";
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = "010011100110010101110110011001010111001000100000011100100110010101100111011100100110010101110100001000000110000101101110011110010111010001101000011010010110111001100111001000000111010001101000011000010111010000100000011011010110000101100100011001010010000001111001011011110111010100100000011100110110110101101001011011000110010100101110";
        var solution = "Never regret anything that made you smile.";
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = "010001000110100101100101001000000111011101101001011101000110100000100000011011010110010101101101011011110111001001101001011001010111001100101100001000000110111001101111011101000010000001100100011100100110010101100001011011010111001100101110";
        var solution = "Die with memories, not dreams.";
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = "0100000101110011011100000110100101110010011001010010000001110100011011110010000001101001011011100111001101110000011010010111001001100101001000000110001001100101011001100110111101110010011001010010000001110111011001010010000001100101011110000111000001101001011100100110010100101110";
        var solution = "Aspire to inspire before we expire.";
        test(testCase, solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase = "0100010101110110011001010111001001111001011101000110100001101001011011100110011100100000011110010110111101110101001000000110001101100001011011100010000001101001011011010110000101100111011010010110111001100101001000000110100101110011001000000111001001100101011000010110110000101110";
        var solution = "Everything you can imagine is real.";
        test(testCase, solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase = "010100110110100101101101011100000110110001101001011000110110100101110100011110010010000001101001011100110010000001110100011010000110010100100000011101010110110001110100011010010110110101100001011101000110010100100000011100110110111101110000011010000110100101110011011101000110100101100011011000010111010001101001011011110110111000101110";
        var solution = "Simplicity is the ultimate sophistication.";
        test(testCase, solution);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase = "01010111011010000110000101110100011001010111011001100101011100100010000001111001011011110111010100100000011001000110111100101100001000000110010001101111001000000110100101110100001000000111011101100101011011000110110000101110";
        var solution = "Whatever you do, do it well.";
        test(testCase, solution);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase = "01010111011010000110000101110100001000000111011101100101001000000111010001101000011010010110111001101011001011000010000001110111011001010010000001100010011001010110001101101111011011010110010100101110";
        var solution = "What we think, we become.";
        test(testCase, solution);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase = "010000010110110001101100001000000110110001101001011011010110100101110100011000010111010001101001011011110110111001110011001000000110000101110010011001010010000001110011011001010110110001100110001011010110100101101101011100000110111101110011011001010110010000101110";
        var solution = "All limitations are self-imposed.";
        test(testCase, solution);
    }//public void test15() {

    @Test
    public void test16() {
        var testCase = "01010100011011110111010101100111011010000010000001110100011010010110110101100101011100110010000001101110011001010111011001100101011100100010000001101100011000010111001101110100001000000110001001110101011101000010000001110100011011110111010101100111011010000010000001110000011001010110111101110000011011000110010100100000011001000110111100101110";
        var solution = "Tough times never last but tough people do.";
        test(testCase, solution);
    }//public void test16() {

    @Test
    public void test17() {
        var testCase = "01010000011100100110111101100010011011000110010101101101011100110010000001100001011100100110010100100000011011100110111101110100001000000111001101110100011011110111000000100000011100110110100101100111011011100111001100101100001000000111010001101000011001010111100100100000011000010111001001100101001000000110011101110101011010010110010001100101011011000110100101101110011001010111001100101110";
        var solution = "Problems are not stop signs, they are guidelines.";
        test(testCase, solution);
    }//public void test17() {

    @Test
    public void test18() {
        var testCase = "00110011";
        var solution = "3";
        test(testCase, solution);
    }//public void test18() {

    @Test
    public void test19() {
        var testCase = "01000001";
        var solution = "A";
        test(testCase, solution);
    }//public void test19() {

    @Test
    public void test20() {
        var testCase = "010000010010000001100011011001010110111001110011011101010111001100100000011101000110000101101011011001010111001000100000011011110110111001100011011001010010000001110100011100100110100101100101011001000010000001110100011011110010000001110100011001010111001101110100001000000110110101100101001011100010000001001001001000000110000101110100011001010010000001101000011010010111001100100000011011000110100101110110011001010111001000100000011101110110100101110100011010000010000001110011011011110110110101100101001000000110011001100001011101100110000100100000011000100110010101100001011011100111001100100000011000010110111001100100001000000110000100100000011011100110100101100011011001010010000001000011011010000110100101100001011011100111010001101001";
        var solution = "A census taker once tried to test me. I ate his liver with some fava beans and a nice Chianti";
        test(testCase, solution);
    }//public void test20() {
    
    private void test(String testCase, String solution){
        assertTimeout(Duration.ofSeconds(3),()-> new MessageFromBinaryCode().messageFromBinaryCode(testCase));
        assertEquals(solution,new MessageFromBinaryCode().messageFromBinaryCode(testCase));
    }//private void test(String testCase, String solution){
}//class MessageFromBinaryCodeTest {