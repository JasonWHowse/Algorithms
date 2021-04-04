using Algorithms.src._1_the_core._04_list_forest_edge;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._04_list_forest_edge {
    [TestClass()]
    public class ReplaceMiddleTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] testCase = { 7, 2, 2, 5, 10, 7 };
            int[] solution = { 7, 2, 7, 10, 7 };
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] testCase = { -5, -5, 10 };
            int[] solution = { -5, -5, 10 };
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] testCase = { 45, 23, 12, 33, 12, 453, -234, -45 };
            int[] solution = { 45, 23, 12, 45, 453, -234, -45 };
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] testCase = { 2, 8 };
            int[] solution = { 10 };
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] testCase = { -12, 34, 40, -5, -12, 4, 0, 0, -12 };
            int[] solution = { -12, 34, 40, -5, -12, 4, 0, 0, -12 };
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[] testCase = { 9, 0, 15, 9 };
            int[] solution = { 9, 15, 9 };
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[] testCase = { -6, 6, -6 };
            int[] solution = { -6, 6, -6 };
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            int[] testCase = { 26, 26, -17 };
            int[] solution = { 26, 26, -17 };
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            int[] testCase = { -7, 5, 5, 10 };
            int[] solution = { -7, 10, 10 };
            Test(testCase, solution);
        }//public void Test9() {

        private void Test(int[] testCase, int[] solution) {
            CollectionAssert.AreEqual(solution, new ReplaceMiddle().replaceMiddle(testCase));
        }//private void Test(int[] testCase,int[] solution) {
    }//public class ReplaceMiddleTests {
}//namespace Algorithms.src_UnitTests._1_the_core._04_list_forest_edge {
