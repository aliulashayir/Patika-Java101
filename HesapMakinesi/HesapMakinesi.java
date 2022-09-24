package HesapMakinesi;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int num1, num2, select;

        Scanner input = new Scanner(System.in);

        System.out.println("İlk sayıyı girin");

        num1 = input.nextInt();
        System.out.println("İkinci sayıyı girin");

        num2 = input.nextInt();

        System.out.println("1 Toplama\n2 Çıkarma\n3 Çarpma\n4 Bölme");
        System.out.println("Seçiminiz");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam:"+ (num1 + num2));
                break;
            case 2:
                System.out.println("Çıkarma:" + (num1 - num2));
                break;
            case 3:
                System.out.println("Çarpma:" + (num1 * num2));
                break;
            case 4:
                if(num2 != 0){
                    System.out.println("Bölme:" + (num1 / num2));
                }
                else{
                    System.out.println("0'a bölünemez");
                }
                break;
            default:
                System.out.println("Lütfen yeniden deneyiniz");

        }

    }
}
