import java.util.Scanner;
public class hesapmakinesi {
    public static void main(String[] args) {
        Scanner verial1=new Scanner(System.in);
        System.out.println("sayi1'i giriniz");    
        double sayi1=verial1.nextDouble();

        System.out.println("sayi2'yi giriniz");
          double sayi2=verial1.nextDouble();

System.out.println("1->+,2->/,3->-,4->* islemlerinden birini gir");
double islem=verial1.nextDouble();
double sonuc;




if(islem==1){
     sonuc=sayi1+sayi2;
    System.out.println("toplam="+sonuc);
}
else if(islem==2){
    sonuc=sayi1/sayi2;
    System.out.println("bolum="+sonuc);
}
else if(islem==3){
     sonuc=sayi1+sayi2;
    System.out.println("kalan="+sonuc);
}
else if(islem==4){
     sonuc=sayi1*sayi2;
    System.out.println("carpım="+sonuc);
}
   else{

    System.out.println("hatalı tuslama yaptiniz");
   }
    }
}

    