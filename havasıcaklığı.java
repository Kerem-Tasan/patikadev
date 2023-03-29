import java.util.Scanner;
public class havasıcaklığı {
    public static void main(String[] args) {
        Scanner verial=new Scanner(System.in);

System.out.println("Hava sıcaklığı kac derece");
int derece=verial.nextInt();

if (derece<5){
    System.out.println("Tam kayak yapmalık hava");
}
else if(derece>=5 && derece<=15)
{
System.out.println("Sinema güzel fikir");
}

else if(derece<25 && derece>15)
{System.out.println("Piknik mi yapsak?");}

else if(derece>=25 )
{
    System.out.println("yüzmeye gitmemiz gerek");
}

    }
}
