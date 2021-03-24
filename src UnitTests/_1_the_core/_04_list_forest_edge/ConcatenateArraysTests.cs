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

        private void Test(int[] testCase1, int[] testCase2, int[] solution) {
            CollectionAssert.AreEqual(solution, new ConcatenateArrays().concatenateArrays(testCase1, testCase2));
        }//private void Test(int[] testCase,int[] solution) {
    }//public class ConcatenateArraysTests {
}//namespace Algorithms.src_UnitTests._1_the_core._04_list_forest_edge {