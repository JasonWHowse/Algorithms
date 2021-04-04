using Algorithms.src._0_intro._02_smooth_sailing;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._02_smooth_sailing {
    [TestClass()]
    public class AllLongestStringsTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            string[] testCase = { "aba", "aa", "ad", "vcd", "aba"};
            string[] solution = { "aba", "vcd", "aba"};
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            string[] testCase = { "aa" };
            string[] solution = { "aa" };
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            string[] testCase = {"abc", "eeee", "abcd", "dcd" };
            string[] solution = {"eeee", "abcd" };
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            string[] testCase = {"a", "abc", "cbd", "zzzzzz", "a", "abcdef", "asasa", "aaaaaa" };
            string[] solution = {"zzzzzz", "abcdef", "aaaaaa" };
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            string[] testCase = { "enyky", "benyky", "yely", "varennyky"};
            string[] solution = { "varennyky" };
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            string[] testCase = { "abacaba", "abacab", "abac", "xxxxxx"};
            string[] solution = { "abacaba" };
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            string[] testCase = { "young", "yooooooung", "hot", "or", "not", "come", "on", "fire", "water", "watermelon"};
            string[] solution = {"yooooooung", "watermelon" };
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            string[] testCase = {"onsfnib", "aokbcwthc", "jrfcw" };
            string[] solution = { "aokbcwthc" };
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            string[] testCase = { "lbgwyqkry" };
            string[] solution = { "lbgwyqkry" };
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            string[] testCase = { "i" };
            string[] solution = { "i" };
            Test(testCase, solution);
        }//public void Test10() {

        private void Test(string[] testCase, string[] solution) {
            CollectionAssert.AreEqual(solution, new AllLongestStrings().allLongestStrings(testCase));
        }//private void Test(var testCase,var solution) {
    }//public class AllLongestStringsTests {
}//namespace Algorithms.src_UnitTests._0_intro._02_smooth_sailing {
