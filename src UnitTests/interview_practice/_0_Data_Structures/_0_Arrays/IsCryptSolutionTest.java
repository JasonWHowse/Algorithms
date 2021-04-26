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
    void test1(){
        String[] testCase1 = {"SEND","MORE","MONEY"};
        char[][] testCase2 = {{'O','0'},{'M','1'},{'Y','2'},{'E','5'},{'N','6'},{'D','7'},{'R','8'},{'S','9'}};
        boolean solution = true;
        test(testCase1,testCase2,solution);
    }//void test1(){

    @Test
    void test2(){
        String[] testCase1 = {"TEN","TWO","ONE"};
        char[][] testCase2 = {{'O','1'},{'T','0'},{'W','9'},{'E','5'},{'N','4'}};
        boolean solution = false;
        test(testCase1,testCase2,solution);
    }//void test2(){

    @Test
    void test3(){
        String[] testCase1 = {"ONE","ONE","TWO"};
        char[][] testCase2 = {{'O','2'},{'T','4'},{'W','6'},{'E','1'},{'N','3'}};
        boolean solution = true;
        test(testCase1,testCase2,solution);
    }//void test3(){

    @Test
    void test4(){
        String[] testCase1 = {"ONE","ONE","TWO"};
        char[][] testCase2 = {{'O','0'},{'T','1'},{'W','2'},{'E','5'},{'N','6'}};
        boolean solution = false;
        test(testCase1,testCase2,solution);
    }//void test4(){

    @Test
    void test5(){
        String[] testCase1 = {"A","A","A"};
        char[][] testCase2 = {{'A','0'}};
        boolean solution = true;
        test(testCase1,testCase2,solution);
    }//void test5(){

    @Test
    void test6(){
        String[] testCase1 = {"A","B","C"};
        char[][] testCase2 = {{'A','5'},{'B','6'},{'C','1'}};
        boolean solution = false;
        test(testCase1,testCase2,solution);
    }//void test6(){

    @Test
    void test7(){
        String[] testCase1 = {"AA","AA","AA"};
        char[][] testCase2 = {{'A','0'}};
        boolean solution = false;
        test(testCase1,testCase2,solution);
    }//void test7(){

    @Test
    void test8(){
        String[] testCase1 = {"A","A","A"};
        char[][] testCase2 = {{'A','1'}};
        boolean solution = false;
        test(testCase1,testCase2,solution);
    }//void test8(){

    @Test
    void test9(){
        String[] testCase1 = {"AA","AA","BB"};
        char[][] testCase2 = {{'A','1'},{'B','2'}};
        boolean solution = true;
        test(testCase1,testCase2,solution);
    }//void test9(){

    @Test
    void test10(){
        String[] testCase1 = {"BAA","CAB","DAB"};
        char[][] testCase2 = {{'A','0'},{'B','1'},{'C','2'},{'D','4'}};
        boolean solution = false;
        test(testCase1,testCase2,solution);
    }//void test10(){

    private void test(String[] testCase1,char[][] testCase2,boolean solution) {
        assertTimeout(Duration.ofSeconds(3), () ->
                new IsCryptSolution().isCryptSolution(testCase1.clone(),deepClone(testCase2)));
        if(solution) {
            assertTrue(new IsCryptSolution().isCryptSolution(testCase1.clone(),deepClone(testCase2)));
        }else {//if(solution) {
            assertFalse(new IsCryptSolution().isCryptSolution(testCase1.clone(),deepClone(testCase2)));
        }//else {
    }//private void test(String[] testCase1,char[][] testCase2,boolean solution) {
}//class IsCryptSolutionTest {