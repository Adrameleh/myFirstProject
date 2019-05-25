package lesson2;

public class Main6 {
    public static void main(String[] args) {
        int mark = 3;

        switch (mark) {
            case 2:
                System.out.println("bad");
                break;
            case 3:
                System.out.println("mediocre");
                break;
            case 4:
                System.out.println("good");
                break;
            case 5:
                System.out.println("perfect");
                break;
            default:
                System.out.println("not a mark");
        }
    }

}
