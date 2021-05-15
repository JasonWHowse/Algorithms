using Algorithms.src.helper_functions;
using Algorithms.src.interview_practice._0_Data_Structures._1_Linked_Lists;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._1_Linked_Lists {
    [TestClass()]
    public class AddTwoHugeNumbersTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] preTestCase1 = { 9876, 5432, 1999 };
            int[] preTestCase2 = { 1, 8001 };
            int[] preSolution = { 9876, 5434, 0 };
            var testCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            var testCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            var solution = ListNodeBuilder.CollectionToListNode(preSolution);
            Test(testCase1, testCase2, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] preTestCase1 = { 123, 4, 5 };
            int[] preTestCase2 = { 100, 100, 100 };
            int[] preSolution = { 223, 104, 105 };
            var testCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            var testCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            var solution = ListNodeBuilder.CollectionToListNode(preSolution);
            Test(testCase1, testCase2, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] preTestCase1 = { 0 };
            int[] preTestCase2 = { 0 };
            int[] preSolution = { 0 };
            var testCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            var testCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            var solution = ListNodeBuilder.CollectionToListNode(preSolution);
            Test(testCase1, testCase2, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] preTestCase1 = { 1234, 1234, 0 };
            int[] preTestCase2 = { 0 };
            int[] preSolution = { 1234, 1234, 0 };
            var testCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            var testCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            var solution = ListNodeBuilder.CollectionToListNode(preSolution);
            Test(testCase1, testCase2, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] preTestCase1 = { 0 };
            int[] preTestCase2 = { 1234, 123, 0 };
            int[] preSolution = { 1234, 123, 0 };
            var testCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            var testCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            var solution = ListNodeBuilder.CollectionToListNode(preSolution);
            Test(testCase1, testCase2, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[] preTestCase1 = { 1 };
            int[] preTestCase2 = { 9998, 9999, 9999, 9999, 9999, 9999 };
            int[] preSolution = { 9999, 0, 0, 0, 0, 0 };
            var testCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            var testCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            var solution = ListNodeBuilder.CollectionToListNode(preSolution);
            Test(testCase1, testCase2, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[] preTestCase1 = { 1 };
            int[] preTestCase2 = { 9999, 9999, 9999, 9999, 9999, 9999 };
            int[] preSolution = { 1, 0, 0, 0, 0, 0, 0 };
            var testCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            var testCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            var solution = ListNodeBuilder.CollectionToListNode(preSolution);
            Test(testCase1, testCase2, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            int[] preTestCase1 = { 8339, 4510 };
            int[] preTestCase2 = { 2309 };
            int[] preSolution = { 8339, 6819 };
            ListNode<int> testCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            ListNode<int> testCase2 = ListNodeBuilder.CollectionToListNode(preTestCase2);
            ListNode<int> solution = ListNodeBuilder.CollectionToListNode(preSolution);
            Test(testCase1, testCase2, solution);
        }//public void Test8() {

        private void Test(ListNode<int> testCase1, ListNode<int> testCase2, ListNode<int> solution) {
            ListNode<int> Actual = new AddTwoHugeNumbers().addTwoHugeNumbers(testCase1, testCase2);
            while (solution != null && Actual != null) {
                Assert.AreEqual(solution.value, Actual.value);
                solution = solution.next;
                Actual = Actual.next;
            }//while(Actual!=null){
            Assert.IsTrue(solution == null && Actual == null);
        }//private void Test(ListNode<int> testCase1, ListNode<int> testCase2, ListNode<int> solution) {
    }//public class AddTwoHugeNumbersTests {
}//namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._1_Linked_Lists {
