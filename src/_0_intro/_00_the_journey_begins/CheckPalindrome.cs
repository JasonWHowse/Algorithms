using System;
using System.Collections.Generic;
using System.Text;

namespace Algorithms.src._0_intro._00_the_journey_begins {
    public class CheckPalindrome {
        public bool checkPalindrome(string g) {
            String p = "";
            for (int i = 0; i < g.Length; i++) {
                p = g[i]+p;
            }//for (int i = 0; i < g.Length; i++) {
            return g.Equals(p);
        }//public bool checkPalindrome(string g) {
    }//public class CheckPalindrome {
}//namespace Algorithms.src._0_intro._00_the_journey_begins {