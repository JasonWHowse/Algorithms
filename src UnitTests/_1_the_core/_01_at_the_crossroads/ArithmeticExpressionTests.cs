using Algorithms.src._1_the_core._01_at_the_crossroads;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._01_at_the_crossroads {
    [TestClass()]
    public class ArithmeticExpressionTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase1 = 2;
            var testCase2 = 3;
            var testCase3 = 5;
            var solution = true;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase1 = 8;
            var testCase2 = 2;
            var testCase3 = 4;
            var solution = true;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase1 = 8;
            var testCase2 = 3;
            var testCase3 = 2;
            var solution = false;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase1 = 6;
            var testCase2 = 3;
            var testCase3 = 3;
            var solution = true;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase1 = 18;
            var testCase2 = 2;
            var testCase3 = 9;
            var solution = true;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase1 = 2;
            var testCase2 = 3;
            var testCase3 = 6;
            var solution = true;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase1 = 5;
            var testCase2 = 2;
            var testCase3 = 0;
            var solution = false;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase1 = 10;
            var testCase2 = 2;
            var testCase3 = 2;
            var solution = false;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase1 = 5;
            var testCase2 = 2;
            var testCase3 = 2;
            var solution = false;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase1 = 1;
            var testCase2 = 2;
            var testCase3 = 1;
            var solution = false;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            var testCase1 = 1;
            var testCase2 = 2;
            var testCase3 = 2;
            var solution = true;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            var testCase1 = 3;
            var testCase2 = 4;
            var testCase3 = 7;
            var solution = true;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            var testCase1 = 7;
            var testCase2 = 2;
            var testCase3 = 5;
            var solution = true;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            var testCase1 = 6;
            var testCase2 = 3;
            var testCase3 = 2;
            var solution = true;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test14() {

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            var testCase1 = 7;
            var testCase2 = 3;
            var testCase3 = 2;
            var solution = false;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test15() {

        [TestMethod(), Timeout(timeout)]
        public void Test16() {
            var testCase1 = 12;
            var testCase2 = 4;
            var testCase3 = 6;
            var solution = false;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test16() {

        [TestMethod(), Timeout(timeout)]
        public void Test17() {
            var testCase1 = 20;
            var testCase2 = 4;
            var testCase3 = 5;
            var solution = true;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test17() {

        [TestMethod(), Timeout(timeout)]
        public void Test18() {
            var testCase1 = 8;
            var testCase2 = 2;
            var testCase3 = 16;
            var solution = true;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test18() {

        [TestMethod(), Timeout(timeout)]
        public void Test19() {
            var testCase1 = 9;
            var testCase2 = 2;
            var testCase3 = 4;
            var solution = false;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test19() {

        [TestMethod(), Timeout(timeout)]
        public void Test20() {
            var testCase1 = 18;
            var testCase2 = 4;
            var testCase3 = 4;
            var solution = false;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test20() {

        [TestMethod(), Timeout(timeout)]
        public void Test21() {
            var testCase1 = 1;
            var testCase2 = 1;
            var testCase3 = 1;
            var solution = true;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test21() {

        [TestMethod(), Timeout(timeout)]
        public void Test22() {
            var testCase1 = 1;
            var testCase2 = 20;
            var testCase3 = 20;
            var solution = true;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test22() {

        private void Test(int testCase1, int testCase2, int testCase3, bool solution) {
            if (solution) {
                Assert.IsTrue(new ArithmeticExpression().arithmeticExpression(testCase1, testCase2, testCase3));
            } else {//if (solution) {
                Assert.IsFalse(new ArithmeticExpression().arithmeticExpression(testCase1, testCase2, testCase3));
            }//else {
        }//private void Test(int testCase1,int testCase2,int testCase3,bool solution) {
    }//public class ArithmeticExpressionTests {
}//namespace Algorithms.src_UnitTests._1_the_core._01_at_the_crossroads {
