using Algorithms.src.interview_practice._0_Data_Structures._1_Linked_Lists;
using Algorithms.src.helper_functions;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._1_Linked_Lists {
    [TestClass()]
    public class IsListPalindromeTests {

        private const int timeout = 3000;
        private ListNode<int> internedTestCase = null;
        private bool internedSolution = false;

        [TestMethod]
        public void Test1() {
            int[] preTestCase = { 0, 1, 0 };
            internedTestCase = ListNodeBuilder.CollectionToListNode(preTestCase);
            internedSolution =  true;
            DoTest();
        }//public void Test1() {

        [TestMethod]
        public void Test2() {
            int[] preTestCase = { 1, 2, 2, 3 };
            internedTestCase = ListNodeBuilder.CollectionToListNode(preTestCase);
            internedSolution =  false;
            DoTest();
        }//public void Test2() {

        [TestMethod]
        public void Test3() {
            int[] preTestCase = { 1, 1000000000, -1000000000, -1000000000, 1000000000, 1 };
            internedTestCase = ListNodeBuilder.CollectionToListNode(preTestCase);
            internedSolution =  true;
            DoTest();
        }//public void Test3() {

        [TestMethod]
        public void Test4() {
            int[] preTestCase = { 1, 2, 3, 3, 2 };
            internedTestCase = ListNodeBuilder.CollectionToListNode(preTestCase);
            internedSolution =  false;
            DoTest();
        }//public void Test4() {

        [TestMethod]
        public void Test5() {
            int[] preTestCase = { 1, 2, 3, 1, 2, 3 };
            internedTestCase = ListNodeBuilder.CollectionToListNode(preTestCase);
            internedSolution =  false;
            DoTest();
        }//public void Test5() {

        [TestMethod]
        public void Test6() {
            int[] preTestCase = { };
            internedTestCase = ListNodeBuilder.CollectionToListNode(preTestCase);
            internedSolution =  true;
            DoTest();
        }//public void Test6() {

        [TestMethod]
        public void Test7() {
            int[] preTestCase = { 3, 5, 3, 5 };
            internedTestCase = ListNodeBuilder.CollectionToListNode(preTestCase);
            internedSolution =  false;
            DoTest();
        }//public void Test7() {

        [TestMethod]
        public void Test8() {
            int[] preTestCase = { 1, 5, 2, 4 };
            internedTestCase = ListNodeBuilder.CollectionToListNode(preTestCase);
            internedSolution =  false;
            DoTest();
        }//public void Test8() {

        [TestMethod]
        public void Test9() {
            int[] preTestCase = { 10 };
            internedTestCase = ListNodeBuilder.CollectionToListNode(preTestCase);
            internedSolution =  true;
            DoTest();
        }//public void Test9() {

        [TestMethod]
        public void Test10() {
            int[] preTestCase = { 0, 0 };
            internedTestCase = ListNodeBuilder.CollectionToListNode(preTestCase);
            internedSolution =  true;
            DoTest();
        }//public void Test10() {

        [TestMethod]
        public void Test11() {
            int[] preTestCase = { 1, 3, 2, 2, 2 };
            internedTestCase = ListNodeBuilder.CollectionToListNode(preTestCase);
            internedSolution =  false;
            DoTest();
        }//public void Test11() {

        private void Test(ListNode<int> testCase, bool solution) {
            if (solution) {
                Assert.IsTrue(new IsListPalindrome().isListPalindrome(testCase));
            } else {//if (solution) {
                Assert.IsFalse(new IsListPalindrome().isListPalindrome(testCase));
            }//else {
        }//private void Test(ListNode<int> testCase,bool solution) {

        [Timeout(timeout)]
        private void DoTest() {
            Test(internedTestCase, internedSolution);
        }//private void DoTest() {
    }//public class IsListPalindromeTests {
}//namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._1_Linked_Lists {