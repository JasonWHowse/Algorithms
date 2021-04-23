/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._0_Data_Structures._0_Arrays;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
import static helper_functions.Helpers.deepClone;

class Sudoku2Test {

    @Test
    void test1() {
        char[][] testCase= {
                {'.','.','.','1','4','.','.','2','.'},
                {'.','.','6','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','1','.','.','.','.','.','.'},
                {'.','6','7','.','.','.','.','.','9'},
                {'.','.','.','.','.','.','8','1','.'},
                {'.','3','.','.','.','.','.','.','6'},
                {'.','.','.','.','.','7','.','.','.'},
                {'.','.','.','5','.','.','.','7','.'}} ;
        boolean solution= true ;
        test(testCase,solution);
    }//void test1() {

    @Test
    void test2() {
        char[][] testCase= {
                {'.','.','.','.','2','.','.','9','.'},
                {'.','.','.','.','6','.','.','.','.'},
                {'7','1','.','.','7','5','.','.','.'},
                {'.','7','.','.','.','.','.','.','.'},
                {'.','.','.','.','8','3','.','.','.'},
                {'.','.','8','.','.','7','.','6','.'},
                {'.','.','.','.','.','2','.','.','.'},
                {'.','1','.','2','.','.','.','.','.'},
                {'.','2','.','.','3','.','.','.','.'}} ;
        boolean solution= false ;
        test(testCase,solution);
    }//void test2() {

