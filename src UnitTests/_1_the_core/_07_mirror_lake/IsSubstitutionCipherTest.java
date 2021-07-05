/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._07_mirror_lake;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsSubstitutionCipherTest {

    @Test
    public void test1() {
        var testCase1 = "aacb";
        var testCase2 = "aabc";
        test(testCase1, testCase2, true);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase1 = "aa";
        var testCase2 = "bc";
        test(testCase1, testCase2, false);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase1 = "aaxxaaz";
        var testCase2 = "aazzaay";
        test(testCase1, testCase2, true);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase1 = "aaxyaa";
        var testCase2 = "aazzaa";
        test(testCase1, testCase2, false);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase1 = "aabc";
        var testCase2 = "aacb";
        test(testCase1, testCase2, true);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase1 = "dccd";
        var testCase2 = "zzxx";
        test(testCase1, testCase2, false);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase1 = "ddcc";
        var testCase2 = "zzxx";
        test(testCase1, testCase2, true);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase1 = "aaaabbbbcc";
        var testCase2 = "cccccccccc";
        test(testCase1, testCase2, false);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase1 = "abcdefg";
        var testCase2 = "hijklmn";
        test(testCase1, testCase2, true);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase1 = "aaabbbccc";
        var testCase2 = "aaabbbccc";
        test(testCase1, testCase2, true);
    }//public void test10() {

    private void test(String testCase1, String testCase2, boolean solution){
        assertTimeout(Duration.ofSeconds(3),()->new IsSubstitutionCipher().isSubstitutionCipher(testCase1,testCase2));
        if(solution){
            assertTrue(new IsSubstitutionCipher().isSubstitutionCipher(testCase1,testCase2));
        }else{//if(solution){
            assertFalse(new IsSubstitutionCipher().isSubstitutionCipher(testCase1,testCase2));
        }//else{
    }//private void test(String testCase1, String testCase2, boolean solution){
}//class IsSubstitutionCipherTest {