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

        private void Test(string testCase1, string testCase2,int solution) {
            Assert.AreEqual(solution, new CommonCharacterCount().commonCharacterCount(testCase1,testCase2));
        }//private void Test(var testCase1,var testCase2,var testCase3,var testCase4,var testCase5,var solution) {
    }//public class CommonCharacterCountTests {
}//namespace Algorithms.src_UnitTests._0_intro._02_smooth_sailing {
