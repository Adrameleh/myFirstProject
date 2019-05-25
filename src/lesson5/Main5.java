package lesson5;

public class Main5 {
    public static void main(String[] args) {
        String text = "language java";
        char[] charFromText = text.toCharArray();
        String alphArray = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < text.length(); i++) {
            System.out.println(charFromText[i] + " - " + alphArray.indexOf(charFromText[i]));
        }
    }
}

