package Sort;
import java.util.Scanner;
public class Sort {
    public static void main(String[] args) {
        long sayi1, sayi2, sayi3;

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen birinci sayıyı giriniz:");
        sayi1=input.nextLong();

        System.out.println("Lütfen ikinci sayıyı giriniz:");
        sayi2=input.nextLong();

        System.out.println("Lütfen üçüncü sayıyı giriniz:");
        sayi3=input.nextLong();

        if((sayi1<sayi2 && sayi1<sayi3)){

            if(sayi2<sayi3){
                System.out.println(sayi1+" <"+sayi2+" <"+sayi3);

            } else{
                System.out.println(sayi1+" <"+sayi3+"<"+sayi2);
            }

        } else if(sayi2<sayi1 && sayi2<sayi3){

            if(sayi1<sayi3){
                System.out.println(sayi2+" <"+sayi1+" <"+sayi3);

            }else{
                System.out.println(sayi2+" <"+sayi3+" <"+sayi1);
            }
        } else{

            if(sayi1<sayi2){
                System.out.println(sayi3+" <"+sayi1+" <"+sayi2);
            }else {
                System.out.println(sayi3+" <"+sayi2+" <"+sayi1);
            }
        }

    }

}
