/*
 * Authored by: Jason Wesley Howse
 */

package helper_functions;

public class Helpers{
    public static int[][] deepCopy(int[][] original) {
        int[][] copy = original.clone();
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i].clone();
        }//for(int i=0;i<original.length;i++){
        return copy;
    }//public static int[][] deepCopy (int[][] original){

    public static boolean[][] deepCopy(boolean[][] original) {
        boolean[][] copy = original.clone();
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i].clone();
        }//for(int i=0;i<original.length;i++){
        return copy;
    }//public static boolean[][] deepCopy (boolean[][] original){

    public static <E> E deepCopy(E original) {
        E[] decon = (E[]) original;
        E[] copy = decon.clone();
        if (decon[0].getClass().isArray()) {
            for (int i = 0; i < decon.length; i++) {
                copy[i] = deepCopy(decon[i]);
            }//for(int i=0;i<decon.length;i++){
        }//if(decon[0].getClass().isArray()){
        E recon = (E) copy;
        return recon;
    }//public static <E> E deepCopy (E original){
}//public class Helpers{