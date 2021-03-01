/*
 * Authored by: Jason Wesley Howse
 */

package helper_functions;

import java.lang.reflect.Array;

public class Helpers{

    public static <E> E[][] deepCopy (E[][] original){
        E[][] copy= original.clone();
        for(int i=0;i<original.length;i++){
            copy[i]=original[i].clone();
        }
        return copy;
    }

    public static <E> E[][][] deepCopy (E[][][] original){
        E[][][] copy= original.clone();
        for(int i=0;i<original.length;i++){
            copy[i]=deepCopy(original[i]).clone();
        }
        return copy;
    }

    public static int[][] deepCopy (int[][] original){
        int[][] copy= original.clone();
        for(int i=0;i<original.length;i++){
            copy[i]=original[i].clone();
        }
        return copy;
    }
}
