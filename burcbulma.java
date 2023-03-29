import java.util.Scanner;
public class burcbulma {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("doğum ayınızı girin");
           String ay=input.nextLine();
       
        System.out.println("doğum gününüzü girin");
           int gun=input.nextInt();
        
        if(ay.equals("ocak")&& gun<=21||ay.equals("aralık" ) && gun>=22&& gun<=31)
        
                   {System.out.println("Oğlak burcusunuz");  } 
       
        else if(ay.equals("ocak")&& gun>=22 && gun<=31||ay.equals("şubat")&&gun<=19)
       
                   {System.out.println("Kova burcusunuz");}
      
        else if(ay.equals("şubat")&& gun>=20 && gun<=29||ay.equals("mart")&&gun<=20)
       
                   {System.out.println("Balık burcusunuz");}
      
        else if(ay.equals("mart")&& gun>=21&& gun<=31||ay.equals("nisan")&&gun<=20)
      
                   {System.out.println("Koç burcusunuz");}
     
        else if(ay.equals("nisan")&& gun>=21&& gun<=30||ay.equals("mayıs")&&gun<=21)
      
                   {System.out.println("Boğa burcusunuz");}
      
        else if(ay.equals("mayıs")&& gun>=22&& gun<=31||ay.equals("haziran")&&gun<=22)
      
                   {System.out.println("İkizler burcusunuz");}
      
        else if(ay.equals("haziran")&& gun>=23&& gun<=30||ay.equals("temmuz")&&gun<=22)
      
                   {System.out.println("Yengeç burcusunuz");}
     
        else if(ay.equals("temmuz")&& gun>=23&& gun<=31||ay.equals("ağustos")&&gun<=22)
       
                   {System.out.println("Aslan burcusunuz");}
      
        else if(ay.equals("ağustos")&& gun>=23&& gun<=31||ay.equals("eylül")&&gun<=22)
      
                   {System.out.println("Başak burcusunuz");}
       
        else if(ay.equals("eylül")&& gun>=23&& gun<=30||ay.equals("ekim")&&gun<=22)
       
                   {System.out.println("Terazi burcusunuz");}
     
        else if(ay.equals("ekim")&& gun>=23&& gun<=31||ay.equals("kasım")&&gun<=22)
     
                   {System.out.println("Akrep burcusunuz");}
       
        else if(ay.equals("kasım")&& gun>=23&& gun<=30||ay.equals("aralık")&&gun<=21)
          
                   {System.out.println("Yay burcusunuz");}
}
}
