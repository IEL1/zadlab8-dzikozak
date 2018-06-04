package zad3;

import zad1.Product;
import zad3.czekolada;

public class tablica {
    private static void tab(){
       Product[] product = new Product[10];
       
       product[0] = new ksiazka(20.2,"nazwaaaa","ppp");
       product[1] = new dzem(20.2,"nazwaaaa","ppp");
       product[2] = new czekolada(20.2,"nazwaaaa","ppp");
       product[3] = new dlugopis(20.2,"nazwaaaa","ppp");
       product[0] = new polopiryna(20.2,"nazwaaaa","ppp");

      
       for (int i=0; i<10; i++){
           product[i].buy();
           product[i].pokazInfo();
       }
    }
       public static void main(String[] args) {
        tab();
     
       }

   
        

    
}