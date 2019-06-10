package lesson17;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.stream.Collector;

public class Tovar {
    private String mainName;
    private String articul;
    private LinkedHashSet<Charateristic> characteristics = new LinkedHashSet<>();
    private ArrayList<Photo> photoes = new ArrayList<>();
    private ArrayList<AdditionalServise> servises = new ArrayList<>();
    private int ostatokNaSklade;
    private int priceFull;
    private int priceSale;
    private String pathToGabaritsImage;
    private String description;
    private ArrayList<Otziv> Otzivi = new ArrayList<>();

    public String getMainName() {
        return mainName;
    }

    public void setMainName(String mainName) {
        this.mainName = mainName;
    }

    public String getArticul() {
        return articul;
    }

    public void setArticul(String articul) {
        this.articul = articul;
    }

    public int getOstatokNaSklade() {
        return ostatokNaSklade;
    }

    public void setOstatokNaSklade(int ostatokNaSklade) {
        this.ostatokNaSklade = ostatokNaSklade;
    }

    public int getPriceFull() {
        return priceFull;
    }

    public void setPriceFull(int priceFull) {
        this.priceFull = priceFull;
    }

    public int getPriceSale() {
        return priceSale;
    }

    public void setPriceSale(int priceSale) {
        this.priceSale = priceSale;
    }

    public String getPathToGabaritsImage() {
        return pathToGabaritsImage;
    }

    public void setPathToGabaritsImage(String pathToGabaritsImage) {
        this.pathToGabaritsImage = pathToGabaritsImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addCharacteristic(Charateristic charateristic){
        characteristics.add(charateristic);
    }
}
