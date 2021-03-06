/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._11_land_of_logic;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class DigitsProductTest {

    @Test
    void test1() {
        int testCase=12;
        int solution=26;
        assertTimeout(Duration.ofSeconds(3),()->
                new DigitsProduct().digitsProduct(testCase));
        assertEquals(new DigitsProduct().digitsProduct(testCase),solution);
    }//void test1() {

    @Test
    void test2() {
        int testCase=19;
        int solution=-1;
        assertTimeout(Duration.ofSeconds(3),()->
                new DigitsProduct().digitsProduct(testCase));
        assertEquals(new DigitsProduct().digitsProduct(testCase),solution);
    }//void test2() {

    @Test
    void test3() {
        int testCase=450;
        int solution=2559;
        assertTimeout(Duration.ofSeconds(3),()->
                new DigitsProduct().digitsProduct(testCase));
        assertEquals(new DigitsProduct().digitsProduct(testCase),solution);
    }//void test3() {

    @Test
    void test4() {
        int testCase=0;
        int solution=10;
        assertTimeout(Duration.ofSeconds(3),()->
                new DigitsProduct().digitsProduct(testCase));
        assertEquals(new DigitsProduct().digitsProduct(testCase),solution);
    }//void test4() {

    @Test
    void test5() {
        int testCase=13;
        int solution=-1;
        assertTimeout(Duration.ofSeconds(3),()->
                new DigitsProduct().digitsProduct(testCase));
        assertEquals(new DigitsProduct().digitsProduct(testCase),solution);
    }//void test5() {

    @Test
    void test6() {
        int testCase=1;
        int solution=1;
        assertTimeout(Duration.ofSeconds(3),()->
                new DigitsProduct().digitsProduct(testCase));
        assertEquals(new DigitsProduct().digitsProduct(testCase),solution);
    }//void test6() {

    @Test
    void test7() {
        int testCase=243;
        int solution=399;
        assertTimeout(Duration.ofSeconds(3),()->
                new DigitsProduct().digitsProduct(testCase));
        assertEquals(new DigitsProduct().digitsProduct(testCase),solution);
    }//void test7() {

    @Test
    void test8() {
        int testCase=576;
        int solution=889;
        assertTimeout(Duration.ofSeconds(3),()->
                new DigitsProduct().digitsProduct(testCase));
        assertEquals(new DigitsProduct().digitsProduct(testCase),solution);
    }//void test8() {

    @Test
    void test9() {
        int testCase=360;
        int solution=589;
        assertTimeout(Duration.ofSeconds(3),()->
                new DigitsProduct().digitsProduct(testCase));
        assertEquals(new DigitsProduct().digitsProduct(testCase),solution);
    }//void test9() {
}