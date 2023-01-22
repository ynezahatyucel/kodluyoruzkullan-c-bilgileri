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
            System.out.println("Şifrenizi değiştirmek ister misiniz?\nEVET-1\nHAYIR-2");
            int secim =veri.nextInt();

             if(secim==1) {
            String newUsername;
            Scanner inp =new Scanner(System.in);

                System.out.println("Yeni şifrenizi giriniz: ");
                    newUsername = inp.nextLine();

                    if (newUsername.equals(kullanici)){
                            System.out.println("Yeni şifre eski şifre ile aynı olamaz.");
                            return;
                        }else if (!newUsername.equals(kullanici)){
                            System.out.println("Yeni şifre oluşturuldu. ");
                        }

                    } else if (secim==2) {
                        System.out.println("Lütfen bilgilerinizi kontrol ederek tekrar giriş yapmayı deneyiniz.");

                }

        }}


    }

