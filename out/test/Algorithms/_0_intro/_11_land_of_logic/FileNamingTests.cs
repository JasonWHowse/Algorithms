using Algorithms.src._0_intro._11_land_of_logic;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._11_land_of_logic {
    [TestClass()]
    public class FileNamingTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            string[] testCase = { "doc", "doc", "image", "doc(1)", "doc" };
            string[] solution = { "doc", "doc(1)", "image", "doc(1)(1)", "doc(2)" };
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            string[] testCase = { "a(1)", "a(6)", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a" };
            string[] solution = { "a(1)", "a(6)", "a", "a(2)", "a(3)", "a(4)", "a(5)", "a(7)", "a(8)", "a(9)", "a(10)", "a(11)" };
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            string[] testCase = { "dd", "dd(1)", "dd(2)", "dd", "dd(1)", "dd(1)(2)", "dd(1)(1)", "dd", "dd(1)" };
            string[] solution = { "dd", "dd(1)", "dd(2)", "dd(3)", "dd(1)(1)", "dd(1)(2)", "dd(1)(1)(1)", "dd(4)", "dd(1)(3)" };
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            string[] testCase = { "a", "b", "cd", "b ", "a(3)" };
            string[] solution = { "a", "b", "cd", "b ", "a(3)" };
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            string[] testCase = { "name", "name", "name(1)", "name(3)", "name(2)", "name(2)" };
            string[] solution = { "name", "name(1)", "name(1)(1)", "name(3)", "name(2)", "name(2)(1)" };
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            string[] testCase = { };
            string[] solution = { };
            Test(testCase, solution);
        }//public void Test6() {

        private void Test(string[] testCase, string[] solution) {
            CollectionAssert.AreEqual(solution, new FileNaming().fileNaming(testCase));
        }//private void Test(string[] testCase, string[] solution) {
    }//public class FileNamingTests {
}//namespace Algorithms.src_UnitTests._0_intro._11_land_of_logic {
