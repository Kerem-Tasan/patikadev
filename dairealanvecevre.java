import java.util.Scanner;
public class dairealanvecevre {
    public static void main(String[] args) {
        Scanner verial=new Scanner(System.in);
         // yarı çapı kullanıcıdan alan ve dairenin alanı ve çevresini bulan program çevre =pi*r*2
 //alan= pi*r*r

 double pi=3.14;
 System.out.println("dairenin yarı çapı kaçtır?");
int r=verial.nextInt();

double cevre=pi*2*r;
double alan=pi*r*r;
System.out.println("cevre="+cevre);
System.out.println("alan="+alan);

    }
}
