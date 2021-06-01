/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._06_through_the_fog;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class StringsRearrangementTest {

    @Test
    public void test1() {
        String[] testCase = { "aba", "bbb", "bab" };
        test(testCase, false);
    }//public void test1() {

    @Test
    public void test2() {
        String[] testCase = { "ab", "bb", "aa" };
        test(testCase, true);
    }//public void test2() {

    @Test
    public void test3() {
        String[] testCase = { "q", "q" };
        test(testCase, false);
    }//public void test3() {

    @Test
    public void test4() {
        String[] testCase = { "zzzzab", "zzzzbb", "zzzzaa" };
        test(testCase, true);
    }//public void test4() {

    @Test
    public void test5() {
        String[] testCase = { "ab", "ad", "ef", "eg" };
        test(testCase, false);
    }//public void test5() {

    @Test
    public void test6() {
        String[] testCase = { "abc", "bef", "bcc", "bec", "bbc", "bdc" };
        test(testCase, true);
    }//public void test6() {

    @Test
    public void test7() {
        String[] testCase = { "abc", "abx", "axx", "abc" };
        test(testCase, false);
    }//public void test7() {

    @Test
    public void test8() {
        String[] testCase = { "abc", "abx", "axx", "abx", "abc" };
        test(testCase, true);
    }//public void test8() {

    @Test
    public void test9() {
        String[] testCase = { "f", "g", "a", "h" };
        test(testCase, true);
    }//public void test9() {

    @Test
    public void test10() {
        String[] testCase = { "ff", "gf", "af", "ar", "hf" };
        test(testCase, true);
    }//public void test10() {

    @Test
    public void test11() {
        String[] testCase = { "a", "b", "c" };
        test(testCase, true);
    }//public void test11() {

    @Test
    public void test12() {
        String[] testCase = { "aa", "bb", "cc" };
        test(testCase, false);
    }//public void test12() {

    @Test
    public void test13() {
        String[] testCase = { "bbc", "bba", "abc" };
        test(testCase, true);
    }//public void test13() {

    @Test
    public void test14() {
        String[] testCase = { "oh", "eh", "ah", "po", "op" };
        test(testCase, false);
    }//public void test14() {

    @Test
    public void test15() {
        String[] testCase = { "zzzabzczaba", "zzzabzczaaa", "zzzabzczabb", "zzzabzczbbb" };
        test(testCase, true);
    }//public void test15() {

    @Test
    public void test16() {
        String[] testCase = { "zzzabzczaaa", "zzzabzczaaa", "zzzabzczaaa", "zzzabzczaaa" };
        test(testCase, false);
    }//public void test16() {

    @Test
    public void test17() {
        String[] testCase = { "abc", "xbc", "xxc", "xbc", "aby", "ayy", "aby", "azc" };
        test(testCase, false);
    }//public void test17() {

    @Test
    public void test18() {
        String[] testCase = { "abc", "bef", "bcc", "bew", "zew", "zyw", "bec", "bbc", "bdc" };
        test(testCase, true);
    }//public void test18() {

    @Test
    public void test19() {
        String[] testCase = { "abacabaabczzzzz", "abacababefzzzzz", "abacababcczzzzz", "abacababeczzzzz", "abacababbczzzzz", "abacababdczzzzz" };
        test(testCase, true);
    }//public void test19() {

    @Test
    public void test20() {
        String[] testCase = { "abc", "xbc", "xxc", "xbc", "aby", "ayy", "aby" };
        test(testCase, true);
    }//public void test20() {

    @Test
    public void test21() {
        String[] testCase = { "abc", "xbc", "axc", "abx" };
        test(testCase, false);
    }//public void test21() {

    private void test(String[] testCase, boolean solution){
        assertTimeout(Duration.ofSeconds(3), ()->
                new StringsRearrangement().stringsRearrangement(testCase.clone()));
        if(solution){
            assertTrue(new StringsRearrangement().stringsRearrangement(testCase));
        }else {//if(solution){
            assertFalse(new StringsRearrangement().stringsRearrangement(testCase));
        }//else{
    }//private void test(String[] testCase, boolean solution){
}//class StringsRearrangementTest {