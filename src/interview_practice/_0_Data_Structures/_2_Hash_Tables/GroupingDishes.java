/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._0_Data_Structures._2_Hash_Tables;

import java.util.*;

public class GroupingDishes {

    /*
You are given a list dishes, where each element consists of a list of strings beginning with the name of the dish, followed by all the ingredients used in preparing it. You want to group the dishes by ingredients, so that for each ingredient you'll be able to find all the dishes that contain it (if there are at least 2 such dishes).

Return an array where each element is a list beginning with the ingredient name, followed by the names of all the dishes that contain this ingredient. The dishes inside each list should be sorted lexicographically, and the result array should be sorted lexicographically by the names of the ingredients.
     */

    String[][] groupingDishes(String[][] dishes) {
        var dict = new TreeMap<String, List<String>>();
        List<String[]> output = new ArrayList<>();
        Arrays.stream(dishes).forEach(dish->{
            String food = dish[0];
            for(int i=1; i< dish.length;i++) {
                if (!dict.containsKey(dish[i])){
                    dict.put(dish[i], new ArrayList<>());
                }//if (!dict.containsKey(dish[i])){
                dict.get(dish[i]).add(food);
            }//for(int i=1; i< dish.length;i++) {
        });
        dict.keySet().stream().filter(a->dict.get(a).size()>=2).forEach(a->{
            dict.get(a).sort((String::compareTo));
            List<String> storeList= new ArrayList<>();
            storeList.add(a);
            storeList.addAll(dict.get(a));
            output.add(storeList.toArray(new String[0]));
        });
        return output.toArray(new String[0][]);
    }//String[][] groupingDishes(String[][] dishes) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] array.array.string dishes

An array of dishes, where dishes[i] for each valid i contains information about the ith dish: dishes[i][0] is the name of the dish, and all the elements after it are the ingredients of that dish. Both the dish name and the ingredient names consist of English letters and spaces. It is guaranteed that all dish names are different. It is also guaranteed that the ingredient names for any one dish are also pairwise distinct.

Guaranteed constraints:
1 ≤ dishes.length ≤ 500,
2 ≤ dishes[i].length ≤ 10,
1 ≤ dishes[i][j].length ≤ 50.

[output] array.array.string

The array containing the grouped dishes.
     */

}//public class GroupingDishes {
