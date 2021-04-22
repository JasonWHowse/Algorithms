using Algorithms.src.interview_practice._0_Data_Structures._0_Arrays;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._0_Arrays {
    [TestClass()]
    public class Sudoku2Tests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            char[][] testCase = {
new char[]{'.','.','.','1','4','.','.','2','.'},
new char[]{'.','.','6','.','.','.','.','.','.'},
new char[]{'.','.','.','.','.','.','.','.','.'},
new char[]{'.','.','1','.','.','.','.','.','.'},
new char[]{'.','6','7','.','.','.','.','.','9'},
new char[]{'.','.','.','.','.','.','8','1','.'},
new char[]{'.','3','.','.','.','.','.','.','6'},
new char[]{'.','.','.','.','.','7','.','.','.'},
new char[]{'.','.','.','5','.','.','.','7','.'}};
            bool solution = true;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            char[][] testCase = {
new char[]{'.','.','.','.','2','.','.','9','.'},
new char[]{'.','.','.','.','6','.','.','.','.'},
new char[]{'7','1','.','.','7','5','.','.','.'},
new char[]{'.','7','.','.','.','.','.','.','.'},
new char[]{'.','.','.','.','8','3','.','.','.'},
new char[]{'.','.','8','.','.','7','.','6','.'},
new char[]{'.','.','.','.','.','2','.','.','.'},
new char[]{'.','1','.','2','.','.','.','.','.'},
new char[]{'.','2','.','.','3','.','.','.','.'}};
            bool solution = false;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            char[][] testCase = {
new char[]{'.','.','4','.','.','.','6','3','.'},
new char[]{'.','.','.','.','.','.','.','.','.'},
new char[]{'5','.','.','.','.','.','.','9','.'},
new char[]{'.','.','.','5','6','.','.','.','.'},
new char[]{'4','.','3','.','.','.','.','.','1'},
new char[]{'.','.','.','7','.','.','.','.','.'},
new char[]{'.','.','.','5','.','.','.','.','.'},
new char[]{'.','.','.','.','.','.','.','.','.'},
new char[]{'.','.','.','.','.','.','.','.','.'}};
            bool solution = false;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            char[][] testCase = {
new char[]{'.','.','.','.','.','.','.','.','2'},
new char[]{'.','.','.','.','.','.','6','.','.'},
new char[]{'.','.','1','4','.','.','8','.','.'},
new char[]{'.','.','.','.','.','.','.','.','.'},
new char[]{'.','.','.','.','.','.','.','.','.'},
new char[]{'.','.','.','.','3','.','.','.','.'},
new char[]{'5','.','8','6','.','.','.','.','.'},
new char[]{'.','9','.','.','.','.','4','.','.'},
new char[]{'.','.','.','.','5','.','.','.','.'}};
            bool solution = true;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            char[][] testCase = {
new char[]{'.','9','.','.','4','.','.','.','.'},
new char[]{'1','.','.','.','.','.','6','.','.'},
new char[]{'.','.','3','.','.','.','.','.','.'},
new char[]{'.','.','.','.','.','.','.','.','.'},
new char[]{'.','.','.','7','.','.','.','.','.'},
new char[]{'3','.','.','.','5','.','.','.','.'},
new char[]{'.','.','7','.','.','4','.','.','.'},
new char[]{'.','.','.','.','.','.','.','.','.'},
new char[]{'.','.','.','.','7','.','.','.','.'}};
            bool solution = true;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            char[][] testCase = {
new char[]{'7','.','.','.','4','.','.','.','.'},
new char[]{'.','.','.','8','6','5','.','.','.'},
new char[]{'.','1','.','2','.','.','.','.','.'},
new char[]{'.','.','.','.','.','9','.','.','.'},
new char[]{'.','.','.','.','5','.','5','.','.'},
new char[]{'.','.','.','.','.','.','.','.','.'},
new char[]{'.','.','.','.','.','.','2','.','.'},
new char[]{'.','.','.','.','.','.','.','.','.'},
new char[]{'.','.','.','.','.','.','.','.','.'}};
            bool solution = false;
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            char[][] testCase = {
new char[]{'.','4','.','.','.','.','.','.','.'},
new char[]{'.','.','4','.','.','.','.','.','.'},
new char[]{'.','.','.','1','.','.','7','.','.'},
new char[]{'.','.','.','.','.','.','.','.','.'},
new char[]{'.','.','.','3','.','.','.','6','.'},
new char[]{'.','.','.','.','.','6','.','9','.'},
new char[]{'.','.','.','.','1','.','.','.','.'},
new char[]{'.','.','.','.','.','.','2','.','.'},
new char[]{'.','.','.','8','.','.','.','.','.'}};
            bool solution = false;
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            char[][] testCase = {
new char[]{'.','.','5','.','.','.','.','.','.'},
new char[]{'.','.','.','8','.','.','.','3','.'},
new char[]{'.','5','.','.','2','.','.','.','.'},
new char[]{'.','.','.','.','.','.','.','.','.'},
new char[]{'.','.','.','.','.','.','.','.','9'},
new char[]{'.','.','.','.','.','.','4','.','.'},
new char[]{'.','.','.','.','.','.','.','.','7'},
new char[]{'.','1','.','.','.','.','.','.','.'},
new char[]{'2','4','.','.','.','.','9','.','.'}};
            bool solution = false;
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            char[][] testCase = {
new char[]{'.','.','.','.','.','.','.','.','.'},
new char[]{'.','.','.','.','.','.','.','.','.'},
new char[]{'.','9','.','.','.','.','.','.','1'},
new char[]{'8','.','.','.','.','.','.','.','.'},
new char[]{'.','9','9','3','5','7','.','.','.'},
new char[]{'.','.','.','.','.','.','.','4','.'},
new char[]{'.','.','.','8','.','.','.','.','.'},
new char[]{'.','1','.','.','.','.','4','.','9'},
new char[]{'.','.','.','5','.','4','.','.','.'}};
            bool solution = false;
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            char[][] testCase = {
new char[]{'.','.','.','2','.','.','6','.','.'},
new char[]{'.','.','.','1','.','.','.','.','.'},
new char[]{'.','.','.','.','.','.','.','.','.'},
new char[]{'.','.','.','5','.','1','.','.','8'},
new char[]{'.','3','.','.','.','.','.','.','.'},
new char[]{'.','.','.','9','.','.','.','.','3'},
new char[]{'4','.','.','.','.','.','.','.','.'},
new char[]{'.','.','.','.','.','.','3','8','.'},
new char[]{'.','.','.','.','.','.','.','.','4'}};
            bool solution = true;
            Test(testCase, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            char[][] testCase = {
new char[]{'.','.','.','.','8','.','.','.','.'},
new char[]{'.','.','.','.','.','.','5','.','.'},
new char[]{'.','.','.','.','4','.','.','2','.'},
new char[]{'.','.','.','3','.','9','.','.','.'},
new char[]{'.','.','1','8','.','.','9','.','.'},
new char[]{'.','.','.','.','.','5','1','.','.'},
new char[]{'.','.','3','.','.','8','.','.','.'},
new char[]{'.','1','2','.','3','.','.','.','.'},
new char[]{'.','.','.','.','.','7','.','.','1'}};
            bool solution = true;
            Test(testCase, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            char[][] testCase = {
new char[]{'.','.','.','.','.','.','5','.','.'},
new char[]{'.','.','.','.','.','.','.','.','.'},
new char[]{'.','.','.','.','.','.','.','.','.'},
new char[]{'9','3','.','.','2','.','4','.','.'},
new char[]{'.','.','7','.','.','.','3','.','.'},
new char[]{'.','.','.','.','.','.','.','.','.'},
new char[]{'.','.','.','3','4','.','.','.','.'},
new char[]{'.','.','.','.','.','3','.','.','.'},
new char[]{'.','.','.','.','.','5','2','.','.'}};
            bool solution = false;
            Test(testCase, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            char[][] testCase = {
new char[]{'.','.','.','.','4','.','9','.','.'},
new char[]{'.','.','2','1','.','.','3','.','.'},
new char[]{'.','.','.','.','.','.','.','.','.'},
new char[]{'.','.','.','.','.','.','.','.','3'},
new char[]{'.','.','.','2','.','.','.','.','.'},
new char[]{'.','.','.','.','.','7','.','.','.'},
new char[]{'.','.','.','6','1','.','.','.','.'},
new char[]{'.','.','9','.','.','.','.','.','.'},
new char[]{'.','.','.','.','.','.','.','9','.'}};
            bool solution = true;
            Test(testCase, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            char[][] testCase = {
new char[]{'.','8','7','6','5','4','3','2','1'},
new char[]{'2','.','.','.','.','.','.','.','.'},
new char[]{'3','.','.','.','.','.','.','.','.'},
new char[]{'4','.','.','.','.','.','.','.','.'},
new char[]{'5','.','.','.','.','.','.','.','.'},
new char[]{'6','.','.','.','.','.','.','.','.'},
new char[]{'7','.','.','.','.','.','.','.','.'},
new char[]{'8','.','.','.','.','.','.','.','.'},
new char[]{'9','.','.','.','.','.','.','.','.'}};
            bool solution = true;
            Test(testCase, solution);
        }//public void Test14() {

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            char[][] testCase = {
new char[]{'.','.','.','.','.','.','.','.','.'},
new char[]{'4','.','.','.','.','.','.','.','.'},
new char[]{'.','.','.','.','.','.','6','.','.'},
new char[]{'.','.','.','3','8','.','.','.','.'},
new char[]{'.','5','.','.','.','6','.','.','1'},
new char[]{'8','.','.','.','.','.','.','6','.'},
new char[]{'.','.','.','.','.','.','.','.','.'},
new char[]{'.','.','7','.','9','.','.','.','.'},
new char[]{'.','.','.','6','.','.','.','.','.'}};
            bool solution = true;
            Test(testCase, solution);
        }//public void Test15() {

        [TestMethod(), Timeout(timeout)]
        public void Test16() {
            char[][] testCase = {
new char[]{'.','.','.','.','.','.','.','.','1'},
new char[]{'.','.','.','.','.','6','.','.','.'},
new char[]{'4','.','.','.','.','.','3','8','.'},
new char[]{'7','.','.','.','.','.','.','.','.'},
new char[]{'.','.','.','.','5','3','.','.','.'},
new char[]{'.','.','.','.','6','8','.','.','.'},
new char[]{'3','.','.','9','.','.','.','.','.'},
new char[]{'.','.','.','.','.','2','1','1','.'},
new char[]{'.','.','.','.','.','.','.','.','.'}};
            bool solution = false;
            Test(testCase, solution);
        }//public void Test16() {

        [TestMethod(), Timeout(timeout)]
        public void Test17() {
            char[][] testCase = {
new char[]{'.','8','.','.','.','.','.','.','.'},
new char[]{'.','.','.','.','2','.','.','.','.'},
new char[]{'.','6','.','.','.','.','1','.','4'},
new char[]{'.','.','.','9','.','.','7','.','.'},
new char[]{'.','.','.','.','.','.','.','4','.'},
new char[]{'.','.','1','.','.','8','.','.','.'},
new char[]{'.','.','.','.','.','.','.','.','.'},
new char[]{'.','.','.','.','.','5','.','7','.'},
new char[]{'.','.','3','.','.','5','6','.','.'}};
            bool solution = false;
            Test(testCase, solution);
        }//public void Test17() {

        [TestMethod(), Timeout(timeout)]
        public void Test18() {
            char[][] testCase = {
new char[]{'.','.','.','.','.','.','.','.','.'},
new char[]{'.','.','2','.','.','.','.','.','.'},
new char[]{'.','.','.','.','.','2','7','1','.'},
new char[]{'.','.','.','.','.','.','.','.','.'},
new char[]{'.','2','.','.','.','.','.','.','.'},
new char[]{'.','5','.','.','.','.','.','.','.'},
new char[]{'.','.','.','.','9','.','.','.','8'},
new char[]{'.','.','.','.','.','1','6','.','.'},
new char[]{'.','.','.','.','6','.','.','.','.'}};
            bool solution = true;
            Test(testCase, solution);
        }//public void Test18() {

        [TestMethod(), Timeout(timeout)]
        public void Test19() {
            char[][] testCase = {
new char[]{'.','.','.','9','.','.','.','.','.'},
new char[]{'.','.','.','.','.','.','.','.','.'},
new char[]{'.','.','3','.','.','.','.','.','1'},
new char[]{'.','.','.','.','.','.','.','.','.'},
new char[]{'1','.','.','.','.','.','3','.','.'},
new char[]{'.','.','.','.','2','.','6','.','.'},
new char[]{'.','9','.','.','.','.','.','7','.'},
new char[]{'.','.','.','.','.','.','.','.','.'},
new char[]{'8','.','.','8','.','.','.','.','.'}};
            bool solution = false;
            Test(testCase, solution);
        }//public void Test19() {

        [TestMethod(), Timeout(timeout)]
        public void Test20() {
            char[][] testCase = {
new char[]{'.','.','.','.','.','.','8','3','.'},
new char[]{'2','.','.','.','.','.','.','.','.'},
new char[]{'7','.','.','.','.','7','.','9','5'},
new char[]{'.','.','.','1','.','.','.','.','2'},
new char[]{'.','8','.','9','.','.','.','.','.'},
new char[]{'.','.','5','1','9','.','.','.','.'},
new char[]{'5','.','.','.','.','.','.','.','.'},
new char[]{'.','.','.','.','.','.','.','.','.'},
new char[]{'.','.','.','.','.','.','.','.','.'}};
            bool solution = false;
            Test(testCase, solution);
        }//public void Test20() {

        private void Test(char[][] testCase,bool solution) {
            if (solution) {
                Assert.IsTrue(new Sudoku2().sudoku2(testCase));
            } else {//if (solution) {
                Assert.IsFalse(new Sudoku2().sudoku2(testCase));
            }//else {
        }//private void Test(char[][] testCase,bool solution) {
    }//public class Sudoku2Tests {
}//namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._0_Arrays {
