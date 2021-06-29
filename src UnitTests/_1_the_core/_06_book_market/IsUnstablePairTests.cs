using Algorithms.src._1_the_core._06_book_market;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._06_book_market {
    [TestClass()]
    public class IsUnstablePairTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase1 = "aa";
            var testCase2 = "AAB";
            Test(testCase1,testCase2, true);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase1 = "A";
            var testCase2 = "z";
            Test(testCase1,testCase2, false);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase1 = "yyyyyy";
            var testCase2 = "Azzzzzzzzz";
            Test(testCase1,testCase2, false);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase1 = "mehOu";
            var testCase2 = "mehau";
            Test(testCase1,testCase2, true);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase1 = "aaZ";
            var testCase2 = "AAzz";
            Test(testCase1,testCase2, true);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase1 = "fdsAs";
            var testCase2 = "dzdw";
            Test(testCase1,testCase2, false);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase1 = "aaad";
            var testCase2 = "aaAdd";
            Test(testCase1,testCase2, true);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase1 = "zzzzzAa123";
            var testCase2 = "zzzzza";
            Test(testCase1,testCase2, true);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase1 = "123za";
            var testCase2 = "123Z";
            Test(testCase1,testCase2, false);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase1 = "qwerTyu123";
            var testCase2 = "qwertyu";
            Test(testCase1,testCase2, true);
        }//public void Test10() {

        private void Test(string testCase1, string testCase2, bool solution) {
            if (solution) {
                Assert.IsTrue(new IsUnstablePair().isUnstablePair(testCase1, testCase2));
            } else {//if (solution) {
                Assert.IsFalse(new IsUnstablePair().isUnstablePair(testCase1, testCase2));
            }//else {
        }//private void Test(string testCase1, string testCase2, bool solution) {
    }//public class IsUnstablePairTests {
}//namespace Algorithms.src_UnitTests._1_the_core._06_book_market {
