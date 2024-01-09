import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin Boyutunu Giriniz :");
        int boyut = input.nextInt();
        int[] dizi = new int[boyut];

        for (int i = 0; i < boyut;i++){
            System.out.print((i+1)+". Elemanı :");
            dizi[i]=input.nextInt();
        }
        Arrays.sort(dizi); // sort küçükten büyüğe sıralıyor büyük kolaylık ...

        System.out.println("Sıralama : ");
        for (int i = 0; i < boyut; i++){ // tamam arraylar dizi içerisinde 0 dan başlıyor hala oturtamadım şu döngüleri. shame on me
            System.out.print(dizi[i]+" ");
        }
        }
    }
