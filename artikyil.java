import java.util.Scanner;
public class artikyil {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir yıl giriniz");
        int yil=input.nextInt();
        double dortebol=yil%4;
        double dortyuzebol=yil%400;
        if(dortebol==0)
        {
            if(dortyuzebol==0){
                System.out.println("Girdiğiniz yıl  artık yıldır");
            }
            else{System.out.println("artık yıl değildir");}
    
        }
        else {System.out.println("4 e tam bölünen bir sayi değildir yani artık yıl değildir");}
    }
}
