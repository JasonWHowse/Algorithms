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


class AddTwoHugeNumbersTest {
    private final static String path = "Test_Cases\\interview_practice\\_0_Data_Structures\\_1_Linked_Lists\\AddTwoHugeNumbers\\";
    private ListNode<Integer> internedTestCase1 = null;
    private ListNode<Integer> internedTestCase2 = null;
    private ListNode<Integer> internedSolution = null;

    @Test
    public void test1() {
        Integer[] preTestCase1 = { 9876, 5432, 1999 };
        Integer[] preTestCase2 = { 1, 8001 };
        Integer[] preSolution = { 9876, 5434, 0 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = CollectionToListNode(preTestCase2);
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test1() {

    @Test
    public void test2() {
        Integer[] preTestCase1 = { 123, 4, 5 };
        Integer[] preTestCase2 = { 100, 100, 100 };
        Integer[] preSolution = { 223, 104, 105 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = CollectionToListNode(preTestCase2);
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test2() {

    @Test
    public void test3() {
        Integer[] preTestCase1 = { 0 };
        Integer[] preTestCase2 = { 0 };
        Integer[] preSolution = { 0 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = CollectionToListNode(preTestCase2);
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test3() {

    @Test
    public void test4() {
        Integer[] preTestCase1 = { 1234, 1234, 0 };
        Integer[] preTestCase2 = { 0 };
        Integer[] preSolution = { 1234, 1234, 0 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = CollectionToListNode(preTestCase2);
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test4() {

    @Test
    public void test5() {
        Integer[] preTestCase1 = { 0 };
        Integer[] preTestCase2 = { 1234, 123, 0 };
        Integer[] preSolution = { 1234, 123, 0 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = CollectionToListNode(preTestCase2);
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test5() {

    @Test
    public void test6() {
        Integer[] preTestCase1 = { 1 };
        Integer[] preTestCase2 = { 9998, 9999, 9999, 9999, 9999, 9999 };
        Integer[] preSolution = { 9999, 0, 0, 0, 0, 0 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = CollectionToListNode(preTestCase2);
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test6() {

    @Test
    public void test7() {
        Integer[] preTestCase1 = { 1 };
        Integer[] preTestCase2 = { 9999, 9999, 9999, 9999, 9999, 9999 };
        Integer[] preSolution = { 1, 0, 0, 0, 0, 0, 0 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = CollectionToListNode(preTestCase2);
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test7() {

    @Test
    public void test8() {
        Integer[] preTestCase1 = { 8339, 4510 };
        Integer[] preTestCase2 = { 2309 };
        Integer[] preSolution = { 8339, 6819 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = CollectionToListNode(preTestCase2);
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test8() {

    @Test
    public void test9() {
        Integer[] preTestCase1 = { 9665 };
        Integer[] preTestCase2 = { 6933, 8443, 5132, 6809, 8519, 9096 };
        Integer[] preSolution = { 6933, 8443, 5132, 6809, 8520, 8761 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = CollectionToListNode(preTestCase2);
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test9() {

    @Test
    public void test10() {
        Integer[] preTestCase1 = { 626, 6726, 9980, 9738, 4562, 6376, 8940, 6921, 1676, 1107, 8959, 4623, 4324, 9083, 7716, 7800, 8042, 4337, 3616, 7983, 9701, 3275, 5680, 802, 2485, 4473, 7661, 9235, 5797, 5042, 7365, 3106, 7361, 2724, 5328, 8525, 7103, 755, 947, 7898 };
        Integer[] preTestCase2 = { 9651, 8173, 5384, 7798, 8467, 2360, 3375, 9054, 1161, 9880, 1427, 6573, 5907, 9061, 7900, 6516, 6546, 293, 3877, 9453, 4289, 4829, 7563, 4308, 7845, 4840, 3279, 7186, 9917, 25, 4220, 9052, 6867, 8567, 8308, 5917, 7251, 7236, 2581, 8901, 8372 };
        Integer[] preSolution = { 9651, 8800, 2111, 7779, 8205, 6922, 9752, 7994, 8083, 1556, 2535, 5533, 531, 3386, 6984, 4233, 4346, 8335, 8215, 3070, 2273, 4531, 838, 9988, 8647, 7325, 7753, 4848, 9152, 5822, 9263, 6417, 9974, 5929, 1033, 1246, 5777, 4339, 3336, 9849, 6270 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = CollectionToListNode(preTestCase2);
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test10() {

    @Test
    public void test11() {
        Integer[] preTestCase1 = { 1000, 8602, 8250, 7667, 4160, 3023, 2349, 9780, 2843, 6174, 4631, 5051, 4090, 4611, 5484, 7433, 1262, 8203, 7126, 1702, 3654, 7627, 7854 };
        Integer[] preTestCase2 = { 4452, 3300, 7905, 6154, 5614, 7477, 4199, 8120, 5023, 4389, 3586, 4981, 3919, 7779, 679, 2740, 7353, 4785, 6616, 4336, 7620, 657, 5687, 9724, 5319, 9541, 6199, 1336, 9600, 2636, 7360, 3788, 3512, 8152, 2493, 252, 7038, 1047, 9058, 8625, 9351, 6331, 7743, 1766, 776, 7269, 7804, 2452, 1580, 4480, 9472, 9495, 3867, 5344, 5562, 4404, 1742, 4010, 6410, 7214, 6751, 1266, 1542, 6124, 3569, 9238, 9573, 2235, 2705, 3582, 4277 };
        Integer[] preSolution = { 4452, 3300, 7905, 6154, 5614, 7477, 4199, 8120, 5023, 4389, 3586, 4981, 3919, 7779, 679, 2740, 7353, 4785, 6616, 4336, 7620, 657, 5687, 9724, 5319, 9541, 6199, 1336, 9600, 2636, 7360, 3788, 3512, 8152, 2493, 252, 7038, 1047, 9058, 8625, 9351, 6331, 7743, 1766, 776, 7269, 7804, 2452, 2581, 3083, 7723, 7162, 8027, 8367, 7912, 4184, 4586, 185, 1042, 2266, 841, 5877, 7027, 3557, 4832, 7442, 6699, 3937, 6360, 1210, 2131 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = CollectionToListNode(preTestCase2);
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test11() {

    @Test
    public void test12() {
        setTestCaseInfo("test-12.json");
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test12() {

    @Test
    public void test13() {
        setTestCaseInfo("test-13.json");
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test13() {

    @Test
    public void test14() {
        setTestCaseInfo("test-14.json");
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test14() {

    @Test
    public void test15() {
        Integer[] preTestCase1 = { 0 };
        Integer[] preTestCase2 = { 9999, 9999, 9998, 0 };
        Integer[] preSolution = { 9999, 9999, 9998, 0 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = CollectionToListNode(preTestCase2);
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test15() {

    @Test
    public void test16() {
        Integer[] preTestCase1 = { 1 };
        Integer[] preTestCase2 = { 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999 };
        Integer[] preSolution = { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        internedTestCase1 = CollectionToListNode(preTestCase1);
        internedTestCase2 = CollectionToListNode(preTestCase2);
        internedSolution = CollectionToListNode(preSolution);
        test(internedTestCase1,internedTestCase2,internedSolution);
    }//public void test16() {

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

    private void setTestCaseInfo(String fileName){
        JSONObject testInfo = getJsonObject(fileName, path);
        if(testInfo==null){
            fail("JObject for " + fileName + " returns null");
        }else{//if(testInfo==null){
            var preInternedTestCase1 = (JSONArray) ((JSONObject) testInfo.get("input")).get("a");
            Integer[] preInternedTestCase1AsArray = new Integer[preInternedTestCase1.size()];
            for(int i=0;i< preInternedTestCase1AsArray.length;i++){
                preInternedTestCase1AsArray[i] = ((Long) preInternedTestCase1.get(i)).intValue();
            }//for(int i=0;i< preInternedTestCase1AsArray.length;i++){

            var preInternedTestCase2 = (JSONArray) ((JSONObject) testInfo.get("input")).get("b");
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
}//class AddTwoHugeNumbersTest {