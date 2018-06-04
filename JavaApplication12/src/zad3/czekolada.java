package zad3;
import zad1.Product;

public class czekolada extends Product {

    public czekolada(double price, String nazwa, String opis) {
        super(price, nazwa, opis);
    }
    
    @Override
    public void buy() {
        System.out.println("Kupiłem czekolade!");
    }

    @Override
    public void pokazInfo() {
        System.out.println("Cena:" + getPrice() + " nazwa:" + getName() + " opis:" + getDescribe());
    }
}