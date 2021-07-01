using Algorithms.src._1_the_core._07_mirror_lake;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._07_mirror_lake {
    [TestClass()]
    public class CreateAnagramTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase1 = "AABAA";
            var testCase2 = "BBAAA";
            var solution = 1;
            Test(testCase1, testCase2, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase1 = "OVGHK";
            var testCase2 = "RPGUC";
            var solution = 4;
            Test(testCase1, testCase2, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase1 = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAB";
            var testCase2 = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAC";
            var solution = 1;
            Test(testCase1, testCase2, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase1 = "HDFFVR";
            var testCase2 = "FEDDEE";
            var solution = 4;
            Test(testCase1, testCase2, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase1 = "AABCDS";
            var testCase2 = "BASEAE";
            var solution = 2;
            Test(testCase1, testCase2, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase1 = "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZY";
            var testCase2 = "YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYZ";
            var solution = 31;
            Test(testCase1, testCase2, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase1 = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
            var testCase2 = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
            var solution = 0;
            Test(testCase1, testCase2, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase1 = "AAAAAA";
            var testCase2 = "AAAAAA";
            var solution = 0;
            Test(testCase1, testCase2, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase1 = "KJDMDLEEKALIJB";
            var testCase2 = "AFDJGDCGHMIGHB";
            var solution = 7;
            Test(testCase1, testCase2, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase1 = "BBAAABCBCAABB";
            var testCase2 = "BBBCCCBABBACA";
            var solution = 2;
            Test(testCase1, testCase2, solution);
        }//public void Test10() {

        private void Test(string testCase1, string testCase2, int solution) {
            Assert.AreEqual(solution, new CreateAnagram().createAnagram(testCase1, testCase2));
        }//private void Test(string testCase1, string testCase2, int solution) {
    }//public class CreateAnagramTests {
}//namespace Algorithms.src_UnitTests._1_the_core._07_mirror_lake {
