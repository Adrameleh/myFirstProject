package homework.lesson6;

public class Fractions {
    public static void sum(int numerator1, int numerator2, int denominator1, int denominator2){
        int numeratorNew = numerator1*denominator2+numerator2*denominator1;
        int denominatorNew = denominator1*denominator2;
        System.out.println(numeratorNew+"/"+denominatorNew);
    }
}
