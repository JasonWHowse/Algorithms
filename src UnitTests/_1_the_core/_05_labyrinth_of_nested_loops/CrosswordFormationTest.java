/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._05_labyrinth_of_nested_loops;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CrosswordFormationTest {

    @Test
    public void test1() {
        String[] testCase = { "crossword", "square", "formation", "something" };
        var solution = 6;
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        String[] testCase = { "anaesthetist", "thatch", "ethnics", "sabulous" };
        var solution = 0;
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        String[] testCase = { "eternal", "texas", "chainsaw", "massacre" };
        var solution = 4;
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        String[] testCase = { "africa", "america", "australia", "antarctica" };
        var solution = 62;
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        String[] testCase = { "phenomenon", "remuneration", "particularly", "pronunciation" };
        var solution = 62;
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        String[] testCase = { "onomatopoeia", "philosophical", "provocatively", "thesaurus" };
        var solution = 20;
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        String[] testCase = { "ahaha", "hihi", "hehehe", "ohoho" };
        var solution = 48;
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        String[] testCase = { "acaabbabb", "ccabcaccc", "accbcbbcb", "caacaacac" };
        var solution = 4100;
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        String[] testCase = { "bccab", "accb", "baabccca", "abaa" };
        var solution = 44;
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        String[] testCase = { "ddabdad", "cccbcbbaac", "abcaabceb", "eabde" };
        var solution = 56;
        test(testCase, solution);
    }//public void test10() {

    @Test
    public void test11() {
        String[] testCase = { "cbbbd", "bbbaeacb", "adbbeedebbbacb", "bebccaa" };
        var solution = 378;
        test(testCase, solution);
    }//public void test11() {

    @Test
    public void test12() {
        String[] testCase = { "aaaaaaaaaaaaaa", "aaaaaaaaaaaaab", "aaaaaaaaaaaaca", "aaaaaaaaaaadaa" };
        var solution = 6826960;
        test(testCase, solution);
    }//public void test12() {

    private void test(String[] testCase,int solution) {
        assertTimeout(Duration.ofSeconds(3), () -> new CrosswordFormation().crosswordFormation(testCase.clone()));
        assertEquals(solution, new CrosswordFormation().crosswordFormation(testCase));
    }//private void test(String[] testCase,int solution) {
}//class CrosswordFormationTest {