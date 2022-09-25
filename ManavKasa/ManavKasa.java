package ManavKasa;
import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int armutKilo, elmaKilo, domatesKilo, muzKilo, patlıcanKilo;
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlıcanFiyat = 5.00;

        System.out.println("Armut kaç kilo:");
        armutKilo = input.nextInt();

        System.out.println("Elma kaç kilo:");
        elmaKilo = input.nextInt();

        System.out.println("Domates kaç kilo:");
        domatesKilo = input.nextInt();

        System.out.println("Muz kaç kilo:");
        muzKilo = input.nextInt();

        System.out.println("Patlıcan kaç kilo:");
        patlıcanKilo = input.nextInt();


        System.out.println("Toplam Tutar"+ ((armutKilo*armutFiyat)+(elmaKilo*elmaFiyat)+(domatesFiyat*domatesKilo)+(muzKilo*muzFiyat)+(patlıcanFiyat*patlıcanKilo)));
    }
}
