/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._0_Data_Structures._2_Hash_Tables;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SwapLexOrder {

    /*
Given a string str and array of pairs that indicates which indices in the string can be swapped, return the lexicographically largest string that results from doing the allowed swaps. You can swap indices any number of times.
     */

    String swapLexOrder(String str, int[][] pairs) {
        List<List<Integer>> list = new ArrayList<>();
        List<Character> holder = new ArrayList<>();
        char[] strCharArr = str.toCharArray();
        for(var pair:pairs){
            list.add(new ArrayList<>());
            list.get(list.size()-1).add(pair[0]-1);
            list.get(list.size()-1).add(pair[1]-1);
        }//for(var pair:pairs){
        for(int i= 0; i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i).contains(list.get(j).get(0))){
                    if(!list.get(i).contains(list.get(j).get(1))){
                        list.get(i).add(list.get(j).get(1));
                    }//if(!list.get(i).contains(list.get(j).get(1))){
                    list.remove(j);
                    j=i;
                }else if(list.get(i).contains(list.get(j).get(1))){//if(list.get(i).contains(list.get(j).get(0))){
                    if(!list.get(i).contains(list.get(j).get(0))){
                        list.get(i).add(list.get(j).get(0));
                    }//if(!list.get(i).contains(list.get(j).get(0))){
                    list.remove(j);
                    j=i;
                }//else if(list.get(i).contains(list.get(j).get(1))){
            }//for(int j=i+1;j<list.size();j++){
            list.get(i).sort(Integer::compareTo);
            for(int j=0;j<list.get(i).size();j++){
                holder.add(strCharArr[list.get(i).get(j)]);
            }//for(int j=0;j<list.get(i).size();j++){
            holder.sort(Comparator.reverseOrder());
            for(int j=0;j<holder.size();j++){
                strCharArr[list.get(i).get(j)] = holder.get(j);
            }//for(int j=0;j<holder.size();j++){
            holder = new ArrayList<>();
        }//for(int i= 0; i<list.size();i++){
        return new String(strCharArr);
    }//String swapLexOrder(String str, int[][] pairs) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] string str

A string consisting only of lowercase English letters.

Guaranteed constraints:
1 ≤ str.length ≤ 104.

[input] array.array.integer pairs

An array containing pairs of indices that can be swapped in str (1-based). This means that for each pairs[i], you can swap elements in str that have the indices pairs[i][0] and pairs[i][1].

Guaranteed constraints:
0 ≤ pairs.length ≤ 5000,
pairs[i].length = 2.

[output] string
     */

}//public class SwapLexOrder {
