using Algorithms.src._0_intro._02_smooth_sailing;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._02_smooth_sailing {
    [TestClass()]
    public class CommonCharacterCountTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase1 = "aabcc";
            var testCase2 = "adcaa";
            var solution = 3;
            Test(testCase1, testCase2, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase1 = "zzzz";
            var testCase2 = "zzzzzzz";
            var solution = 4;
            Test(testCase1, testCase2, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase1 = "abca";
            var testCase2 = "xyzbac";
            var solution = 3;
            Test(testCase1, testCase2, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase1 = "a";
            var testCase2 = "b";
            var solution = 0;
            Test(testCase1, testCase2, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase1 = "a";
            var testCase2 = "aaa";
            var solution = 1;
            Test(testCase1, testCase2, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase1 = "abcdefghxyzttw";
            var testCase2 = "hgfedcbaabcwwt";
            var solution = 10;
            Test(testCase1, testCase2, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase1 = "zza";
            var testCase2 = "zzz";
            var solution = 2;
            Test(testCase1, testCase2, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase1 = "abaca";
            var testCase2 = "abaac";
            var solution = 5;
            Test(testCase1, testCase2, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase1 = "aba";
            var testCase2 = "bb";
            var solution = 1;
            Test(testCase1, testCase2, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase1 = "bb";
            var testCase2 = "bbb";
            var solution = 2;
            Test(testCase1, testCase2, solution);
        }//public void Test10() {

        private void Test(string testCase1, string testCase2,int solution) {
            Assert.AreEqual(solution, new CommonCharacterCount().commonCharacterCount(testCase1,testCase2));
        }//private void Test(var testCase1,var testCase2,var testCase3,var testCase4,var testCase5,var solution) {
    }//public class CommonCharacterCountTests {
}//namespace Algorithms.src_UnitTests._0_intro._02_smooth_sailing {
