import java.util.Scanner;
public class taksimetre {
    public static void main(String[] args) {
        Scanner verial=new Scanner(System.in);
        
        //km si 2.20 tl açılısı 10 tl en az 20 tl ödenen taksimetre programı.

      double tutar,taksimetre=2.20;
      int acilis=10;
 
 System.out.println("Kaç km gidildi");
 int km=verial.nextInt();

tutar=acilis+km*taksimetre;
if(tutar>=20 ){
 System.out.println("Tutar="+tutar);
}
 else{
    System.out.println("tutar 20 tl");
 }
 
 
    }
}
