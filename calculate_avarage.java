import java.util.Scanner;

public class OrtalamaHesaplayici {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunu girin: ");
        int matematikNotu = scanner.nextInt();

        System.out.print("Fizik notunu girin: ");
        int fizikNotu = scanner.nextInt();

        System.out.print("Kimya notunu girin: ");
        int kimyaNotu = scanner.nextInt();

        System.out.print("Türkçe notunu girin: ");
        int turkceNotu = scanner.nextInt();

        System.out.print("Tarih notunu girin: ");
        int tarihNotu = scanner.nextInt();

        System.out.print("Müzik notunu girin: ");
        int muzikNotu = scanner.nextInt();

        int toplamNot = matematikNotu + fizikNotu + kimyaNotu + turkceNotu + tarihNotu + muzikNotu;
        double ortalama = toplamNot / 6.0;

        System.out.println("Ortalama: " + ortalama);

        if (ortalama > 60) {
            System.out.println("Sınıfı Geçti");
        } else {
            System.out.println("Sınıfta Kaldı");
        }
    }
}