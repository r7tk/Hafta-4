public class Main {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};

        // Diziyi gezerek tekrar sayılarını hesaplayın
        for (int i = 0; i < dizi.length; i++) {
            int sayi = dizi[i];
            int tekrarSayisi = 1;

            // Bu sayının daha önce işlenip işlenmediğini kontrol et
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[j] == sayi) {
                    tekrarSayisi++;
                }
            }

            // Daha önce işlenmediyse, tekrar sayısını yazdır
            if (tekrarSayisi > 0) {
                System.out.println(sayi + " sayısı " + tekrarSayisi + " kere tekrar edildi.");

                // Tekrar sayısını 0 yaparak işlendiğini işaretle
                for (int k = i + 1; k < dizi.length; k++) {
                    if (dizi[k] == sayi) {
                        dizi[k] = 0;

                    }
                }
            }
        }
    }
}
