import java.util.Scanner;
public class kdvtutari {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double tutar ,kdvOran=0.18;
        System.out.println("ücret tutarını giriniz");
        tutar=input.nextDouble();
        double kdvtutar=tutar*kdvOran;
        Double kdvliTutar=tutar+kdvtutar;
        System.out.println("kdvsiz tutar=>"+tutar);
        System.out.println("kdv oran =>"+kdvOran);
        System.out.println("kdv tutarı=>"+kdvtutar);
        System.out.println("Toplam tutar=>"+kdvliTutar);

    }
}
