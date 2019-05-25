package homework.lesson5;

public class Main1 {
    public static void main(String[] args) {
        String text1 = "I like to go shopping";
        String text2 = "We hate each other";
        char[] matchingSymbols = new char[Math.max(text1.length(), text2.length())];
        int count = 0;

        for (int i = 0; i < text1.length(); i++) {
            for (int j = 0; j < text2.length(); j++) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    boolean check = true;
                    for (int k = 0; k<count;k++){
                        if(matchingSymbols[k]==text1.charAt(i)){
                            check = false;
                        }
                    }
                    if(check){
                        matchingSymbols[count] = text1.charAt(i);
                        count++;
                    }
                }
            }
        }
        System.out.print("Matching symbols are : ");

        for (int i = 0; i < count; i++) {
            System.out.print("'" + matchingSymbols[i] + "'");
        }
    }
}
