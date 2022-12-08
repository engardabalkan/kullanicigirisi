import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class Login{
    public static void main(String[] args) {
        String username, password,newpassword;
        int select;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınız:");
        username = input.nextLine();

        System.out.print("Şifrenizi:");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.print("Giriş yaptınız!");

        } else {
            System.out.println("Girdiğiniz bilgiler yanlış! Şifrenizi sıfırlamak istiyorsanız 1'i, " +
                    "istemiyorsanız 2 yi işaretlerin");
            Scanner inp = new Scanner(System.in);
            System.out.println("1-Şifreyi sıfırla\n2-Şifreyi sıfırlama");
            System.out.println("Seçiminiz:");
            select=inp.nextInt();
            if (select==1){
                Scanner in=new Scanner(System.in);
                System.out.println("Lütfen yeni şifrenizi belirleyiniz:");
                newpassword=in.nextLine();
                if (newpassword.equals("java123")){
                    System.out.print("Girdiğiniz şifre bir öncekiyle aynı olmamalıdır!");
                }else {
                    System.out.print("Şifreniz oluşturuldu!");
                }

            } else if (select==2) {
                System.out.print("Şifre sıfırlanmayacak!");

            }else {
                System.out.print("Lütfen 1 veya 2. seçeneği işaretleyin!");

        }
    }}}