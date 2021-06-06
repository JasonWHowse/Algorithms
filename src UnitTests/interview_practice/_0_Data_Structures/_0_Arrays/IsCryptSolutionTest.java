/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._0_Data_Structures._0_Arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static helper_functions.Helpers.deepClone;
import java.time.Duration;

class IsCryptSolutionTest {

    @Test
    public void test1() {
        String[] testCase1 = {
                "SEND",
                "MORE",
                "MONEY"};
        char[][] testCase2 = {
                new char[] {'O','0'},
                new char[] {'M','1'},
                new char[] {'Y','2'},
                new char[] {'E','5'},
                new char[] {'N','6'},
                new char[] {'D','7'},
                new char[] {'R','8'},
                new char[] {'S','9'}};
        test(testCase1, testCase2, true);
    }//public void test1() {

    @Test
    public void test2() {
        String[] testCase1 = {
                "TEN",
                "TWO",
                "ONE"};
        char[][] testCase2 = {
                new char[] {'O','1'},
                new char[] {'T','0'},
                new char[] {'W','9'},
                new char[] {'E','5'},
                new char[] {'N','4'}};
        test(testCase1, testCase2, false);
    }//public void test2() {

    @Test
    public void test3() {
        String[] testCase1 = {
                "ONE",
                "ONE",
                "TWO"};
        char[][] testCase2 = {
                new char[] {'O','2'},
                new char[] {'T','4'},
                new char[] {'W','6'},
                new char[] {'E','1'},
                new char[] {'N','3'}};
        test(testCase1, testCase2, true);
    }//public void test3() {

    @Test
    public void test4() {
        String[] testCase1 = {
                "ONE",
                "ONE",
                "TWO"};
        char[][] testCase2 = {
                new char[] {'O','0'},
                new char[] {'T','1'},
                new char[] {'W','2'},
                new char[] {'E','5'},
                new char[] {'N','6'}};
        test(testCase1, testCase2, false);
    }//public void test4() {

    @Test
    public void test5() {
        String[] testCase1 = {
                "A",
                "A",
                "A"};
        char[][] testCase2 = {
                new char[] {'A','0'}};
        test(testCase1, testCase2, true);
    }//public void test5() {

    @Test
    public void test6() {
        String[] testCase1 = {
                "A",
                "B",
                "C"};
        char[][] testCase2 = {
                new char[] {'A','5'},
                new char[] {'B','6'},
                new char[] {'C','1'}};
        test(testCase1, testCase2, false);
    }//public void test6() {

    @Test
    public void test7() {
        String[] testCase1 = {
                "AA",
                "AA",
                "AA"};
        char[][] testCase2 = {
                new char[] {'A','0'}};
        test(testCase1, testCase2, false);
    }//public void test7() {

    @Test
    public void test8() {
        String[] testCase1 = {
                "A",
                "A",
                "A"};
        char[][] testCase2 = {
                new char[] {'A','1'}};
        test(testCase1, testCase2, false);
    }//public void test8() {

    @Test
    public void test9() {
        String[] testCase1 = {
                "AA",
                "AA",
                "BB"};
        char[][] testCase2 = {
                new char[] {'A','1'},
                new char[] {'B','2'}};
        test(testCase1, testCase2, true);
    }//public void test9() {

    @Test
    public void test10() {
        String[] testCase1 = {
                "BAA",
                "CAB",
                "DAB"};
        char[][] testCase2 = {
                new char[] {'A','0'},
                new char[] {'B','1'},
                new char[] {'C','2'},
                new char[] {'D','4'}};
        test(testCase1, testCase2, false);
    }//public void test10() {

    @Test
    public void test11() {
        String[] testCase1 = {
                "BAA",
                "CAB",
                "DAB"};
        char[][] testCase2 = {
                new char[]{'A','0'},
                new char[]{'B','1'},
                new char[]{'C','2'},
                new char[]{'D','3'}};
        test(testCase1, testCase2, true);
    }//public void test11() {

    @Test
    public void test12() {
        String[] testCase1 = {
                "BAA",
                "BAA",
                "CAA"};
        char[][] testCase2 = {
                new char[]{'A','0'},
                new char[]{'B','1'},
                new char[]{'C','2'}};
        test(testCase1, testCase2, true);
    }//public void test12() {

