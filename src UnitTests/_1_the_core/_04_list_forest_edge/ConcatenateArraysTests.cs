using Algorithms.src._1_the_core._04_list_forest_edge;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._04_list_forest_edge {
    [TestClass()]
    public class ConcatenateArraysTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] testCase1 = { 2, 2, 1 };
            int[] testCase2 = { 10, 11 };
            int[] solution = { 2, 2, 1, 10, 11 };
            Test(testCase1, testCase2, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] testCase1 = { 1, 2 };
            int[] testCase2 = { 3, 1, 2 };
            int[] solution = { 1, 2, 3, 1, 2 };
            Test(testCase1, testCase2, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] testCase1 = { 1 };
            int[] testCase2 = { };
            int[] solution = { 1 };
            Test(testCase1, testCase2, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] testCase1 = { 2, 10, 3, 9, 5, 11, 11 };
            int[] testCase2 = { 4, 8, 1, 13, 3, 1, 14};
            int[] solution = { 2, 10, 3, 9, 5, 11, 11, 4, 8, 1, 13, 3, 1, 14 };
            Test(testCase1, testCase2, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] testCase1 = { 9, 6, 6, 9, 8, 14 };
            int[] testCase2 = { 3, 2, 2, 5, 3, 11, 12, 9, 7, 7 };
            int[] solution = { 9, 6, 6, 9, 8, 14, 3, 2, 2, 5, 3, 11, 12, 9, 7, 7 };
            Test(testCase1, testCase2, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[] testCase1 = { 11, 13, 10 };
            int[] testCase2 = { 8 };
            int[] solution = { 11, 13, 10, 8 };
            Test(testCase1, testCase2, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[] testCase1 = { 1, 5, 4, 3 };
            int[] testCase2 = { 9 };
            int[] solution = { 1, 5, 4, 3, 9 };
            Test(testCase1, testCase2, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            int[] testCase1 = { 15, 9, 11, 4, 12, 3, 2, 14, 6, 4 };
            int[] testCase2 = { 4, 12, 1, 13, 15 };
            int[] solution = { 15, 9, 11, 4, 12, 3, 2, 14, 6, 4, 4, 12, 1, 13, 15 };
            Test(testCase1, testCase2, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            int[] testCase1 = { 10, 7, 8 };
            int[] testCase2 = { 1 };
            int[] solution = { 10, 7, 8, 1 };
            Test(testCase1, testCase2, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            int[] testCase1 = { 7, 10, 1, 11, 8, 8, 11, 5, 7, 9 };
            int[] testCase2 = { 8, 2, 13, 15, 5, 11, 10, 6, 14, 2 };
            int[] solution = { 7, 10, 1, 11, 8, 8, 11, 5, 7, 9, 8, 2, 13, 15, 5, 11, 10, 6, 14, 2 };
            Test(testCase1, testCase2, solution);
        }//public void Test10() {

        private void Test(int[] testCase1, int[] testCase2, int[] solution) {
            CollectionAssert.AreEqual(solution, new ConcatenateArrays().concatenateArrays(testCase1, testCase2));
        }//private void Test(int[] testCase,int[] solution) {
    }//public class ConcatenateArraysTests {
}//namespace Algorithms.src_UnitTests._1_the_core._04_list_forest_edge {