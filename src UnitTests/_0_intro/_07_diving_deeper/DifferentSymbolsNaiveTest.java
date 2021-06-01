/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._07_diving_deeper;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class DifferentSymbolsNaiveTest {

    @Test
    public void test1() {
        var testCase = "cabca";
        var solution = 3;
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = "aba";
        var solution = 2;
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = "ccccccccccc";
        var solution = 1;
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = "bcaba";
        var solution = 3;
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = "codesignal";
        var solution = 10;
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = "rrbxzqza";
        var solution = 6;
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = "lqqhpughgfkkfgihptucfldgfpdjtesngnehnthltrfqtjfrcdpumqpupiakfuheocrttjlolgotjcetnojmiepnbenpclogtujschplkjaimlniqikkgugspfmhhtordiranioklsqmejnrpjfifihulkgdfmgtnanomkmrmmuqsoibkbjgpktbcoqgtqschrstprqdibfcatjqjumpqaqahcutcihdfmrntenjkcjrhutlslplqmrsamimacmidsssrjbeoekeapceqqfpnkqucouibsdgdrorcqdfopqmmtluftpjueobasmmegqrskgphtnpdlnbcpfnmbmccoudfcijbiarpodscgmoqcrhuellgmcrldgiogrmcdednauggtcmbqtgtkbfmcnenmidghlrtplcuriuromjgiecppeugadgqhepbekqogueqpcqcsfqqpuhtjcpncbdrtiacrtibnhsjihlhojgbrbamoiglotctleerjcjgintppefmnomlgejidkgslitepblcmqekelpopgsppbhmpomgtqqsdcftjfsmnlratfrgcmqpjfioqhuscbplbmdrieerfrcstqlpeatrlejornldpntuojklgikrtqrdtoehkthqoghjjcuecclarqdarnqceqclcadehceaqeokngdgnaclmmfsgdhoareqdablftrhanttmnithkdohmhphqnaencfkuckqdkcgriighrqbitkqhtggiqmktnafqherpcenrtgigsfkhqpttjukqhurlddhqullnrjdkriuttcojcfpuaftbabkpbtlodgbccisjglbmeeahmomkpeuebmpeuiqrtncqgfrkhfrtgcjipudgesnnogqcdargkuelfejamcorfjjubeqpsllaskhpoenbabpfqqcprjlffnadcipbshcdopbjrpsosrgsomaphplkitoesmjqkbubmmobglgnhdgtknkcb";
        var solution = 21;
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = "qwertyuiopasdfghjklzxcvbnm";
        var solution = 26;
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = "wlfeaixgzjscnghhvmittkkywfsoiyqgrzdoeytgrwivbefchkzyeybzbckyieinxwiuyruumpdaqkaeilgirxokbloymckskkjefrzbjlilcbayzgxkylgncufdiyjgiudanoqchzigsytlhurhoekkjmzddllhhkreugtmmmtmmeiiosuirhlzbepygalgynbgjingrngpohcynoyufrjqiaoaebqggizfiuapmlobyswupipdmzmbekxclngplowxjgqkuatkvehtxdkomcefudbogydvqgpmwsibsdatmqgmrhvamchwxsngzcohvvmbxvrrebunvjzobvvkcahkusbtotchfrmobspziquyjznpwinxmmfmwlkoiyastfeayfaqkthohxwxivzmxjhjefywfpjtezsdvtmgjuurbhjpdznbmmbyohnirzqljnaeatqmeoctndqsujkcitpkrdsgkamlxouxmwsugigvlmbganxbckwqodsduhwdzshnhjziztogvbogmweeoltmseisyasxitpiiupyjfomwjbhobkozehewaaxekosoxpcbxikhbdvqflcrocfcpcdgmsnilfeveyhtygtvwyfvqgszkpoxbpdtjhiyreqcahpbbrxzclrtibwzgheytijkeevanwsynpxiimtlynyhhwmphawvjffrxcdtbfeajhwvmxzjbjliichnefzuiffmkixqogbspuugeidjihstfvvbckwuryiurqoyzwqtvaknsqgrwxvcdqspfdamoxreqbxmajinkcieangtyybpmuydemdrwysmnzltdgfcexbincgzuvhgjpefjxdudfmcoabskvpedffpjowcwfzupwwffbiubpcjqqbzrmamsoemxdmqralnmnjpgobfvgsbmdhmyovkglmynvsnezcksqdlyzaqspnpeaomdilkhifmbpokseuslyrvzljvmyzpbdteghiqocyrzit";
        var solution = 26;
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = "aaaaaaaaaaaaaaa";
        var solution = 1;
        test(testCase, solution);
    }//public void test10() {

    private void test(String testCase, int solution){
        assertTimeout(Duration.ofSeconds(3),()->
                new DifferentSymbolsNaive().differentSymbolsNaive(testCase));
        assertEquals(solution,new DifferentSymbolsNaive().differentSymbolsNaive(testCase));
    }//private void test(String testCase, int solution){
}//class DifferentSymbolsNaiveTest {