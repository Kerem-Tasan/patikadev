import java.util.Scanner;
public class ciftsayilar {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
System.out.print("Sayı giriniz=>");
int sayi=src.nextInt();
for (int i=0; i<=sayi ;i++)
{
System.out.print(","+i);
}

    }
}
