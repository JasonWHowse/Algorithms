/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._07_mirror_lake;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CreateAnagramTest {

    @Test
    public void test1() {
        var testCase1 = "AABAA";
        var testCase2 = "BBAAA";
        var solution = 1;
        test(testCase1, testCase2, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase1 = "OVGHK";
        var testCase2 = "RPGUC";
        var solution = 4;
        test(testCase1, testCase2, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase1 = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAB";
        var testCase2 = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAC";
        var solution = 1;
        test(testCase1, testCase2, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase1 = "HDFFVR";
        var testCase2 = "FEDDEE";
        var solution = 4;
        test(testCase1, testCase2, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase1 = "AABCDS";
        var testCase2 = "BASEAE";
        var solution = 2;
        test(testCase1, testCase2, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase1 = "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZY";
        var testCase2 = "YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYZ";
        var solution = 31;
        test(testCase1, testCase2, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase1 = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        var testCase2 = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        var solution = 0;
        test(testCase1, testCase2, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase1 = "AAAAAA";
        var testCase2 = "AAAAAA";
        var solution = 0;
        test(testCase1, testCase2, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase1 = "KJDMDLEEKALIJB";
        var testCase2 = "AFDJGDCGHMIGHB";
        var solution = 7;
        test(testCase1, testCase2, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase1 = "BBAAABCBCAABB";
        var testCase2 = "BBBCCCBABBACA";
        var solution = 2;
        test(testCase1, testCase2, solution);
    }//public void test10() {

    private void test(String testCase1, String testCase2, int solution){
        assertTimeout(Duration.ofSeconds(3), ()->new CreateAnagram().createAnagram(testCase1,testCase2));
        assertEquals(solution, new CreateAnagram().createAnagram(testCase1,testCase2));
    }//private void test(String testCase1, String testCase2, int solution){
}//class CreateAnagramTest {