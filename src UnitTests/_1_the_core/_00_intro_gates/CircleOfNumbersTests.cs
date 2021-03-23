﻿using Algorithms.src._1_the_core._00_intro_gates;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._00_intro_gates {
    [TestClass()]
    public class CircleOfNumbersTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase1 = 10;
            var testCase2 = 2;
            var solution = 7;
            Test(testCase1, testCase2, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase1 = 10;
            var testCase2 = 7;
            var solution = 2;
            Test(testCase1, testCase2, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase1 = 4;
            var testCase2 = 1;
            var solution = 3;
            Test(testCase1, testCase2, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase1 = 6;
            var testCase2 = 3;
            var solution = 0;
            Test(testCase1, testCase2, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase1 = 18;
            var testCase2 = 6;
            var solution = 15;
            Test(testCase1, testCase2, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase1 = 12;
            var testCase2 = 10;
            var solution = 4;
            Test(testCase1, testCase2, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase1 = 18;
            var testCase2 = 5;
            var solution = 14;
            Test(testCase1, testCase2, solution);
        }//public void Test7() {

        private void Test(int testCase1, int testCase2, int solution) {
            Assert.AreEqual(solution, new CircleOfNumbers().circleOfNumbers(testCase1, testCase2));
        }//private void Test(int testCase1,int testCase2,int solution) {
    }//public class CircleOfNumbersTests {
}//namespace Algorithms.src_UnitTests._1_the_core._00_intro_gates {
