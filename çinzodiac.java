import java.util.Scanner;
import javax.xml.transform.Source;
public class çinzodiac {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
   
   System.out.println("Doğum tarihinizi girin=> ");
   int tarih=sc.nextInt();
   int kalan=(tarih % 12); 
   switch (kalan){
case 0:
System.out.println("burcunuz maymun ");
break;
case 1:
System.out.println("burcunuz horoz ");
break;
case 2:
System.out.println("burcunuz köpek");
break;
case 3:
System.out.println("burcunuz domuz");
break;
case 4:
System.out.println("burcunuz fare");
break;
case 5:
System.out.println("burcunuz öküz");
break;
case 6:
System.out.println("burcunuz kaplan");
break;
case 7:
System.out.println("burcunuz tavşan");
break;
case 8:
System.out.println("burcunuz ejderha");
break;
case 9:
System.out.println("burcunuz yılan");
break;
case 10:
System.out.println("burcunuz at");
break;
case 11:
System.out.println("burcunuz koyun");
break;

    default:
    System.out.println("geçersiz durum girdiniz!!");
    break;
   }
   
   
   
   
   
   
   
   
    }
}
