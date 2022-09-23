package KDV;

import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tutar, kdvOran, kdvTutar, kdvliTutar;

        System.out.print("Ücret tutarını giriniz:");
        tutar=input.nextDouble();

        kdvOran = tutar<1000 ? 0.18 : 0.08;
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz tutar:"+tutar);
        System.out.println("KDV oranı:"+kdvOran);
        System.out.println("KDV tutarı:"+kdvTutar);
        System.out.println("KDV'li tutarı:"+kdvliTutar);

    }
}
