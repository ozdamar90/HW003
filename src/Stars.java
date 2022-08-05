import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        //Klavyeden girilen sayı kadar yıldızı ekrana tablo halinde yazan bir program yazınız.
        /*
            Ekran:
            Yıldız Adedi:
            Sütun Adedi :


            Örnek;
            Yıldız Adedi: 54
            Sütun Adedi : 12
            *	*	*	*	*	*	*	*	*	*	*	*
            *	*	*	*	*	*	*	*	*	*	*	*
            *	*	*	*	*	*	*	*	*	*	*	*
            *	*	*	*	*	*	*	*	*	*	*	*
            *	*	*	*	*	*
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Yıldız Tablosu");
        System.out.print("Yıldız Adedi Giriniz :");
        int yıldız=input.nextInt();
        System.out.print("Sütun Adedi Giriniz :");
        int sutun=input.nextInt();
        for (int i = 1; i <yıldız ; i++) {
            System.out.print("*\t\t");
            if (i % sutun == 0) {
                System.out.print("\n");
            
        }


    }
}
    }
