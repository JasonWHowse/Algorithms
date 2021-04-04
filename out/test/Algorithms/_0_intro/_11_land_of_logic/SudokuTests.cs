using Algorithms.src._0_intro._11_land_of_logic;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._11_land_of_logic {
    [TestClass()]
    public class SudokuTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[][] testCase = { new int[] { 1, 3, 2, 5, 4, 6, 9, 8, 7 }, new int[] { 4, 6, 5, 8, 7, 9, 3, 2, 1 }, new int[] { 7, 9, 8, 2, 1, 3, 6, 5, 4 }, new int[] { 9, 2, 1, 4, 3, 5, 8, 7, 6 }, new int[] { 3, 5, 4, 7, 6, 8, 2, 1, 9 }, new int[] { 6, 8, 7, 1, 9, 2, 5, 4, 3 }, new int[] { 5, 7, 6, 9, 8, 1, 4, 3, 2 }, new int[] { 2, 4, 3, 6, 5, 7, 1, 9, 8 }, new int[] { 8, 1, 9, 3, 2, 4, 7, 6, 5 } };
            var solution = true;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[][] testCase = { new int[] { 1, 3, 2, 5, 4, 6, 9, 2, 7 }, new int[] { 4, 6, 5, 8, 7, 9, 3, 8, 1 }, new int[] { 7, 9, 8, 2, 1, 3, 6, 5, 4 }, new int[] { 9, 2, 1, 4, 3, 5, 8, 7, 6 }, new int[] { 3, 5, 4, 7, 6, 8, 2, 1, 9 }, new int[] { 6, 8, 7, 1, 9, 2, 5, 4, 3 }, new int[] { 5, 7, 6, 9, 8, 1, 4, 3, 2 }, new int[] { 2, 4, 3, 6, 5, 7, 1, 9, 8 }, new int[] { 8, 1, 9, 3, 2, 4, 7, 6, 5 } };
            var solution = false;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[][] testCase = { new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 } };
            var solution = false;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[][] testCase = { new int[] { 1, 3, 4, 2, 5, 6, 9, 8, 7 }, new int[] { 4, 6, 8, 5, 7, 9, 3, 2, 1 }, new int[] { 7, 9, 2, 8, 1, 3, 6, 5, 4 }, new int[] { 9, 2, 3, 1, 4, 5, 8, 7, 6 }, new int[] { 3, 5, 7, 4, 6, 8, 2, 1, 9 }, new int[] { 6, 8, 1, 7, 9, 2, 5, 4, 3 }, new int[] { 5, 7, 6, 9, 8, 1, 4, 3, 2 }, new int[] { 2, 4, 5, 6, 3, 7, 1, 9, 8 }, new int[] { 8, 1, 9, 3, 2, 4, 7, 6, 5 } };
            var solution = false;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[][] testCase = { new int[] { 1, 3, 2, 5, 4, 6, 9, 8, 7 }, new int[] { 4, 6, 5, 8, 7, 9, 3, 2, 1 }, new int[] { 7, 9, 8, 2, 1, 3, 6, 5, 4 }, new int[] { 9, 2, 1, 4, 3, 5, 8, 7, 6 }, new int[] { 3, 5, 4, 7, 6, 8, 2, 1, 9 }, new int[] { 6, 8, 7, 1, 9, 2, 5, 4, 3 }, new int[] { 5, 4, 6, 9, 8, 1, 4, 3, 2 }, new int[] { 2, 7, 3, 6, 5, 7, 1, 9, 8 }, new int[] { 8, 1, 9, 3, 2, 4, 7, 6, 5 } };
            var solution = false;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[][] testCase = { new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, new int[] { 4, 6, 5, 8, 7, 9, 3, 2, 1 }, new int[] { 7, 9, 8, 2, 1, 3, 6, 5, 4 }, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, new int[] { 4, 6, 5, 8, 7, 9, 3, 2, 1 }, new int[] { 7, 9, 8, 2, 1, 3, 6, 5, 4 }, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, new int[] { 4, 6, 5, 8, 7, 9, 3, 2, 1 }, new int[] { 7, 9, 8, 2, 1, 3, 6, 5, 4 } };
            var solution = false;
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[][] testCase = { new int[] { 5, 3, 4, 6, 7, 8, 9, 1, 2 }, new int[] { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, new int[] { 1, 9, 8, 3, 4, 2, 5, 6, 7 }, new int[] { 8, 5, 9, 9, 6, 1, 4, 2, 3 }, new int[] { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, new int[] { 7, 1, 3, 7, 2, 4, 8, 5, 6 }, new int[] { 9, 6, 1, 5, 3, 7, 2, 8, 4 }, new int[] { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, new int[] { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };
            var solution = false;
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            int[][] testCase = { new int[] { 5, 5, 5, 5, 5, 5, 5, 5, 5 }, new int[] { 5, 5, 5, 5, 5, 5, 5, 5, 5 }, new int[] { 5, 5, 5, 5, 5, 5, 5, 5, 5 }, new int[] { 5, 5, 5, 5, 5, 5, 5, 5, 5 }, new int[] { 5, 5, 5, 5, 5, 5, 5, 5, 5 }, new int[] { 5, 5, 5, 5, 5, 5, 5, 5, 5 }, new int[] { 5, 5, 5, 5, 5, 5, 5, 5, 5 }, new int[] { 5, 5, 5, 5, 5, 5, 5, 5, 5 }, new int[] { 5, 5, 5, 5, 5, 5, 5, 5, 5 } };
            var solution = false;
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            int[][] testCase = { new int[] { 5, 3, 4, 6, 7, 8, 9, 1, 2 }, new int[] { 6, 7, 2, 3, 9, 5, 3, 4, 8 }, new int[] { 1, 9, 8, 1, 4, 2, 5, 6, 7 }, new int[] { 8, 5, 9, 7, 6, 1, 4, 2, 3 }, new int[] { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, new int[] { 7, 1, 3, 9, 2, 4, 8, 5, 6 }, new int[] { 9, 6, 1, 5, 3, 7, 2, 8, 4 }, new int[] { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, new int[] { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };
            var solution = false;
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            int[][] testCase = { new int[] { 5, 3, 4, 6, 7, 8, 9, 1, 2 }, new int[] { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, new int[] { 1, 9, 8, 3, 4, 2, 5, 6, 7 }, new int[] { 8, 5, 9, 7, 6, 1, 4, 2, 3 }, new int[] { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, new int[] { 7, 1, 3, 9, 2, 4, 8, 5, 6 }, new int[] { 9, 6, 1, 5, 3, 7, 2, 8, 4 }, new int[] { 2, 5, 7, 4, 1, 9, 6, 3, 5 }, new int[] { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };
            var solution = false;
            Test(testCase, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            int[][] testCase = { new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, new int[] { 4, 5, 6, 7, 8, 9, 1, 2, 3 }, new int[] { 7, 8, 9, 1, 2, 3, 4, 5, 6 }, new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 1 }, new int[] { 3, 4, 5, 6, 7, 8, 9, 1, 2 }, new int[] { 5, 6, 7, 8, 9, 1, 2, 3, 4 }, new int[] { 6, 7, 8, 9, 1, 2, 3, 4, 5 }, new int[] { 8, 9, 1, 2, 3, 4, 5, 6, 7 }, new int[] { 9, 1, 2, 3, 4, 5, 6, 7, 8 } };
            var solution = false;
            Test(testCase, solution);
        }//public void Test11() {

        private void Test(int[][] testCase, bool solution) {
            Assert.AreEqual(solution, new Sudoku().sudoku(testCase));
        }//private void Test(int[][] testCase,bool solution) {
    }//public class SudokuTests {
}//namespace Algorithms.src_UnitTests._0_intro._11_land_of_logic {