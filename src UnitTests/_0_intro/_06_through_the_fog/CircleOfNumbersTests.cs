using Algorithms.src._0_intro._06_through_the_fog;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._06_through_the_fog {
    [TestClass()]
    public class CircleOfNumbersTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase1 = 10;
            var testCase2 = 2;
            var solution = 7;
            Test(testCase1, testCase2, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase1 = 10;
            var testCase2 = 7;
            var solution = 2;
            Test(testCase1, testCase2, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase1 = 4;
            var testCase2 = 1;
            var solution = 3;
            Test(testCase1, testCase2, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase1 = 6;
            var testCase2 = 3;
            var solution = 0;
            Test(testCase1, testCase2, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase1 = 18;
            var testCase2 = 6;
            var solution = 15;
            Test(testCase1, testCase2, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase1 = 12;
            var testCase2 = 10;
            var solution = 4;
            Test(testCase1, testCase2, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase1 = 18;
            var testCase2 = 5;
            var solution = 14;
            Test(testCase1, testCase2, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase1 = 18;
            var testCase2 = 13;
            var solution = 4;
            Test(testCase1, testCase2, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase1 = 18;
            var testCase2 = 0;
            var solution = 9;
            Test(testCase1, testCase2, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase1 = 20;
            var testCase2 = 11;
            var solution = 1;
            Test(testCase1, testCase2, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            var testCase1 = 18;
            var testCase2 = 9;
            var solution = 0;
            Test(testCase1, testCase2, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            var testCase1 = 4;
            var testCase2 = 3;
            var solution = 1;
            Test(testCase1, testCase2, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            var testCase1 = 14;
            var testCase2 = 7;
            var solution = 0;
            Test(testCase1, testCase2, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            var testCase1 = 12;
            var testCase2 = 3;
            var solution = 9;
            Test(testCase1, testCase2, solution);
        }//public void Test14() {

        private void Test(int testCase1, int testCase2, int solution) {
            Assert.AreEqual(solution, new CircleOfNumbers().circleOfNumbers(testCase1, testCase2));
        }//private void Test(int testCase1,int testCase2,int solution) {
    }//public class CircleOfNumbersTests {
}//namespace Algorithms.src_UnitTests._0_intro._06_through_the_fog {
