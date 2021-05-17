using Algorithms.src.helper_functions;
using Algorithms.src.interview_practice._0_Data_Structures._1_Linked_Lists;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._1_Linked_Lists {
    [TestClass()]
    public class MergeTwoLinkedListsTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] preTestCase1 = { 1, 2, 3 };
            int[] preTestCase2 = { 4, 5, 6 };
            int[] preSolution = { 1, 2, 3, 4, 5, 6 };
            var testCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            var testCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            var solution = ListNodeBuilder.CollectionToListNode(preSolution);
            Test(testCase1, testCase2, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] preTestCase1 = { 1, 1, 2, 4 };
            int[] preTestCase2 = { 0, 3, 5 };
            int[] preSolution = { 0, 1, 1, 2, 3, 4, 5 };
            var testCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            var testCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            var solution = ListNodeBuilder.CollectionToListNode(preSolution);
            Test(testCase1, testCase2, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] preTestCase1 = { 5, 10, 15, 40 };
            int[] preTestCase2 = { 2, 3, 20 };
            int[] preSolution = { 2, 3, 5, 10, 15, 20, 40 };
            var testCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            var testCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            var solution = ListNodeBuilder.CollectionToListNode(preSolution);
            Test(testCase1, testCase2, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] preTestCase1 = { 1, 1 };
            int[] preTestCase2 = { 2, 4 };
            int[] preSolution = { 1, 1, 2, 4 };
            var testCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            var testCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            var solution = ListNodeBuilder.CollectionToListNode(preSolution);
            Test(testCase1, testCase2, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] preTestCase1 = {  };
            int[] preTestCase2 = { 1, 1, 2, 2, 4, 7, 7, 8 };
            int[] preSolution = { 1, 1, 2, 2, 4, 7, 7, 8 };
            var testCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            var testCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            var solution = ListNodeBuilder.CollectionToListNode(preSolution);
            Test(testCase1, testCase2, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[] preTestCase1 = {  };
            int[] preTestCase2 = {  };
            int[] preSolution = {  };
            var testCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            var testCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            var solution = ListNodeBuilder.CollectionToListNode(preSolution);
            Test(testCase1, testCase2, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[] preTestCase1 = { 1, 1, 4 };
            int[] preTestCase2 = {  };
            int[] preSolution = { 1, 1, 4 };
            var testCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            var testCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            var solution = ListNodeBuilder.CollectionToListNode(preSolution);
            Test(testCase1, testCase2, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            int[] preTestCase1 = { 1, 1 };
            int[] preTestCase2 = { 0 };
            int[] preSolution = { 0, 1, 1 };
            var testCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            var testCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            var solution = ListNodeBuilder.CollectionToListNode(preSolution);
            Test(testCase1, testCase2, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            int[] preTestCase1 = { 0 };
            int[] preTestCase2 = { 2 };
            int[] preSolution = { 0, 2 };
            var testCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            var testCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            var solution = ListNodeBuilder.CollectionToListNode(preSolution);
            Test(testCase1, testCase2, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            int[] preTestCase1 = { 1 };
            int[] preTestCase2 = { -1000000000, 1000000000 };
            int[] preSolution = { -1000000000, 1, 1000000000 };
            var testCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            var testCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            var solution = ListNodeBuilder.CollectionToListNode(preSolution);
            Test(testCase1, testCase2, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            int[] preTestCase1 = { -1, -1, 0, 1 };
            int[] preTestCase2 = { -1, 0, 0, 1, 1 };
            int[] preSolution = { -1, -1, -1, 0, 0, 0, 1, 1, 1 };
            var testCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            var testCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            var solution = ListNodeBuilder.CollectionToListNode(preSolution);
            Test(testCase1, testCase2, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            int[] preTestCase1 = { -780990573, -670826849, -404817961, 242026249, 731519938 };
            int[] preTestCase2 = { -815817641, -426491047, 437929670, 520408640 };
            int[] preSolution = { -815817641, -780990573, -670826849, -426491047, -404817961, 242026249, 437929670, 520408640, 731519938 };
            var testCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            var testCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            var solution = ListNodeBuilder.CollectionToListNode(preSolution);
            Test(testCase1, testCase2, solution);
        }//public void Test12() {

        private void Test(ListNode<int> testCase1, ListNode<int> testCase2, ListNode<int> solution) {
            ListNode<int> Actual = new MergeTwoLinkedLists().mergeTwoLinkedLists(testCase1, testCase2);
            while (solution != null && Actual != null) {
                Assert.AreEqual(solution.value, Actual.value);
                solution = solution.next;
                Actual = Actual.next;
            }//while(Actual!=null){
            Assert.IsTrue(solution == null && Actual == null);
        }//private void Test(ListNode<int> testCase1, ListNode<int> testCase2, ListNode<int> solution) {
    }//public class MergeTwoLinkedListsTests {
}//namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._1_Linked_Lists {
