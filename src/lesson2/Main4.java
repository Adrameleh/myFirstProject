package lesson2;

public class Main4 {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = 4;


        if ((a == b) && (b == c)) {
            System.out.println("equilateral");//ravnostoronniy postaraysa zapomnit
        } else {
            System.out.println("not equilateral");

            if ((a == b && c != a) || (b == c && c != a) || (c == a && c != b)) {
                System.out.println("isosceles"); //ravnobedrenniy, toje zapomni neznayu zachem
            }

            if ((a != b) && (b != c) && (c != a)) {
                System.out.println("versatile"); //raznostoronniy opyat zapomni
            }
        }
    }
}
