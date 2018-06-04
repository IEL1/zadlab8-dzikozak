package zad3;
import zad1.Product;

public class ksiazka extends Product{

    public ksiazka(double price, String nazwa, String opis) {
        super(price, nazwa, opis);
    }
    @Override
    public void buy() {
        System.out.println("Kupiłem książke!");
    }

    @Override
    public void pokazInfo() {
        System.out.println("Cena:" + getPrice() + " nazwa:" + getName() + " opis:" + getDescribe());
    }
  
}