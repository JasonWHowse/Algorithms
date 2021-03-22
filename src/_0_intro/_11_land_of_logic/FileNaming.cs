using System.Collections.Generic;

namespace Algorithms.src._0_intro._11_land_of_logic {
    public class FileNaming {

        /*

You are given an array of desired filenames in the order of their creation. Since two files cannot have equal names, the one which comes later will have an addition to its name in a form of (k), where k is the smallest positive integer such that the obtained name is not used yet.

Return an array of names that will be given to the files.

Example

For names = ["doc", "doc", "image", "doc(1)", "doc"], the output should be
fileNaming(names) = ["doc", "doc(1)", "image", "doc(1)(1)", "doc(2)"].

Input/Output

[execution time limit] 3 seconds (cs)

[input] array.string names

Guaranteed constraints:
5 ≤ names.length ≤ 1000,
1 ≤ names[i].length ≤ 15.

[output] array.string

        */

        public
        string[] fileNaming(string[] names) {
            HashSet<string> hS = new HashSet<string>();
            for (int i = 0; i < names.Length; i++) {
                if (!hS.Contains(names[i])) {
                    hS.Add(names[i]);
                } else {//if(!hS.contains(names[i])){
                    for (int j = 1; j <= names.Length; j++) {
                        if (!hS.Contains(names[i] + "(" + j + ")")) {
                            names[i] = names[i] + "(" + j + ")";
                            hS.Add(names[i]);
                            break;
                        }//if(!hS.contains(names[i]+"("+j+")")){
                    }//for(int j=1;j<=names.length;j++){
                }//else{
            }//for(int i=0;i<names.length;i++){
            return names;
        }//string[] fileNaming(string[] names) {
    }//public class FileNaming {
}//namespace Algorithms.src._0_intro._11_land_of_logic {