using Algorithms.src._1_the_core._03_loop_tunnel;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._03_loop_tunnel {
    [TestClass()]
    public class CandlesTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase1 = 5;
            var testCase2 = 2;
            var solution = 9;
            Test(testCase1, testCase2, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase1 = 1;
            var testCase2 = 2;
            var solution = 1;
            Test(testCase1, testCase2, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase1 = 3;
            var testCase2 = 3;
            var solution = 4;
            Test(testCase1, testCase2, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase1 = 11;
            var testCase2 = 3;
            var solution = 16;
            Test(testCase1, testCase2, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase1 = 15;
            var testCase2 = 5;
            var solution = 18;
            Test(testCase1, testCase2, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase1 = 14;
            var testCase2 = 3;
            var solution = 20;
            Test(testCase1, testCase2, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase1 = 12;
            var testCase2 = 2;
            var solution = 23;
            Test(testCase1, testCase2, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase1 = 6;
            var testCase2 = 4;
            var solution = 7;
            Test(testCase1, testCase2, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase1 = 13;
            var testCase2 = 5;
            var solution = 16;
            Test(testCase1, testCase2, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase1 = 2;
            var testCase2 = 3;
            var solution = 2;
            Test(testCase1, testCase2, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            var testCase1 = 0000;
            var testCase2 = 0000;
            var solution = 0000;
            Test(testCase1, testCase2, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            var testCase1 = 1;
            var testCase2 = 3;
            var solution = 1;
            Test(testCase1, testCase2, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            var testCase1 = 10;
            var testCase2 = 4;
            var solution = 13;
            Test(testCase1, testCase2, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            var testCase1 = 10;
            var testCase2 = 5;
            var solution = 12;
            Test(testCase1, testCase2, solution);
        }//public void Test14() {

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            var testCase1 = 4;
            var testCase2 = 4;
            var solution = 5;
            Test(testCase1, testCase2, solution);
        }//public void Test15() {

        [TestMethod(), Timeout(timeout)]
        public void Test16() {
            var testCase1 = 13;
            var testCase2 = 4;
            var solution = 17;
            Test(testCase1, testCase2, solution);
        }//public void Test16() {

        [TestMethod(), Timeout(timeout)]
        public void Test17() {
            var testCase1 = 15;
            var testCase2 = 3;
            var solution = 22;
            Test(testCase1, testCase2, solution);
        }//public void Test17() {

        [TestMethod(), Timeout(timeout)]
        public void Test18() {
            var testCase1 = 15;
            var testCase2 = 2;
            var solution = 29;
            Test(testCase1, testCase2, solution);
        }//public void Test18() {

        [TestMethod(), Timeout(timeout)]
        public void Test19() {
            var testCase1 = 8;
            var testCase2 = 5;
            var solution = 9;
            Test(testCase1, testCase2, solution);
        }//public void Test19() {

        [TestMethod(), Timeout(timeout)]
        public void Test20() {
            var testCase1 = 1;
            var testCase2 = 4;
            var solution = 1;
            Test(testCase1, testCase2, solution);
        }//public void Test20() {

        private void Test(int testCase1, int testCase2, int solution) {
            Assert.AreEqual(solution, new Candles().candles(testCase1, testCase2));
        }//private void Test(int testCase1,int testCase2,int solution) {
    }//public class CandlesTests {
}//namespace Algorithms.src_UnitTests._1_the_core._03_loop_tunnel {
