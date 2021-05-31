using Algorithms.src._0_intro._00_the_journey_begins;
using Algorithms.src.helper_functions;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Newtonsoft.Json.Linq;

namespace Algorithms.src_UnitTests._0_intro._00_the_journey_begins {
    [TestClass()]
    public class CheckPalindromeTests {

        private const int timeout = 3000;
        private const string path = "Test_Cases\\_0_intro\\_00_the_journey_begins\\CheckPalindrome\\";
        private string internedTestCase = "";
        private bool internedSolution = false;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = "aabaa";
            var solution = true;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = "abac";
            var solution = false;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = "a";
            var solution = true;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = "az";
            var solution = false;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = "abacaba";
            var solution = true;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase = "z";
            var solution = true;
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase = "aaabaaaa";
            var solution = false;
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase = "zzzazzazz";
            var solution = false;
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase = "hlbeeykoqqqqokyeeblh";
            var solution = true;
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase = "hlbeeykoqqqokyeeblh";
            var solution = true;
            Test(testCase, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            var testCase = "tnfodxxzqtivgnostongvitqzxxdofnt";
            var solution = false;
            Test(testCase, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            var testCase = "tnfodxxzqtivgnottongvitqzxxdofnt";
            var solution = true;
            Test(testCase, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            var testCase = "zdsptawefecbickktjoeeojtkkcibcefewatpsdz";
            var solution = true;
            Test(testCase, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            var testCase = "dshdyghryuwbdiqiuwjhdisayueyhdasdwhgdhhshaduw";
            var solution = false;
            Test(testCase, solution);
        }//public void Test14() {

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            var testCase = "gvtygiiyztilqbukcrropxafkskfaxporrckubqlitzyiigytvg";
            var solution = true;
            Test(testCase, solution);
        }//public void Test15() {

        [TestMethod(), Timeout(timeout)]
        public void Test16() {
            var testCase = "sxwghmtxvzpzmxejczaqufqmibscltvbzouuordogclpqywzgyfulfpzuzwvkhhfitozydwjjoacdxfspbakpnltunrrgzffzcjx";
            var solution = false;
            Test(testCase, solution);
        }//public void Test16() {

        [TestMethod(), Timeout(timeout)]
        public void Test17() {
            var testCase = "sxwghmtxvzpzmxejczaqufqmibscltvbzouuordogclpqywzgyfulfpzuzwvkhhfitozydwjjoacdxfspbakpnltunrrgzffzcjxsxwghmtxvzpzmxejczaqufqmibscltvbzouuordogclpqywzgyfulfpzuzwvkhhfitozydwjjoacdxfspbakpnltunrrgzffzcjx";
            var solution = false;
            Test(testCase, solution);
        }//public void Test17() {

        [TestMethod(), Timeout(timeout)]
        public void Test18() {
            var testCase = "ksswieohzzonjqosouzbnthoqfktlhokcblmleilmrbxvldvodyhuzknirkdlexrprgqbznnwypsjowrjyteosbhqflkvyfshhgzchhchyeeasbopifwhsusjvxsvlxtchrxzywptdljywcqykstepgzufvcxphtjsnxeveuqybmifdbpnwwruqgyzbltubkjzvxhpsuusphxvzjkbutlbzygqurwwnpbdfimbyquevexnsjthpxcvfuzgpetskyqcwyjldtpwyzxrhctxlvsxvjsushwfipobsaeeyhchhczghhsfyvklfqhbsoetyjrwojspywnnzbqgrprxeldkrinkzuhydovdlvxbrmlielmlbckohltkfqohtnbzuosoqjnozzhoeiwssk";
            var solution = true;
            Test(testCase, solution);
        }//public void Test18() {

        [TestMethod]
        public void Test19() {
            SetTestCaseInfo("test-19.json");
            DoTest();
        }//public void Test19() {

        [TestMethod]
        public void Test20() {
            SetTestCaseInfo("test-20.json");
            DoTest();
        }//public void Test20() {

        private void Test(string testCase,bool solution) {
            if (solution) {
                Assert.IsTrue(new CheckPalindrome().checkPalindrome(testCase));
            } else {//if (solution) {
                Assert.IsFalse(new CheckPalindrome().checkPalindrome(testCase));
            }//else {
        }//private void Test(String testCase,bool solution) {

        private void SetTestCaseInfo(string fileName) {
            JObject o = Helpers.GetJsonObject(fileName, path);
            if (o == null) {
                Assert.Fail("JObject for " + fileName + " returns null");
            } else {//if (o == null) {
                internedSolution = (bool)o["output"];
                internedTestCase = (string)o["input"]["inputString"];
            }//else {
        }//private void SetTestCaseInfo(string fileName) {

        [Timeout(timeout)]
        private void DoTest() {
            Test(internedTestCase, internedSolution);
        }//private void DoTest() {
    }//public class CheckPalindromeTests {
}//namespace Algorithms.src_UnitTests._0_intro._00_the_journey_begins {