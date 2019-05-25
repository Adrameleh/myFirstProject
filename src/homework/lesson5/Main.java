package homework.lesson5;

import homework.lesson6.StringUtils;

public class Main {
    public static void main(String[] args) {
        String text = "?Is it good? I do not know.";
        char[] charText = text.replaceAll(" ", "").toLowerCase().toCharArray();
        char[] punctuationMarks = {'!', ',', ';', '.', '-', '?'};
        int countVowels = 0;
        int countPunctuationMarks = 0;

        for (char current : charText) {
            if (current == 'a' || current == 'e' || current == 'i' || current == 'o' || current == 'u') {
                countVowels++;
            }
        }

        for (char current : charText) {
            for (int i = 0; i < punctuationMarks.length; i++) {
                if (current == punctuationMarks[i]) {
                    countPunctuationMarks++;
                }
            }
        }

        System.out.println("Number of vowels - " + countVowels);
        System.out.println("Number of consonants - " + (charText.length - countPunctuationMarks - countVowels));
        System.out.println("Number of punctuation marks - " + countPunctuationMarks);

    }
}
