/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._06_diving_deeper;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class DifferentSymbolsNaiveTest {

    @Test
    void test1() {
        String testCase="cabca";
        int solution=3;
        assertTimeout(Duration.ofSeconds(3),()->
                new DifferentSymbolsNaive().differentSymbolsNaive(testCase));
        assertEquals(new DifferentSymbolsNaive().differentSymbolsNaive(testCase),solution);
    }//void test1() {

    @Test
    void test2() {
        String testCase="aba";
        int solution=2;
        assertTimeout(Duration.ofSeconds(3),()->
                new DifferentSymbolsNaive().differentSymbolsNaive(testCase));
        assertEquals(new DifferentSymbolsNaive().differentSymbolsNaive(testCase),solution);
    }//void test2() {

    @Test
    void test3() {
        String testCase="ccccccccccc";
        int solution=1;
        assertTimeout(Duration.ofSeconds(3),()->
                new DifferentSymbolsNaive().differentSymbolsNaive(testCase));
        assertEquals(new DifferentSymbolsNaive().differentSymbolsNaive(testCase),solution);
    }//void test3() {

    @Test
    void test4() {
        String testCase="bcaba";
        int solution=3;
        assertTimeout(Duration.ofSeconds(3),()->
                new DifferentSymbolsNaive().differentSymbolsNaive(testCase));
        assertEquals(new DifferentSymbolsNaive().differentSymbolsNaive(testCase),solution);
    }//void test4() {

    @Test
    void test5() {
        String testCase="codesignal";
        int solution=10;
        assertTimeout(Duration.ofSeconds(3),()->
                new DifferentSymbolsNaive().differentSymbolsNaive(testCase));
        assertEquals(new DifferentSymbolsNaive().differentSymbolsNaive(testCase),solution);
    }//void test5() {
}//class DifferentSymbolsNaiveTest {