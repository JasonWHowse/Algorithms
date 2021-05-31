using Algorithms.src._0_intro._07_diving_deeper;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._07_diving_deeper {
    [TestClass()]
    public class DifferentSymbolsNaiveTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = "cabca";
            var solution = 3;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = "aba";
            var solution = 2;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = "ccccccccccc";
            var solution = 1;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = "bcaba";
            var solution = 3;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = "codesignal";
            var solution = 10;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase = "rrbxzqza";
            var solution = 6;
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase = "lqqhpughgfkkfgihptucfldgfpdjtesngnehnthltrfqtjfrcdpumqpupiakfuheocrttjlolgotjcetnojmiepnbenpclogtujschplkjaimlniqikkgugspfmhhtordiranioklsqmejnrpjfifihulkgdfmgtnanomkmrmmuqsoibkbjgpktbcoqgtqschrstprqdibfcatjqjumpqaqahcutcihdfmrntenjkcjrhutlslplqmrsamimacmidsssrjbeoekeapceqqfpnkqucouibsdgdrorcqdfopqmmtluftpjueobasmmegqrskgphtnpdlnbcpfnmbmccoudfcijbiarpodscgmoqcrhuellgmcrldgiogrmcdednauggtcmbqtgtkbfmcnenmidghlrtplcuriuromjgiecppeugadgqhepbekqogueqpcqcsfqqpuhtjcpncbdrtiacrtibnhsjihlhojgbrbamoiglotctleerjcjgintppefmnomlgejidkgslitepblcmqekelpopgsppbhmpomgtqqsdcftjfsmnlratfrgcmqpjfioqhuscbplbmdrieerfrcstqlpeatrlejornldpntuojklgikrtqrdtoehkthqoghjjcuecclarqdarnqceqclcadehceaqeokngdgnaclmmfsgdhoareqdablftrhanttmnithkdohmhphqnaencfkuckqdkcgriighrqbitkqhtggiqmktnafqherpcenrtgigsfkhqpttjukqhurlddhqullnrjdkriuttcojcfpuaftbabkpbtlodgbccisjglbmeeahmomkpeuebmpeuiqrtncqgfrkhfrtgcjipudgesnnogqcdargkuelfejamcorfjjubeqpsllaskhpoenbabpfqqcprjlffnadcipbshcdopbjrpsosrgsomaphplkitoesmjqkbubmmobglgnhdgtknkcb";
            var solution = 21;
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase = "qwertyuiopasdfghjklzxcvbnm";
            var solution = 26;
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase = "wlfeaixgzjscnghhvmittkkywfsoiyqgrzdoeytgrwivbefchkzyeybzbckyieinxwiuyruumpdaqkaeilgirxokbloymckskkjefrzbjlilcbayzgxkylgncufdiyjgiudanoqchzigsytlhurhoekkjmzddllhhkreugtmmmtmmeiiosuirhlzbepygalgynbgjingrngpohcynoyufrjqiaoaebqggizfiuapmlobyswupipdmzmbekxclngplowxjgqkuatkvehtxdkomcefudbogydvqgpmwsibsdatmqgmrhvamchwxsngzcohvvmbxvrrebunvjzobvvkcahkusbtotchfrmobspziquyjznpwinxmmfmwlkoiyastfeayfaqkthohxwxivzmxjhjefywfpjtezsdvtmgjuurbhjpdznbmmbyohnirzqljnaeatqmeoctndqsujkcitpkrdsgkamlxouxmwsugigvlmbganxbckwqodsduhwdzshnhjziztogvbogmweeoltmseisyasxitpiiupyjfomwjbhobkozehewaaxekosoxpcbxikhbdvqflcrocfcpcdgmsnilfeveyhtygtvwyfvqgszkpoxbpdtjhiyreqcahpbbrxzclrtibwzgheytijkeevanwsynpxiimtlynyhhwmphawvjffrxcdtbfeajhwvmxzjbjliichnefzuiffmkixqogbspuugeidjihstfvvbckwuryiurqoyzwqtvaknsqgrwxvcdqspfdamoxreqbxmajinkcieangtyybpmuydemdrwysmnzltdgfcexbincgzuvhgjpefjxdudfmcoabskvpedffpjowcwfzupwwffbiubpcjqqbzrmamsoemxdmqralnmnjpgobfvgsbmdhmyovkglmynvsnezcksqdlyzaqspnpeaomdilkhifmbpokseuslyrvzljvmyzpbdteghiqocyrzit";
            var solution = 26;
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase = "aaaaaaaaaaaaaaa";
            var solution = 1;
            Test(testCase, solution);
        }//public void Test10() {

        private void Test(string testCase, int solution) {
            Assert.AreEqual(solution, new DifferentSymbolsNaive().differentSymbolsNaive(testCase));
        }//private void Test(string testCase, int solution) {
    }//public class DifferentSymbolsNaiveTests {
}//namespace Algorithms.src_UnitTests._0_intro._07_diving_deeper {