    @Test
    public void test13() {
        String[] testCase1 = {
                "AA",
                "BB",
                "AA"};
        char[][] testCase2 = {
                new char[]{'A','1'},
                new char[]{'B','0'}};
        test(testCase1, testCase2, false);
    }//public void test13() {

    @Test
    public void test14() {
        String[] testCase1 = {
                "FOUR",
                "FOUR",
                "EIGHT"};
        char[][] testCase2 = {
                new char[]{'F','5'},
                new char[]{'O','2'},
                new char[]{'U','3'},
                new char[]{'R','9'},
                new char[]{'E','1'},
                new char[]{'I','0'},
                new char[]{'G','4'},
                new char[]{'H','7'},
                new char[]{'T','8'}};
        test(testCase1, testCase2, true);
    }//public void test14() {

    @Test
    public void test15() {
        String[] testCase1 = {
                "AAAAAAAAAAAAAA",
                "BBBBBBBBBBBBBB",
                "CCCCCCCCCCCCCC"};
        char[][] testCase2 = {
                new char[]{'A','0'},
                new char[]{'B','1'},
                new char[]{'C','2'}};
        test(testCase1, testCase2, false);
    }//public void test15() {

    @Test
    public void test16() {
        String[] testCase1 = {
                "AAAAAAAAAAAAAA",
                "BBBBBBBBBBBBBB",
                "CCCCCCCCCCCCCC"};
        char[][] testCase2 = {
                new char[]{'A','1'},
                new char[]{'B','2'},
                new char[]{'C','3'}};
        test(testCase1, testCase2, true);
    }//public void test16() {

    @Test
    public void test17() {
        String[] testCase1 = {
                "WASD",
                "IJKL",
                "OPAS"};
        char[][] testCase2 = {
                new char[]{'W','2'},
                new char[]{'A','4'},
                new char[]{'S','7'},
                new char[]{'D','9'},
                new char[]{'I','1'},
                new char[]{'J','0'},
                new char[]{'K','6'},
                new char[]{'L','8'},
                new char[]{'O','3'},
                new char[]{'P','5'}};
        test(testCase1, testCase2, true);
    }//public void test17() {

    @Test
    public void test18() {
        String[] testCase1 = {
                "WASD",
                "IJKL",
                "OPAS"};
        char[][] testCase2 = {
                new char[]{'W','2'},
                new char[]{'A','0'},
                new char[]{'S','4'},
                new char[]{'D','1'},
                new char[]{'I','5'},
                new char[]{'J','8'},
                new char[]{'K','6'},
                new char[]{'L','3'},
                new char[]{'O','7'},
                new char[]{'P','9'}};
        test(testCase1, testCase2, true);
    }//public void test18() {

    @Test
    public void test19() {
        String[] testCase1 = {
                "WASD",
                "IJKL",
                "AOPAS"};
        char[][] testCase2 = {
                new char[]{'W','2'},
                new char[]{'A','0'},
                new char[]{'S','4'},
                new char[]{'D','1'},
                new char[]{'I','5'},
                new char[]{'J','8'},
                new char[]{'K','6'},
                new char[]{'L','3'},
                new char[]{'O','7'},
                new char[]{'P','9'}};
        test(testCase1, testCase2, false);
    }//public void test19() {

    @Test
    public void test20() {
        String[] testCase1 = {
                "BLACK",
                "BLUE",
                "APPLE"};
        char[][] testCase2 = {
                new char[]{'B','5'},
                new char[]{'L','8'},
                new char[]{'A','6'},
                new char[]{'C','7'},
                new char[]{'K','0'},
                new char[]{'U','1'},
                new char[]{'E','9'},
                new char[]{'P','4'}};
        test(testCase1, testCase2, true);
    }//public void test20() {

    private void test(String[] testCase1,char[][] testCase2,boolean solution) {
        if(solution) {
            assertTrue(new IsCryptSolution().isCryptSolution(testCase1.clone(),deepClone(testCase2)));
        }else {//if(solution) {
            assertFalse(new IsCryptSolution().isCryptSolution(testCase1.clone(),deepClone(testCase2)));
        }//else {
        assertTimeout(Duration.ofSeconds(3), () -> new IsCryptSolution().isCryptSolution(testCase1,testCase2));
    }//private void test(String[] testCase1,char[][] testCase2,boolean solution) {
}//class IsCryptSolutionTest {