import  java.util.Scanner;
public class sınıfgecme {
    public static void main(String[] args) {
       Scanner al=new Scanner(System.in);
        int mat,turkce,fizik,kimya,muzik;
double dersOrt=0,ort,ders=5;

System.out.println("matematik notunuzu giriniz");
mat=al.nextInt();
if(mat<0 ||  mat>100)
{
    System.out.println("girdiginiz not geçersizdir ortalamaya etki etmeyecek");
    ders=ders-1;

}
    else{
        dersOrt+=mat;
    }   
System.out.println("turkce notunuzu giriniz");
turkce=al.nextInt();
if(turkce<0 || turkce>100)
{
    System.out.println("girdiginiz not geçersizdir ortalamaya etki etmeyecek");
    ders=ders-1;
}
    else{
        dersOrt+=turkce;
    }   
    System.out.println("Kimya notunuzu giriniz");
    kimya=al.nextInt();
    if(kimya<0 || kimya>100)
    {
        System.out.println("girdiginiz not geçersizdir ortalamaya etki etmeyecek");
        ders=ders-1;
    }
        else{
            dersOrt+=kimya;
        }   
        System.out.println("fizik notunuzu giriniz");
        fizik=al.nextInt();
        if(fizik<0 ||  fizik>100)
        {
            System.out.println("girdiginiz not geçersizdir ortalamaya etki etmeyecek");
            ders=ders-1;
        }
            else{
                dersOrt+=fizik;
            }   
            System.out.println("muzik notunuzu giriniz");
            muzik=al.nextInt();
            if(muzik<0 ||  muzik>100)
            {
                System.out.println("girdiginiz not geçersizdir ortalamaya etki etmeyecek");
                ders=ders-1;
            }
                else{
                    dersOrt+=muzik;

                    ort=dersOrt/ders;
                    System.out.println("ders ortalamanız=>"+ort);
                }   
}

}
