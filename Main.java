/**
 * Created by ISaidMe0w
 */
// jest to klasa Main

public class Main{
    byte b=127; // -128 do 127
    short s=32767; // -32768 do 32767
    int i=-2147483648; // -2147483648 do 2147483647
    long l=-922337203; // -92233720368547758071 do 9223372036854775807
    float f=3.444444f; // -3.4*10^38 do 3.4*10^38
    double d=3.7773454234643254325; // -1.8*10^108 do 1.8*10^108
    char c='a'; // większość liter występujących na świecie
    String string = "To jest jakiś tekst"; // dowolny tekst

    public static void main (String[] args){
        int wynik1,wynik2,wynik3,wynik4,wynik5;
        int l1=35;
        int l2=16;
        wynik1=l1+l2;
        wynik2=l1-l2;
        wynik3=l1*l2;
        wynik4=l1/l2;
        wynik5=l1%l2;
        System.out.println("Wynik dodawania = "+wynik1);
        System.out.println("Wynik odejmowania = "+wynik2);
        System.out.println("Wynik mnożenia = "+wynik3);
        System.out.println("Wynik dzielenia = "+wynik4);
        System.out.println("Reszta z dzielenia = "+wynik5);
        wynik5++;
        wynik5++;
        wynik5++;
        System.out.println("po dodaniu 3 = "+wynik5);
        wynik5--;
        wynik5--;
        System.out.println("po odjęciu 2 = "+wynik5);
    }
}
