/*
 * Authored by: Jason Wesley Howse
 */

package helper_functions;

import java.lang.reflect.Array;
import java.util.Collection;

public class Helpers{
    public static <E> E[][] deepCopy (E[][] original){
        E[][] copy= original.clone();
        for(int i=0;i<original.length;i++){
            copy[i]=original[i].clone();
        }//for(int i=0;i<original.length;i++){
        return copy;
    }//public static <E> E[][] deepCopy (E[][] original){

    public static <E> E[][][] deepCopy (E[][][] original){
        E[][][] copy= original.clone();
        for(int i=0;i<original.length;i++){
            copy[i]=deepCopy(original[i]).clone();
        }//public static <E> E[][][] deepCopy (E[][][] original){
        return copy;
    }//public static <E> E[][][] deepCopy (E[][][] original){

    public static int[][] deepCopy (int[][] original){
        int[][] copy= original.clone();
        for(int i=0;i<original.length;i++){
            copy[i]=original[i].clone();
        }//for(int i=0;i<original.length;i++){
        return copy;
    }//public static int[][] deepCopy (int[][] original){

    public static boolean[][] deepCopy (boolean[][] original){
        boolean[][] copy= original.clone();
        for(int i=0;i<original.length;i++){
            copy[i]=original[i].clone();
        }//for(int i=0;i<original.length;i++){
        return copy;
    }//public static boolean[][] deepCopy (boolean[][] original){

//potential for deepcopy recursive top layer array method explore later
//    public static Object[] deepCopy1 (Object[] original){
//        Object[] copy= original[0].clone();
//        if(original[0] instanceof Collection<?>){
//            for(int i=0;i< original[0].length;i++){
//                copy[i]=deepCopy1(new Object[] {original[0][i]});
//            }
//        }
//        for(int i=0;i<original.length;i++){
//            copy[i]=original[i];
//        }//
//        return copy;
//    }//
//    public static Collection<?> deepCopy1(Collection<?> original){
//        Collection<?> copy=;
//        return copy;
//    }
}//public class Helpers{