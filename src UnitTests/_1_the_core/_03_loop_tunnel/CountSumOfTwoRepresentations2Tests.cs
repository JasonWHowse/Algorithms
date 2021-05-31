using Algorithms.src._1_the_core._03_loop_tunnel;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._03_loop_tunnel {
    [TestClass()]
    public class CountSumOfTwoRepresentations2Tests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase1 = 6;
            var testCase2 = 2;
            var testCase3 = 4;
            var solution = 2;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase1 = 6;
            var testCase2 = 3;
            var testCase3 = 3;
            var solution = 1;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase1 = 10;
            var testCase2 = 9;
            var testCase3 = 11;
            var solution = 0;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase1 = 24;
            var testCase2 = 8;
            var testCase3 = 16;
            var solution = 5;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase1 = 24;
            var testCase2 = 12;
            var testCase3 = 12;
            var solution = 1;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase1 = 93;
            var testCase2 = 24;
            var testCase3 = 58;
            var solution = 12;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase1 = 1000000;
            var testCase2 = 490000;
            var testCase3 = 900000;
            var solution = 10001;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase1 = 1000;
            var testCase2 = 1;
            var testCase3 = 1000;
            var solution = 500;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase1 = 1000000000;
            var testCase2 = 999999000;
            var testCase3 = 1000000000;
            var solution = 0;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase1 = 10000;
            var testCase2 = 8;
            var testCase3 = 9991;
            var solution = 4992;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            var testCase1 = 2400;
            var testCase2 = 12;
            var testCase3 = 1000000;
            var solution = 1189;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            var testCase1 = 88;
            var testCase2 = 27;
            var testCase3 = 58;
            var solution = 15;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test12() {

        private void Test(int testCase1,int testCase2, int testCase3,int solution) { 
            Assert.AreEqual(solution, new CountSumOfTwoRepresentations2().countSumOfTwoRepresentations2(testCase1, testCase2, testCase3));
        }//private void Test(int testCase1,int testCase2, int testCase3,int solution) {
    }//public class CountSumOfTwoRepresentations2Tests {
}//namespace Algorithms.src_UnitTests._1_the_core._03_loop_tunnel {
