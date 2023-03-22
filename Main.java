import java.util.Random;
import java.lang.Math;
class Main {
  public static void main(String[] args) {

    /*
  suma 5 cyfr (0-100)
  (wygenerowa losowo)
  podniec do potegi  i wynik
    */

  Random liczba = new Random();
  //int liczba = tablica[5]; 
  int[] tablica;
  tablica = new int[5];
    
    /*
      a = liczba.nextInt(100); 
      b = liczba.nextInt(100); 
      c = liczba.nextInt(100); 
      d = liczba.nextInt(100); 
      e = liczba.nextInt(100); 
      // int a,b,c,d,e; 
       int wynik = a*a + b*b + c*c + d*d + e*e;
    */

    
    for (int a=0; a<5; a++ ){
    tablica[a] = liczba.nextInt(100);  
    }

      

int wynik = 1;//tablica[a] ;
  System.out.println("wynik: "/*+ tablica[a]*/);


    
    
  }
  
}