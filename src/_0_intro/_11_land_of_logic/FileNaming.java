/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._11_land_of_logic;

import java.util.HashSet;

public class FileNaming {

/*
You are given an array of desired filenames in
the order of their creation. Since two files
cannot have equal names, the one which comes
later will have an addition to its name in a
form of (k), where k is the smallest positive
integer such that the obtained name is not
used yet.

Return an array of names that will be given
to the files.
 */

    String[] fileNaming(String[] names) {
        HashSet<String> hS=new HashSet<>();
        for(int i=0;i<names.length;i++){
            if(!hS.contains(names[i])){
                hS.add(names[i]);
            }else{//if(!hS.contains(names[i])){
                for(int j=1;j<=names.length;j++){
                    if(!hS.contains(names[i]+"("+j+")")){
                        names[i]=names[i]+"("+j+")";
                        hS.add(names[i]);
                        break;
                    }//if(!hS.contains(names[i]+"("+j+")")){
                }//for(int j=1;j<=names.length;j++){
            }//else{
        }//for(int i=0;i<names.length;i++){
        return names;
    }//String[] fileNaming(String[] names) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] array.string names

Guaranteed constraints:
5 ≤ names.length ≤ 1000,
1 ≤ names[i].length ≤ 15.

[output] array.string


 */

}//public class FileNaming {
