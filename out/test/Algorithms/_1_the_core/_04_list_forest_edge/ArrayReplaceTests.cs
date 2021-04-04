using Algorithms.src._1_the_core._04_list_forest_edge;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._04_list_forest_edge {
    [TestClass()]
    public class ArrayReplaceTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] testCase1 = { 1, 2, 1 };
            var testCase2 = 1;
            var testCase3 = 3;
            int[] solution = { 3, 2, 3 };
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] testCase1 = { 1, 2, 3, 4, 5 };
            var testCase2 = 3;
            var testCase3 = 0;
            int[] solution = { 1, 2, 0, 4, 5 };
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] testCase1 = { 1, 1, 1 };
            var testCase2 = 1;
            var testCase3 = 10;
            int[] solution = { 10, 10, 10 };
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] testCase1 = { 1, 2, 1, 2, 1 };
            var testCase2 = 2;
            var testCase3 = 1;
            int[] solution = { 1, 1, 1, 1, 1 };
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] testCase1 = { 1, 2, 1, 2, 1 };
            var testCase2 = 2;
            var testCase3 = 2;
            int[] solution = { 1, 2, 1, 2, 1 };
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[] testCase1 = { 3, 1 };
            var testCase2 = 3;
            var testCase3 = 9;
            int[] solution = { 9, 1 };
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[] testCase1 = { 10, 10 };
            var testCase2 = 0;
            var testCase3 = 9;
            int[] solution = { 10, 10 };
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            int[] testCase1 = { 2, 1 };
            var testCase2 = 3;
            var testCase3 = 9;
            int[] solution = { 2, 1 };
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test8() {

        private void Test(int[] testCase1, int testCase2, int testCase3, int[] solution) {
            CollectionAssert.AreEqual(solution, new ArrayReplace().arrayReplace(testCase1, testCase2, testCase3));
        }//private void Test(int[] testCase1,int testCase2,int testCase3,int[] solution) {
    }//public class ArrayReplaceTests {
}//namespace Algorithms.src_UnitTests._1_the_core._04_list_forest_edge {
