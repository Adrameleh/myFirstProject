package lesson5;

public class Main {
    public static void main(String[] args) {
        String text = "I like to learn java";
        char[] alphArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for (int i = 0; i < alphArray.length; i++) {
            int count = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == alphArray[i] || text.charAt(j) == Character.toUpperCase(alphArray[i])) {
                    count++;
                }
            }
            System.out.println(alphArray[i] + " - " + count);
        }
    }
}
