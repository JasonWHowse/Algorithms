﻿using Algorithms.src._1_the_core._03_loop_tunnel;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._03_loop_tunnel {
    [TestClass()]
    public class AdditionWithoutCarryingTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase1 = 456;
            var testCase2 = 1734;
            var solution = 1180;
            Test(testCase1, testCase2, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase1 = 99999;
            var testCase2 = 0;
            var solution = 99999;
            Test(testCase1, testCase2, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase1 = 999;
            var testCase2 = 999;
            var solution = 888;
            Test(testCase1, testCase2, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase1 = 0;
            var testCase2 = 0;
            var solution = 0;
            Test(testCase1, testCase2, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase1 = 54321;
            var testCase2 = 54321;
            var solution = 8642;
            Test(testCase1, testCase2, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase1 = 54321;
            var testCase2 = 56789;
            var solution = 0;
            Test(testCase1, testCase2, solution);
        }//public void Test6() {

        private void Test(int testCase1, int testCase2, int solution) {
            Assert.AreEqual(solution, new AdditionWithoutCarrying().additionWithoutCarrying(testCase1, testCase2));
        }//private void Test(int testCase1,int testCase2,int solution) {
    }//public class AdditionWithoutCarryingTests {
}//namespace Algorithms.src_UnitTests._1_the_core._03_loop_tunnel {
