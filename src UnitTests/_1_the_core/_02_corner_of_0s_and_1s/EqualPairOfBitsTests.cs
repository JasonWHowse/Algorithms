using Algorithms.src._1_the_core._02_corner_of_0s_and_1s;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._02_corner_of_0s_and_1s {
    [TestClass()]
    public class EqualPairOfBitsTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase1 = 10;
            var testCase2 = 11;
            var solution = 2;
            Test(testCase1, testCase2, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase1 = 0;
            var testCase2 = 0;
            var solution = 1;
            Test(testCase1, testCase2, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase1 = 28;
            var testCase2 = 27;
            var solution = 8;
            Test(testCase1, testCase2, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase1 = 895;
            var testCase2 = 928;
            var solution = 32;
            Test(testCase1, testCase2, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase1 = 1073741824;
            var testCase2 = 1006895103;
            var solution = 262144;
            Test(testCase1, testCase2, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase1 = 1;
            var testCase2 = 1;
            var solution = 1;
            Test(testCase1, testCase2, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase1 = 524288;
            var testCase2 = 1048575;
            var solution = 524288;
            Test(testCase1, testCase2, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase1 = 32767;
            var testCase2 = 32767;
            var solution = 1;
            Test(testCase1, testCase2, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase1 = 9936640;
            var testCase2 = 16777215;
            var solution = 256;
            Test(testCase1, testCase2, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase1 = 536870911;
            var testCase2 = 1073741824;
            var solution = 536870912;
            Test(testCase1, testCase2, solution);
        }//public void Test10() {

        private void Test(int testCase1, int testCase2, int solution) {
            Assert.AreEqual(solution, new EqualPairOfBits().equalPairOfBits(testCase1, testCase2));
        }//private void Test(int testCase1, int testCase2, int solution) {
    }//public class EqualPairOfBitsTests {
}//namespace Algorithms.src_UnitTests._1_the_core._02_corner_of_0s_and_1s {