using Algorithms.src._1_the_core._04_list_forest_edge;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._04_list_forest_edge {
    [TestClass()]
    public class IsSmoothTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] testCase = { 7, 2, 2, 5, 10, 7 };
            var solution = true;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] testCase = { -5, -5, 10 };
            var solution = false;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] testCase = { 4, 2 };
            var solution = false;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] testCase = { 45, 23, 12, 33, 12, 453, -234, -45 };
            var solution = false;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] testCase = { -12, 34, 40, -5, -12, 4, 0, 0, -12 };
            var solution = true;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[] testCase = { 9, 0, 15, 9 };
            var solution = false;
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[] testCase = { -6, 6, -6 };
            var solution = false;
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            int[] testCase = { 26, 26, -17 };
            var solution = false;
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            int[] testCase = { -7, 5, 5, 10 };
            var solution = false;
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            int[] testCase = { 3, 4, 5 };
            var solution = false;
            Test(testCase, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            int[] testCase = { -5, 3, -1, 9 };
            var solution = false;
            Test(testCase, solution);
        }//public void Test11() {

        private void Test(int[] testCase, bool solution) {
            if (solution) {
                Assert.IsTrue(new IsSmooth().isSmooth(testCase));
            } else {//if (solution) {
                Assert.IsFalse(new IsSmooth().isSmooth(testCase));
            }//else {
        }//private void Test(int[] testCase,bool solution) {
    }//public class IsSmoothTests {
}//namespace Algorithms.src_UnitTests._1_the_core._04_list_forest_edge {
