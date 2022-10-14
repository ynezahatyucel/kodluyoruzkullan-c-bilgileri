import javax.swing.*;
import java.util.Scanner;

public class kGirisi {
    public static void main(String[] args) {
        String username,paasword;

        Scanner veri =new Scanner(System.in);

        System.out.print("Kullanıcı adını giriniz :");
        username= veri.nextLine();

        System.out.print("Şifrenizi giriniz :");
        paasword= veri.nextLine();

        if (username.equals("kodlama")&& (paasword.equals("patika123"))){
            System.out.print("Giriş Yaptınız.");

        }else{
            System.out.println("Yanlış Şifre girdiniz!");
            System.out.println("Şifrenizi değiştirmek ister misiniz?\nEVET-e\nHAYIR-h");
            String secim =veri.nextLine();
            if(secim.equals("e")) {
                System.out.println("Yeni şifrenizin eski şifreniz ile aynı olmamasına dikkat edin.");
            }
            else {
                System.out.println("Kullanıcı bilgilerini tekrar giriniz");
            }
                String npassword= veri.nextLine();
                if(npassword.equals(paasword) || npassword.equals("patika123")) {
                    System.out.println("Şifre oluşturulamadı! Lütfen başka bir şifre deneyiniz");

                }
                else {
                    System.out.println("Yeni şifre oluşturuldu.");
                }

        }}


    }

