import java.util.Scanner;

public class tr_SecondsCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.print("Saniye değeri giriniz: ");
            int girilenSaniye = input.nextInt();
        
            int saat = girilenSaniye / 3600;
            int saattenKalanSaniye = girilenSaniye % 3600;
            int dakika = saattenKalanSaniye / 60;
            int dakikadanKalanSaniye = saattenKalanSaniye % 60;
            int kalanSaniye = dakikadanKalanSaniye;

            System.out.print(girilenSaniye + " saniye: ");
            
            if (saat > 0) {
                System.out.print(saat + " saat ");
            }
            if (dakika > 0) {
                System.out.print(dakika + " dakika "); 
            }
            if (kalanSaniye > 0) {
                System.out.print(kalanSaniye + " saniye ");
            }
            if (girilenSaniye == 0) {
                System.out.print("0 saniye ");
            }

            System.out.print("ediyor.");
            System.out.println();
        }
    }    
}