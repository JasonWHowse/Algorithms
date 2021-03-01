/*
 * Authored by: Jason Wesley Howse
 */

/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._02_smooth_sailing;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.*;

class AllLongestStringsTest {
    @Test
    void test1() {
        String[] testCase=new String[]{
                "aba",
                "aa",
                "ad",
                "vcd",
                "aba"};
        String[] solution=new String[]{
                "aba",
                "vcd",
                "aba"};
        assertTimeout(Duration.ofSeconds(3),()->
                new AllLongestStrings().allLongestStrings(
                        testCase.clone()));
        MatcherAssert.assertThat(new AllLongestStrings().
                allLongestStrings(testCase.clone()),is(solution.clone()));
    }//void test1() {

    @Test
    void test2() {
        String[] testCase=new String[]{"aa"};
        String[] solution=new String[]{"aa"};
        assertTimeout(Duration.ofSeconds(3),()->
                new AllLongestStrings().allLongestStrings(
                        testCase.clone()));
        MatcherAssert.assertThat(new AllLongestStrings().
                allLongestStrings(testCase.clone()),is(solution.clone()));
    }//void test2() {

    @Test
    void test3() {
        String[] testCase=new String[]{"abc",
                "eeee",
                "abcd",
                "dcd"};
        String[] solution=new String[]{"eeee",
                "abcd"};
        assertTimeout(Duration.ofSeconds(3),()->
                new AllLongestStrings().allLongestStrings(
                        testCase.clone()));
        MatcherAssert.assertThat(new AllLongestStrings().
                allLongestStrings(testCase.clone()),is(solution.clone()));
    }//void test3() {

    @Test
    void test4() {
        String[] testCase=new String[]{"a",
                "abc",
                "cbd",
                "zzzzzz",
                "a",
                "abcdef",
                "asasa",
                "aaaaaa"};
        String[] solution=new String[]{"zzzzzz",
                "abcdef",
                "aaaaaa"};
        assertTimeout(Duration.ofSeconds(3),()->
                new AllLongestStrings().allLongestStrings(
                        testCase.clone()));
        MatcherAssert.assertThat(new AllLongestStrings().
                allLongestStrings(testCase.clone()),is(solution.clone()));
    }//void test4() {

    @Test
    void test5() {
        String[] testCase=new String[]{"enyky",
                "benyky",
                "yely",
                "varennyky"};
        String[] solution=new String[]{"varennyky"};
        assertTimeout(Duration.ofSeconds(3),()->
                new AllLongestStrings().allLongestStrings(
                        testCase.clone()));
        MatcherAssert.assertThat(new AllLongestStrings().
                allLongestStrings(testCase.clone()),is(solution.clone()));
    }//void test5() {

    @Test
    void test6() {
        String[] testCase=new String[]{"abacaba",
                "abacab",
                "abac",
                "xxxxxx"};
        String[] solution=new String[]{"abacaba"};
        assertTimeout(Duration.ofSeconds(3),()->
                new AllLongestStrings().allLongestStrings(
                        testCase.clone()));
        MatcherAssert.assertThat(new AllLongestStrings().
                allLongestStrings(testCase.clone()),is(solution.clone()));
    }//void test6() {

    @Test
    void test7() {
        String[] testCase=new String[]{"young",
                "yooooooung",
                "hot",
                "or",
                "not",
                "come",
                "on",
                "fire",
                "water",
                "watermelon"};
        String[] solution=new String[]{"yooooooung",
                "watermelon"};
        assertTimeout(Duration.ofSeconds(3),()->
                new AllLongestStrings().allLongestStrings(
                        testCase.clone()));
        MatcherAssert.assertThat(new AllLongestStrings().
                allLongestStrings(testCase.clone()),is(solution.clone()));
    }//void test7() {

    @Test
    void test8() {
        String[] testCase=new String[]{"onsfnib",
                "aokbcwthc",
                "jrfcw"};
        String[] solution=new String[]{"aokbcwthc"};
        assertTimeout(Duration.ofSeconds(3),()->
                new AllLongestStrings().allLongestStrings(
                        testCase.clone()));
        MatcherAssert.assertThat(new AllLongestStrings().
                allLongestStrings(testCase.clone()),is(solution.clone()));
    }//void test8() {

    @Test
    void test9() {
        String[] testCase=new String[]{"lbgwyqkry"};
        String[] solution=new String[]{"lbgwyqkry"};
        assertTimeout(Duration.ofSeconds(3),()->
                new AllLongestStrings().allLongestStrings(
                        testCase.clone()));
        MatcherAssert.assertThat(new AllLongestStrings().
                allLongestStrings(testCase.clone()),is(solution.clone()));
    }//void test9() {

    @Test
    void test10() {
        String[] testCase=new String[]{"i"};
        String[] solution=new String[]{"i"};
        assertTimeout(Duration.ofSeconds(3),()->
                new AllLongestStrings().allLongestStrings(
                        testCase.clone()));
        MatcherAssert.assertThat(new AllLongestStrings().
                allLongestStrings(testCase.clone()),is(solution.clone()));
    }//void test10() {
}//class AllLongestStringsTest {