    @Test
    void test3() {
        char[][] testCase= {
                {'.','.','4','.','.','.','6','3','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'5','.','.','.','.','.','.','9','.'},
                {'.','.','.','5','6','.','.','.','.'},
                {'4','.','3','.','.','.','.','.','1'},
                {'.','.','.','7','.','.','.','.','.'},
                {'.','.','.','5','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'}} ;
        boolean solution= false ;
        test(testCase,solution);
    }//void test3() {

    @Test
    void test4() {
        char[][] testCase= {
                {'.','.','.','.','.','.','.','.','2'},
                {'.','.','.','.','.','.','6','.','.'},
                {'.','.','1','4','.','.','8','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','3','.','.','.','.'},
                {'5','.','8','6','.','.','.','.','.'},
                {'.','9','.','.','.','.','4','.','.'},
                {'.','.','.','.','5','.','.','.','.'}} ;
        boolean solution= true ;
        test(testCase,solution);
    }//void test4() {

    @Test
    void test5() {
        char[][] testCase= {
                {'.','9','.','.','4','.','.','.','.'},
                {'1','.','.','.','.','.','6','.','.'},
                {'.','.','3','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','7','.','.','.','.','.'},
                {'3','.','.','.','5','.','.','.','.'},
                {'.','.','7','.','.','4','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','7','.','.','.','.'}} ;
        boolean solution= true ;
        test(testCase,solution);
    }//void test5() {

    @Test
    void test6() {
        char[][] testCase= {
                {'7','.','.','.','4','.','.','.','.'},
                {'.','.','.','8','6','5','.','.','.'},
                {'.','1','.','2','.','.','.','.','.'},
                {'.','.','.','.','.','9','.','.','.'},
                {'.','.','.','.','5','.','5','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','2','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'}} ;
        boolean solution= false ;
        test(testCase,solution);
    }//void test6() {

    @Test
    void test7() {
        char[][] testCase= {
                {'.','4','.','.','.','.','.','.','.'},
                {'.','.','4','.','.','.','.','.','.'},
                {'.','.','.','1','.','.','7','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','3','.','.','.','6','.'},
                {'.','.','.','.','.','6','.','9','.'},
                {'.','.','.','.','1','.','.','.','.'},
                {'.','.','.','.','.','.','2','.','.'},
                {'.','.','.','8','.','.','.','.','.'}} ;
        boolean solution= false ;
        test(testCase,solution);
    }//void test7() {

    @Test
    void test8() {
        char[][] testCase= {
                {'.','.','5','.','.','.','.','.','.'},
                {'.','.','.','8','.','.','.','3','.'},
                {'.','5','.','.','2','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','9'},
                {'.','.','.','.','.','.','4','.','.'},
                {'.','.','.','.','.','.','.','.','7'},
                {'.','1','.','.','.','.','.','.','.'},
                {'2','4','.','.','.','.','9','.','.'}} ;
        boolean solution= false ;
        test(testCase,solution);
    }//void test8() {

    @Test
    void test9() {
        char[][] testCase= {
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','9','.','.','.','.','.','.','1'},
                {'8','.','.','.','.','.','.','.','.'},
                {'.','9','9','3','5','7','.','.','.'},
                {'.','.','.','.','.','.','.','4','.'},
                {'.','.','.','8','.','.','.','.','.'},
                {'.','1','.','.','.','.','4','.','9'},
                {'.','.','.','5','.','4','.','.','.'}} ;
        boolean solution= false ;
        test(testCase,solution);
    }//void test9() {

    @Test
    void test10() {
        char[][] testCase= {
                {'.','.','.','2','.','.','6','.','.'},
                {'.','.','.','1','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','5','.','1','.','.','8'},
                {'.','3','.','.','.','.','.','.','.'},
                {'.','.','.','9','.','.','.','.','3'},
                {'4','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','3','8','.'},
                {'.','.','.','.','.','.','.','.','4'}} ;
        boolean solution= true ;
        test(testCase,solution);
    }//void test10() {

    @Test
    void test11() {
        char[][] testCase= {
                {'.','.','.','.','8','.','.','.','.'},
                {'.','.','.','.','.','.','5','.','.'},
                {'.','.','.','.','4','.','.','2','.'},
                {'.','.','.','3','.','9','.','.','.'},
                {'.','.','1','8','.','.','9','.','.'},
                {'.','.','.','.','.','5','1','.','.'},
                {'.','.','3','.','.','8','.','.','.'},
                {'.','1','2','.','3','.','.','.','.'},
                {'.','.','.','.','.','7','.','.','1'}} ;
        boolean solution= true ;
        test(testCase,solution);
    }//void test11() {

    @Test
    void test12() {
        char[][] testCase= {
                {'.','.','.','.','.','.','5','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'9','3','.','.','2','.','4','.','.'},
                {'.','.','7','.','.','.','3','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','3','4','.','.','.','.'},
                {'.','.','.','.','.','3','.','.','.'},
                {'.','.','.','.','.','5','2','.','.'}} ;
        boolean solution= false ;
        test(testCase,solution);
    }//void test12() {

    @Test
    void test13() {
        char[][] testCase= {
                {'.','.','.','.','4','.','9','.','.'},
                {'.','.','2','1','.','.','3','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','3'},
                {'.','.','.','2','.','.','.','.','.'},
                {'.','.','.','.','.','7','.','.','.'},
                {'.','.','.','6','1','.','.','.','.'},
                {'.','.','9','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','9','.'}} ;
        boolean solution= true ;
        test(testCase,solution);
    }//void test13() {

    @Test
    void test14() {
        char[][] testCase= {
                {'.','8','7','6','5','4','3','2','1'},
                {'2','.','.','.','.','.','.','.','.'},
                {'3','.','.','.','.','.','.','.','.'},
                {'4','.','.','.','.','.','.','.','.'},
                {'5','.','.','.','.','.','.','.','.'},
                {'6','.','.','.','.','.','.','.','.'},
                {'7','.','.','.','.','.','.','.','.'},
                {'8','.','.','.','.','.','.','.','.'},
                {'9','.','.','.','.','.','.','.','.'}} ;
        boolean solution= true ;
        test(testCase,solution);
    }//void test14() {

    @Test
    void test15() {
        char[][] testCase= {
                {'.','.','.','.','.','.','.','.','.'},
                {'4','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','6','.','.'},
                {'.','.','.','3','8','.','.','.','.'},
                {'.','5','.','.','.','6','.','.','1'},
                {'8','.','.','.','.','.','.','6','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','7','.','9','.','.','.','.'},
                {'.','.','.','6','.','.','.','.','.'}} ;
        boolean solution= true ;
        test(testCase,solution);
    }//void test15() {

    @Test
    void test16() {
        char[][] testCase= {
                {'.','.','.','.','.','.','.','.','1'},
                {'.','.','.','.','.','6','.','.','.'},
                {'4','.','.','.','.','.','3','8','.'},
                {'7','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','5','3','.','.','.'},
                {'.','.','.','.','6','8','.','.','.'},
                {'3','.','.','9','.','.','.','.','.'},
                {'.','.','.','.','.','2','1','1','.'},
                {'.','.','.','.','.','.','.','.','.'}} ;
        boolean solution= false ;
        test(testCase,solution);
    }//void test16() {

    @Test
    void test17() {
        char[][] testCase= {
                {'.','8','.','.','.','.','.','.','.'},
                {'.','.','.','.','2','.','.','.','.'},
                {'.','6','.','.','.','.','1','.','4'},
                {'.','.','.','9','.','.','7','.','.'},
                {'.','.','.','.','.','.','.','4','.'},
                {'.','.','1','.','.','8','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','5','.','7','.'},
                {'.','.','3','.','.','5','6','.','.'}} ;
        boolean solution= false ;
        test(testCase,solution);
    }//void test17() {

    @Test
    void test18() {
        char[][] testCase= {
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','2','.','.','.','.','.','.'},
                {'.','.','.','.','.','2','7','1','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','2','.','.','.','.','.','.','.'},
                {'.','5','.','.','.','.','.','.','.'},
                {'.','.','.','.','9','.','.','.','8'},
                {'.','.','.','.','.','1','6','.','.'},
                {'.','.','.','.','6','.','.','.','.'}} ;
        boolean solution= true ;
        test(testCase,solution);
    }//void test18() {

    @Test
    void test19() {
        char[][] testCase= {
                {'.','.','.','9','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','3','.','.','.','.','.','1'},
                {'.','.','.','.','.','.','.','.','.'},
                {'1','.','.','.','.','.','3','.','.'},
                {'.','.','.','.','2','.','6','.','.'},
                {'.','9','.','.','.','.','.','7','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'8','.','.','8','.','.','.','.','.'}} ;
        boolean solution= false ;
        test(testCase,solution);
    }//void test19() {

    @Test
    void test20() {
        char[][] testCase= {
                {'.','.','.','.','.','.','8','3','.'},
                {'2','.','.','.','.','.','.','.','.'},
                {'7','.','.','.','.','7','.','9','5'},
                {'.','.','.','1','.','.','.','.','2'},
                {'.','8','.','9','.','.','.','.','.'},
                {'.','.','5','1','9','.','.','.','.'},
                {'5','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'}} ;
        boolean solution= false ;
        test(testCase,solution);
    }//void test20() {

    void test(char[][] testCase, boolean solution){
        char[][] actual = deepClone(testCase);
        assertTimeout(Duration.ofSeconds(3),()->
                new Sudoku2().sudoku2(actual));
        if(solution) {
            assertTrue(new Sudoku2().sudoku2(testCase));
        }else{//if(solution) {
            assertFalse(new Sudoku2().sudoku2(testCase));
        }//}else{
    }//void test(char[][] testCase, boolean solution){
}//class Sudoku2Test {