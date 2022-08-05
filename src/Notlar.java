import java.util.Scanner;

public class Notlar {
    public static void main(String[] args) {
        //Klavyeden girilen vize ve final notlarının ortalamasını ve harf notunu bulan bir program yazınız.
        /*
            Vize Notu :
            Final Notu :

            Formül: not=Vize Notu x 0.4 + Final Notu x 0.6
            Harfler:
                A 90-100
                B 80-89
                C 70-79
                D 60-69
                F 0-59

            Örnek Ekran Çıktısı:

            Not : 80 [B]

         */
        Scanner input=new Scanner(System.in);
        System.out.print("Vize Notunu Giriniz :");
        int vizeNotu=input.nextInt();
        System.out.print("Final Notunu Giriniz :");
        int finalNotu=input.nextInt();
        double not=vizeNotu*0.4+finalNotu*0.6;

        char notHarf = not< 60 ? 'F' : not < 70 ? 'D' : not < 80 ? 'C' : not < 90 ? 'B' : not< 100 ? 'A' : 'G';
        System.out.println("Not :" +not+ "--->" + notHarf);

    }
}
