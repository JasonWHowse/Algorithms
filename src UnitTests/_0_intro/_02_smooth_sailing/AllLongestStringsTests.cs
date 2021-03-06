﻿using Algorithms.src._0_intro._02_smooth_sailing;
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

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            string[] testCase = { "khtalawph", "sbm", "gcyksgxay", "nsfllbkf", "v", "dgi", "comuoube", "fywmfrxgk", "empg" };
            string[] solution = { "khtalawph", "gcyksgxay", "fywmfrxgk" };
            Test(testCase, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            string[] testCase = { "rfty" };
            string[] solution = { "rfty" };
            Test(testCase, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            string[] testCase = { "zcecgkpyb", "tdacd", "m", "wauqkcu", "vpblr", "arykm", "bzogu", "me", "lt" };
            string[] solution = { "zcecgkpyb" };
            Test(testCase, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            string[] testCase = { "ikbxvrug", "hiccycgk", "kyuus" };
            string[] solution = { "ikbxvrug", "hiccycgk" };
            Test(testCase, solution);
        }//public void Test14() {

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            string[] testCase = { "xqa", "hhnyfayyj", "oxuqxqrx", "bbibat", "matafgnmrq", "mswvjnqusu" };
            string[] solution = { "matafgnmrq", "mswvjnqusu" };
            Test(testCase, solution);
        }//public void Test15() {

        [TestMethod(), Timeout(timeout)]
        public void Test16() {
            string[] testCase = { "hxumgl", "udyuekcfn", "zrmiiqwvg", "xmkkgt", "hkz" };
            string[] solution = { "udyuekcfn", "zrmiiqwvg" };
            Test(testCase, solution);
        }//public void Test16() {

        [TestMethod(), Timeout(timeout)]
        public void Test17() {
            string[] testCase = { "guux", "i", "uoopjf", "yhwmg", "qmc", "lixdzs", "t", "duzh" };
            string[] solution = { "uoopjf", "lixdzs" };
            Test(testCase, solution);
        }//public void Test17() {

        [TestMethod(), Timeout(timeout)]
        public void Test18() {
            string[] testCase = { "pjwipkwr", "cbjjkuos", "vao", "kpyutrrxa", "cmt", "ubg" };
            string[] solution = { "kpyutrrxa" };
            Test(testCase, solution);
        }//public void Test18() {

        [TestMethod(), Timeout(timeout)]
        public void Test19() {
            string[] testCase = { "ae", "uljczhlv", "t", "qrxie" };
            string[] solution = { "uljczhlv" };
            Test(testCase, solution);
        }//public void Test19() {

        [TestMethod(), Timeout(timeout)]
        public void Test20() {
            string[] testCase = { "y", "dumcwfqfu" };
            string[] solution = { "dumcwfqfu" };
            Test(testCase, solution);
        }//public void Test20() {

        private void Test(string[] testCase, string[] solution) {
            CollectionAssert.AreEqual(solution, new AllLongestStrings().allLongestStrings(testCase));
        }//private void Test(var testCase,var solution) {
    }//public class AllLongestStringsTests {
}//namespace Algorithms.src_UnitTests._0_intro._02_smooth_sailing {
