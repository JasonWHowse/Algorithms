﻿using Algorithms.src._1_the_core._05_labyrinth_of_nested_loops;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._05_labyrinth_of_nested_loops {
    [TestClass()]
    public class IsPowerTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = 125;
            var solution = true;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = 72;
            var solution = false;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = 100;
            var solution = true;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = 11;
            var solution = false;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = 324;
            var solution = true;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase = 256;
            var solution = true;
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase = 119;
            var solution = false;
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase = 400;
            var solution = true;
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase = 350;
            var solution = false;
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase = 361;
            var solution = true;
            Test(testCase, solution);
        }//public void Test10() {

        private void Test(int testCase, bool solution) {
            if (solution) {
                Assert.IsTrue(new IsPower().isPower(testCase));
            } else {//if (solution) {
                Assert.IsFalse(new IsPower().isPower(testCase));
            }//else {
        }//private void Test(int testCase,bool solution) {
    }//public class IsPowerTests {
}//namespace Algorithms.src_UnitTests._1_the_core._05_labyrinth_of_nested_loops {
