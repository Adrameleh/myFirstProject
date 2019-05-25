package homework.lesson4;

public class Main {
    public static void main(String[] args) {

        System.out.println("Part 1");
        String text = "I am happy to learn java";
        String[] words = text.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + ' ');
        }
        System.out.println();

        System.out.println("Part 2");
        char[] result = text.toCharArray();
        char[] upperCase = text.toUpperCase().toCharArray();

        for (int i = 0; i < result.length; i++) {
            if (result[i] == 'b' || result[i] == 'c' || result[i] == 'd' || result[i] == 'f' || result[i] == 'g' || result[i] == 'h' || result[i] == 'j' || result[i] == 'k' || result[i] == 'l' || result[i] == 'm' || result[i] == 'n' || result[i] == 'p' || result[i] == 'q' || result[i] == 'r' || result[i] == 's' || result[i] == 't' || result[i] == 'v' || result[i] == 'w' || result[i] == 'x' || result[i] == 'z') {
                result[i] = upperCase[i];
            }
            System.out.print(result[i]);
        }
        System.out.println();

        System.out.println("Part 3");
        char[] start = {'a', 'b', 'c', 'd'};
        char[] end = new char[start.length];
        int down = start.length - 1;
        for (int i = 0; i < start.length; i++) {   // for(int i = 0, j = start.length - 1; i < start.length; i++, j--)
            end[i] = start[down];
            down--;
        }
        for (char current : end) {
            System.out.print(current);
        }
        System.out.println();

        System.out.println("Part 4");
        char[] oldChar = {'a', 'b', 'c', 'd'};
        char[] newChar = {'q', 'w', 'e', 'r'};
        String oldText = "Are you ready to start studying of programming?";

        char[] textChar = oldText.toLowerCase().toCharArray();

        for (int i = 0; i < textChar.length; i++) {
            for (int j = 0; j < oldChar.length; j++) {
                if (textChar[i] == oldChar[j]) {
                    textChar[i] = newChar[j];
                }
            }
        }
        // String newText = String.valueOf(textChar);
        String newText = new String(textChar);
        System.out.println(newText);
        System.out.println(oldText);

        for (char current : textChar) {
            System.out.print(current);
        }
    }
}
