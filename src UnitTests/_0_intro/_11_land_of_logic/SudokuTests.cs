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

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            int[][] testCase = { new int[] { 2, 9, 3, 4, 1, 6, 5, 7, 8 }, new int[] { 4, 6, 1, 7, 5, 8, 3, 9, 2 }, new int[] { 5, 8, 7, 9, 2, 3, 6, 1, 4 }, new int[] { 2, 9, 3, 4, 1, 6, 5, 7, 8 }, new int[] { 4, 6, 1, 7, 5, 8, 3, 9, 2 }, new int[] { 5, 8, 7, 9, 2, 3, 6, 1, 4 }, new int[] { 2, 9, 3, 4, 1, 6, 5, 7, 8 }, new int[] { 4, 6, 1, 7, 5, 8, 3, 9, 2 }, new int[] { 5, 8, 7, 9, 2, 3, 6, 1, 4 } };
            var solution = false;
            Test(testCase, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            int[][] testCase = { new int[] { 5, 3, 4, 6, 7, 8, 9, 1, 2 }, new int[] { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, new int[] { 1, 9, 8, 3, 4, 2, 5, 6, 7 }, new int[] { 8, 5, 9, 7, 6, 1, 4, 2, 3 }, new int[] { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, new int[] { 7, 1, 3, 9, 2, 4, 8, 5, 6 }, new int[] { 9, 6, 1, 5, 3, 7, 2, 8, 4 }, new int[] { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, new int[] { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };
            var solution = true;
            Test(testCase, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            int[][] testCase = { new int[] { 1, 2, 3, 1, 2, 3, 1, 2, 9 }, new int[] { 2, 3, 4, 2, 3, 4, 2, 3, 1 }, new int[] { 3, 4, 5, 3, 4, 5, 3, 4, 2 }, new int[] { 4, 5, 6, 4, 5, 6, 4, 5, 3 }, new int[] { 5, 6, 7, 5, 6, 7, 5, 6, 4 }, new int[] { 6, 7, 8, 6, 7, 8, 6, 7, 5 }, new int[] { 7, 8, 9, 7, 8, 9, 7, 8, 6 }, new int[] { 8, 9, 1, 8, 9, 1, 8, 9, 7 }, new int[] { 9, 1, 2, 9, 1, 2, 9, 1, 8 } };
            var solution = false;
            Test(testCase, solution);
        }//public void Test14() {

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            int[][] testCase = { new int[] { 2, 3, 4, 5, 6, 2, 3, 4, 1 }, new int[] { 3, 4, 5, 6, 7, 3, 4, 5, 2 }, new int[] { 4, 5, 6, 7, 8, 4, 5, 6, 3 }, new int[] { 5, 6, 7, 8, 9, 5, 6, 7, 4 }, new int[] { 6, 7, 8, 9, 1, 6, 7, 8, 5 }, new int[] { 7, 8, 9, 1, 2, 7, 8, 9, 6 }, new int[] { 8, 9, 1, 2, 3, 8, 9, 1, 7 }, new int[] { 9, 1, 2, 3, 4, 9, 1, 2, 8 }, new int[] { 1, 2, 3, 4, 5, 1, 2, 3, 9 } };
            var solution = false;
            Test(testCase, solution);
        }//public void Test15() {

        [TestMethod(), Timeout(timeout)]
        public void Test16() {
            int[][] testCase = { new int[] { 3, 1, 6, 5, 7, 8, 4, 9, 2 }, new int[] { 5, 2, 9, 1, 3, 4, 7, 6, 8 }, new int[] { 4, 8, 7, 6, 2, 9, 5, 3, 1 }, new int[] { 2, 6, 3, 4, 1, 5, 9, 8, 7 }, new int[] { 9, 7, 4, 8, 6, 3, 1, 2, 5 }, new int[] { 8, 5, 1, 7, 9, 2, 6, 4, 3 }, new int[] { 1, 3, 8, 9, 4, 7, 2, 5, 6 }, new int[] { 6, 9, 2, 3, 5, 1, 8, 7, 4 }, new int[] { 7, 4, 5, 2, 8, 6, 3, 1, 9 } };
            var solution = true;
            Test(testCase, solution);
        }//public void Test16() {

        [TestMethod(), Timeout(timeout)]
        public void Test17() {
            int[][] testCase = { new int[] { 5, 5, 5, 3, 5, 7, 5, 4, 6 }, new int[] { 5, 5, 5, 5, 5, 5, 6, 5, 4 }, new int[] { 5, 5, 5, 7, 5, 3, 4, 6, 5 }, new int[] { 5, 5, 5, 5, 5, 5, 5, 5, 5 }, new int[] { 5, 5, 5, 5, 5, 5, 5, 5, 5 }, new int[] { 5, 5, 5, 5, 5, 5, 5, 5, 5 }, new int[] { 3, 6, 6, 5, 5, 5, 5, 5, 5 }, new int[] { 6, 3, 6, 5, 5, 5, 5, 5, 5 }, new int[] { 6, 6, 3, 5, 5, 5, 5, 5, 5 } };
            var solution = false;
            Test(testCase, solution);
        }//public void Test17() {

        [TestMethod(), Timeout(timeout)]
        public void Test18() {
            int[][] testCase = { new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 1 }, new int[] { 3, 4, 5, 6, 7, 8, 9, 1, 2 }, new int[] { 4, 5, 6, 7, 8, 9, 1, 2, 3 }, new int[] { 5, 6, 7, 8, 9, 1, 2, 3, 4 }, new int[] { 6, 7, 8, 9, 1, 2, 3, 4, 5 }, new int[] { 7, 8, 9, 1, 2, 3, 4, 5, 6 }, new int[] { 8, 9, 1, 2, 3, 4, 5, 6, 7 }, new int[] { 9, 1, 2, 3, 4, 5, 6, 7, 8 } };
            var solution = false;
            Test(testCase, solution);
        }//public void Test18() {

        [TestMethod(), Timeout(timeout)]
        public void Test19() {
            int[][] testCase = { new int[] { 3, 5, 7, 9, 2, 4, 6, 8, 1 }, new int[] { 5, 7, 9, 2, 4, 6, 8, 1, 3 }, new int[] { 7, 9, 2, 4, 6, 8, 1, 3, 5 }, new int[] { 9, 2, 4, 6, 8, 1, 3, 5, 7 }, new int[] { 2, 4, 6, 8, 1, 3, 5, 7, 9 }, new int[] { 4, 6, 8, 1, 3, 5, 7, 9, 2 }, new int[] { 6, 8, 1, 3, 5, 7, 9, 2, 4 }, new int[] { 8, 1, 3, 5, 7, 9, 2, 4, 6 }, new int[] { 1, 3, 5, 7, 9, 2, 4, 6, 8 } };
            var solution = false;
            Test(testCase, solution);
        }//public void Test19() {

        [TestMethod(), Timeout(timeout)]
        public void Test20() {
            int[][] testCase = { new int[] { 2, 4, 6, 8, 1, 3, 5, 7, 1 }, new int[] { 3, 5, 7, 9, 2, 4, 6, 8, 3 }, new int[] { 4, 6, 8, 1, 3, 5, 7, 9, 5 }, new int[] { 5, 7, 9, 2, 4, 6, 8, 1, 7 }, new int[] { 6, 8, 1, 3, 5, 7, 9, 2, 9 }, new int[] { 7, 9, 2, 4, 6, 8, 1, 3, 2 }, new int[] { 8, 1, 3, 5, 7, 9, 2, 4, 4 }, new int[] { 9, 2, 4, 6, 8, 1, 3, 5, 6 }, new int[] { 1, 3, 5, 7, 9, 2, 4, 6, 8 } };
            var solution = false;
            Test(testCase, solution);
        }//public void Test20() {

        [TestMethod(), Timeout(timeout)]
        public void Test21() {
            int[][] testCase = { new int[] { 8, 1, 2, 7, 5, 3, 6, 4, 9 }, new int[] { 9, 4, 3, 6, 8, 2, 1, 7, 5 }, new int[] { 6, 7, 5, 4, 9, 1, 2, 8, 3 }, new int[] { 1, 5, 4, 2, 3, 7, 8, 9, 6 }, new int[] { 3, 6, 9, 8, 4, 5, 7, 2, 1 }, new int[] { 2, 8, 7, 1, 6, 9, 5, 3, 4 }, new int[] { 5, 2, 1, 9, 7, 4, 3, 6, 8 }, new int[] { 4, 3, 8, 5, 2, 6, 8, 1, 7 }, new int[] { 7, 9, 6, 3, 1, 8, 4, 5, 2 } };
            var solution = false;
            Test(testCase, solution);
        }//public void Test21() {

        private void Test(int[][] testCase, bool solution) {
            Assert.AreEqual(solution, new Sudoku().sudoku(testCase));
        }//private void Test(int[][] testCase,bool solution) {
    }//public class SudokuTests {
}//namespace Algorithms.src_UnitTests._0_intro._11_land_of_logic {