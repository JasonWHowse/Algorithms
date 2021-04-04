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

        private void Test(int testCase1, int testCase2, int solution) {
            Assert.AreEqual(solution, new EqualPairOfBits().equalPairOfBits(testCase1, testCase2));
        }//private void Test(int testCase1, int testCase2, int solution) {
    }//public class EqualPairOfBitsTests {
}//namespace Algorithms.src_UnitTests._1_the_core._02_corner_of_0s_and_1s {