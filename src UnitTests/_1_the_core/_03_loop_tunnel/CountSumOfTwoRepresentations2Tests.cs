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

        private void Test(int testCase1,int testCase2, int testCase3,int solution) { 
            Assert.AreEqual(solution, new CountSumOfTwoRepresentations2().countSumOfTwoRepresentations2(testCase1, testCase2, testCase3));
        }//private void Test(int testCase1,int testCase2, int testCase3,int solution) {
    }//public class CountSumOfTwoRepresentations2Tests {
}//namespace Algorithms.src_UnitTests._1_the_core._03_loop_tunnel {
