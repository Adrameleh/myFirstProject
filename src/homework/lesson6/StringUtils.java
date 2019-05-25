package homework.lesson6;

public class StringUtils {
    public static String reverse(String text) {
        char[] start = text.toCharArray();
        char[] end = new char[start.length];
        int down = start.length - 1;
        for (int i = 0; i < start.length; i++) {   // for(int i = 0, j = start.length - 1; i < start.length; i++, j--)
            end[i] = start[down];
            down--;
        }
        return String.valueOf(end);
    }

    public static int countGlass(String text) {
        int countVowels = 0;
        char[] charText = text.toLowerCase().toCharArray();

        for (char current : charText) {
            if (current == 'a' || current == 'e' || current == 'i' || current == 'o' || current == 'u') {
                countVowels++;
            }
        }
        return countVowels;
    }

    public static int countSoglasnie(String text) {
        char[] charText = text.toLowerCase().replaceAll(" ", "").toCharArray();
        int countConsonants = 0;
        for (char current : charText) {
            if (current != 'a' && current != 'e' && current != 'i' && current != 'o' && current != 'u' &&
                    current != '!' && current != ',' && current != ';' && current != '.' && current != '-' &&
                    current != '?' && current != '"' && current != '\'') {
                countConsonants++;
            }
        }
        return countConsonants;
    }
}
