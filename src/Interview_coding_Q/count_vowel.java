package Interview_coding_Q;

import java.util.*;

/*
1) String str="Learning automation is easy"; //given a string, output the count of each vowel
 */
public class count_vowel {

    public static void main(String[] args) {
        String text="Learning automation is easy";
        text = text.replaceAll(" ","");

        count_vowels(text);
    }

    private static void count_vowels(String text) {
        Map <Character,Integer> Count = new TreeMap<>();
        for(char c : text.toLowerCase().toCharArray()){
            if("aeiou".indexOf(c) !=-1){
                Count.put(c,Count.getOrDefault(c,0)+1);
            }
        }
        System.out.println(Count);
    }
}
