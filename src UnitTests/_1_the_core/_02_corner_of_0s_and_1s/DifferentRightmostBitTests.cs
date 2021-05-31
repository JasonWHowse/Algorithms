using Algorithms.src._1_the_core._02_corner_of_0s_and_1s;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._02_corner_of_0s_and_1s {
    [TestClass()]
    public class DifferentRightmostBitTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase1 = 11;
            var testCase2 = 13;
            var solution = 2;
            Test(testCase1, testCase2, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase1 = 7;
            var testCase2 = 23;
            var solution = 16;
            Test(testCase1, testCase2, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase1 = 1;
            var testCase2 = 0;
            var solution = 1;
            Test(testCase1, testCase2, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase1 = 64;
            var testCase2 = 65;
            var solution = 1;
            Test(testCase1, testCase2, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase1 = 1073741823;
            var testCase2 = 1071513599;
            var solution = 131072;
            Test(testCase1, testCase2, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase1 = 42;
            var testCase2 = 22;
            var solution = 4;
            Test(testCase1, testCase2, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase1 = 0;
            var testCase2 = 1;
            var solution = 1;
            Test(testCase1, testCase2, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase1 = 16072704;
            var testCase2 = 11173888;
            var solution = 16384;
            Test(testCase1, testCase2, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase1 = 33554431;
            var testCase2 = 67108863;
            var solution = 33554432;
            Test(testCase1, testCase2, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase1 = 32;
            var testCase2 = 1073741824;
            var solution = 32;
            Test(testCase1, testCase2, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            var testCase1 = 1023;
            var testCase2 = 3071;
            var solution = 2048;
            Test(testCase1, testCase2, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            var testCase1 = 1073741824;
            var testCase2 = 32;
            var solution = 32;
            Test(testCase1, testCase2, solution);
        }//public void Test12() {

        private void Test(int testCase1, int testCase2, int solution) {
            Assert.AreEqual(solution, new DifferentRightmostBit().differentRightmostBit(testCase1, testCase2));
        }//private void Test(int testCase1,int testCase2,int solution) {
    }//public class DifferentRightmostBitTests {
}//namespace Algorithms.src_UnitTests._1_the_core._02_corner_of_0s_and_1s {
