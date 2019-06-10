package lesson15;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <String> texts = new ArrayList<>();
        texts.add("rwey");
        texts.add("fdsf");
        texts.add("vxdvx");
        texts.add("fxbx");
        texts.add("xdvx");

        System.out.println(texts.size());

        for(String t:texts){
            System.out.println(t);
        }
    }
}
