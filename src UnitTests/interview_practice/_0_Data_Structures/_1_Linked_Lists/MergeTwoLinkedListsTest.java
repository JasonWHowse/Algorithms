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
import static org.junit.jupiter.api.Assertions.*;

class MergeTwoLinkedListsTest {
    private final static String path = "Test_Cases\\interview_practice\\_0_Data_Structures\\_1_Linked_Lists\\MergeTwoLinkedLists\\";
    private ListNode<Integer> internedTestCase1 = null;
    private ListNode<Integer> internedTestCase2 = null;
    private ListNode<Integer> internedSolution = null;

    @Test
    public void test1() {
        Integer[] preTestCase1 = { 1, 2, 3 };
        Integer[] preTestCase2 = { 4, 5, 6 };
        Integer[] preSolution = { 1, 2, 3, 4, 5, 6 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = CollectionToListNode(preTestCase2);
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test1() {

    @Test
    public void test2() {
        Integer[] preTestCase1 = { 1, 1, 2, 4 };
        Integer[] preTestCase2 = { 0, 3, 5 };
        Integer[] preSolution = { 0, 1, 1, 2, 3, 4, 5 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = CollectionToListNode(preTestCase2);
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test2() {

    @Test
    public void test3() {
        Integer[] preTestCase1 = { 5, 10, 15, 40 };
        Integer[] preTestCase2 = { 2, 3, 20 };
        Integer[] preSolution = { 2, 3, 5, 10, 15, 20, 40 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = CollectionToListNode(preTestCase2);
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test3() {

    @Test
    public void test4() {
        Integer[] preTestCase1 = { 1, 1 };
        Integer[] preTestCase2 = { 2, 4 };
        Integer[] preSolution = { 1, 1, 2, 4 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = CollectionToListNode(preTestCase2);
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test4() {

    @Test
    public void test5() {
        Integer[] preTestCase1 = {  };
        Integer[] preTestCase2 = { 1, 1, 2, 2, 4, 7, 7, 8 };
        Integer[] preSolution = { 1, 1, 2, 2, 4, 7, 7, 8 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = CollectionToListNode(preTestCase2);
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test5() {

    @Test
    public void test6() {
        Integer[] preTestCase1 = {  };
        Integer[] preTestCase2 = {  };
        Integer[] preSolution = {  };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = CollectionToListNode(preTestCase2);
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test6() {

    @Test
    public void test7() {
        Integer[] preTestCase1 = { 1, 1, 4 };
        Integer[] preTestCase2 = {  };
        Integer[] preSolution = { 1, 1, 4 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = CollectionToListNode(preTestCase2);
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test7() {

    @Test
    public void test8() {
        Integer[] preTestCase1 = { 1, 1 };
        Integer[] preTestCase2 = { 0 };
        Integer[] preSolution = { 0, 1, 1 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = CollectionToListNode(preTestCase2);
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test8() {

    @Test
    public void test9() {
        Integer[] preTestCase1 = { 0 };
        Integer[] preTestCase2 = { 2 };
        Integer[] preSolution = { 0, 2 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = CollectionToListNode(preTestCase2);
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test9() {

    @Test
    public void test10() {
        Integer[] preTestCase1 = { 1 };
        Integer[] preTestCase2 = { -1000000000, 1000000000 };
        Integer[] preSolution = { -1000000000, 1, 1000000000 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = CollectionToListNode(preTestCase2);
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test10() {

    @Test
    public void test11() {
        Integer[] preTestCase1 = { -1, -1, 0, 1 };
        Integer[] preTestCase2 = { -1, 0, 0, 1, 1 };
        Integer[] preSolution = { -1, -1, -1, 0, 0, 0, 1, 1, 1 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = CollectionToListNode(preTestCase2);
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test11() {

    @Test
    public void test12() {
        Integer[] preTestCase1 = { -780990573, -670826849, -404817961, 242026249, 731519938 };
        Integer[] preTestCase2 = { -815817641, -426491047, 437929670, 520408640 };
        Integer[] preSolution = { -815817641, -780990573, -670826849, -426491047, -404817961, 242026249, 437929670, 520408640, 731519938 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = CollectionToListNode(preTestCase2);
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test12() {

    @Test
    public void test13() {
        Integer[] preTestCase1 = { -3, -2, -2, -1, -1, 3, 3 };
        Integer[] preTestCase2 = { -2, -1, -1, 1, 1, 1, 2, 2, 2, 3 };
        Integer[] preSolution = { -3, -2, -2, -2, -1, -1, -1, -1, 1, 1, 1, 2, 2, 2, 3, 3, 3 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = CollectionToListNode(preTestCase2);
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test13() {

    @Test
    public void test14() {
        Integer[] preTestCase1 = { -659474950, -269421862, -167389066, 333930706, 377439229, 427653092, 439785264, 645789055 };
        Integer[] preTestCase2 = { -903278135, -773195107, -653405140, -582813052, -540635007, -35341462, 95558633, 248972335, 429858426, 958085016 };
        Integer[] preSolution = { -903278135, -773195107, -659474950, -653405140, -582813052, -540635007, -269421862, -167389066, -35341462, 95558633, 248972335, 333930706, 377439229, 427653092, 429858426, 439785264, 645789055, 958085016 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = CollectionToListNode(preTestCase2);
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test14() {

    @Test
    public void test15() {
        Integer[] preTestCase1 = { -15, -15, -13, -13, -12, -12, -11, -11, -11, -10, -9, -8, -8, -7, -6, -6, -6, -5, -5, -4, -3, -3, -3, 1, 1, 2, 3, 3, 3, 5, 5, 6, 6, 7, 8, 9, 9, 9, 9, 12, 13, 15, 15 };
        Integer[] preTestCase2 = { -15, -14, -14, -14, -13, -13, -13, -13, -10, -10, -10, -9, -9, -9, -7, -6, -6, -6, -3, 0, 1, 3, 3, 3, 4, 5, 5, 5, 7, 7, 7, 9, 9, 10, 11, 12, 13, 14, 14, 16, 16 };
        Integer[] preSolution = { -15, -15, -15, -14, -14, -14, -13, -13, -13, -13, -13, -13, -12, -12, -11, -11, -11, -10, -10, -10, -10, -9, -9, -9, -9, -8, -8, -7, -7, -6, -6, -6, -6, -6, -6, -5, -5, -4, -3, -3, -3, -3, 0, 1, 1, 1, 2, 3, 3, 3, 3, 3, 3, 4, 5, 5, 5, 5, 5, 6, 6, 7, 7, 7, 7, 8, 9, 9, 9, 9, 9, 9, 10, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = CollectionToListNode(preTestCase2);
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test15() {

    @Test
    public void test16() {
        Integer[] preTestCase1 = { -974133093, -877622761, -824849660, -803517097, -784293222, -762273049, -737896952, -718360029, -702004341, -592588130, -567595992, -499749048, -434261356, -381541206, -283205170, -264883401, -206439854, -174916544, -169451498, -142200699, -141374212, -131359385, -51384974, 96483901, 139629992, 165033215, 181951779, 341906806, 359062031, 361153706, 367112767, 440725448, 544137015, 545558659, 569330362, 635060352, 729540089, 778358990, 779017205, 779503630, 820255999, 868222772, 877390779, 879372624, 892702237, 940789421 };
        Integer[] preTestCase2 = { -947547617, -917016142, -903422949, -895795097, -790058590, -770288168, -751627717, -735549944, -712470184, -576448173, -536894298, -432148242, -425387697, -422381627, -391589404, -377612667, -247458908, -228676178, -215741425, -81825360, 14662630, 24182578, 27546917, 89077418, 112120204, 177487866, 206829672, 337245809, 342476945, 357253918, 570915382, 599359585, 709393756, 735011164, 850323947, 946478652, 972264515 };
        Integer[] preSolution = { -974133093, -947547617, -917016142, -903422949, -895795097, -877622761, -824849660, -803517097, -790058590, -784293222, -770288168, -762273049, -751627717, -737896952, -735549944, -718360029, -712470184, -702004341, -592588130, -576448173, -567595992, -536894298, -499749048, -434261356, -432148242, -425387697, -422381627, -391589404, -381541206, -377612667, -283205170, -264883401, -247458908, -228676178, -215741425, -206439854, -174916544, -169451498, -142200699, -141374212, -131359385, -81825360, -51384974, 14662630, 24182578, 27546917, 89077418, 96483901, 112120204, 139629992, 165033215, 177487866, 181951779, 206829672, 337245809, 341906806, 342476945, 357253918, 359062031, 361153706, 367112767, 440725448, 544137015, 545558659, 569330362, 570915382, 599359585, 635060352, 709393756, 729540089, 735011164, 778358990, 779017205, 779503630, 820255999, 850323947, 868222772, 877390779, 879372624, 892702237, 940789421, 946478652, 972264515 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = CollectionToListNode(preTestCase2);
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test16() {

    @Test
    public void test17() {
        setTestCaseInfo("test-17.json");
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test17() {

    @Test
    public void test18() {
        setTestCaseInfo("test-18.json");
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test18() {

    @Test
    public void test19() {
        setTestCaseInfo("test-19.json");
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test19() {

    @Test
    public void test20() {
        setTestCaseInfo("test-20.json");
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test20() {

    @Test
    public void test21() {
        setTestCaseInfo("test-21.json");
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test21() {

    @Test
    public void test22() {
        setTestCaseInfo("test-22.json");
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test22() {

    @Test
    public void test23() {
        setTestCaseInfo("test-23.json");
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test23() {

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

    private void setTestCaseInfo(String fileName){
        JSONObject testInfo = getJsonObject(fileName, path);
        if(testInfo==null){
            fail("JObject for " + fileName + " returns null");
        }else{//if(testInfo==null){
            var preInternedTestCase1 = (JSONArray) ((JSONObject) testInfo.get("input")).get("l1");
            Integer[] preInternedTestCase1AsArray = new Integer[preInternedTestCase1.size()];
            for(int i=0;i< preInternedTestCase1AsArray.length;i++){
                preInternedTestCase1AsArray[i] = ((Long) preInternedTestCase1.get(i)).intValue();
            }//for(int i=0;i< preInternedTestCase1AsArray.length;i++){

            var preInternedTestCase2 = (JSONArray) ((JSONObject) testInfo.get("input")).get("l2");
            Integer[] preInternedTestCase2AsArray = new Integer[preInternedTestCase2.size()];
            for(int i=0;i< preInternedTestCase2AsArray.length;i++){
                preInternedTestCase2AsArray[i] = ((Long) preInternedTestCase2.get(i)).intValue();
            }//for(int i=0;i< preInternedTestCase2AsArray.length;i++){

            var preInternedSolution = (JSONArray) testInfo.get("output");
            Integer[] preInternedSolutionAsArray = new Integer[preInternedSolution.size()];
            for(int i=0;i< preInternedSolutionAsArray.length;i++){
                preInternedSolutionAsArray[i] = ((Long) preInternedSolution.get(i)).intValue();
            }//for(int i=0;i< preInternedSolutionAsArray.length;i++){

            internedTestCase1 = CollectionToListNode(preInternedTestCase1AsArray);
            internedTestCase2 = CollectionToListNode(preInternedTestCase2AsArray);
            internedSolution = CollectionToListNode(preInternedSolutionAsArray);
        }//else{
    }//private void setTestCaseInfo(String filename){
}//class MergeTwoLinkedListsTest {