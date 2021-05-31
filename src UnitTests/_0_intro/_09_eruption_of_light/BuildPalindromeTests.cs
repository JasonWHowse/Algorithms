using Algorithms.src._0_intro._09_eruption_of_light;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._09_eruption_of_light {
    [TestClass()]
    public class BuildPalindromeTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = "abcdc";
            var solution = "abcdcba";
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = "ababab";
            var solution = "abababa";
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = "abba";
            var solution = "abba";
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = "abaa";
            var solution = "abaaba";
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = "aaaaba";
            var solution = "aaaabaaaa";
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase = "abc";
            var solution = "abcba";
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase = "kebab";
            var solution = "kebabek";
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase = "abccba";
            var solution = "abccba";
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase = "abcabc";
            var solution = "abcabcbacba";
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase = "cbdbedffcg";
            var solution = "cbdbedffcgcffdebdbc";
            Test(testCase, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            var testCase = "euotmn";
            var solution = "euotmnmtoue";
            Test(testCase, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            var testCase = "jfd";
            var solution = "jfdfj";
            Test(testCase, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            var testCase = "cdfjkbe";
            var solution = "cdfjkbebkjfdc";
            Test(testCase, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            var testCase = "jqrdb";
            var solution = "jqrdbdrqj";
            Test(testCase, solution);
        }//public void Test14() {

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            var testCase = "fej";
            var solution = "fejef";
            Test(testCase, solution);
        }//public void Test15() {

        [TestMethod(), Timeout(timeout)]
        public void Test16() {
            var testCase = "edcahble";
            var solution = "edcahblelbhacde";
            Test(testCase, solution);
        }//public void Test16() {

        [TestMethod(), Timeout(timeout)]
        public void Test17() {
            var testCase = "cfhbkabkjh";
            var solution = "cfhbkabkjhjkbakbhfc";
            Test(testCase, solution);
        }//public void Test17() {

        [TestMethod(), Timeout(timeout)]
        public void Test18() {
            var testCase = "kewlncbzhe";
            var solution = "kewlncbzhehzbcnlwek";
            Test(testCase, solution);
        }//public void Test18() {

        [TestMethod(), Timeout(timeout)]
        public void Test19() {
            var testCase = "jeahf";
            var solution = "jeahfhaej";
            Test(testCase, solution);
        }//public void Test19() {

        [TestMethod(), Timeout(timeout)]
        public void Test20() {
            var testCase = "lmsrlimdrh";
            var solution = "lmsrlimdrhrdmilrsml";
            Test(testCase, solution);
        }//public void Test20() {

        [TestMethod(), Timeout(timeout)]
        public void Test21() {
            var testCase = "aaaaaaaaa";
            var solution = "aaaaaaaaa";
            Test(testCase, solution);
        }//public void Test21() {

        [TestMethod(), Timeout(timeout)]
        public void Test22() {
            var testCase = "aaaaaaba";
            var solution = "aaaaaabaaaaaa";
            Test(testCase, solution);
        }//public void Test22() {

        private void Test(string testCase, string solution) {
            Assert.AreEqual(solution, new BuildPalindrome().buildPalindrome(testCase));
        }//private void Test(string testCase,string solution) {
    }//public class BuildPalindromeTests {
}//namespace Algorithms.src_UnitTests._0_intro._09_eruption_of_light {
