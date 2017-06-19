
import java.util.Scanner;
//Biblioteka 
public class main
{
  public static void main()
  {
      Scanner input= new Scanner(System.in);

      
      
      
      System.out.println("Podaj liczbe");
      int liczba1=input.nextInt();
      System.out.println("Podaj inna liczbe");
      int liczba2=input.nextInt();
      System.out.println("liczba 1:"+liczba1+"  ,liczba 2:"+liczba2);
      
       // wyświetla sie spis tresci
      System.out.println("************************************************");
      System.out.println("* 1 - Dodawanie                                *");
      System.out.println("************************************************");
      
      
      //wczytanie wartosci ze spisu do zmiennej
      
      
      //obejmujesz dzialania w ify 
      
      int suma=liczba1+liczba2;
      System.out.println("Suma liczb = "+suma);
      int roznica=liczba1-liczba2;
      System.out.println("Różnica liczb ="+roznica);
      int iloczyn=liczba1*liczba2;
      System.out.println("Iloczyn liczb ="+iloczyn);
      double iloraz=liczba1/(liczba2*1.0); // To jest wymuszenie zmienno przecinkowości
       System.out.println("Iloraz liczb * ="+iloraz);
      iloraz=(double)liczba1/liczba2; //rzutowanie na double
      System.out.println("Iloraz liczb (double) ="+iloraz);
      
      int reszta=liczba1%liczba2;
      System.out.println("Reszta liczb ="+reszta);
      // Konkatenacja stringów
      //Łączenie tekstu ze zmienna i wypisanie jej na ekran
  }
}
