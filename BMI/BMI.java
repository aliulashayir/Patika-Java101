package BMI;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilo, boy;
        System.out.println("Boyunuz(Metre):");
        boy = input.nextFloat();

        System.out.println("Kilonuz:");
        kilo = input.nextFloat();


        System.out.println("Vucüt kitle endeksiniz"+ (kilo/(boy*boy)));

    }
}
