package Interview_coding_Q;

import java.util.*;

/*
input: String s = "I Love Dogs";

output : [IL, Io, Iv, Ie, ID, Io, Ig, Is, Lo, Lv, Le, LD, Lo, Lg, Ls, ov, oe, oD, og, os, ve, vD, vo, vg, vs, eD, eo, eg, es, Do, Dg, Ds, og, os, gs] - using Arraylist()
         [IL, Io, Iv, Ie, ID, Ig, Is, Lo, Lv, Le, LD, Lg, Ls, ov, oe, oD, og, os, ve, vD, vo, vg, vs, eD, eo, eg, es, Do, Dg, Ds, gs]- Using LinkedHashSet()

Note: Same pair should not be repeated like (oo).
 */
public class Unique_Character_Pair_Generation {
    public static void main(String[] args) {

        String s = "I Love Dogs";
        s = s.replaceAll(" ", ""); // Remove spaces
        List<String> pairs_list = new ArrayList<>();
        Set<String> pairs_set = new LinkedHashSet<>();

        System.out.println("Generating char pair generation using Arraylist");
        Char_pair_Generation(s,pairs_list);

        System.out.println("Generating char pair generation using HashSet");
        Char_pair_Generation_Generics(s,pairs_set);

    }
    private static  void Char_pair_Generation(String s, Collection<String> pairs){
        for (int i =0 ; i <s.length(); i++){
            for (int j=i+1; j<s.length();j++){
                if (s.charAt(i) !=s.charAt(j)){
                    pairs.add(""+s.charAt(i)+s.charAt(j));
                }
            }
        }
        System.out.println(pairs);
    }

    private static <T extends Collection<String>> void Char_pair_Generation_Generics(String s, T pairs) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) != s.charAt(j)) {
                    pairs.add("" + s.charAt(i) + s.charAt(j));
                }
            }
        }
        System.out.println(pairs);
    }
}
