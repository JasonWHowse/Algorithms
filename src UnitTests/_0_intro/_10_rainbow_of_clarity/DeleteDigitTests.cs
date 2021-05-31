using Algorithms.src._0_intro._10_rainbow_of_clarity;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._10_rainbow_of_clarity {
    [TestClass()]
    public class DeleteDigitTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = 152;
            var solution = 52;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = 1001;
            var solution = 101;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = 10;
            var solution = 1;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = 222219;
            var solution = 22229;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = 109;
            var solution = 19;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase = 222250;
            var solution = 22250;
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase = 44435;
            var solution = 4445;
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase = 12;
            var solution = 2;
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase = 218616;
            var solution = 28616;
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase = 861452;
            var solution = 86452;
            Test(testCase, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            var testCase = 527964;
            var solution = 57964;
            Test(testCase, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            var testCase = 807418;
            var solution = 87418;
            Test(testCase, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            var testCase = 433757;
            var solution = 43757;
            Test(testCase, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            var testCase = 748541;
            var solution = 78541;
            Test(testCase, solution);
        }//public void Test14() {

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            var testCase = 909912;
            var solution = 99912;
            Test(testCase, solution);
        }//public void Test15() {

        [TestMethod(), Timeout(timeout)]
        public void Test16() {
            var testCase = 864200;
            var solution = 86420;
            Test(testCase, solution);
        }//public void Test16() {

        [TestMethod(), Timeout(timeout)]
        public void Test17() {
            var testCase = 812520;
            var solution = 82520;
            Test(testCase, solution);
        }//public void Test17() {

        [TestMethod(), Timeout(timeout)]
        public void Test18() {
            var testCase = 1000000;
            var solution = 100000;
            Test(testCase, solution);
        }//public void Test18() {

        [TestMethod(), Timeout(timeout)]
        public void Test19() {
            var testCase = 987654;
            var solution = 98765;
            Test(testCase, solution);
        }//public void Test19() {

        [TestMethod(), Timeout(timeout)]
        public void Test20() {
            var testCase = 872048;
            var solution = 87248;
            Test(testCase, solution);
        }//public void Test20() {

        private void Test(int testCase, int solution) {
            Assert.AreEqual(solution, new DeleteDigit().deleteDigit(testCase));
        }//private void Test(int testCase,int solution) {
    }//public class DeleteDigitTests {
}//namespace Algorithms.src_UnitTests._0_intro._10_rainbow_of_clarity {
