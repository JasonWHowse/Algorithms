/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._06_through_the_fog;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class StringsRearrangementTest {

    @Test
    void test1() {
        String[] testCase = {"aba",
                "bbb",
                "bab"};
        assertTimeout(Duration.ofSeconds(3), ()->
                new StringsRearrangement().stringsRearrangement(testCase.clone()));
        assertFalse(new StringsRearrangement().stringsRearrangement(testCase.clone()));
    }//void test1() {

    @Test
    void test2() {
        String[] testCase = {"ab",
                "bb",
                "aa"};
        assertTimeout(Duration.ofSeconds(3), ()->
                new StringsRearrangement().stringsRearrangement(testCase.clone()));
        assertTrue(new StringsRearrangement().stringsRearrangement(testCase.clone()));
    }//void test2() {

    @Test
    void test3() {
        String[] testCase = {"q",
                "q"};
        assertTimeout(Duration.ofSeconds(3), ()->
                new StringsRearrangement().stringsRearrangement(testCase.clone()));
        assertFalse(new StringsRearrangement().stringsRearrangement(testCase.clone()));
    }//void test3() {

    @Test
    void test4() {
        String[] testCase = {"zzzzab",
                "zzzzbb",
                "zzzzaa"};
        assertTimeout(Duration.ofSeconds(3), ()->
                new StringsRearrangement().stringsRearrangement(testCase.clone()));
        assertTrue(new StringsRearrangement().stringsRearrangement(testCase.clone()));
    }//void test4() {

    @Test
    void test5() {
        String[] testCase = {"ab",
                "ad",
                "ef",
                "eg"};
        assertTimeout(Duration.ofSeconds(3), ()->
                new StringsRearrangement().stringsRearrangement(testCase.clone()));
        assertFalse(new StringsRearrangement().stringsRearrangement(testCase.clone()));
    }//void test5() {

    @Test
    void test6() {
        String[] testCase = {"abc",
                "bef",
                "bcc",
                "bec",
                "bbc",
                "bdc"};
        assertTimeout(Duration.ofSeconds(3), ()->
                new StringsRearrangement().stringsRearrangement(testCase.clone()));
        assertTrue(new StringsRearrangement().stringsRearrangement(testCase.clone()));
    }//void test6() {

    @Test
    void test7() {
        String[] testCase = {"abc",
                "abx",
                "axx",
                "abc"};
        assertTimeout(Duration.ofSeconds(3), ()->
                new StringsRearrangement().stringsRearrangement(testCase.clone()));
        assertFalse(new StringsRearrangement().stringsRearrangement(testCase.clone()));
    }//void test7() {

    @Test
    void test8() {
        String[] testCase = {"abc",
                "abx",
                "axx",
                "abx",
                "abc"};
        assertTimeout(Duration.ofSeconds(3), ()->
                new StringsRearrangement().stringsRearrangement(testCase.clone()));
        assertTrue(new StringsRearrangement().stringsRearrangement(testCase.clone()));
    }//void test8() {

    @Test
    void test9() {
        String[] testCase = {"f",
                "g",
                "a",
                "h"};
        assertTimeout(Duration.ofSeconds(3), ()->
                new StringsRearrangement().stringsRearrangement(testCase.clone()));
        assertTrue(new StringsRearrangement().stringsRearrangement(testCase.clone()));
    }//void test9() {

    @Test
    void test10() {
        String[] testCase = {"ff",
                "gf",
                "af",
                "ar",
                "hf"};
        assertTimeout(Duration.ofSeconds(3), ()->
                new StringsRearrangement().stringsRearrangement(testCase.clone()));
        assertTrue(new StringsRearrangement().stringsRearrangement(testCase.clone()));
    }//void test10() {

    @Test
    void test11() {
        String[] testCase = {"a",
                "b",
                "c"};
        assertTimeout(Duration.ofSeconds(3), ()->
                new StringsRearrangement().stringsRearrangement(testCase.clone()));
        assertTrue(new StringsRearrangement().stringsRearrangement(testCase.clone()));
    }//void test11() {
}