using Algorithms.src.helper_functions;
using Algorithms.src.interview_practice._0_Data_Structures._1_Linked_Lists;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._1_Linked_Lists {
    [TestClass()]
    public class RemoveKFromListTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] preTestCase1 = { 3, 1, 2, 3, 4, 5 };
            int[] preSolution = { 1, 2, 4, 5 };
            ListNode<int> testCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            int testCase2 = 3;
            ListNode<int> solution = ListNodeBuilder.CollectionToListNode(preSolution);
            Test(testCase1, testCase2, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] preTestCase1 = { 1, 2, 3, 4, 5, 6, 7 };
            int[] preSolution = { 1, 2, 3, 4, 5, 6, 7 };
            ListNode<int> testCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            int testCase2 = 10;
            ListNode<int> solution = ListNodeBuilder.CollectionToListNode(preSolution);
            Test(testCase1, testCase2, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] preTestCase1 = { 1000, 1000 };
            int[] preSolution = { };
            ListNode<int> testCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            int testCase2 = 1000;
            ListNode<int> solution = ListNodeBuilder.CollectionToListNode(preSolution);
            Test(testCase1, testCase2, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] preTestCase1 = { };
            int[] preSolution = { };
            ListNode<int> testCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            int testCase2 = -1000;
            ListNode<int> solution = ListNodeBuilder.CollectionToListNode(preSolution);
            Test(testCase1, testCase2, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] preTestCase1 = { 123, 456, 789, 0 };
            int[] preSolution = { 123, 456, 789 };
            ListNode<int> testCase1 = ListNodeBuilder.CollectionToListNode(preTestCase1);
            int testCase2 = 0;
            ListNode<int> solution = ListNodeBuilder.CollectionToListNode(preSolution);
            Test(testCase1, testCase2, solution);
        }//public void Test5() {

        private void Test(ListNode<int> testCase1, int testCase2, ListNode<int> solution) {
            ListNode<int> Actual = new RemoveKFromList().removeKFromList(testCase1, testCase2);
            while (solution != null && Actual != null) {
                Assert.AreEqual(solution.value, Actual.value);
                solution = solution.next;
                Actual = Actual.next;
            }//while(Actual!=null){
            Assert.IsTrue(solution==null && Actual==null);
        }//private void Test(ListNode<int> testCase1,int testCase2, ListNode<int> solution) {  
    }//public class RemoveKFromListTests {
}//namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._1_Linked_Lists {
