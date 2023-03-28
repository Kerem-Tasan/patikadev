import java.util.Scanner;
public class hipotenus {
    public static void main(String[] args) {
        Scanner verial=new Scanner(System.in);
       
        //üçgenin hipotenüsünü bulan program
  
  int hipo;

  System.out.println("a kenarını giriniz:");
  int kenar2=verial.nextInt();

  System.out.println("b kenarını giriniz:");
  int kenar1=verial.nextInt();
  
  hipo=kenar1*kenar1+kenar2*kenar2;
  System.out.println("üçgenin hipotenüsü="+hipo);
    }
}
