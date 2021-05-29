/*
 * Authored by: Jason Wesley Howse
 */

package helper_functions;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

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

    public static JSONObject getJsonObject(String fileName, String path) {
        JSONObject object = null;
        try {
            object = (JSONObject) new JSONParser().parse(new FileReader(Paths.get(path + fileName).normalize().toAbsolutePath().toString()));
        } catch (ParseException | FileNotFoundException e) {//try {
            System.err.println(e);
        } catch (IOException e) {//} catch (ParseException | FileNotFoundException e) {
            System.err.println("IOException\r\n" + e);
        } catch (Exception e) {//catch (IOException e) {
            System.err.println("Exception\r\n" + e);
        }//catch (Exception e) {
        return object;
    }//public static JSONObject getJsonObject(String fileName, String path) {
}//public class Helpers{