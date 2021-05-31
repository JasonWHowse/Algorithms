using Algorithms.src._0_intro._08_dark_wilderness;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._08_dark_wilderness {
    [TestClass()]
    public class BishopAndPawnTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase1 = "a1";
            var testCase2 = "c3";
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase1 = "h1";
            var testCase2 = "h3";
            var solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase1 = "a5";
            var testCase2 = "c3";
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase1 = "g1";
            var testCase2 = "f3";
            var solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase1 = "e7";
            var testCase2 = "d6";
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase1 = "e7";
            var testCase2 = "a3";
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase1 = "e3";
            var testCase2 = "a7";
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase1 = "a1";
            var testCase2 = "h8";
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase1 = "a1";
            var testCase2 = "h7";
            var solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase1 = "h1";
            var testCase2 = "a8";
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            var testCase1 = "h1";
            var testCase2 = "b8";
            var solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            var testCase1 = "b4";
            var testCase2 = "c3";
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            var testCase1 = "b4";
            var testCase2 = "d7";
            var solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            var testCase1 = "b4";
            var testCase2 = "e7";
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test14() {

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            var testCase1 = "d6";
            var testCase2 = "b4";
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test15() {

        [TestMethod(), Timeout(timeout)]
        public void Test16() {
            var testCase1 = "d6";
            var testCase2 = "a2";
            var solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test16() {

        [TestMethod(), Timeout(timeout)]
        public void Test17() {
            var testCase1 = "a1";
            var testCase2 = "a8";
            var solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test17() {

        [TestMethod(), Timeout(timeout)]
        public void Test18() {
            var testCase1 = "e5";
            var testCase2 = "f6";
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test18() {

        [TestMethod(), Timeout(timeout)]
        public void Test19() {
            var testCase1 = "f6";
            var testCase2 = "e8";
            var solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test19() {

        [TestMethod(), Timeout(timeout)]
        public void Test20() {
            var testCase1 = "g8";
            var testCase2 = "a2";
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test20() {

        private void Test(string testCase1, string testCase2, bool solution) {
            if (solution) {
                Assert.IsTrue(new BishopAndPawn().bishopAndPawn(testCase1, testCase2));
            } else {//if (solution) {
                Assert.IsFalse(new BishopAndPawn().bishopAndPawn(testCase1, testCase2));
            }//else {
        }//private void Test(string testCase1,string testCase2,bool solution) {
    }//public class BishopAndPawnTests {
}//namespace Algorithms.src_UnitTests._0_intro._08_dark_wilderness {
