/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._07_mirror_lake;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringsConstructionTest {

    @Test
    public void test1() {
        var testCase1 = "abc";
        var testCase2 = "abccba";
        var solution = 2;
        test(testCase1, testCase2, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase1 = "ab";
        var testCase2 = "abcbcb";
        var solution = 1;
        test(testCase1, testCase2, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase1 = "ab";
        var testCase2 = "abccba";
        var solution = 2;
        test(testCase1, testCase2, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase1 = "b";
        var testCase2 = "abccba";
        var solution = 2;
        test(testCase1, testCase2, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase1 = "c";
        var testCase2 = "abccbac";
        var solution = 3;
        test(testCase1, testCase2, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase1 = "z";
        var testCase2 = "z";
        var solution = 1;
        test(testCase1, testCase2, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase1 = "z";
        var testCase2 = "y";
        var solution = 0;
        test(testCase1, testCase2, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase1 = "za";
        var testCase2 = "bzc";
        var solution = 0;
        test(testCase1, testCase2, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase1 = "hnccv";
        var testCase2 = "hncvohcjhdfnhonxddcocjncchnvohchnjohcvnhjdhihsn";
        var solution = 3;
        test(testCase1, testCase2, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase1 = "abc";
        var testCase2 = "def";
        var solution = 0;
        test(testCase1, testCase2, solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase1 = "zzz";
        var testCase2 = "zzzzzzzzzzz";
        var solution = 3;
        test(testCase1, testCase2, solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase1 = "abcabcabc";
        var testCase2 = "aaaaaaaaaaabbbbbbbbbbcccccccccc";
        var solution = 3;
        test(testCase1, testCase2, solution);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase1 = "abc";
        var testCase2 = "xyz";
        var solution = 0;
        test(testCase1, testCase2, solution);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase1 = "zbc";
        var testCase2 = "ydlblksdjccdddb";
        var solution = 0;
        test(testCase1, testCase2, solution);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase1 = "abdd";
        var testCase2 = "adadapqrtsmnckgljj";
        var solution = 0;
        test(testCase1, testCase2, solution);
    }//public void test15() {

    @Test
    public void test16() {
        var testCase1 = "abcde";
        var testCase2 = "edbcaacbdebcedaadbecadbceecabddbaecabecdcdabeabcde";
        var solution = 10;
        test(testCase1, testCase2, solution);
    }//public void test16() {

    @Test
    public void test17() {
        var testCase1 = "abcde";
        var testCase2 = "edbcaaclpebcekbadbecadbcefcabddbaecaaaaacdakrabcde";
        var solution = 7;
        test(testCase1, testCase2, solution);
    }//public void test17() {

    @Test
    public void test18() {
        var testCase1 = "zkz";
        var testCase2 = "zpaskazgazkazggaaksiokkzzzzaaazzpkuazzzgzkzabrgzzq";
        var solution = 7;
        test(testCase1, testCase2, solution);
    }//public void test18() {

    @Test
    public void test19() {
        var testCase1 = "ggagagagga";
        var testCase2 = "gga";
        var solution = 0;
        test(testCase1, testCase2, solution);
    }//public void test19() {

    @Test
    public void test20() {
        var testCase1 = "pqrsttt";
        var testCase2 = "parfkajfraqrakjssattertjeqsqaptatdptdstasreraqprtt";
        var solution = 3;
        test(testCase1, testCase2, solution);
    }//public void test20() {

    @Test
    public void test21() {
        var testCase1 = "azgtpzzgab";
        var testCase2 = "taagzajfrqrakjzztgzgzazstppatdptdblgaasreraqprtt";
        var solution = 1;
        test(testCase1, testCase2, solution);
    }//public void test21() {

    private void test(String testCase1, String testCase2, int solution){
        assertTimeout(Duration.ofSeconds(3),()->new StringsConstruction().stringsConstruction(testCase1,testCase2));
        assertEquals(solution,new StringsConstruction().stringsConstruction(testCase1,testCase2));
    }//private void test(String testCase1, String testCase2, int solution){
}//class StringsConstructionTest {