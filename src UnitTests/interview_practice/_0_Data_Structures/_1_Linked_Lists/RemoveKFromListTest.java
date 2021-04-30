/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._0_Data_Structures._1_Linked_Lists;

import helper_functions.ListNode;

import static helper_functions.ListNodeBuilder.CollectionToListNode;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.Duration;

class RemoveKFromListTest {
    @Test
    void test1(){
        Integer[] preTestCase = { 3, 1, 2, 3, 4, 5 };
        Integer[] preSolution={ 1, 2, 4, 5 };
        var testCase1=CollectionToListNode(preTestCase);
        int testCase2=3;
        var solution=CollectionToListNode(preSolution);
        test(testCase1,testCase2,solution);
    }//void test1(){

    @Test
    void test2(){
        Integer[] preTestCase = { 1, 2, 3, 4, 5, 6, 7 };
        Integer[] preSolution={ 1, 2, 3, 4, 5, 6, 7 };
        var testCase1=CollectionToListNode(preTestCase);
        int testCase2=10;
        var solution=CollectionToListNode(preSolution);
        test(testCase1,testCase2,solution);
    }//void test2(){

    @Test
    void test3(){
        Integer[] preTestCase = { 1000, 1000 };
        Integer[] preSolution={};
        var testCase1=CollectionToListNode(preTestCase);
        int testCase2=1000;
        var solution=CollectionToListNode(preSolution);
        test(testCase1,testCase2,solution);
    }//void test3(){

    @Test
    void test4(){
        Integer[] preTestCase = {};
        Integer[] preSolution={};
        var testCase1=CollectionToListNode(preTestCase);
        int testCase2=-1000;
        var solution=CollectionToListNode(preSolution);
        test(testCase1,testCase2,solution);
    }//void test4(){

    @Test
    void test5(){
        Integer[] preTestCase = { 123, 456, 789, 0 };
        Integer[] preSolution={ 123, 456, 789 };
        var testCase1=CollectionToListNode(preTestCase);
        int testCase2=0;
        var solution=CollectionToListNode(preSolution);
        test(testCase1,testCase2,solution);
    }//void test5(){

    private void test(ListNode<Integer> testCase1,int testCase2, ListNode<Integer> solution){
        ListNode<Integer> testCase1Head=testCase1;
        assertTimeout(Duration.ofSeconds(3), ()->
                new RemoveKFromList().removeKFromList(testCase1Head,testCase2));
        ListNode<Integer> Actual = new RemoveKFromList().removeKFromList(testCase1,testCase2);
        while(solution!=null && Actual!=null ){
            assertEquals(solution.value,Actual.value);
            solution=solution.next;
            Actual=Actual.next;
        }//while(solution!=null && Actual!=null ){
        assertTrue(solution==null&&Actual==null);
    }//private void test(ListNode<Integer> testCase1,int testCase2, ListNode<Integer> solution){
}//class RemoveKFromListTest {