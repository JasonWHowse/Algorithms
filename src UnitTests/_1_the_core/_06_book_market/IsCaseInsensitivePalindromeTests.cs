using Algorithms.src._1_the_core._06_book_market;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._06_book_market {
    [TestClass()]
    public class IsCaseInsensitivePalindromeTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = "AaBaa";
            Test(testCase, true);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = "abac";
            Test(testCase, false);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = "aBACaba";
            Test(testCase, true);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = "opOP";
            Test(testCase, false);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = "ZZzzazZzz";
            Test(testCase, true);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase = "zzzzazzzz";
            Test(testCase, true);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase = "ZZzzabzZzz";
            Test(testCase, false);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase = "abcdcbA";
            Test(testCase, true);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase = "abracabra";
            Test(testCase, false);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase = "abcd";
            Test(testCase, false);
        }//public void Test10() {

        private void Test(string testCase, bool solution) {
            if (solution) {
                Assert.IsTrue(new IsCaseInsensitivePalindrome().isCaseInsensitivePalindrome(testCase));
            } else {//if (solution) {
                Assert.IsFalse(new IsCaseInsensitivePalindrome().isCaseInsensitivePalindrome(testCase));
            }//else {
        }//private void Test(string testCase,bool solution) {
    }//public class IsCaseInsensitivePalindromeTests {
}//namespace Algorithms.src_UnitTests._1_the_core._06_book_market {
