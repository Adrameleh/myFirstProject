package lesson18;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> listOfProducts = new HashMap<>();
        listOfProducts.put("apple", 3);
        listOfProducts.put("grusha", 7);
        listOfProducts.put("sliva", 6);
        listOfProducts.put("kivi", 4);
        System.out.println(listOfProducts);

        System.out.println(listOfProducts.get("apple"));

        for(Map.Entry<String, Integer> pair:listOfProducts.entrySet()){
            System.out.println(pair.getKey());
            System.out.println(pair.getValue());
        }

        for(String key:listOfProducts.keySet()){
            System.out.println(key);
            System.out.println(listOfProducts.get(key));
        }



    }
}
