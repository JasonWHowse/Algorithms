using Algorithms.src._0_intro._03_exploring_the_waters;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._03_exploring_the_waters {
    [TestClass()]
    public class AddBorderTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            string[] testCase = { "abc", "ded" };
            string[] solution = { "*****", "*abc*", "*ded*", "*****" };
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            string[] testCase = { "a" };
            string[] solution = { "***", "*a*", "***" };
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            string[] testCase = { "aa", "**", "zz" };
            string[] solution = { "****", "*aa*", "****", "*zz*", "****" };
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            string[] testCase = { "abcde", "fghij", "klmno", "pqrst", "uvwxy" };
            string[] solution = { "*******", "*abcde*", "*fghij*", "*klmno*", "*pqrst*", "*uvwxy*", "*******" };
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            string[] testCase = { "wzy**" };
            string[] solution = { "*******", "*wzy***", "*******" };
            Test(testCase, solution);
        }//public void Test5() {

        private void Test(string[] testCase, string[] solution) {
            CollectionAssert.AreEqual(solution, new AddBorder().addBorder(testCase));
        }//private void Test(string[] testCase,string[] solution) {
    }//public class AddBorderTests {
}//namespace Algorithms.src_UnitTests._0_intro._03_exploring_the_waters {
