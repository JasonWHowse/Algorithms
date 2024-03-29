﻿using Algorithms.src.helper_functions;
using Algorithms.src.interview_practice._0_Data_Structures._0_Arrays;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Newtonsoft.Json.Linq;

namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._0_Arrays {
    [TestClass()]
    public class RotateImageTests {

        private const int timeout = 3000;
        private const string path = "Test_Cases\\interview_practice\\_0_Data_Structures\\_0_Arrays\\RotateImage\\";
        private int[][] internedTestCase = new int[0][];
        private int[][] internedSolution = new int[0][];

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[][] testCase = { new int[] { 1, 2, 3 }, new int[] { 4, 5, 6 }, new int[] { 7, 8, 9 } };
            int[][] solution = { new int[] { 7, 4, 1 }, new int[] { 8, 5, 2 }, new int[] { 9, 6, 3 } };
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[][] testCase = { new int[] { 1 } };
            int[][] solution = { new int[] { 1 } };
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[][] testCase = { new int[] { 10, 9, 6, 3, 7 }, new int[] { 6, 10, 2, 9, 7 }, new int[] { 7, 6, 3, 8, 2 }, new int[] { 8, 9, 7, 9, 9 }, new int[] { 6, 8, 6, 8, 2 } };
            int[][] solution = { new int[] { 6, 8, 7, 6, 10 }, new int[] { 8, 9, 6, 10, 9 }, new int[] { 6, 7, 3, 2, 6 }, new int[] { 8, 9, 8, 9, 3 }, new int[] { 2, 9, 2, 7, 7 } };
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[][] testCase = { new int[] { 40, 12, 15, 37, 33, 11, 45, 13, 25, 3 }, new int[] { 37, 35, 15, 43, 23, 12, 22, 29, 46, 43 }, new int[] { 44, 19, 15, 12, 30, 2, 45, 7, 47, 6 }, new int[] { 48, 4, 40, 10, 16, 22, 18, 36, 27, 48 }, new int[] { 45, 17, 36, 28, 47, 46, 8, 4, 17, 3 }, new int[] { 14, 9, 33, 1, 6, 31, 7, 38, 25, 17 }, new int[] { 31, 9, 17, 11, 29, 42, 38, 10, 48, 6 }, new int[] { 12, 13, 42, 3, 47, 24, 28, 22, 3, 47 }, new int[] { 38, 23, 26, 3, 23, 27, 14, 40, 15, 22 }, new int[] { 8, 46, 20, 21, 35, 4, 36, 18, 32, 3 } };
            int[][] solution = { new int[] { 8, 38, 12, 31, 14, 45, 48, 44, 37, 40 }, new int[] { 46, 23, 13, 9, 9, 17, 4, 19, 35, 12 }, new int[] { 20, 26, 42, 17, 33, 36, 40, 15, 15, 15 }, new int[] { 21, 3, 3, 11, 1, 28, 10, 12, 43, 37 }, new int[] { 35, 23, 47, 29, 6, 47, 16, 30, 23, 33 }, new int[] { 4, 27, 24, 42, 31, 46, 22, 2, 12, 11 }, new int[] { 36, 14, 28, 38, 7, 8, 18, 45, 22, 45 }, new int[] { 18, 40, 22, 10, 38, 4, 36, 7, 29, 13 }, new int[] { 32, 15, 3, 48, 25, 17, 27, 47, 46, 25 }, new int[] { 3, 22, 47, 6, 17, 3, 48, 6, 43, 3 } };
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[][] testCase = { new int[] { 33, 35, 8, 24, 19, 1, 3, 1, 4, 5 }, new int[] { 25, 27, 40, 25, 17, 35, 20, 3, 19, 3 }, new int[] { 9, 1, 9, 30, 9, 25, 32, 12, 15, 22 }, new int[] { 30, 47, 25, 10, 18, 1, 19, 17, 43, 17 }, new int[] { 40, 46, 42, 34, 18, 48, 29, 40, 31, 39 }, new int[] { 37, 42, 37, 19, 45, 1, 4, 46, 48, 13 }, new int[] { 8, 26, 31, 46, 44, 24, 34, 29, 12, 25 }, new int[] { 45, 48, 36, 12, 33, 12, 4, 45, 22, 37 }, new int[] { 33, 15, 34, 25, 34, 8, 50, 48, 30, 28 }, new int[] { 18, 19, 22, 29, 15, 43, 38, 30, 8, 47 } };
            int[][] solution = { new int[] { 18, 33, 45, 8, 37, 40, 30, 9, 25, 33 }, new int[] { 19, 15, 48, 26, 42, 46, 47, 1, 27, 35 }, new int[] { 22, 34, 36, 31, 37, 42, 25, 9, 40, 8 }, new int[] { 29, 25, 12, 46, 19, 34, 10, 30, 25, 24 }, new int[] { 15, 34, 33, 44, 45, 18, 18, 9, 17, 19 }, new int[] { 43, 8, 12, 24, 1, 48, 1, 25, 35, 1 }, new int[] { 38, 50, 4, 34, 4, 29, 19, 32, 20, 3 }, new int[] { 30, 48, 45, 29, 46, 40, 17, 12, 3, 1 }, new int[] { 8, 30, 22, 12, 48, 31, 43, 15, 19, 4 }, new int[] { 47, 28, 37, 25, 13, 39, 17, 22, 3, 5 } };
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[][] testCase = { new int[] { 8 } };
            int[][] solution = { new int[] { 8 } };
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[][] testCase = { new int[] { 6, 8, 6, 9, 3 }, new int[] { 6, 8, 7, 6, 1 }, new int[] { 2, 5, 8, 4, 1 }, new int[] { 3, 3, 6, 3, 4 }, new int[] { 5, 6, 6, 6, 5 } };
            int[][] solution = { new int[] { 5, 3, 2, 6, 6 }, new int[] { 6, 3, 5, 8, 8 }, new int[] { 6, 6, 8, 7, 6 }, new int[] { 6, 3, 4, 6, 9 }, new int[] { 5, 4, 1, 1, 3 } };
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod]
        public void Test8() {
            SetTestCaseInfo("test-8.json");
            DoTest();
        }//public void Test8() {

        [TestMethod]
        public void Test9() {
            SetTestCaseInfo("test-9.json");
            DoTest();
        }//public void Test9() {

        [TestMethod]
        public void Test10() {
            SetTestCaseInfo("test-10.json");
            DoTest();
        }//public void Test10() {

        private void Test(int[][] testCase, int[][] solution) {
            int[][] actual = new RotateImage().rotateImage(testCase);
            Assert.AreEqual(solution.Length, actual.Length);
            for (int i = 0; i < actual.Length; i++) {
                CollectionAssert.AreEqual(solution[i], actual[i]);
            }//for (int i = 0; i < actual.Length; i++) {
        }//private void Test(int[][] testCase,int[][] solution) {

        private void SetTestCaseInfo(string fileName) {
            JObject o = Helpers.GetJsonObject(fileName, path);
            if (o == null) {
                Assert.Fail("JObject for " + fileName + " returns null");
            } else {//if (o == null) {
                JArray preSolution = (JArray)o["output"];
                internedSolution = new int[preSolution.Count][];
                for(int x = 0; x < internedSolution.Length; x++) {
                    internedSolution[x]=new int[((JArray)preSolution[x]).Count];
                    for(int y = 0; y < internedSolution[x].Length; y++) {
                        internedSolution[x][y] = (int)preSolution[x][y];
                    }//for(int y = 0; y < internedSolution[x].Length; y++) {
                }//for(int x = 0; x < internedSolution.Length; x++) {
                JArray preTestCase = (JArray)o["input"]["a"];
                internedTestCase = new int[preTestCase.Count][];
                for (int x = 0; x < internedTestCase.Length; x++) {
                    internedTestCase[x] = new int[((JArray)preTestCase[x]).Count];
                    for(int y = 0; y < internedTestCase[x].Length; y++) {
                        internedTestCase[x][y] = (int)preTestCase[x][y];
                    }//for(int y = 0; y < internedTestCase[x].Length; y++) {
                }//for (int i = 0; i < internedTestCase.Length; i++) {
            }//else {
        }//public void SetTestCaseInfo(string fileName) {

        [Timeout(timeout)]
        private void DoTest() {
            Test(internedTestCase, internedSolution);
        }//private void DoTest() {
    }//public class RotateImageTests {
}//namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._0_Arrays {
