/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._05_rains_of_reason;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class AlphabeticShiftTest {

    @Test
    public void test1() {
        var testCase = "crazy";
        var solution = "dsbaz";
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = "z";
        var solution = "a";
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = "aaaabbbccd";
        var solution = "bbbbcccdde";
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = "fuzzy";
        var solution = "gvaaz";
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = "codesignal";
        var solution = "dpeftjhobm";
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = "eryqo";
        var solution = "fszrp";
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = "yeap";
        var solution = "zfbq";
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = "kitvbazzzkvzjzozzzbxzazndtzznzwezbzzfhjzdazzufoizzzzzzzzhvczzrjzzhozzzcznjzgztyzlxczzyzzkxezzhzzzzznhzazrzvnedvtzfzcuzhhszolzyouxzzbznzezzbzzzzkxrzxzzzizzdzwxzzfoqzdmreiwzhgozqvyhshazqzzdaszjkkzgxvzzkzezzzolovzzzkergzyhvazzzttrvzzztzhzbxzqzcbhkzgtscfzezcjzkahgzzuczgznnzzmmrzszzzzdzeztzzzgrzrzzkzbzdzztzzzzqzqzszzvsijzziqazmzztzzxfzmjmzjzhgzzzizezzhzaoezlywzznzjxzzpzmzaczalznghizzzdzzzzszpzjrpmzshzazjzzjxjxzkgxqzonpdzezgeiirglzzzvzzzlpzzzbkhuzzudzzzzzztjqizzzzvhizzbzzhzzlpkzzlnazmvczzjubkbnzxzkbzvzzcpbzcztbzganzzzcqzzgzzzeozzcrpamzzhzzislwzmzgzvzzwzzzzyemdzzzzxhzgsgzsxwzbzzlxevzzzzzbgsmuezxzzzzkzjezlzznzmjujewicnzvzgrzzbhzzoeutzzyxlziuznczzkhyzrzrnzuzzzmxlzzzyjzzzzszzzsxzzgqzzrxnzvejjpuzzzlzmrzemzzozhzzzkzryezhjpnbztzzzzzzqtqpzvzazzzolaydrvblczzozotzzlzumijzzqojzszxfcnzzzryrcqezddizzozkskzyjzzzzlxtezthzhozzwzhozdrzdizzzdozebeogyokepdezzlebzzlqxzqzhralczzczkzzzzzpzwwzrnmpfzzmzzazzctlzzzijzzxczfhwyzzzvzxzzdtzlipzovjazzzrhzzzzzctjztzzcezzvzfzpzzizzwbzzsvzioczdzbslzzixbndvqukzkwwzzrmzrezjezz";
        var solution = "ljuwcbaaalwakapaaacyabaoeuaaoaxfacaagikaebaavgpjaaaaaaaaiwdaaskaaipaaadaokahauzamydaazaalyfaaiaaaaaoiabasawofewuagadvaiitapmazpvyaacaoafaacaaaalysayaaajaaeaxyaagpraensfjxaihparwzitibaraaebtakllahywaalafaaapmpwaaalfshaziwbaaauuswaaauaiacyaradcilahutdgafadkalbihaavdahaooaannsataaaaeafauaaahsasaalacaeaauaaaararataawtjkaajrbanaauaayganknakaihaaajafaaiabpfamzxaaoakyaaqanabdabmaohijaaaeaaaataqaksqnatiabakaakykyalhyrapoqeafahfjjshmaaawaaamqaaaclivaaveaaaaaaukrjaaaawijaacaaiaamqlaamobanwdaakvclcoayalcawaadqcadaucahboaaadraahaaafpaadsqbnaaiaajtmxanahawaaxaaaazfneaaaayiahthatyxacaamyfwaaaaachtnvfayaaaalakfamaaoankvkfxjdoawahsaaciaapfvuaazymajvaodaalizasasoavaaanymaaazkaaaataaatyaahraasyoawfkkqvaaamansafnaapaiaaalaszfaikqocauaaaaaarurqawabaaapmbzeswcmdaapapuaamavnjkaarpkataygdoaaaszsdrfaeejaapaltlazkaaaamyufauiaipaaxaipaesaejaaaepafcfphzplfqefaamfcaamryaraisbmdaadalaaaaaqaxxasonqgaanaabaadumaaajkaaydagixzaaawayaaeuamjqapwkbaaasiaaaaadukauaadfaawagaqaajaaxcaatwajpdaeactmaajycoewrvlalxxaasnasfakfaa";
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = "znczszzybxzzazzczzzzzfnfzzzzzqzztmezgzozudyzbzzvgwkzznazzzjzfzzukyzzjaryhwuzztzzzzzwtzduzzlzziozzizhzsizczzpvacszgzzsfzsgztzzzzzgzdzztzzizsztxfczczelzinkgjzrxzszzwcdjzkferzzlnzzyzujfzzqzsqzzzvazzsvzxzzkzzqjzzjykznzzzfcuczoazrkluzzqzxzojnzzlazzzcmdwslpzzxfzgmwzzcezdmzzzbdtadzfkymrdudymxgzkxpezzzzziphzzgzzzuzzzjwqynzfozzwuiiazddtbzjczconzlwzeyzczzeozeezzzzgzzyzukzzdzvzfzzzzslpzwqgjyzzxzzxbzzzszrzzzlzizzzzzpzzezgzzzqwxozkdzzkznqlwzyprzgqzzmzjxzlpvgbztrzzzjzmyzzuzkzzhzzzzkzhjyobcmzzezlwczmzrzzdtzzzzzsgzzndzzzzzpczzmzzlkbjhzcqzzxnezrzzzbzwnuzyzhklzzeztzzdzzghuiczgbzzzzzzzwgzzlzwzdzlvzafuzvhzzyggwloxayzzzzzzzzebxzzzzztzzbmzuzzbtsnavbyzuzzzszpyzdzqzzuxeeqlqzzjzgfxzzoxfzqzectwrrogdukjsoyzbyzrzuyozzzzzzzzzkiuwzffddkzngzzpzzunhzwmzpvsdzbfazszzfckzyazzgzzqlzzzozzlzzrwzzmevbzzguezzkmtzvwywscczwulznzumzkzzzazltwzpizcezzzzjzzmohzzujzzzvyzzjzzzziqzzzcuozzmzznlzzzzajrzvzzzfzfzzgmuzszwvokzkzwozzzzqtshjaczzgzwzzzzropzfzrzznmowzqzzzvzzzsbfcczewzrvbfzkzzsazxezvchzzjznzpzztzqzzzbzzzzzzzzipzodzzznrzingrqzzl";
        var solution = "aodataazcyaabaadaaaaagogaaaaaraaunfahapavezacaawhxlaaobaaakagaavlzaakbszixvaauaaaaaxuaevaamaajpaajaiatjadaaqwbdtahaatgathauaaaaahaeaauaajatauygdadafmajolhkasyataaxdekalgfsaamoaazavkgaaratraaawbaatwayaalaarkaakzlaoaaagdvdapbaslmvaarayapkoaambaaadnextmqaaygahnxaadfaenaaaceubeaglznseveznyhalyqfaaaaajqiaahaaavaaakxrzoagpaaxvjjbaeeucakdadpoamxafzadaafpaffaaaahaazavlaaeawagaaaatmqaxrhkzaayaaycaaatasaaamajaaaaaqaafahaaarxypaleaalaormxazqsahraanakyamqwhcausaaakanzaavalaaiaaaalaikzpcdnaafamxdanasaaeuaaaaathaaoeaaaaaqdaanaamlckiadraayofasaaacaxovazailmaafauaaeaahivjdahcaaaaaaaxhaamaxaeamwabgvawiaazhhxmpybzaaaaaaaafcyaaaaauaacnavaacutobwczavaaataqzaearaavyffrmraakahgyaapygarafduxssphevlktpzaczasavzpaaaaaaaaaljvxaggeelaohaaqaavoiaxnaqwteacgbataagdlazbaahaarmaaapaamaasxaanfwcaahvfaalnuawxzxtddaxvmaoavnalaaabamuxaqjadfaaaakaanpiaavkaaawzaakaaaajraaadvpaanaaomaaaabksawaaagagaahnvataxwplalaxpaaaarutikbdaahaxaaaaspqagasaaonpxaraaawaaatcgddafxaswcgalaatbayfawdiaakaoaqaauaraaacaaaaaaaajqapeaaaosajohsraam";
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = "hzlgrmkzbvphqzgzwzzhxzrzzzzqatbzzbszzzzzczowuzrzxzezzzgzizzauzmozrzzprzzzzqoxlzgizxznoizzzjzzzwzhpsazttizzcjzazzznnzjuzwznyynzzyaazhizpnzsqzzzzzmvzwnzzzzzzzvmfzezvzlrttzzzzzhsznwkzmzzrpzbszzyvgnzzegmbzebzbzzzzttzsyolzzkzzvzjsfwzomvjzzzzdzzqzzzsjzmvzizzzzwzznzzzsazxcpgbwzyhewzzzfzlzzzyzqosfwzzqmzdzazzzzzzxprzszxvhzbozzfspxpzldzzzewvezxzzznzhzzkzwnnzvzvzzizzztzzixxgqpvczzxzdrvzszzrzzzlzqtwzzzzzzdszylkzzzhlezfzzvzzhbzixzzzfzzzzcxueznzzqkzzidzzszzzqzzzzzkizxszjzzzulztrizzzopzbzzszsljzzzzjzrcjnmzezyzwjemczyzijzxpdzobzzznvsdabnpwzgfvkzxcvzacxmzkftxqzpvzbzpzqzvieyfzazzzzrzzzzpzozwfzalpczoohizczwrjyitjcxzozztzzzzegzfzkzftzounzzzzfxzlnzzxzmkznzszvztzzzagvxzjczazjkzfzzhzejzzgzzfzzzzryzyzzzzzjzzzbzozdezrzzzzzbczzmwvvzgcazrkzcfzumgzdzzkhzczzzkzbzfjzdwgzzybuzlgszzbaoezyzbzntpzzodzvsuzygyzzzsqhzknvkzzzxizzkrzzzocxzzsjwqzztuyzzojtztzkmvtiopkzgzyttzzjzzuzldmfzzzhrzahsztzrfuyoozplqzzzazzztzycgzmfjzcbzmzwjbtzztjuxdopezzhdndzlztzgybupzfzhzxrgyzxzdzxygzzznzzijzkzxzgdbzzlzkzorsgzmnmzztthszztruzmdzzznizzpzz";
        var solution = "iamhsnlacwqirahaxaaiyasaaaarbucaactaaaaadapxvasayafaaahajaabvanpasaaqsaaaarpymahjayaopjaaakaaaxaiqtbauujaadkabaaaooakvaxaozzoaazbbaijaqoatraaaaanwaxoaaaaaaawngafawamsuuaaaaaitaoxlanaasqactaazwhoaafhncafcacaaaauuatzpmaalaawaktgxapnwkaaaaeaaraaatkanwajaaaaxaaoaaatbaydqhcxazifxaaagamaaazarptgxaarnaeabaaaaaayqsataywiacpaagtqyqameaaafxwfayaaaoaiaalaxooawawaajaaauaajyyhrqwdaayaeswataasaaamaruxaaaaaaetazmlaaaimfagaawaaicajyaaagaaaadyvfaoaarlaajeaataaaraaaaaljaytakaaavmausjaaapqacaatatmkaaaakasdkonafazaxkfndazajkayqeapcaaaowtebcoqxahgwlaydwabdynalguyraqwacaqarawjfzgabaaaasaaaaqapaxgabmqdappijadaxskzjukdyapaauaaaafhagalaguapvoaaaagyamoaayanlaoatawauaaabhwyakdabaklagaaiafkaahaagaaaaszazaaaaakaaacapaefasaaaaacdaanxwwahdbasladgavnhaeaaliadaaalacagkaexhaazcvamhtaacbpfazacaouqaapeawtvazhzaaatrialowlaaayjaalsaaapdyaatkxraauvzaapkuaualnwujpqlahazuuaakaavamengaaaisabitauasgvzppaqmraaabaaauazdhangkadcanaxkcuaaukvyepqfaaieoeamauahzcvqagaiayshzayaeayzhaaaoaajkalayahecaamalapsthanonaauuitaausvaneaaaojaaqaa";
        test(testCase, solution);
    }//public void test10() {

    private void test(String testCase, String solution){
        assertTimeout(Duration.ofSeconds(3),()->new AlphabeticShift().alphabeticShift(testCase));
        assertEquals(new AlphabeticShift().alphabeticShift(testCase),solution);
    }//private void test(String testCase, String solution){
}//class AlphabeticShiftTest {