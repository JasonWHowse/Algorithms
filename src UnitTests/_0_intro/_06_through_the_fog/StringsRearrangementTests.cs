using Algorithms.src._0_intro._06_through_the_fog;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._06_through_the_fog {
    [TestClass()]
    public class StringsRearrangementTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            string[] testCase = { "aba", "bbb", "bab" };
            bool solution = false;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            string[] testCase = { "ab", "bb", "aa" };
            bool solution = true;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            string[] testCase = { "q", "q" };
            bool solution = false;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            string[] testCase = { "zzzzab", "zzzzbb", "zzzzaa" };
            bool solution = true;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            string[] testCase = { "ab", "ad", "ef", "eg" };
            bool solution = false;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            string[] testCase = { "abc", "bef", "bcc", "bec", "bbc", "bdc" };
            bool solution = true;
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            string[] testCase = { "abc", "abx", "axx", "abc" };
            bool solution = false;
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            string[] testCase = { "abc", "abx", "axx", "abx", "abc" };
            bool solution = true;
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            string[] testCase = { "f", "g", "a", "h" };
            bool solution = true;
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            string[] testCase = { "ff", "gf", "af", "ar", "hf" };
            bool solution = true;
            Test(testCase, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            string[] testCase = { "a", "b", "c" };
            bool solution = true;
            Test(testCase, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            string[] testCase = { "aa", "bb", "cc" };
            bool solution = false;
            Test(testCase, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            string[] testCase = { "bbc", "bba", "abc" };
            bool solution = true;
            Test(testCase, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            string[] testCase = { "oh", "eh", "ah", "po", "op" };
            bool solution = false;
            Test(testCase, solution);
        }//public void Test14() {

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            string[] testCase = { "zzzabzczaba", "zzzabzczaaa", "zzzabzczabb", "zzzabzczbbb" };
            bool solution = true;
            Test(testCase, solution);
        }//public void Test15() {

        [TestMethod(), Timeout(timeout)]
        public void Test16() {
            string[] testCase = { "zzzabzczaaa", "zzzabzczaaa", "zzzabzczaaa", "zzzabzczaaa" };
            bool solution = false;
            Test(testCase, solution);
        }//public void Test16() {

        [TestMethod(), Timeout(timeout)]
        public void Test17() {
            string[] testCase = { "abc", "xbc", "xxc", "xbc", "aby", "ayy", "aby", "azc" };
            bool solution = false;
            Test(testCase, solution);
        }//public void Test17() {

        [TestMethod(), Timeout(timeout)]
        public void Test18() {
            string[] testCase = { "abc", "bef", "bcc", "bew", "zew", "zyw", "bec", "bbc", "bdc" };
            bool solution = true;
            Test(testCase, solution);
        }//public void Test18() {

        [TestMethod(), Timeout(timeout)]
        public void Test19() {
            string[] testCase = { "abacabaabczzzzz", "abacababefzzzzz", "abacababcczzzzz", "abacababeczzzzz", "abacababbczzzzz", "abacababdczzzzz" };
            bool solution = true;
            Test(testCase, solution);
        }//public void Test19() {

        [TestMethod(), Timeout(timeout)]
        public void Test20() {
            string[] testCase = { "abc", "xbc", "xxc", "xbc", "aby", "ayy", "aby" };
            bool solution = true;
            Test(testCase, solution);
        }//public void Test20() {

        [TestMethod(), Timeout(timeout)]
        public void Test21() {
            string[] testCase = { "abc", "xbc", "axc", "abx" };
            bool solution = false;
            Test(testCase, solution);
        }//public void Test21() {

        private void Test(string[] testCase, bool solution) {
            if (solution) {
                Assert.IsTrue(new StringsRearrangement().stringsRearrangement(testCase));
            } else {//if (solution) {
                Assert.IsFalse(new StringsRearrangement().stringsRearrangement(testCase));
            }//else {
        }//private void Test(string[] testCase,bool solution) {
    }//public class StringsRearrangementTests {
}//namespace Algorithms.src_UnitTests._0_intro._06_through_the_fog {
