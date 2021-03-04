/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._06_through_the_fog;

import java.util.HashSet;
import java.util.Stack;

public class StringsRearrangement {

/*
Given an array of equal-length strings, you'd like
to know if it's possible to rearrange the order of
the elements in such a way that each consecutive
pair of strings differ by exactly one character.
Return true if it's possible, and false if not.

Note: You're only rearranging the order of the
strings, not the order of the letters within the
strings!
 */

    boolean stringsRearrangement(String[] inputArray) {
        Stack<Integer>[] stacks=new Stack[inputArray.length];
        for(int i=0;i<inputArray.length;i++){
            stacks[i]=new Stack<Integer>();
            for(int j=0;j<inputArray.length;j++){
                if(isSimilar(inputArray[i],inputArray[j])){
                    stacks[i].push(j);
                }//if(isSimilar(inputArray[i],inputArray[j])){
            }//for(int j=0;j<inputArray.length;j++){
            if(stacks[i].empty()){
                return false;
            }//if(stacks[i].empty()){
        }//for(int i=0;i<inputArray.length;i++){
        for(Integer i=0;i<inputArray.length;i++){
            HashSet<Integer> hS = new HashSet<>();
            hS.add(i);
            hS = checkPath((HashSet<Integer>) hS.clone(), stacksClone(stacks), i);
            if(hS.size()==stacks.length){
                return true;
            }//if(hS.size()==stacks.length){
        }//for(Integer i=0;i<inputArray.length;i++){
        return false;
    }//boolean stringsRearrangement(String[] inputArray) {

    private HashSet<Integer> checkPath(HashSet<Integer> hS, Stack<Integer>[] stacks, Integer iP){
        while(!stacks[iP].empty()){
            Integer i = stacks[iP].pop();
            if(!hS.contains(i)) {
                HashSet<Integer> nHS=(HashSet<Integer>) hS.clone();
                hS.add(i);
                hS = checkPath((HashSet<Integer>) hS.clone(), stacksClone(stacks), i);
                if(hS.size()== stacks.length){
                    return hS;
                }else{//if(hS.size()== stacks.length){
                    hS=(HashSet<Integer>) nHS.clone();
                }//else{
            }//if(!hS.contains(i)) {
        }//while(!stacks[iP].empty()){
        return hS;
    }//private HashSet<Integer> checkPath(HashSet<Integer> hS, Stack<Integer>[] stacks, Integer iP){

    private Stack<Integer>[] stacksClone(Stack<Integer>[] stacks){
        Stack<Integer>[] stacksNew=new Stack[stacks.length];
        Stack<Integer>[] stacksOld=new Stack[stacks.length];
        for(int i=0;i<stacks.length;i++){
            stacksNew[i]=new Stack<>();
            stacksOld[i]=new Stack<>();
            while(!stacks[i].isEmpty()){
                Integer newItem= stacks[i].pop();
                stacksNew[i].push(newItem);
                stacksOld[i].push(newItem);
            }//while(!stacks[i].isEmpty()){
            stacks[i]=stacksOld[i];
        }//for(int i=0;i<stacks.length;i++){
        return stacksNew;
    }//private Stack<Integer>[] stacksClone(Stack<Integer>[] stacks){

    private boolean isSimilar(String s1,String s2){
        boolean flag=false;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(flag){
                    return false;
                }
                flag=true;
            }//if(s1.charAt(i)!=s2.charAt(i)){
        }//for(int i=0;i<s1.length();i++){
        return flag;
    }//boolean isSimilar(String s1,String s2){

/*
Input/Output

[execution time limit] 3 seconds (cs)

[input] array.string inputArray

A non-empty array of strings of lowercase letters.

Guaranteed constraints:
2 ≤ inputArray.length ≤ 10,
1 ≤ inputArray[i].length ≤ 15.

[output] boolean

Return true if the strings can be reordered in such a way that each neighbouring pair of strings differ by exactly one character (false otherwise).
 */

}//public class StringsRearrangement {