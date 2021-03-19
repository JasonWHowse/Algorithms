using Algorithms.src._0_intro._00_the_journey_begins;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._00_the_journey_begins {
    [TestClass()]
    public class CheckPalindromeTests {

        [TestMethod(), Timeout(3000)]
        public void test1() {
            var testCase = "aabaa";
            var solution = true;
            test(testCase, solution);
        }//public void test1() {

        [TestMethod(), Timeout(3000)]
        public void test2() {
            var testCase = "abac";
            var solution = false;
            test(testCase, solution);
        }//public void test2() {

        [TestMethod(), Timeout(3000)]
        public void test3() {
            var testCase = "a";
            var solution = true;
            test(testCase, solution);
        }//public void test3() {

        [TestMethod(), Timeout(3000)]
        public void test4() {
            var testCase = "az";
            var solution = false;
            test(testCase, solution);
        }//public void test4() {

        [TestMethod(), Timeout(3000)]
        public void test5() {
            var testCase = "abacaba";
            var solution = true;
            test(testCase, solution);
        }//public void test5() {

        [TestMethod(), Timeout(3000)]
        public void test6() {
            var testCase = "z";
            var solution = true;
            test(testCase, solution);
        }//public void test6() {

        [TestMethod(), Timeout(3000)]
        public void test7() {
            var testCase = "aaabaaaa";
            var solution = false;
            test(testCase, solution);
        }//public void test7() {

        [TestMethod(), Timeout(3000)]
        public void test8() {
            var testCase = "zzzazzazz";
            var solution = false;
            test(testCase, solution);
        }//public void test8() {

        [TestMethod(), Timeout(3000)]
        public void test9() {
            var testCase = "hlbeeykoqqqqokyeeblh";
            var solution = true;
            test(testCase, solution);
        }//public void test9() {

        [TestMethod(), Timeout(3000)]
        public void test10() {
            var testCase = "hlbeeykoqqqokyeeblh";
            var solution = true;
            test(testCase, solution);
        }//public void test10() {

        private void test(string testCase,bool solution) {
            if (solution) {
                Assert.IsTrue(new CheckPalindrome().checkPalindrome(testCase));
            } else {//if (solution) {
                Assert.IsFalse(new CheckPalindrome().checkPalindrome(testCase));
            }//else {
        }//private void test(String testCase,bool solution) {
    }//public class CheckPalindromeTests {
}//namespace Algorithms.src_UnitTests._0_intro._00_the_journey_begins {