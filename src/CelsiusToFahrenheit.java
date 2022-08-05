import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        //Klavyeden girilen Sıcaklık değerleri, diğer birime dönüştürülecektir.
        /*
            Örnek Menü Tasarımı:

            Sıcaklık Dönüşüm Uygulaması
            1. Santigrat - Fahrenheit
            2. Fahrenheit - Santigrat
            Seçim :
            -------------------------
            Formül: F=Cx1.8+32
                    C=(F-32)/1.8
             -----------------------
            Örnek;  F=30x1.8+32=86
                    C=(86-32)/1.8=30
            -------------------------
             Ekran Çıktısı:
             30 C --> 86 F
             86 F --> 30 C
         */
        Scanner input=new Scanner(System.in);
        int F,C;

        System.out.println("Sıcaklık Dönüşüm Uygulaması");
        System.out.print("Lütfen bir Sıcaklık Değeri Giriniz : ");
        int sıcaklıkDegeri= input.nextInt();
        System.out.println("-------------");
        System.out.println("1. Cantigrat Derece Hesaplama");
        System.out.println("2.Fahrenheit Derece Hesaplama ");
        System.out.print("Lütfen Bir Seçim Yapınız : ");
        int secim= input.nextInt();
        switch (secim){
            case 1:double c=sıcaklıkDegeri-32/1.8;
                System.out.println("C ="+c+"---->"+'F');
                break;
            case 2:double f=sıcaklıkDegeri*1.8+32;
                System.out.println("F ="+f+"----->"+'C');
                break;
        }


    }
}
