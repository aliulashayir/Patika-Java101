package DaireHesaplama;

import java.util.Scanner;
public class DaireHesaplama {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int r ,a;
        double pi = 3.14;
        System.out.println("yarı çapı girin :");
        r = input.nextInt();

        System.out.println("a açısını girin :");
        a = input.nextInt();

        double alan = (pi*(r*r)*a)/360;
        double cevre = 2 * pi * r;

        System.out.println("dairenin çevresi :"+cevre);
        System.out.println("dairenin alanı :"+alan);
    }
}
