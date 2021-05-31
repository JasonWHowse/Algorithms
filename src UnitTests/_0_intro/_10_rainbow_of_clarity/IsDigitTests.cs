using Algorithms.src._0_intro._10_rainbow_of_clarity;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._10_rainbow_of_clarity {
    [TestClass()]
    public class IsDigitTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = '0';
            var solution = true;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = '-';
            var solution = false;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = 'O';
            var solution = false;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = '1';
            var solution = true;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = '2';
            var solution = true;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase = '!';
            var solution = false;
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase = '@';
            var solution = false;
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase = '+';
            var solution = false;
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase = '6';
            var solution = true;
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase = '(';
            var solution = false;
            Test(testCase, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            var testCase = ')';
            var solution = false;
            Test(testCase, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            var testCase = 'g';
            var solution = false;
            Test(testCase, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            var testCase = '8';
            var solution = true;
            Test(testCase, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            var testCase = '*';
            var solution = false;
            Test(testCase, solution);
        }//public void Test14() {

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            var testCase = '3';
            var solution = true;
            Test(testCase, solution);
        }//public void Test15() {

        [TestMethod(), Timeout(timeout)]
        public void Test16() {
            var testCase = '4';
            var solution = true;
            Test(testCase, solution);
        }//public void Test16() {

        [TestMethod(), Timeout(timeout)]
        public void Test17() {
            var testCase = '5';
            var solution = true;
            Test(testCase, solution);
        }//public void Test17() {

        [TestMethod(), Timeout(timeout)]
        public void Test18() {
            var testCase = '/';
            var solution = false;
            Test(testCase, solution);
        }//public void Test18() {

        [TestMethod(), Timeout(timeout)]
        public void Test19() {
            var testCase = ':';
            var solution = false;
            Test(testCase, solution);
        }//public void Test19() {

        [TestMethod(), Timeout(timeout)]
        public void Test20() {
            var testCase = '7';
            var solution = true;
            Test(testCase, solution);
        }//public void Test20() {

        [TestMethod(), Timeout(timeout)]
        public void Test21() {
            var testCase = '9';
            var solution = true;
            Test(testCase, solution);
        }//public void Test21() {

        private void Test(char testCase, bool solution) {
            if (solution) {
                Assert.IsTrue(new IsDigit().isDigit(testCase));
            } else {//if (solution) {
                Assert.IsFalse(new IsDigit().isDigit(testCase));
            }//else {
        }//private void Test(char testCase,bool solution) {
    }//public class IsDigitTests {
}//namespace Algorithms.src_UnitTests._0_intro._10_rainbow_of_clarity {
