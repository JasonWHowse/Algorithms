/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._0_Data_Structures._1_Linked_Lists;

import helper_functions.ListNode;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static helper_functions.Helpers.getJsonObject;
import static helper_functions.ListNodeBuilder.CollectionToListNode;
import static helper_functions.ListNodeBuilder.ListNodeClone;
import static org.junit.jupiter.api.Assertions.*;

class RearrangeLastNTest {
    private final static String path = "Test_Cases\\interview_practice\\_0_Data_Structures\\_1_Linked_Lists\\RearrangeLastN\\";
    private ListNode<Integer> internedTestCase1 = null;
    int internedTestCase2 = 0;
    private ListNode<Integer> internedSolution = null;

    @Test
    public void test1() {
        Integer[] preTestCase1 = { 1, 2, 3, 4, 5 };
        Integer[] preSolution = { 3, 4, 5, 1, 2 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = 3;
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1, internedTestCase2, internedSolution);
    }//public void test1() {

    @Test
    public void test2() {
        Integer[] preTestCase1 = { 1, 2, 3, 4, 5, 6, 7 };
        Integer[] preSolution = { 7, 1, 2, 3, 4, 5, 6 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = 1;
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1, internedTestCase2, internedSolution);
    }//public void test2() {

    @Test
    public void test3() {
        Integer[] preTestCase1 = { 1000, -1000 };
        Integer[] preSolution = { 1000, -1000 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = 0;
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1, internedTestCase2, internedSolution);
    }//public void test3() {

    @Test
    public void test4() {
        Integer[] preTestCase1 = { };
        Integer[] preSolution = { };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = 0;
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1, internedTestCase2, internedSolution);
    }//public void test4() {

    @Test
    public void test5() {
        Integer[] preTestCase1 = { 123, 456, 789, 0 };
        Integer[] preSolution = { 123, 456, 789, 0 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = 4;
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1, internedTestCase2, internedSolution);
    }//public void test5() {

    @Test
    public void test6() {
        Integer[] preTestCase1 = { 1 };
        Integer[] preSolution = { 1 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = 1;
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1, internedTestCase2, internedSolution);
    }//public void test6() {

    @Test
    public void test7() {
        Integer[] preTestCase1 = { -262, -925, -360, 38, -401, -533, -505, 358, -970, -142, -874, 907, -776, 64, 662, 89, -99, -926, 942, -944, 859, -359, -376, -435, -918, -346, 674, -678, 683, -801, 734, -889, 530, 143, 24, -557, -594, 443, -901, -830, 615, -339, 203, -484, 785, 409, -837, 585, -634, -285, 697, -179, -67, -670, 420, 15, 567, 274, 864, -604, 241, -744, -667, 650, 600, -607, -219, -936, -141, 566, -468, -116, -57, 243, 457, -497, 731, 638, -315, -229, -835, -605, 368, -787, 997, 375, 474, -217, 587, -331, -730, -742, -134, -874, 847, 813, 588, 624, -624, -338 };
        Integer[] preSolution = { -901, -830, 615, -339, 203, -484, 785, 409, -837, 585, -634, -285, 697, -179, -67, -670, 420, 15, 567, 274, 864, -604, 241, -744, -667, 650, 600, -607, -219, -936, -141, 566, -468, -116, -57, 243, 457, -497, 731, 638, -315, -229, -835, -605, 368, -787, 997, 375, 474, -217, 587, -331, -730, -742, -134, -874, 847, 813, 588, 624, -624, -338, -262, -925, -360, 38, -401, -533, -505, 358, -970, -142, -874, 907, -776, 64, 662, 89, -99, -926, 942, -944, 859, -359, -376, -435, -918, -346, 674, -678, 683, -801, 734, -889, 530, 143, 24, -557, -594, 443 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = 62;
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1, internedTestCase2, internedSolution);
    }//public void test7() {

    @Test
    public void test8() {
        setTestCaseInfo("test-8.json");
        test(internedTestCase1, internedTestCase2, internedSolution);
    }//public void test8() {

    @Test
    public void test9() {
        setTestCaseInfo("test-9.json");
        test(internedTestCase1, internedTestCase2, internedSolution);
    }//public void test9() {

    @Test
    public void test10() {
        Integer[] preTestCase1 = { 2, 1 };
        Integer[] preSolution = { 1, 2 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = 1;
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1, internedTestCase2, internedSolution);
    }//public void test10() {

    private void test(ListNode<Integer> testCase1,int testCase2, ListNode<Integer> solution){
        ListNode<Integer> testCase1Head=ListNodeClone(testCase1);
        assertTimeout(Duration.ofSeconds(3), ()->
                new RearrangeLastN().rearrangeLastN(testCase1Head,testCase2));
        ListNode<Integer> Actual = new RearrangeLastN().rearrangeLastN(testCase1,testCase2);
        while(solution!=null && Actual!=null ){
            assertEquals(solution.value,Actual.value);
            solution=solution.next;
            Actual=Actual.next;
        }//while(solution!=null && Actual!=null ){
        assertTrue(solution==null&&Actual==null);
    }//private void test(ListNode<Integer> testCase1,int testCase2, ListNode<Integer> solution){

    private void setTestCaseInfo(String fileName){
        JSONObject testInfo = getJsonObject(fileName, path);
        if(testInfo==null){
            fail("JObject for " + fileName + " returns null");
        }else{//if(testInfo==null){
            var preInternedTestCase1 = (JSONArray) ((JSONObject) testInfo.get("input")).get("l");
            Integer[] preInternedTestCase1AsArray = new Integer[preInternedTestCase1.size()];
            for(int i=0;i< preInternedTestCase1AsArray.length;i++){
                preInternedTestCase1AsArray[i] = ((Long) preInternedTestCase1.get(i)).intValue();
            }//for(int i=0;i< internedTestCase1.length;i++){
            internedTestCase1 = CollectionToListNode(preInternedTestCase1AsArray);
            internedTestCase2 = ((Long)((JSONObject)testInfo.get("input")).get("n")).intValue();
            var preInternedSolution = (JSONArray) testInfo.get("output");
            Integer[] preInternedSolutionAsArray = new Integer[preInternedSolution.size()];
            for(int i=0;i< preInternedSolutionAsArray.length;i++){
                preInternedSolutionAsArray[i] = ((Long) preInternedSolution.get(i)).intValue();
            }//for(int i=0;i< preInternedSolutionAsArray.length;i++){
            internedSolution = CollectionToListNode(preInternedSolutionAsArray);
        }//else{
    }//private void setTestCaseInfo(String filename){
}//class RearrangeLastNTest {