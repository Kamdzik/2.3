import java.util.Random;
class Main {
  public static void main(String[] args) {

    /*
  suma 5 cyfr (0-100)
  (wygenerowa losowo)
  podniec do potegi  i wynik
    */

    Random liczba = new Random();
    int[] tablica = new int[5]; 
    double wynik1 = 0;
    double suma = 0;

    
    /*
    int a,b,c,d,e; 
      a = liczba.nextInt(100); 
      b = liczba.nextInt(100); 
      c = liczba.nextInt(100); 
      d = liczba.nextInt(100); 
      e = liczba.nextInt(100); 
     int wynik = a*a + b*b + c*c + d*d + e*e;
    */

    
    for (int a = 0; a < 5; a++ ){
     tablica[a] = liczba.nextInt(100);  
     System.out.println(tablica[a]);
     wynik1 = Math.pow(tablica[a],2);
     suma = wynik1 + suma;
    }
    
    System.out.println("wynik: " + suma);
  } 
}