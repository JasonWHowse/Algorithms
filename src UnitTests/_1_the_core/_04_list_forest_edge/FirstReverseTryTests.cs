using Algorithms.src._1_the_core._04_list_forest_edge;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._04_list_forest_edge {
    [TestClass()]
    public class FirstReverseTryTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] testCase = { 1, 2, 3, 4, 5 };
            int[] solution = { 5, 2, 3, 4, 1 };
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] testCase = { };
            int[] solution = { };
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] testCase = { 239 };
            int[] solution = { 239 };
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] testCase = { 23, 54, 12, 3, 4, 56, 23, 12, 5, 324 };
            int[] solution = { 324, 54, 12, 3, 4, 56, 23, 12, 5, 23 };
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] testCase = { -1, 1 };
            int[] solution = { 1, -1 };
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[] testCase = { 88, -101, -310, 818, 747, -888, -183, -687, -723, 188, -611, 677, -597, 293, -295, -162, -265, 368, 346, 81, -831, 198, -94, 685, -434, -241, -566, -397, 501, -183, 366, -669, 96, -592, 358, 598, 444, -929, 769, -361, -754, 218, -464, 332, 893, 422, -192, -287, -850, 543 };
            int[] solution = { 543, -101, -310, 818, 747, -888, -183, -687, -723, 188, -611, 677, -597, 293, -295, -162, -265, 368, 346, 81, -831, 198, -94, 685, -434, -241, -566, -397, 501, -183, 366, -669, 96, -592, 358, 598, 444, -929, 769, -361, -754, 218, -464, 332, 893, 422, -192, -287, -850, 88 };
            Test(testCase, solution);
        }//public void Test6() {

        private void Test(int[] testCase, int[] solution) {
            CollectionAssert.AreEqual(solution, new FirstReverseTry().firstReverseTry(testCase));
        }//private void Test(int[] testCase,int[] solution) {
    }//public class FirstReverseTryTests {
}//namespace Algorithms.src_UnitTests._1_the_core._04_list_forest_edge {