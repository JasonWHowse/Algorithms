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

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase1 = 9;
            var testCase2 = 4;
            var solution = 10;
            Test(testCase1, testCase2, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase1 = 100;
            var testCase2 = 3;
            var solution = 100;
            Test(testCase1, testCase2, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase1 = 325;
            var testCase2 = 4;
            var solution = 325;
            Test(testCase1, testCase2, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            var testCase1 = 761;
            var testCase2 = 5;
            var solution = 761;
            Test(testCase1, testCase2, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            var testCase1 = 543;
            var testCase2 = 6;
            var solution = 544;
            Test(testCase1, testCase2, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            var testCase1 = 987;
            var testCase2 = 543;
            var solution = 1125;
            Test(testCase1, testCase2, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            var testCase1 = 987;
            var testCase2 = 544;
            var solution = 1125;
            Test(testCase1, testCase2, solution);
        }//public void Test14() {

        private void Test(int testCase1, int testCase2, int solution) {
            Assert.AreEqual(solution, new PagesNumberingWithInk().pagesNumberingWithInk(testCase1, testCase2));
        }//private void Test(int testCase1,int testCase2,int solution) {
    }//public class PagesNumberingWithInkTests {
}//namespace Algorithms.src_UnitTests._1_the_core._05_labyrinth_of_nested_loops {
