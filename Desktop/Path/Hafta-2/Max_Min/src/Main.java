import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz: ");
        int girdi = scan.nextInt();
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        // Diziyi küçükten büyüğe sırala
        Arrays.sort(list);

        // Girilen sayıya en yakın küçük sayıyı bul
        int enYakinKucuk = -1;
        for (int i = 0; i < list.length; i++) {
            if (list[i] < girdi) {
                enYakinKucuk = list[i];
            } else {
                break;  // Diziyi sıralı olduğu için, girdiden büyük bir sayıya ulaştığımızda döngüyü sonlandırabiliriz.
            }
        }

        // Girilen sayıya en yakın büyük sayıyı bul
        int enYakinBuyuk = -1;
        for (int i = list.length - 1; i >= 0; i--) {
            if (list[i] > girdi) {
                enYakinBuyuk = list[i];
            } else {
                break;  // Diziyi sıralı olduğu için, girdiden küçük bir sayıya ulaştığımızda döngüyü sonlandırabiliriz.
            }
        }

        // Sonuçları yazdır
        System.out.println("Girilen sayıya en yakın küçük sayı: " + enYakinKucuk);
        System.out.println("Girilen sayıya en yakın büyük sayı: " + enYakinBuyuk);
    }
}
