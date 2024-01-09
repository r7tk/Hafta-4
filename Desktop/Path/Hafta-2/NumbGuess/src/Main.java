import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String RESET = "\u001B[0m";
        String SIYAH = "\u001B[30m";
        String KIRMIZI = "\u001B[31m";
        String YESIL = "\u001B[32m";
        String SARI = "\u001B[33m";
        String MAVI = "\u001B[34m";
        String MOR = "\u001B[35m";
        String CYAN = "\u001B[36m";
        String BEYAZ = "\u001B[37m";
        String BOLD = "\u001B[1m";


        Random rand = new Random();
        int number = rand.nextInt(100);
        //int number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);
        while (right < 5) {
            System.out.print("Lütfen tahmininizi giriniz : ");
            selected = input.nextInt();

            //////////////////////////////////////////////////////////////// deneme
            String RightColor = "";
            switch (right){
                case 4 :                        // Kalan Hak : 0
                    RightColor = BOLD+KIRMIZI;
                    break;
                case 3 :                        // Kalan Hak : 1
                    RightColor = BOLD+SARI;
                    break;
                case 2 :                        // Kalan Hak : 2
                    RightColor = BOLD+YESIL;
                    break;
                case 1 :                        // Kalan Hak : 3
                    RightColor = BOLD+MAVI;
                    break;
                case 0 :                        // Kalan Hak : 4
                    RightColor = BOLD+MOR;
                    break;
                default:
                    RightColor = BOLD+BEYAZ;
                    break;

            ////////////////////////////////////////////////////////////////////
            }

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " +RightColor+ (5 - right)+RESET);
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;       // HATALI GİRİŞ SONRASI TEKRAR YAPMASI İÇİN continue; komutunu kullanıyoruz.
            }

            if (selected == number) {
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğini sayı : " + number);
                isWin = true;
                break;              // OYUNU DOĞRU TAHMİN ETTİĞİMİZDEN DEVAM ETMESİNE GEREK DUYULMADIĞINDAN break; komutu ile programı sonlandırıyoruz
            } else {
                System.out.println("Hatalı bir sayı girdiniz !");
                if (selected > number) {  // EĞER SEÇİLEN SAYI NUMARADAN BÜYÜK İSE
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                } else {                    // DEĞİL İSE SAYI NUMARADAN KÜÇÜKTÜR .
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                }

                wrong[right++] = selected;
                System.out.println("Kalan hakkı : " + RightColor+ (5 - right)+RESET);
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz ! ");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }

    }
}
