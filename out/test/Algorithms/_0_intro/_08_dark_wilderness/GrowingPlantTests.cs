﻿using Algorithms.src._0_intro._08_dark_wilderness;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._08_dark_wilderness {
    [TestClass()]
    public class GrowingPlantTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase1 = 100;
            var testCase2 = 10;
            var testCase3 = 910;
            var solution = 10;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase1 = 10;
            var testCase2 = 9;
            var testCase3 = 4;
            var solution = 1;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase1 = 5;
            var testCase2 = 2;
            var testCase3 = 7;
            var solution = 2;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase1 = 7;
            var testCase2 = 3;
            var testCase3 = 443;
            var solution = 110;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase1 = 6;
            var testCase2 = 5;
            var testCase3 = 10;
            var solution = 5;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test5() {

        private void Test(int testCase1, int testCase2, int testCase3, int solution) {
            Assert.AreEqual(solution, new GrowingPlant().growingPlant(testCase1, testCase2, testCase3));
        }//private void Test(int testCase1,int testCase2,int testCase3,int solution) {
    }//public class GrowingPlantTests {
}//namespace Algorithms.src_UnitTests._0_intro._08_dark_wilderness {
