﻿using Algorithms.src._1_the_core._00_intro_gates;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._00_intro_gates {
    [TestClass()]
    public class PhoneCallTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase1 = 3;
            var testCase2 = 1;
            var testCase3 = 2;
            var testCase4 = 20;
            var solution = 14;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase1 = 2;
            var testCase2 = 2;
            var testCase3 = 1;
            var testCase4 = 2;
            var solution = 1;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase1 = 10;
            var testCase2 = 1;
            var testCase3 = 2;
            var testCase4 = 22;
            var solution = 11;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase1 = 2;
            var testCase2 = 2;
            var testCase3 = 1;
            var testCase4 = 24;
            var solution = 14;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase1 = 1;
            var testCase2 = 2;
            var testCase3 = 1;
            var testCase4 = 6;
            var solution = 3;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase1 = 10;
            var testCase2 = 10;
            var testCase3 = 10;
            var testCase4 = 8;
            var solution = 0;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase1 = 5;
            var testCase2 = 3;
            var testCase3 = 2;
            var testCase4 = 60;
            var solution = 24;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase1 = 3;
            var testCase2 = 3;
            var testCase3 = 2;
            var testCase4 = 3;
            var solution = 1;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase1 = 2;
            var testCase2 = 4;
            var testCase3 = 2;
            var testCase4 = 8;
            var solution = 2;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase1 = 3;
            var testCase2 = 8;
            var testCase3 = 8;
            var testCase4 = 289;
            var solution = 36;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            var testCase1 = 5;
            var testCase2 = 5;
            var testCase3 = 9;
            var testCase4 = 329;
            var solution = 41;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            var testCase1 = 1;
            var testCase2 = 4;
            var testCase3 = 9;
            var testCase4 = 500;
            var solution = 61;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test12() {

        private void Test(int testCase1, int testCase2, int testCase3, int testCase4, int solution) {
            Assert.AreEqual(solution, new PhoneCall().phoneCall(testCase1, testCase2, testCase3, testCase4));
        }//private void Test(int testCase1, int testCase2, int testCase3, int testCase4, int solution) {
    }//public class PhoneCallTests {
}//namespace Algorithms.src_UnitTests._1_the_core._00_intro_gates {
