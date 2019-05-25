package homework.lesson6;

public class Main {
    public static void main(String[] args) {
        String text = "Ewoks - ?want to ,destroy .our world";
        System.out.println(StringUtils.reverse(text));
        System.out.println(StringUtils.countGlass(text));
        System.out.println(StringUtils.countSoglasnie(text));
    }
}
