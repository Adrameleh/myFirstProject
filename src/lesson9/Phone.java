package lesson9;

public class Phone {//поля - переменные внутри класса которые описывают состояние объекта
    private double diagonal;// модификатор доступа слово которое определяет область видимости.
    private String model;   // есть перед классом, перед пременными, конструкторами, методами
    private int price;      //private - only here, public - everywhere, default - in this package

    public void setPrice(int newPrice){
        price = newPrice;
    }

    public int getPrice(){
        return price;
    }

    public void setDiagonal(double newDiagonal){
        diagonal = newDiagonal;
    }

    public double getDiagonal(){
        return diagonal;
    }

    public void setModel(String newModel){
        model = newModel;
    }


    public String getModel(){
        return model;
    }
}
