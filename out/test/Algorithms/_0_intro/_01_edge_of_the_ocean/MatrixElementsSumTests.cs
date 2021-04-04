using Algorithms.src._0_intro._01_edge_of_the_ocean;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._01_edge_of_the_ocean {
    [TestClass()]
    public class MatrixElementsSumTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[][] testCase = {new int[]{ 0, 1, 1, 2 }, new int[]{ 0, 5, 0, 0 }, new int[]{ 2, 0, 3, 3 } };
            var solution = 9;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[][] testCase = {new int[]{ 1, 1, 1, 0 }, new int[]{ 0, 5, 0, 1 }, new int[]{ 2, 1, 3, 10 } };
            var solution = 9;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[][] testCase = {new int[]{ 1, 1, 1 }, new int[]{ 2, 2, 2 }, new int[]{ 3, 3, 3 } };
            var solution = 18;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[][] testCase = {new int[]{ 0 } };
            var solution = 0;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[][] testCase = {new int[]{ 1, 0, 3 }, new int[]{ 0, 2, 1 }, new int[]{ 1, 2, 0 } };
            var solution = 5;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[][] testCase = {new int[]{ 1 }, new int[]{ 5 }, new int[]{ 0 }, new int[]{ 2 } };
            var solution = 6;
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[][] testCase = {new int[]{ 1, 2, 3, 4, 5 } };
            var solution = 15;
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            int[][] testCase = {new int[]{ 2 }, new int[]{ 5 }, new int[]{ 10 } };
            var solution = 17;
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            int[][] testCase = {new int[]{ 4, 0, 1 }, new int[]{ 10, 7, 0 }, new int[]{ 0, 0, 0 }, new int[]{ 9, 1, 2 } };
            var solution = 15;
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            int[][] testCase = {new int[]{ 1 } };
            var solution = 1;
            Test(testCase, solution);
        }//public void Test10() {

        private void Test(int[][] testCase, int solution) {
            Assert.AreEqual(solution, new MatrixElementsSum().matrixElementsSum(testCase));
        }//private void Test(int[][] testCase,int solution) {
    }//public class MatrixElementsSumTests {
}//namespace Algorithms.src_UnitTests._0_intro._01_edge_of_the_ocean {
