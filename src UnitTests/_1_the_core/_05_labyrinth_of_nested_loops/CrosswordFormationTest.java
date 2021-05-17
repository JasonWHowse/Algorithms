/*
 * Authored by: Jason Wesley Howse
 */

/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._05_labyrinth_of_nested_loops;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CrosswordFormationTest {

    @Test
    void test1() {
        String[] testCase = {"crossword",
                "square",
                "formation",
                "something"};
        int solution = 6;
        test(testCase,solution);
    }//void test1() {

    @Test
    void test2() {
        String[] testCase = {"anaesthetist",
                "thatch",
                "ethnics",
                "sabulous"};
        int solution = 0;
        test(testCase,solution);
    }//void test2() {

    @Test
    void test3() {
        String[] testCase = {"eternal",
                "texas",
                "chainsaw",
                "massacre"};
        int solution = 4;
        test(testCase,solution);
    }//void test3() {

    @Test
    void test4() {
        String[] testCase = {"africa",
                "america",
                "australia",
                "antarctica"};
        int solution = 62;
        test(testCase,solution);
    }//void test4() {

    @Test
    void test5() {
        String[] testCase = {"phenomenon",
                "remuneration",
                "particularly",
                "pronunciation"};
        int solution = 62;
        test(testCase,solution);
    }//void test5() {

    @Test
    void test6() {
        String[] testCase = {"onomatopoeia",
                "philosophical",
                "provocatively",
                "thesaurus"};
        int solution = 20;
        test(testCase,solution);
    }//void test6() {

    private void test(String[] testCase,int solution) {
        assertTimeout(Duration.ofSeconds(3), () ->
                new CrosswordFormation().crosswordFormation(testCase.clone()));
        assertEquals(solution, new CrosswordFormation().crosswordFormation(testCase.clone()));
    }//private void test(){
}//class CrosswordFormationTest {