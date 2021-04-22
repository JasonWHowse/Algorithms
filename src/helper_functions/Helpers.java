/*
 * Authored by: Jason Wesley Howse
 */

package helper_functions;

public class Helpers{
    public static byte[][] deepClone(byte[][] original) {
        byte[][] copy = original.clone();
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i].clone();
        }//for(int i=0;i<original.length;i++){
        return copy;
    }//public static byte[][] deepClone(byte[][] original) {

    public static short[][] deepClone(short[][] original) {
        short[][] copy = original.clone();
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i].clone();
        }//for(int i=0;i<original.length;i++){
        return copy;
    }//public static short[][] deepClone(short[][] original) {

    public static int[][] deepClone(int[][] original) {
        int[][] copy = original.clone();
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i].clone();
        }//for(int i=0;i<original.length;i++){
        return copy;
    }//public static int[][] deepClone (int[][] original){

    public static long[][] deepClone(long[][] original) {
        long[][] copy = original.clone();
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i].clone();
        }//for(int i=0;i<original.length;i++){
        return copy;
    }//public static long[][] deepClone(long[][] original) {

    public static float[][] deepClone(float[][] original) {
        float[][] copy = original.clone();
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i].clone();
        }//for(int i=0;i<original.length;i++){
        return copy;
    }//public static float[][] deepClone(float[][] original) {

    public static double[][] deepClone(double[][] original) {
        double[][] copy = original.clone();
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i].clone();
        }//for(int i=0;i<original.length;i++){
        return copy;
    }//public static double[][] deepClone(double[][] original) {

    public static boolean[][] deepClone(boolean[][] original) {
        boolean[][] copy = original.clone();
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i].clone();
        }//for(int i=0;i<original.length;i++){
        return copy;
    }//public static boolean[][] deepClone (boolean[][] original){

    public static char[][] deepClone(char[][] original) {
        char[][] copy = original.clone();
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i].clone();
        }//for(int i=0;i<original.length;i++){
        return copy;
    }//public static char[][] deepClone(char[][] original) {

    public static <E> E deepClone(E original) {
        E[] decon = (E[]) original;
        E[] copy = decon.clone();
        if (decon[0].getClass().isArray()) {
            for (int i = 0; i < decon.length; i++) {
                copy[i] = deepClone(decon[i]);
            }//for(int i=0;i<decon.length;i++){
        }//if(decon[0].getClass().isArray()){
        E recon = (E) copy;
        return recon;
    }//public static <E> E deepClone (E original){
}//public class Helpers{