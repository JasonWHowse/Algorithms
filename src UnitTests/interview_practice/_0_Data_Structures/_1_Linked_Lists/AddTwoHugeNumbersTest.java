/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._0_Data_Structures._1_Linked_Lists;

import helper_functions.ListNode;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static helper_functions.ListNodeBuilder.CollectionToListNode;
import static org.junit.jupiter.api.Assertions.*;


class AddTwoHugeNumbersTest {
    @Test
    void test1(){
        Integer[] preTestCase1 = {9876, 5432, 1999};
        Integer[] preTestCase2 = {1, 8001};
        Integer[] preSolution = {9876, 5434, 0};
        var testCase1 = CollectionToListNode(preTestCase1);
        var testCase2 = CollectionToListNode(preTestCase2);
        var solution = CollectionToListNode(preSolution);
        test(testCase1,testCase2,solution);
    }//void test1(){

    @Test
    void test2(){
        Integer[] preTestCase1 = {123, 4, 5};
        Integer[] preTestCase2 = {100, 100, 100};
        Integer[] preSolution = {223, 104, 105};
        var testCase1 = CollectionToListNode(preTestCase1);
        var testCase2 = CollectionToListNode(preTestCase2);
        var solution = CollectionToListNode(preSolution);
        test(testCase1,testCase2,solution);
    }//void test2(){

    @Test
    void test3(){
        Integer[] preTestCase1 = {0};
        Integer[] preTestCase2 = {0};
        Integer[] preSolution = {0};
        var testCase1 = CollectionToListNode(preTestCase1);
        var testCase2 = CollectionToListNode(preTestCase2);
        var solution = CollectionToListNode(preSolution);
        test(testCase1,testCase2,solution);
    }//void test3(){

    @Test
    void test4(){
        Integer[] preTestCase1 = {1234, 1234, 0};
        Integer[] preTestCase2 = {0};
        Integer[] preSolution = {1234, 1234, 0};
        var testCase1 = CollectionToListNode(preTestCase1);
        var testCase2 = CollectionToListNode(preTestCase2);
        var solution = CollectionToListNode(preSolution);
        test(testCase1,testCase2,solution);
    }//void test4(){

    @Test
    void test5(){
        Integer[] preTestCase1 = {0};
        Integer[] preTestCase2 = {1234, 123, 0};
        Integer[] preSolution = {1234, 123, 0};
        var testCase1 = CollectionToListNode(preTestCase1);
        var testCase2 = CollectionToListNode(preTestCase2);
        var solution = CollectionToListNode(preSolution);
        test(testCase1,testCase2,solution);
    }//void test5(){

    @Test
    void test6(){
        Integer[] preTestCase1 = {1};
        Integer[] preTestCase2 = {9998, 9999, 9999, 9999, 9999, 9999};
        Integer[] preSolution = {9999, 0, 0, 0, 0, 0};
        var testCase1 = CollectionToListNode(preTestCase1);
        var testCase2 = CollectionToListNode(preTestCase2);
        var solution = CollectionToListNode(preSolution);
        test(testCase1,testCase2,solution);
    }//void test6(){

    @Test
    void test7(){
        Integer[] preTestCase1 = {1};
        Integer[] preTestCase2 = {9999, 9999, 9999, 9999, 9999, 9999};
        Integer[] preSolution = {1, 0, 0, 0, 0, 0, 0};
        var testCase1 = CollectionToListNode(preTestCase1);
        var testCase2 = CollectionToListNode(preTestCase2);
        var solution = CollectionToListNode(preSolution);
        test(testCase1,testCase2,solution);
    }//void test7(){

    @Test
    void test8(){
        Integer[] preTestCase1 = {8339, 4510};
        Integer[] preTestCase2 = {2309};
        Integer[] preSolution = {8339, 6819};
        var testCase1 = CollectionToListNode(preTestCase1);
        var testCase2 = CollectionToListNode(preTestCase2);
        var solution = CollectionToListNode(preSolution);
        test(testCase1,testCase2,solution);
    }//void test8(){

    private void test(ListNode<Integer> testCase1, ListNode<Integer> testCase2, ListNode<Integer> solution){
        assertTimeout(Duration.ofSeconds(3),()-> new AddTwoHugeNumbers().addTwoHugeNumbers(testCase1,testCase2));
        var Actual = new AddTwoHugeNumbers().addTwoHugeNumbers(testCase1, testCase2);
        while(solution!=null && Actual!=null ){
            assertEquals(solution.value,Actual.value);
            solution=solution.next;
            Actual=Actual.next;
        }//while(solution!=null && Actual!=null ){
        assertTrue(solution==null&&Actual==null);
    }//private void test(ListNode<Integer> testCase1, ListNode<Integer> testCase2, ListNode<Integer> solution){
}//class AddTwoHugeNumbersTest {