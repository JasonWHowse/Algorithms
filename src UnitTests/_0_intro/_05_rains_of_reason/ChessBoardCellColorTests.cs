using Algorithms.src._0_intro._05_rains_of_reason;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._05_rains_of_reason {
    [TestClass()]
    public class ChessBoardCellColorTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase1 = "A1";
            var testCase2 = "C3";
            var solution = true;
            Test(testCase1,testCase2, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase1 = "A1";
            var testCase2 = "H3";
            var solution = false;
            Test(testCase1,testCase2, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase1 = "A1";
            var testCase2 = "A2";
            var solution = false;
            Test(testCase1,testCase2, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase1 = "A1";
            var testCase2 = "B2";
            var solution = true;
            Test(testCase1,testCase2, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase1 = "B3";
            var testCase2 = "H8";
            var solution = false;
            Test(testCase1,testCase2, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase1 = "C3";
            var testCase2 = "B5";
            var solution = false;
            Test(testCase1,testCase2, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase1 = "G5";
            var testCase2 = "E7";
            var solution = true;
            Test(testCase1,testCase2, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase1 = "C8";
            var testCase2 = "H8";
            var solution = false;
            Test(testCase1,testCase2, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase1 = "D2";
            var testCase2 = "D2";
            var solution = true;
            Test(testCase1,testCase2, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase1 = "A2";
            var testCase2 = "A5";
            var solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            var testCase1 = "G5";
            var testCase2 = "G6";
            var solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            var testCase1 = "A1";
            var testCase2 = "B1";
            var solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            var testCase1 = "A1";
            var testCase2 = "D4";
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            var testCase1 = "B2";
            var testCase2 = "B4";
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test14() {

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            var testCase1 = "G6";
            var testCase2 = "H6";
            var solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test15() {

        [TestMethod(), Timeout(timeout)]
        public void Test16() {
            var testCase1 = "H1";
            var testCase2 = "H1";
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test16() {

        [TestMethod(), Timeout(timeout)]
        public void Test17() {
            var testCase1 = "B2";
            var testCase2 = "H8";
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test17() {

        [TestMethod(), Timeout(timeout)]
        public void Test18() {
            var testCase1 = "B2";
            var testCase2 = "B5";
            var solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test18() {

        [TestMethod(), Timeout(timeout)]
        public void Test19() {
            var testCase1 = "G5";
            var testCase2 = "H6";
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test19() {

        [TestMethod(), Timeout(timeout)]
        public void Test20() {
            var testCase1 = "C8";
            var testCase2 = "H1";
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test20() {

        private void Test(string testCase1, string testCase2, bool solution) {
            if (solution) {
                Assert.IsTrue(new ChessBoardCellColor().chessBoardCellColor(testCase1, testCase2));
            } else {//if (solution) {
                Assert.IsFalse(new ChessBoardCellColor().chessBoardCellColor(testCase1, testCase2));
            }//else {
        }//private void Test(string testCase1, string testCase2,bool solution) {
    }//public class ChessBoardCellColorTests {
}//namespace Algorithms.src_UnitTests._0_intro._05_rains_of_reason {
