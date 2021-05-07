using Algorithms.src._1_the_core._05_labyrinth_of_nested_loops;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._05_labyrinth_of_nested_loops {
    [TestClass()]
    public class PagesNumberingWithInkTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase1 = 1;
            var testCase2 = 5;
            var solution = 5;
            Test(testCase1, testCase2, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase1 = 21;
            var testCase2 = 5;
            var solution = 22;
            Test(testCase1, testCase2, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase1 = 8;
            var testCase2 = 4;
            var solution = 10;
            Test(testCase1, testCase2, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase1 = 21;
            var testCase2 = 6;
            var solution = 23;
            Test(testCase1, testCase2, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase1 = 10;
            var testCase2 = 3;
            var solution = 10;
            Test(testCase1, testCase2, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase1 = 76;
            var testCase2 = 250;
            var solution = 166;
            Test(testCase1, testCase2, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase1 = 80;
            var testCase2 = 1000;
            var solution = 419;
            Test(testCase1, testCase2, solution);
        }//public void Test7() {

        private void Test(int testCase1, int testCase2, int solution) {
            Assert.AreEqual(solution, new PagesNumberingWithInk().pagesNumberingWithInk(testCase1, testCase2));
        }//private void Test(int testCase1,int testCase2,int solution) {
    }//public class PagesNumberingWithInkTests {
}//namespace Algorithms.src_UnitTests._1_the_core._05_labyrinth_of_nested_loops {
