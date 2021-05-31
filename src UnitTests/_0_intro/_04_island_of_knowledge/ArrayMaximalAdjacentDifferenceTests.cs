using Algorithms.src._0_intro._04_island_of_knowledge;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._04_island_of_knowledge {
    [TestClass()]
    public class ArrayMaximalAdjacentDifferenceTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] testCase = { 2, 4, 1, 0 };
            var solution = 3;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] testCase = { 1, 1, 1, 1 };
            var solution = 0;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] testCase = { -1, 4, 10, 3, -2 };
            var solution = 7;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] testCase = { 10, 11, 13 };
            var solution = 2;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] testCase = { -2, -2, -2, -2, -2 };
            var solution = 0;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[] testCase = { -1, 1, -3, -4 };
            var solution = 4;
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[] testCase = { -14, 15, -15 };
            var solution = 30;
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            int[] testCase = { 1, 5, 9, -3, 7, 1, 10 };
            var solution = 12;
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            int[] testCase = { 10, 7, -2, -5, -15 };
            var solution = 10;
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            int[] testCase = { 0, 15, -10 };
            var solution = 25;
            Test(testCase, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            int[] testCase = { -1, 1, -1, 1, -4, 4, 3, -3, 3, -3 };
            var solution = 8;
            Test(testCase, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            int[] testCase = { 0, 10, 2, -1 };
            var solution = 10;
            Test(testCase, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            int[] testCase = { 2, 2, 2, 2 };
            var solution = 0;
            Test(testCase, solution);
        }//public void Test13() {

        private void Test(int[] testCase, int solution) {
            Assert.AreEqual(solution, new ArrayMaximalAdjacentDifference().arrayMaximalAdjacentDifference(testCase));
        }//private void Test(int[] testCase,var solution) {
    }//public class ArrayMaximalAdjacentDifferenceTests {
}//namespace Algorithms.src_UnitTests._0_intro._04_island_of_knowledge {
