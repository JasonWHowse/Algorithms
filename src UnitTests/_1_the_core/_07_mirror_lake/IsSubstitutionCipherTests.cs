using Algorithms.src._1_the_core._07_mirror_lake;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._07_mirror_lake {
    [TestClass()]
    public class IsSubstitutionCipherTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase1 = "aacb";
            var testCase2 = "aabc";
            Test(testCase1, testCase2, true);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase1 = "aa";
            var testCase2 = "bc";
            Test(testCase1, testCase2, false);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase1 = "aaxxaaz";
            var testCase2 = "aazzaay";
            Test(testCase1, testCase2, true);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase1 = "aaxyaa";
            var testCase2 = "aazzaa";
            Test(testCase1, testCase2, false);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase1 = "aabc";
            var testCase2 = "aacb";
            Test(testCase1, testCase2, true);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase1 = "dccd";
            var testCase2 = "zzxx";
            Test(testCase1, testCase2, false);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase1 = "ddcc";
            var testCase2 = "zzxx";
            Test(testCase1, testCase2, true);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase1 = "aaaabbbbcc";
            var testCase2 = "cccccccccc";
            Test(testCase1, testCase2, false);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase1 = "abcdefg";
            var testCase2 = "hijklmn";
            Test(testCase1, testCase2, true);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase1 = "aaabbbccc";
            var testCase2 = "aaabbbccc";
            Test(testCase1, testCase2, true);
        }//public void Test10() {

        private void Test(string testCase1, string testCase2, bool solution) {
            if (solution) {
                Assert.IsTrue(new IsSubstitutionCipher().isSubstitutionCipher(testCase1, testCase2));
            } else {//if (solution) {
                Assert.IsFalse(new IsSubstitutionCipher().isSubstitutionCipher(testCase1, testCase2));
            }//else {
        }//private void Test(string testCase1, string testCase2, bool solution) {
    }//public class IsSubstitutionCipherTests {
}//namespace Algorithms.src_UnitTests._1_the_core._07_mirror_lake {
