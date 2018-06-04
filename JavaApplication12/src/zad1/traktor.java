package zad1;

public class traktor extends Product {
    public traktor(double price, String nazwa, String opis) {
    super(price, nazwa, opis);
    
    }
    public void buy(){
        System.out.println("traktoooorek");
    }
    public void pokazInfo(){
        System.out.println("Cena:"+getPrice() + "Nazwa" + getName() + "opis" + getDescribe());
    }
    
}
