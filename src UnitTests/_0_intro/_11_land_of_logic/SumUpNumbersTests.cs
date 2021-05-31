using Algorithms.src._0_intro._11_land_of_logic;
using Algorithms.src.helper_functions;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Newtonsoft.Json.Linq;

namespace Algorithms.src_UnitTests._0_intro._11_land_of_logic {
    [TestClass()]
    public class SumUpNumbersTests {

        private const int timeout = 3000;
        private const string path = "Test_Cases\\_0_intro\\_11_land_of_logic\\SumUpNumbers\\";
        private string internedTestCase = "";
        private int internedSolution = 0;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = "2 apples, 12 oranges";
            var solution = 14;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = "123450";
            var solution = 123450;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = "Your payment method is invalid";
            var solution = 0;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = "no digits at all";
            var solution = 0;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = "there are some (12) digits 5566 in this 770 string 239";
            var solution = 6587;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase = "42+781";
            var solution = 823;
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase = "abc abc 4 abc 0 abc";
            var solution = 4;
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase = "abcdefghijklmnopqrstuvwxyz1AbCdEfGhIjKlMnOpqrstuvwxyz23,74 -";
            var solution = 98;
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase = "12 51 0 0 1 0 10";
            var solution = 74;
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase = "";
            var solution = 0;
            Test(testCase, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            var testCase = "n753fq9vmh16ky1a86o0d2nq39ekz4kttkko20tp6l6n763864785eu48eig7j888u4x4lzs1j4ce76vaae65cr4234wwly2583l";
            var solution = 763873641;
            Test(testCase, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            var testCase = "c8s6zw83k0e7um6d41lfowqbqi987x4o6v62k3fut8fh51080x48h31v4751z806em2i5wg042hyz4p6wc440sflv02018g0le4q51221y1y4fjf99xhk86688daa2391s035p95w49kc63h46e4i5jy7uq4u9b380fz8sh73v096jwed3sa03cn93ydva69s7rzscs5511k4963e71hf7gh18d837d490djg30q21jp65g3cgq2e55159nncc133fikc4p510z8sgop7j8xd5yem0qdylj28bqatwyu0q03jk1xpkrq370z84534rw658g6r680xbfwa61v6q1r1t5r1fl224dmf2ss25e0ukw01n426b47b789481b3qgp6y12dw11u5qrroz43zk106yq87rsneqj0q6k132c310zvja2y85x6jqh92f1y2y2ql2hsjbl45a3697b8c7i2fh0g2s2u965nrlv1ps56j3z80906624wy2qct8zxt94w1hyfyx841n656ots3f5pq6b9a7grirz0pp655v27z11ja15x07kat96vfn5n81403mu492yhn66a7p3s3o87o5z891a5ie33o6o8pes3x10mct1t8702ozn0kd175y41c95p7q3265u4v4ll7eo2n90v504t541o0wt097qh8rx36toprg6iewi64ua8771pof755i0t6c1l9a718712l1x826n0dlt0248u709de0124rb5h5on33428h9c12tr2r9076lr0s5eyy19g8h2d65280tw7u230b56k15v782o87c044vo6z446s5zsaf318m8h2z87lj23317t292926a994cvp7t59c387drxjjcd1e8dw9bwvs55y7o96672zogniwb2r6b2541c24p057t4oa0fyzfg8in4er26syh18bvuk230n8e2fio03m4y9h838276u8w6cslm304o49ib838xe45s00udw7";
            var solution = 84254795;
            Test(testCase, solution);
        }//public void Test12() {

        [TestMethod]
        public void Test13() {
            SetTestCaseInfo("test-13.json");
            DoTest();
        }//public void Test13() {

        [TestMethod]
        public void Test14() {
            SetTestCaseInfo("test-14.json");
            DoTest();
        }//public void Test14() {

        [TestMethod]
        public void Test15() {
            SetTestCaseInfo("test-15.json");
            DoTest();
        }//public void Test15() {

        private void Test(string testCase, int solution) {
            Assert.AreEqual(solution, new SumUpNumbers().sumUpNumbers(testCase));
        }//private void Test(string testCase,int solution) {

        private void SetTestCaseInfo(string fileName) {
            JObject o = Helpers.GetJsonObject(fileName, path);
            if (o == null) {
                Assert.Fail("JObject for " + fileName + " returns null");
            } else {//if (o == null) {
                internedSolution = (int)o["output"];
                internedTestCase = (string)o["input"]["inputString"];
            }//else {
        }//public void SetTestCaseInfo(string fileName) {

        [Timeout(timeout)]
        private void DoTest() {
            Test(internedTestCase, internedSolution);
        }//private void DoTest() {
    }//public class SumUpNumbersTests {
}//namespace Algorithms.src_UnitTests._0_intro._11_land_of_logic {
