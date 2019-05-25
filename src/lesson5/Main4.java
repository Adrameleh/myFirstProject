package lesson5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        String text = "computers are bad for eyes";
        String[] words = text.split(" ");
        String [] newOrder = new String[words.length];
        int j = words.length-1;
        for(int i =0; i<words.length;i++){
            newOrder[j]=words[i];
            j--;
        }
        String newText = String.join(" ", newOrder);
        System.out.println(newText);
    }
}
