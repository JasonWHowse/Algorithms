﻿using Algorithms.src._0_intro._07_diving_deeper;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._07_diving_deeper {
    [TestClass()]
    public class FirstDigitTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = "var_1__Int";
            var solution = '1';
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = "q2q-q";
            var solution = '2';
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = "0ss";
            var solution = '0';
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = "_Aas_23";
            var solution = '2';
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = "a a_933";
            var solution = '9';
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase = "ok0";
            var solution = '0';
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase = "-15";
            var solution = '1';
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase = "a b c 4 e ";
            var solution = '4';
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase = "abcd efg8";
            var solution = '8';
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase = "ab cd 00";
            var solution = '0';
            Test(testCase, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            var testCase = "d91e073";
            var solution = '9';
            Test(testCase, solution);
        }//public void Test11() {

        private void Test(string testCase, char solution) {
            Assert.AreEqual(solution, new FirstDigit().firstDigit(testCase));
        }//private void Test(var testCase,var solution) {
    }//public class FirstDigitTests {
}//namespace Algorithms.src_UnitTests._0_intro._07_diving_deeper {
