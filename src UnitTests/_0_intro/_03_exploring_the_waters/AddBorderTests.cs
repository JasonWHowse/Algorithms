using Algorithms.src._0_intro._03_exploring_the_waters;
using Algorithms.src.helper_functions;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Newtonsoft.Json.Linq;

namespace Algorithms.src_UnitTests._0_intro._03_exploring_the_waters {
    [TestClass()]
    public class AddBorderTests {

        private const int timeout = 3000;
        private const string path = "Test_Cases\\_0_intro\\_03_exploring_the_waters\\AddBorder\\";
        private string[] internedTestCase = new string[0];
        private string[] internedSolution = new string[0];

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

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            string[] testCase = { "yhopw", "hpplz", "idbnb", "*wehb", "swbbg" };
            string[] solution = { "*******", "*yhopw*", "*hpplz*", "*idbnb*", "**wehb*", "*swbbg*", "*******" };
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            string[] testCase = { "**", "**", "*e" };
            string[] solution = { "****", "****", "****", "**e*", "****" };
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            string[] testCase = { "a", "a" };
            string[] solution = { "***", "*a*", "*a*", "***" };
            Test(testCase, solution);
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

        private void Test(string[] testCase, string[] solution) {
            CollectionAssert.AreEqual(solution, new AddBorder().addBorder(testCase));
        }//private void Test(string[] testCase,string[] solution) {

        private void SetTestCaseInfo(string fileName) {
            JObject o = Helpers.GetJsonObject(fileName, path);
            if (o == null) {
                Assert.Fail("JObject for " + fileName + " returns null");
            } else {//if (o == null) {
                JArray preSolution = (JArray)o["output"];
                internedSolution = new string[preSolution.Count];
                for(int i = 0; i < internedSolution.Length; i++) {
                    internedSolution[i] = (string)preSolution[i];
                }//for(int i = 0; i < internedSolution.Length; i++) {
                JArray preTestCase = (JArray)o["input"]["picture"];
                internedTestCase = new string[preTestCase.Count];
                for (int i = 0; i < internedTestCase.Length; i++) {
                    internedTestCase[i] = (string)preTestCase[i];
                }//for (int i = 0; i < internedTestCase.Length; i++) {
            }//else {
        }//public void SetTestCaseInfo(string fileName) {

        [Timeout(timeout)]
        private void DoTest() {
            Test(internedTestCase, internedSolution);
        }//private void DoTest() {
    }//public class AddBorderTests {
}//namespace Algorithms.src_UnitTests._0_intro._03_exploring_the_waters {
