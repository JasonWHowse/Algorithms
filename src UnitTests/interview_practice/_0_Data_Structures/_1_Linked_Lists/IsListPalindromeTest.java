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
    public void test1(){
        Integer[] preTestCase = { 0, 1, 0 };
        var testCase = CollectionToListNode(preTestCase);
        test(testCase,true);
    }//public void test1(){

    @Test
    public void test2(){
        Integer[] preTestCase = { 1, 2, 2, 3 };
        var testCase = CollectionToListNode(preTestCase);
        test(testCase,false);
    }//public void test2(){

    @Test
    public void test3(){
        Integer[] preTestCase = { 1, 1000000000, -1000000000, -1000000000, 1000000000, 1 };
        var testCase = CollectionToListNode(preTestCase);
        test(testCase,true);
    }//public void test3(){

    @Test
    public void test4(){
        Integer[] preTestCase = { 1, 2, 3, 3, 2 };
        var testCase = CollectionToListNode(preTestCase);
        test(testCase,false);
    }//public void test4(){

    @Test
    public void test5(){
        Integer[] preTestCase = { 1, 2, 3, 1, 2, 3 };
        var testCase = CollectionToListNode(preTestCase);
        test(testCase,false);
    }//public void test5(){

    @Test
    public void test6(){
        Integer[] preTestCase = {  };
        var testCase = CollectionToListNode(preTestCase);
        test(testCase,true);
    }//public void test6(){

    @Test
    public void test7(){
        Integer[] preTestCase = { 3, 5, 3, 5 };
        var testCase = CollectionToListNode(preTestCase);
        test(testCase,false);
    }//public void test7(){

    @Test
    public void test8(){
        Integer[] preTestCase = { 1, 5, 2, 4 };
        var testCase = CollectionToListNode(preTestCase);
        test(testCase,false);
    }//public void test8(){

    @Test
    public void test9(){
        Integer[] preTestCase = { 10 };
        var testCase = CollectionToListNode(preTestCase);
        test(testCase,true);
    }//public void test9(){

    @Test
    public void test10(){
        Integer[] preTestCase = { 0, 0 };
        var testCase = CollectionToListNode(preTestCase);
        test(testCase,true);
    }//public void test10(){

    @Test
    public void test11(){
        Integer[] preTestCase = { 1, 3, 2, 2, 2 };
        var testCase = CollectionToListNode(preTestCase);
        test(testCase,false);
    }//public void test11(){

    private void test(ListNode<Integer> testCase, boolean solution){
        assertTimeout(Duration.ofSeconds(3),()-> new IsListPalindrome().isListPalindrome(testCase));
        if(solution){
            assertTrue(new IsListPalindrome().isListPalindrome(testCase));
        }else{//if(solution){
            assertFalse(new IsListPalindrome().isListPalindrome(testCase));
        }//else{
    }//private void test(ListNode<Integer> testCase, boolean solution){
}//class IsListPalindromeTest {