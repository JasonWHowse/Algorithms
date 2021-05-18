/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._0_Data_Structures._1_Linked_Lists;

import helper_functions.ListNode;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static helper_functions.ListNodeBuilder.CollectionToListNode;
import static org.junit.jupiter.api.Assertions.*;

class MergeTwoLinkedListsTest {
    @Test
    void test1(){
        Integer[] preTestCase1 = { 1, 2, 3 };
        Integer[] preTestCase2 = { 4, 5, 6 };
        Integer[] preSolution = { 1, 2, 3, 4, 5, 6 };
        var testCase1 = CollectionToListNode(preTestCase1);
        var testCase2 = CollectionToListNode(preTestCase2);
        var solution = CollectionToListNode(preSolution);
        test(testCase1,testCase2,solution);
    }//void test1(){

    @Test
    void test2(){
        Integer[] preTestCase1 = { 1, 1, 2, 4 };
        Integer[] preTestCase2 = { 0, 3, 5 };
        Integer[] preSolution = { 0, 1, 1, 2, 3, 4, 5 };
        var testCase1 = CollectionToListNode(preTestCase1);
        var testCase2 = CollectionToListNode(preTestCase2);
        var solution = CollectionToListNode(preSolution);
        test(testCase1,testCase2,solution);
    }//void test2(){

    @Test
    void test3(){
        Integer[] preTestCase1 = { 5, 10, 15, 40 };
        Integer[] preTestCase2 = { 2, 3, 20 };
        Integer[] preSolution = { 2, 3, 5, 10, 15, 20, 40 };
        var testCase1 = CollectionToListNode(preTestCase1);
        var testCase2 = CollectionToListNode(preTestCase2);
        var solution = CollectionToListNode(preSolution);
        test(testCase1,testCase2,solution);
    }//void test3(){

    @Test
    void test4(){
        Integer[] preTestCase1 = { 1, 1 };
        Integer[] preTestCase2 = { 2, 4 };
        Integer[] preSolution = { 1, 1, 2, 4 };
        var testCase1 = CollectionToListNode(preTestCase1);
        var testCase2 = CollectionToListNode(preTestCase2);
        var solution = CollectionToListNode(preSolution);
        test(testCase1,testCase2,solution);
    }//void test4(){

    @Test
    void test5(){
        Integer[] preTestCase1 = {  };
        Integer[] preTestCase2 = { 1, 1, 2, 2, 4, 7, 7, 8 };
        Integer[] preSolution = { 1, 1, 2, 2, 4, 7, 7, 8 };
        var testCase1 = CollectionToListNode(preTestCase1);
        var testCase2 = CollectionToListNode(preTestCase2);
        var solution = CollectionToListNode(preSolution);
        test(testCase1,testCase2,solution);
    }//void test5(){

    @Test
    void test6(){
        Integer[] preTestCase1 = {  };
        Integer[] preTestCase2 = {  };
        Integer[] preSolution = {  };
        var testCase1 = CollectionToListNode(preTestCase1);
        var testCase2 = CollectionToListNode(preTestCase2);
        var solution = CollectionToListNode(preSolution);
        test(testCase1,testCase2,solution);
    }//void test6(){

    @Test
    void test7(){
        Integer[] preTestCase1 = { 1, 1, 4 };
        Integer[] preTestCase2 = {  };
        Integer[] preSolution = { 1, 1, 4 };
        var testCase1 = CollectionToListNode(preTestCase1);
        var testCase2 = CollectionToListNode(preTestCase2);
        var solution = CollectionToListNode(preSolution);
        test(testCase1,testCase2,solution);
    }//void test7(){

    @Test
    void test8(){
        Integer[] preTestCase1 = { 1, 1 };
        Integer[] preTestCase2 = { 0 };
        Integer[] preSolution = { 0, 1, 1 };
        var testCase1 = CollectionToListNode(preTestCase1);
        var testCase2 = CollectionToListNode(preTestCase2);
        var solution = CollectionToListNode(preSolution);
        test(testCase1,testCase2,solution);
    }//void test8(){

    @Test
    void test9(){
        Integer[] preTestCase1 = { 0 };
        Integer[] preTestCase2 = { 2 };
        Integer[] preSolution = { 0, 2 };
        var testCase1 = CollectionToListNode(preTestCase1);
        var testCase2 = CollectionToListNode(preTestCase2);
        var solution = CollectionToListNode(preSolution);
        test(testCase1,testCase2,solution);
    }//void test9(){

    @Test
    void test10(){
        Integer[] preTestCase1 = { 1 };
        Integer[] preTestCase2 = { -1000000000, 1000000000 };
        Integer[] preSolution = { -1000000000, 1, 1000000000 };
        var testCase1 = CollectionToListNode(preTestCase1);
        var testCase2 = CollectionToListNode(preTestCase2);
        var solution = CollectionToListNode(preSolution);
        test(testCase1,testCase2,solution);
    }//void test10(){

    @Test
    void test11(){
        Integer[] preTestCase1 = { -1, -1, 0, 1 };
        Integer[] preTestCase2 = { -1, 0, 0, 1, 1 };
        Integer[] preSolution = { -1, -1, -1, 0, 0, 0, 1, 1, 1 };
        var testCase1 = CollectionToListNode(preTestCase1);
        var testCase2 = CollectionToListNode(preTestCase2);
        var solution = CollectionToListNode(preSolution);
        test(testCase1,testCase2,solution);
    }//void test11(){

    @Test
    void test12(){
        Integer[] preTestCase1 = { -780990573, -670826849, -404817961, 242026249, 731519938 };
        Integer[] preTestCase2 = { -815817641, -426491047, 437929670, 520408640 };
        Integer[] preSolution = { -815817641, -780990573, -670826849, -426491047, -404817961, 242026249, 437929670, 520408640, 731519938 };
        var testCase1 = CollectionToListNode(preTestCase1);
        var testCase2 = CollectionToListNode(preTestCase2);
        var solution = CollectionToListNode(preSolution);
        test(testCase1,testCase2,solution);
    }//void test12(){

    private void test(ListNode<Integer> testCase1, ListNode<Integer> testCase2, ListNode<Integer> solution){
        assertTimeout(Duration.ofSeconds(3),()-> new MergeTwoLinkedLists().mergeTwoLinkedLists(testCase1,testCase2));
        var Actual = new MergeTwoLinkedLists().mergeTwoLinkedLists(testCase1, testCase2);
        while(solution!=null && Actual!=null ){
            assertEquals(solution.value,Actual.value);
            solution=solution.next;
            Actual=Actual.next;
        }//while(solution!=null && Actual!=null ){
        assertTrue(solution==null&&Actual==null);
    }//private void test(ListNode<Integer> testCase1, ListNode<Integer> testCase2, ListNode<Integer> solution){
}//class MergeTwoLinkedListsTest {