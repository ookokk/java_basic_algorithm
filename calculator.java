
import java.util.Scanner;

public class OrtalamaHesaplayici {
    public static void main(String[] args) {
        Scanner girdial = new Scanner(System.in);

        System.out.println("Birinci sayiyi gir: ");
        int sayi1 = girdial.nextInt();

        System.out.println("İkinci sayiyi gir: ");
        int sayi2 = girdial.nextInt();


        double toplam,fark,carpim,bolum;
        toplam = sayi1 + sayi2;
        fark = sayi1 - sayi2;
        carpim = sayi1 * sayi2;
        bolum = (double)sayi1 / sayi2;



        System.out.println("İslem Seciniz\n1-Toplama\n2-Cıkarma\n3-Carpma\n4-Bolme ");
        int secimint = girdial.nextInt();
        switch (secimint){
                case 1:
                System.out.println("Toplam:" +toplam);
                    break;
                case 2:
                System.out.println("Fark:" +fark);
                    break;
                case 3:
                System.out.println("Carpım:" +carpim);
                    break;
                case 4:
                System.out.println("Bolum:" +bolum);

        }






    }
}