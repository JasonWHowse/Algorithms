using Algorithms.src.helper_functions;
using Algorithms.src.interview_practice._0_Data_Structures._1_Linked_Lists;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Newtonsoft.Json.Linq;

namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._1_Linked_Lists {
    [TestClass()]
    public class RearrangeLastNTests {

        private const int timeout = 3000;
        private const string path = "Test_Cases\\interview_practice\\_0_Data_Structures\\_1_Linked_Lists\\RearrangeLastN\\";
        private ListNode<int> internedTestCase1 = null;
        int internedTestCase2 = 0;
        private ListNode<int> internedSolution = null;

        [TestMethod]
        public void Test1() {
            int[] preTestCase1 = { 1, 2, 3, 4, 5 };
            int[] preSolution = { 3, 4, 5, 1, 2 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = 3;
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test1() {

        [TestMethod]
        public void Test2() {
            int[] preTestCase1 = { 1, 2, 3, 4, 5, 6, 7 };
            int[] preSolution = { 7, 1, 2, 3, 4, 5, 6 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = 1;
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test2() {

        [TestMethod]
        public void Test3() {
            int[] preTestCase1 = { 1000, -1000 };
            int[] preSolution = { 1000, -1000 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = 0;
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test3() {

        [TestMethod]
        public void Test4() {
            int[] preTestCase1 = { };
            int[] preSolution = { };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = 0;
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test4() {

        [TestMethod]
        public void Test5() {
            int[] preTestCase1 = { 123, 456, 789, 0 };
            int[] preSolution = { 123, 456, 789, 0 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = 4;
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test5() {

        [TestMethod]
        public void Test6() {
            int[] preTestCase1 = { 1 };
            int[] preSolution = { 1 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = 1;
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test6() {

        [TestMethod]
        public void Test7() {
            int[] preTestCase1 = { -262, -925, -360, 38, -401, -533, -505, 358, -970, -142, -874, 907, -776, 64, 662, 89, -99, -926, 942, -944, 859, -359, -376, -435, -918, -346, 674, -678, 683, -801, 734, -889, 530, 143, 24, -557, -594, 443, -901, -830, 615, -339, 203, -484, 785, 409, -837, 585, -634, -285, 697, -179, -67, -670, 420, 15, 567, 274, 864, -604, 241, -744, -667, 650, 600, -607, -219, -936, -141, 566, -468, -116, -57, 243, 457, -497, 731, 638, -315, -229, -835, -605, 368, -787, 997, 375, 474, -217, 587, -331, -730, -742, -134, -874, 847, 813, 588, 624, -624, -338 };
            int[] preSolution = { -901, -830, 615, -339, 203, -484, 785, 409, -837, 585, -634, -285, 697, -179, -67, -670, 420, 15, 567, 274, 864, -604, 241, -744, -667, 650, 600, -607, -219, -936, -141, 566, -468, -116, -57, 243, 457, -497, 731, 638, -315, -229, -835, -605, 368, -787, 997, 375, 474, -217, 587, -331, -730, -742, -134, -874, 847, 813, 588, 624, -624, -338, -262, -925, -360, 38, -401, -533, -505, 358, -970, -142, -874, 907, -776, 64, 662, 89, -99, -926, 942, -944, 859, -359, -376, -435, -918, -346, 674, -678, 683, -801, 734, -889, 530, 143, 24, -557, -594, 443 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = 62;
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test7() {

        [TestMethod]
        public void Test8() {
            SetTestCaseInfo("test-8.json");
            DoTest();
        }//public void Test8() {

        [TestMethod]
        public void Test9() {
            SetTestCaseInfo("test-9.json");
            DoTest();
        }//public void Test9() {

        [TestMethod]
        public void Test10() {
            int[] preTestCase1 = { 2, 1 };
            int[] preSolution = { 1, 2 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = 1;
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test10() {

        private void Test(ListNode<int> testCase1, int testCase2, ListNode<int> solution) {
            ListNode<int> Actual = new RearrangeLastN().rearrangeLastN(testCase1, testCase2);
            while (solution != null && Actual != null) {
                Assert.AreEqual(solution.value, Actual.value);
                solution = solution.next;
                Actual = Actual.next;
            }//while (solution != null && Actual != null) {
            Assert.IsTrue(solution == null && Actual == null);
        }//private void Test(ListNode<int> testCase1, int testCase2, ListNode<int> solution) {

        private void SetTestCaseInfo(string fileName) {
            JObject o = Helpers.GetJsonObject(fileName, path);
            if (o == null) {
                Assert.Fail("JObject for " + fileName + " returns null");
            } else {//if (o == null) {
                JArray preSolution = (JArray)o["output"];
                int[] preInternedSolution = new int[preSolution.Count];
                for (int i = 0; i < preInternedSolution.Length; i++) {
                    preInternedSolution[i] = (int)preSolution[i];
                }//for(int i = 0; i < preInternedSolution.Length; i++) {
                JArray preTestCase1 = (JArray)o["input"]["l"];
                int[] preInternedTestCase1 = new int[preTestCase1.Count];
                for (int i = 0; i < preInternedTestCase1.Length; i++) {
                    preInternedTestCase1[i] = (int)preTestCase1[i];
                }//for (int i = 0; i < internedTestCase.Length; i++) {
                internedTestCase1 = ListNodeBuilder.CollectionToListNode(preInternedTestCase1);
                internedTestCase2 = (int)o["input"]["n"];
                internedSolution = ListNodeBuilder.CollectionToListNode(preInternedSolution);
            }//else {
        }//public void SetTestCaseInfo(string fileName) {

        [Timeout(timeout)]
        private void DoTest() {
            Test(internedTestCase1, internedTestCase2, internedSolution);
        }//private void DoTest() {
    }//public class RearrangeLastNTests {
}//namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._1_Linked_Lists {
