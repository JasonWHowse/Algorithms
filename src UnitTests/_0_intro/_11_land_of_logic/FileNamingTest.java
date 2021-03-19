/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._11_land_of_logic;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class FileNamingTest {

    @Test
    void test1() {
        String[] testCase={"doc",
                "doc",
                "image",
                "doc(1)",
                "doc"};
        String[] solution={"doc",
                "doc(1)",
                "image",
                "doc(1)(1)",
                "doc(2)"};
        assertTimeout(Duration.ofSeconds(3),()->
                new FileNaming().fileNaming(testCase.clone()));
        MatcherAssert.assertThat(new FileNaming().fileNaming(testCase.clone()),is(solution));
    }//void test1() {

    @Test
    void test2() {
        String[] testCase={"a(1)",
                "a(6)",
                "a",
                "a",
                "a",
                "a",
                "a",
                "a",
                "a",
                "a",
                "a",
                "a"};
        String[] solution={"a(1)",
                "a(6)",
                "a",
                "a(2)",
                "a(3)",
                "a(4)",
                "a(5)",
                "a(7)",
                "a(8)",
                "a(9)",
                "a(10)",
                "a(11)"};
        assertTimeout(Duration.ofSeconds(3),()->
                new FileNaming().fileNaming(testCase.clone()));
        MatcherAssert.assertThat(new FileNaming().fileNaming(testCase.clone()),is(solution));
    }//void test2() {

    @Test
    void test3() {
        String[] testCase={"dd",
                "dd(1)",
                "dd(2)",
                "dd",
                "dd(1)",
                "dd(1)(2)",
                "dd(1)(1)",
                "dd",
                "dd(1)"};
        String[] solution={"dd",
                "dd(1)",
                "dd(2)",
                "dd(3)",
                "dd(1)(1)",
                "dd(1)(2)",
                "dd(1)(1)(1)",
                "dd(4)",
                "dd(1)(3)"};
        assertTimeout(Duration.ofSeconds(3),()->
                new FileNaming().fileNaming(testCase.clone()));
        MatcherAssert.assertThat(new FileNaming().fileNaming(testCase.clone()),is(solution));
    }//void test3() {

    @Test
    void test4() {
        String[] testCase={"a",
                "b",
                "cd",
                "b ",
                "a(3)"};
        String[] solution={"a",
                "b",
                "cd",
                "b ",
                "a(3)"};
        assertTimeout(Duration.ofSeconds(3),()->
                new FileNaming().fileNaming(testCase.clone()));
        MatcherAssert.assertThat(new FileNaming().fileNaming(testCase.clone()),is(solution));
    }//void test4() {

    @Test
    void test5() {
        String[] testCase={"name",
                "name",
                "name(1)",
                "name(3)",
                "name(2)",
                "name(2)"};
        String[] solution={"name",
                "name(1)",
                "name(1)(1)",
                "name(3)",
                "name(2)",
                "name(2)(1)"};
        assertTimeout(Duration.ofSeconds(3),()->
                new FileNaming().fileNaming(testCase.clone()));
        MatcherAssert.assertThat(new FileNaming().fileNaming(testCase.clone()),is(solution));
    }//void test5() {

    @Test
    void test6() {
        String[] testCase={};
        String[] solution={};
        assertTimeout(Duration.ofSeconds(3),()->
                new FileNaming().fileNaming(testCase.clone()));
        MatcherAssert.assertThat(new FileNaming().fileNaming(testCase.clone()),is(solution));
    }//void test6() {
}