using Algorithms.src._1_the_core._03_loop_tunnel;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._03_loop_tunnel {
    [TestClass()]
    public class CountBlackCellsTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase1 = 3;
            var testCase2 = 4;
            var solution = 6;
            Test(testCase1, testCase2, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase1 = 3;
            var testCase2 = 3;
            var solution = 7;
            Test(testCase1, testCase2, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase1 = 2;
            var testCase2 = 5;
            var solution = 6;
            Test(testCase1, testCase2, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase1 = 1;
            var testCase2 = 1;
            var solution = 1;
            Test(testCase1, testCase2, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase1 = 1;
            var testCase2 = 2;
            var solution = 2;
            Test(testCase1, testCase2, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase1 = 1;
            var testCase2 = 3;
            var solution = 3;
            Test(testCase1, testCase2, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase1 = 1;
            var testCase2 = 239;
            var solution = 239;
            Test(testCase1, testCase2, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase1 = 33;
            var testCase2 = 44;
            var solution = 86;
            Test(testCase1, testCase2, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase1 = 16;
            var testCase2 = 8;
            var solution = 30;
            Test(testCase1, testCase2, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase1 = 66666;
            var testCase2 = 88888;
            var solution = 177774;
            Test(testCase1, testCase2, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            var testCase1 = 100000;
            var testCase2 = 1;
            var solution = 100000;
            Test(testCase1, testCase2, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            var testCase1 = 239;
            var testCase2 = 1;
            var solution = 239;
            Test(testCase1, testCase2, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            var testCase1 = 1;
            var testCase2 = 100000;
            var solution = 100000;
            Test(testCase1, testCase2, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            var testCase1 = 2;
            var testCase2 = 100;
            var solution = 102;
            Test(testCase1, testCase2, solution);
        }//public void Test14() {

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            var testCase1 = 239;
            var testCase2 = 749;
            var solution = 987;
            Test(testCase1, testCase2, solution);
        }//public void Test15() {

        [TestMethod(), Timeout(timeout)]
        public void Test16() {
            var testCase1 = 100;
            var testCase2 = 2;
            var solution = 102;
            Test(testCase1, testCase2, solution);
        }//public void Test16() {

        [TestMethod(), Timeout(timeout)]
        public void Test17() {
            var testCase1 = 2;
            var testCase2 = 1;
            var solution = 2;
            Test(testCase1, testCase2, solution);
        }//public void Test17() {

        [TestMethod(), Timeout(timeout)]
        public void Test18() {
            var testCase1 = 100000;
            var testCase2 = 100000;
            var solution = 299998;
            Test(testCase1, testCase2, solution);
        }//public void Test18() {

        [TestMethod(), Timeout(timeout)]
        public void Test19() {
            var testCase1 = 14;
            var testCase2 = 234;
            var solution = 248;
            Test(testCase1, testCase2, solution);
        }//public void Test19() {

        private void Test(int testCase1, int testCase2, int solution) {
            Assert.AreEqual(solution, new CountBlackCells().countBlackCells(testCase1, testCase2));
        }//private void Test(int testCase1,int testCase2,int solution) {
    }//public class CountBlackCellsTests {
}//namespace Algorithms.src_UnitTests._1_the_core._03_loop_tunnel {
