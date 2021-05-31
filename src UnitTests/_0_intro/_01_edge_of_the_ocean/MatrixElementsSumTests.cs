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
            int[][] testCase = { new int[] { 1 } };
            var solution = 1;
            Test(testCase, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            int[][] testCase = { new int[] { 2, 4, 0 } };
            var solution = 6;
            Test(testCase, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            int[][] testCase = { new int[] { 7, 0, 0 }, new int[] { 9, 0, 0 }, new int[] { 5, 9, 0 }, new int[] { 0, 0, 0 } };
            var solution = 21;
            Test(testCase, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            int[][] testCase = { new int[] { 9, 2 }, new int[] { 9, 1 } };
            var solution = 21;
            Test(testCase, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            int[][] testCase = { new int[] { 0, 3, 0, 9, 6 } };
            var solution = 18;
            Test(testCase, solution);
        }//public void Test14() {

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            int[][] testCase = { new int[] { 1, 0 }, new int[] { 0, 0 }, new int[] { 0, 8 }, new int[] { 9, 8 } };
            var solution = 1;
            Test(testCase, solution);
        }//public void Test15() {

        [TestMethod(), Timeout(timeout)]
        public void Test16() {
            int[][] testCase = { new int[] { 4, 0, 0, 0 }, new int[] { 8, 4, 0, 1 }, new int[] { 5, 0, 0, 4 }, new int[] { 0, 0, 1, 2 } };
            var solution = 17;
            Test(testCase, solution);
        }//public void Test16() {

        [TestMethod(), Timeout(timeout)]
        public void Test17() {
            int[][] testCase = { new int[] { 4 }, new int[] { 0 }, new int[] { 0 }, new int[] { 7 } };
            var solution = 4;
            Test(testCase, solution);
        }//public void Test17() {

        [TestMethod(), Timeout(timeout)]
        public void Test18() {
            int[][] testCase = { new int[] { 3, 9 }, new int[] { 10, 0 }, new int[] { 0, 0 }, new int[] { 3, 4 } };
            var solution = 22;
            Test(testCase, solution);
        }//public void Test18() {

        [TestMethod(), Timeout(timeout)]
        public void Test19() {
            int[][] testCase = { new int[] { 0 }, new int[] { 0 }, new int[] { 0 }, new int[] { 9 } };
            var solution = 0;
            Test(testCase, solution);
        }//public void Test19() {

        [TestMethod(), Timeout(timeout)]
        public void Test20() {
            int[][] testCase = { new int[] { 2, 7 }, new int[] { 0, 2 }, new int[] { 0, 1 } };
            var solution = 12;
            Test(testCase, solution);
        }//public void Test20() {

        private void Test(int[][] testCase, int solution) {
            Assert.AreEqual(solution, new MatrixElementsSum().matrixElementsSum(testCase));
        }//private void Test(int[][] testCase,int solution) {
    }//public class MatrixElementsSumTests {
}//namespace Algorithms.src_UnitTests._0_intro._01_edge_of_the_ocean {
