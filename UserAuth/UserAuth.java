package UserAuth;
import java.util.Scanner;
public class UserAuth {
    public static void main(String[] args) {
        String userName,password,newPassword;
        int enterNewPassword;
        Scanner input = new Scanner(System.in);

        System.out.println("Username:");
        userName = input.nextLine();
        System.out.println("Password: ");
        password = input.nextLine();


        if( userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş yaptınız");
        }
        else {
            System.out.println("Bilgiler yanlış");
            System.out.println("Yeni bir şifre oluşturmak isterseniz 1 i tuşlayın");
            enterNewPassword = input.nextInt();
            if (enterNewPassword == 1) {

                System.out.println("Yeni şifrenizi giriniz");
                System.out.println("Password:");
                newPassword = input.nextLine();
                newPassword = input.nextLine();
                if (newPassword.equals(password)) {
                    System.out.println("Eski şifrenizle aynı yeni bir şifre giriniz");
                }
            }
        }
    }
}
