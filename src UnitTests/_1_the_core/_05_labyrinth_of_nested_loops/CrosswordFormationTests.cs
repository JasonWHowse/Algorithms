﻿using Algorithms.src._1_the_core._05_labyrinth_of_nested_loops;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._05_labyrinth_of_nested_loops {
    [TestClass()]
    public class CrosswordFormationTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            string[] testCase = { "crossword", "square", "formation", "something" };
            var solution = 6;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            string[] testCase = { "anaesthetist", "thatch", "ethnics", "sabulous" };
            var solution = 0;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            string[] testCase = { "eternal", "texas", "chainsaw", "massacre" };
            var solution = 4;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            string[] testCase = { "africa", "america", "australia", "antarctica" };
            var solution = 62;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            string[] testCase = { "phenomenon", "remuneration", "particularly", "pronunciation" };
            var solution = 62;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            string[] testCase = { "onomatopoeia", "philosophical", "provocatively", "thesaurus" };
            var solution = 20;
            Test(testCase, solution);
        }//public void Test6() {

        private void Test(string[] testCase, int solution) {
            Assert.AreEqual(solution, new CrosswordFormation().crosswordFormation(testCase));
        }//private void Test(string[] testCase,int solution) {
    }//public class CrosswordFormationTests {
}//namespace Algorithms.src_UnitTests._1_the_core._05_labyrinth_of_nested_loops {
