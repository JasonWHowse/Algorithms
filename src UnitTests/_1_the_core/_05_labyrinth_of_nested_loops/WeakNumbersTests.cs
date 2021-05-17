﻿using Algorithms.src._1_the_core._05_labyrinth_of_nested_loops;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._05_labyrinth_of_nested_loops {
    [TestClass()]
    public class WeakNumbersTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = 9;
            int[] solution = { 2, 2 };
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = 1;
            int[] solution = { 0, 1 };
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = 2;
            int[] solution = { 0, 2 };
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = 7;
            int[] solution = { 2, 1 };
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = 500;
            int[] solution = { 403, 1 };
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase = 4;
            int[] solution = { 0, 4 };
            Test(testCase, solution);
        }//public void Test6() {

        private void Test(int testCase, int[] solution) {
            CollectionAssert.AreEqual(solution, new WeakNumbers().weakNumbers(testCase));
        }//private void Test(int testCase,int[] solution) {
    }//public class WeakNumbersTests {
}//namespace Algorithms.src_UnitTests._1_the_core._05_labyrinth_of_nested_loops {