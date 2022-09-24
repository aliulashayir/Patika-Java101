package PassFail;
import java.util.Scanner;
public class PassFail {

    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, muzik, ortmat, ortkimya, ortturkce, ortmuzik, ortfizik, toplam = 5;
        Scanner scan = new Scanner(System.in);


        System.out.print("Matematik notunuzu giriniz: ");
        mat = scan.nextInt();
        ortmat = (mat <= 100 && mat >= 0) ? mat : 0;
        if(ortmat == 0)
            toplam--;


        System.out.print("fizik notunuzu giriniz: ");
        fizik = scan.nextInt();
        ortfizik = (fizik <= 100 && fizik >= 0) ? fizik : 0;
        if(ortfizik == 0)
            toplam--;

        System.out.print("kimya notunuzu giriniz: ");
        kimya = scan.nextInt();
        ortkimya = (kimya <= 100 && kimya >= 0) ? kimya : 0;
        if(ortkimya == 0)
            toplam--;

        System.out.print("turkce notunuzu giriniz: ");
        turkce = scan.nextInt();
        ortturkce = (turkce <= 100 && turkce >= 0) ? turkce : 0;
        if(ortturkce == 0)
            toplam--;

        System.out.print("Muzik notunuzu giriniz: ");
        muzik = scan.nextInt();
        ortmuzik = (muzik <= 100 && muzik >= 0) ? muzik : 0;
        if(ortmuzik == 0)
            toplam--;


        double ortalama = (ortmat + ortfizik + ortkimya + ortturkce + ortmuzik) / (toplam);
        System.out.println("Ortalamaniz: " + ortalama);
        System.out.println((ortalama > 55) ? "Sinifi Gecti" : "Sinifta Kaldi");


    }
}
