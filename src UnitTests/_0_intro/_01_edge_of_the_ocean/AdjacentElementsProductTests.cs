using Algorithms.src._0_intro._01_edge_of_the_ocean;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._01_edge_of_the_ocean {
    [TestClass()]
    public class AdjacentElementsProductTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void test1() {
            int[] testCase = { 3, 6, -2, -5, 7, 3 };
            var solution = 21;
            test(testCase, solution);
        }//public void test1() {

        [TestMethod(), Timeout(timeout)]
        public void test2() {
            int[] testCase = { -1, -2 };
            var solution = 2;
            test(testCase, solution);
        }//public void test2() {

        [TestMethod(), Timeout(timeout)]
        public void test3() {
            int[] testCase = { 5, 1, 2, 3, 1, 4 };
            var solution = 6;
            test(testCase, solution);
        }//public void test3() {

        [TestMethod(), Timeout(timeout)]
        public void test4() {
            int[] testCase = { 1, 2, 3, 0 };
            var solution = 6;
            test(testCase, solution);
        }//public void test4() {

        [TestMethod(), Timeout(timeout)]
        public void test5() {
            int[] testCase = { 9, 5, 10, 2, 24, -1, -48 };
            var solution = 50;
            test(testCase, solution);
        }//public void test5() {

        [TestMethod(), Timeout(timeout)]
        public void test6() {
            int[] testCase = { 5, 6, -4, 2, 3, 2, -23 };
            var solution = 30;
            test(testCase, solution);
        }//public void test6() {

        [TestMethod(), Timeout(timeout)]
        public void test7() {
            int[] testCase = { 4, 1, 2, 3, 1, 5 };
            var solution = 6;
            test(testCase, solution);
        }//public void test7() {

        [TestMethod(), Timeout(timeout)]
        public void test8() {
            int[] testCase = { -23, 4, -3, 8, -12 };
            var solution = -12;
            test(testCase, solution);
        }//public void test8() {

        [TestMethod(), Timeout(timeout)]
        public void test9() {
            int[] testCase = { 1, 0, 1, 0, 1000 };
            var solution = 0;
            test(testCase, solution);
        }//public void test9() {

        private void test(int[] testCase ,int solution) {
            Assert.AreEqual(solution,new AdjacentElementsProduct().adjacentElementsProduct(testCase));
        }//private void test(int[] testCase ,int solution) {
    }//public class AdjacentElementsProductTests {
}//namespace Algorithms.src_UnitTests._0_intro._01_edge_of_the_ocean {
