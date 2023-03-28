import java.util.Scanner;
public class kullanicigirisi {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner verial=new Scanner(System.in);

        String kuladi,sifre;

        System.out.println("kullanıcı adınızı girin");
        kuladi=verial.nextLine();
        System.out.println("sifrenizi girin ");
        sifre=verial.nextLine();
        if(kuladi.equals("kaladin")){
            System.out.println("kullanıcı adınız doğru");
            if(sifre.equals("stormblessed")){System.out.println("sifreniz doğru ");}
            else {System.out.println("sifreniz yanlıs ");
        System.out.println("şifrenizi yenilemek ister misiniz (evet/hayır)");
        String cevap=verial.nextLine();
        if(cevap.equals("evet")){
            System.out.println("yeni şifrenizi girin ");
            String yeni_Sifre=verial.nextLine();
          
          if(yeni_Sifre.equals("stormblessed")){
            System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
          
            

            
        }
        else{System.out.println("Şifre oluşturuldu");}
       
    
    
    
    }
        else{
            System.out.println("sistem kapatılıyor!");
        }
    }

        }
        else {
            System.out.println("kullanıcı adınız yanlış");
        }
    }
}
