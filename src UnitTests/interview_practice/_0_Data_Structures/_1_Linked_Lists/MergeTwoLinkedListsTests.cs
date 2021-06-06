using Algorithms.src.helper_functions;
using Algorithms.src.interview_practice._0_Data_Structures._1_Linked_Lists;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Newtonsoft.Json.Linq;

namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._1_Linked_Lists {
    [TestClass()]
    public class MergeTwoLinkedListsTests {

        private const int timeout = 3000;
        private const string path = "Test_Cases\\interview_practice\\_0_Data_Structures\\_1_Linked_Lists\\MergeTwoLinkedLists\\";
        private ListNode<int> internedTestCase1 = null;
        private ListNode<int> internedTestCase2 = null;
        private ListNode<int> internedSolution = null;

        [TestMethod]
        public void Test1() {
            int[] preTestCase1 = { 1, 2, 3 };
            int[] preTestCase2 = { 4, 5, 6 };
            int[] preSolution = { 1, 2, 3, 4, 5, 6 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test1() {

        [TestMethod]
        public void Test2() {
            int[] preTestCase1 = { 1, 1, 2, 4 };
            int[] preTestCase2 = { 0, 3, 5 };
            int[] preSolution = { 0, 1, 1, 2, 3, 4, 5 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test2() {

        [TestMethod]
        public void Test3() {
            int[] preTestCase1 = { 5, 10, 15, 40 };
            int[] preTestCase2 = { 2, 3, 20 };
            int[] preSolution = { 2, 3, 5, 10, 15, 20, 40 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test3() {

        [TestMethod]
        public void Test4() {
            int[] preTestCase1 = { 1, 1 };
            int[] preTestCase2 = { 2, 4 };
            int[] preSolution = { 1, 1, 2, 4 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test4() {

        [TestMethod]
        public void Test5() {
            int[] preTestCase1 = {  };
            int[] preTestCase2 = { 1, 1, 2, 2, 4, 7, 7, 8 };
            int[] preSolution = { 1, 1, 2, 2, 4, 7, 7, 8 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test5() {

        [TestMethod]
        public void Test6() {
            int[] preTestCase1 = {  };
            int[] preTestCase2 = {  };
            int[] preSolution = {  };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test6() {

        [TestMethod]
        public void Test7() {
            int[] preTestCase1 = { 1, 1, 4 };
            int[] preTestCase2 = {  };
            int[] preSolution = { 1, 1, 4 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test7() {

        [TestMethod]
        public void Test8() {
            int[] preTestCase1 = { 1, 1 };
            int[] preTestCase2 = { 0 };
            int[] preSolution = { 0, 1, 1 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test8() {

        [TestMethod]
        public void Test9() {
            int[] preTestCase1 = { 0 };
            int[] preTestCase2 = { 2 };
            int[] preSolution = { 0, 2 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test9() {

        [TestMethod]
        public void Test10() {
            int[] preTestCase1 = { 1 };
            int[] preTestCase2 = { -1000000000, 1000000000 };
            int[] preSolution = { -1000000000, 1, 1000000000 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test10() {

        [TestMethod]
        public void Test11() {
            int[] preTestCase1 = { -1, -1, 0, 1 };
            int[] preTestCase2 = { -1, 0, 0, 1, 1 };
            int[] preSolution = { -1, -1, -1, 0, 0, 0, 1, 1, 1 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test11() {

        [TestMethod]
        public void Test12() {
            int[] preTestCase1 = { -780990573, -670826849, -404817961, 242026249, 731519938 };
            int[] preTestCase2 = { -815817641, -426491047, 437929670, 520408640 };
            int[] preSolution = { -815817641, -780990573, -670826849, -426491047, -404817961, 242026249, 437929670, 520408640, 731519938 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test12() {

        [TestMethod]
        public void Test13() {
            int[] preTestCase1 = { -3, -2, -2, -1, -1, 3, 3 };
            int[] preTestCase2 = { -2, -1, -1, 1, 1, 1, 2, 2, 2, 3 };
            int[] preSolution = { -3, -2, -2, -2, -1, -1, -1, -1, 1, 1, 1, 2, 2, 2, 3, 3, 3 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test13() {

        [TestMethod]
        public void Test14() {
            int[] preTestCase1 = { -659474950, -269421862, -167389066, 333930706, 377439229, 427653092, 439785264, 645789055 };
            int[] preTestCase2 = { -903278135, -773195107, -653405140, -582813052, -540635007, -35341462, 95558633, 248972335, 429858426, 958085016 };
            int[] preSolution = { -903278135, -773195107, -659474950, -653405140, -582813052, -540635007, -269421862, -167389066, -35341462, 95558633, 248972335, 333930706, 377439229, 427653092, 429858426, 439785264, 645789055, 958085016 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test14() {

        [TestMethod]
        public void Test15() {
            int[] preTestCase1 = { -15, -15, -13, -13, -12, -12, -11, -11, -11, -10, -9, -8, -8, -7, -6, -6, -6, -5, -5, -4, -3, -3, -3, 1, 1, 2, 3, 3, 3, 5, 5, 6, 6, 7, 8, 9, 9, 9, 9, 12, 13, 15, 15 };
            int[] preTestCase2 = { -15, -14, -14, -14, -13, -13, -13, -13, -10, -10, -10, -9, -9, -9, -7, -6, -6, -6, -3, 0, 1, 3, 3, 3, 4, 5, 5, 5, 7, 7, 7, 9, 9, 10, 11, 12, 13, 14, 14, 16, 16 };
            int[] preSolution = { -15, -15, -15, -14, -14, -14, -13, -13, -13, -13, -13, -13, -12, -12, -11, -11, -11, -10, -10, -10, -10, -9, -9, -9, -9, -8, -8, -7, -7, -6, -6, -6, -6, -6, -6, -5, -5, -4, -3, -3, -3, -3, 0, 1, 1, 1, 2, 3, 3, 3, 3, 3, 3, 4, 5, 5, 5, 5, 5, 6, 6, 7, 7, 7, 7, 8, 9, 9, 9, 9, 9, 9, 10, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test15() {

        [TestMethod]
        public void Test16() {
            int[] preTestCase1 = { -974133093, -877622761, -824849660, -803517097, -784293222, -762273049, -737896952, -718360029, -702004341, -592588130, -567595992, -499749048, -434261356, -381541206, -283205170, -264883401, -206439854, -174916544, -169451498, -142200699, -141374212, -131359385, -51384974, 96483901, 139629992, 165033215, 181951779, 341906806, 359062031, 361153706, 367112767, 440725448, 544137015, 545558659, 569330362, 635060352, 729540089, 778358990, 779017205, 779503630, 820255999, 868222772, 877390779, 879372624, 892702237, 940789421 };
            int[] preTestCase2 = { -947547617, -917016142, -903422949, -895795097, -790058590, -770288168, -751627717, -735549944, -712470184, -576448173, -536894298, -432148242, -425387697, -422381627, -391589404, -377612667, -247458908, -228676178, -215741425, -81825360, 14662630, 24182578, 27546917, 89077418, 112120204, 177487866, 206829672, 337245809, 342476945, 357253918, 570915382, 599359585, 709393756, 735011164, 850323947, 946478652, 972264515 };
            int[] preSolution = { -974133093, -947547617, -917016142, -903422949, -895795097, -877622761, -824849660, -803517097, -790058590, -784293222, -770288168, -762273049, -751627717, -737896952, -735549944, -718360029, -712470184, -702004341, -592588130, -576448173, -567595992, -536894298, -499749048, -434261356, -432148242, -425387697, -422381627, -391589404, -381541206, -377612667, -283205170, -264883401, -247458908, -228676178, -215741425, -206439854, -174916544, -169451498, -142200699, -141374212, -131359385, -81825360, -51384974, 14662630, 24182578, 27546917, 89077418, 96483901, 112120204, 139629992, 165033215, 177487866, 181951779, 206829672, 337245809, 341906806, 342476945, 357253918, 359062031, 361153706, 367112767, 440725448, 544137015, 545558659, 569330362, 570915382, 599359585, 635060352, 709393756, 729540089, 735011164, 778358990, 779017205, 779503630, 820255999, 850323947, 868222772, 877390779, 879372624, 892702237, 940789421, 946478652, 972264515 };
            internedTestCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            internedTestCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            internedSolution = ListNodeBuilder.CollectionToListNode(preSolution);
            DoTest();
        }//public void Test16() {

        [TestMethod]
        public void Test17() {
            SetTestCaseInfo("test-17.json");
            DoTest();
        }//public void Test17() {

        [TestMethod]
        public void Test18() {
            SetTestCaseInfo("test-18.json");
            DoTest();
        }//public void Test18() {

        [TestMethod]
        public void Test19() {
            SetTestCaseInfo("test-19.json");
            DoTest();
        }//public void Test19() {

        [TestMethod]
        public void Test20() {
            SetTestCaseInfo("test-20.json");
            DoTest();
        }//public void Test20() {

        [TestMethod]
        public void Test21() {
            SetTestCaseInfo("test-21.json");
            DoTest();
        }//public void Test21() {

        [TestMethod]
        public void Test22() {
            SetTestCaseInfo("test-22.json");
            DoTest();
        }//public void Test22() {

        [TestMethod]
        public void Test23() {
            SetTestCaseInfo("test-23.json");
            DoTest();
        }//public void Test23() {

        private void Test(ListNode<int> testCase1, ListNode<int> testCase2, ListNode<int> solution) {
            ListNode<int> Actual = new MergeTwoLinkedLists().mergeTwoLinkedLists(testCase1, testCase2);
            while (solution != null && Actual != null) {
                Assert.AreEqual(solution.value, Actual.value);
                solution = solution.next;
                Actual = Actual.next;
            }//while(Actual!=null){
            Assert.IsTrue(solution == null && Actual == null);
        }//private void Test(ListNode<int> testCase1, ListNode<int> testCase2, ListNode<int> solution) {

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
                JArray preTestCase1 = (JArray)o["input"]["l1"];
                int[] preInternedTestCase1 = new int[preTestCase1.Count];
                for (int i = 0; i < preInternedTestCase1.Length; i++) {
                    preInternedTestCase1[i] = (int)preTestCase1[i];
                }//for (int i = 0; i < internedTestCase.Length; i++) {
                JArray preTestCase2 = (JArray)o["input"]["l2"];
                int[] preInternedTestCase2 = new int[preTestCase2.Count];
                for(int i = 0; i < preInternedTestCase2.Length; i++) {
                    preInternedTestCase2[i] = (int)preTestCase2[i];
                }//for(int i = 0; i < preInternedTestCase2.Length; i++) {
                internedTestCase1 = ListNodeBuilder.CollectionToListNode(preInternedTestCase1);
                internedTestCase2 = ListNodeBuilder.CollectionToListNode(preInternedTestCase2);
                internedSolution = ListNodeBuilder.CollectionToListNode(preInternedSolution);
            }//else {
        }//public void SetTestCaseInfo(string fileName) {

        [Timeout(timeout)]
        private void DoTest() {
            Test(internedTestCase1, internedTestCase2, internedSolution);
        }//private void DoTest() {
    }//public class MergeTwoLinkedListsTests {
}//namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._1_Linked_Lists {
