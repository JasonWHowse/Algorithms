/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._0_Data_Structures._1_Linked_Lists;

import helper_functions.ListNode;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static helper_functions.ListNodeBuilder.CollectionToListNode;
import static org.junit.jupiter.api.Assertions.*;

class IsListPalindromeTest {
    @Test
    void test1(){
        Integer[] preTestCase = { 0, 1, 0 };
        var testCase = CollectionToListNode(preTestCase);
        var solution = true;
        test(testCase,solution);
    }//void test1(){

    @Test
    void test2(){
        Integer[] preTestCase = { 1, 2, 2, 3 };
        var testCase = CollectionToListNode(preTestCase);
        var solution = false;
        test(testCase,solution);
    }//void test2(){

    @Test
    void test3(){
        Integer[] preTestCase = { 1, 1000000000, -1000000000, -1000000000, 1000000000, 1 };
        var testCase = CollectionToListNode(preTestCase);
        var solution = true;
        test(testCase,solution);
    }//void test3(){

    @Test
    void test4(){
        Integer[] preTestCase = { 1, 2, 3, 3, 2 };
        var testCase = CollectionToListNode(preTestCase);
        var solution = false;
        test(testCase,solution);
    }//void test4(){

    @Test
    void test5(){
        Integer[] preTestCase = { 1, 2, 3, 1, 2, 3 };
        var testCase = CollectionToListNode(preTestCase);
        var solution = false;
        test(testCase,solution);
    }//void test5(){

    @Test
    void test6(){
        Integer[] preTestCase = {  };
        var testCase = CollectionToListNode(preTestCase);
        var solution = true;
        test(testCase,solution);
    }//void test6(){

    @Test
    void test7(){
        Integer[] preTestCase = { 3, 5, 3, 5 };
        var testCase = CollectionToListNode(preTestCase);
        var solution = false;
        test(testCase,solution);
    }//void test7(){

    @Test
    void test8(){
        Integer[] preTestCase = { 1, 5, 2, 4 };
        var testCase = CollectionToListNode(preTestCase);
        var solution = false;
        test(testCase,solution);
    }//void test8(){

    @Test
    void test9(){
        Integer[] preTestCase = { 10 };
        var testCase = CollectionToListNode(preTestCase);
        var solution = true;
        test(testCase,solution);
    }//void test9(){

    @Test
    void test10(){
        Integer[] preTestCase = { 0, 0 };
        var testCase = CollectionToListNode(preTestCase);
        var solution = true;
        test(testCase,solution);
    }//void test10(){

    @Test
    void test11(){
        Integer[] preTestCase = { 1, 3, 2, 2, 2 };
        var testCase = CollectionToListNode(preTestCase);
        var solution = false;
        test(testCase,solution);
    }//void test11(){

    private void test(ListNode<Integer> testCase, boolean solution){
        var testCaseHead = testCase;
        assertTimeout(Duration.ofSeconds(3),()->
                new IsListPalindrome().isListPalindrome(testCase));
        if(solution){
            assertTrue(new IsListPalindrome().isListPalindrome(testCaseHead));
        }else{//if(solution){
            assertFalse(new IsListPalindrome().isListPalindrome(testCaseHead));
        }//else{
    }//private void test(ListNode<Integer> testCase, boolean solution){
}//class IsListPalindromeTest {