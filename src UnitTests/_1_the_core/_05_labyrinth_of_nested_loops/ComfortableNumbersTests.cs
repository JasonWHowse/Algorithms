using Algorithms.src._1_the_core._05_labyrinth_of_nested_loops;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._05_labyrinth_of_nested_loops {
    [TestClass()]
    public class ComfortableNumbersTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase1 = 10;
            var testCase2 = 12;
            var solution = 2;
            Test(testCase1, testCase2, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase1 = 1;
            var testCase2 = 9;
            var solution = 20;
            Test(testCase1, testCase2, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase1 = 13;
            var testCase2 = 13;
            var solution = 0;
            Test(testCase1, testCase2, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase1 = 12;
            var testCase2 = 108;
            var solution = 707;
            Test(testCase1, testCase2, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase1 = 239;
            var testCase2 = 777;
            var solution = 6166;
            Test(testCase1, testCase2, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase1 = 1;
            var testCase2 = 1000;
            var solution = 11435;
            Test(testCase1, testCase2, solution);
        }//public void Test6() {

        private void Test(int testCase1, int testCase2, int solution) {
            Assert.AreEqual(solution, new ComfortableNumbers().comfortableNumbers(testCase1, testCase2));
        }//private void Test(int testCase1,int testCase2,var solution) {
    }//public class ComfortableNumbersTests {
}//namespace Algorithms.src_UnitTests._1_the_core._05_labyrinth_of_nested_loops {
