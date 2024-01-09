public class Main {
    public static void main(String[] args) {
        // Örnek matris oluştur
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // Matrisi ekrana yazdır
        System.out.println("Orijinal Matris:");
        printMatris(matris);

        // Transpozunu al
        int[][] transpozeMatris = transposeMatris(matris);

        // Transpoz matrisi ekrana yazdır
        System.out.println("\nTranspoze Matris:");
        printMatris(transpozeMatris);
    }

    // Matrisi ekrana yazdırmak için yardımcı fonksiyon
    public static void printMatris(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Matrisin transpozunu almak için yardımcı fonksiyon
    public static int[][] transposeMatris(int[][] matris) {
        int row = matris.length;
        int col = matris[0].length;

        int[][] transpozeMatris = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpozeMatris[j][i] = matris[i][j];
            }
        }

        return transpozeMatris;
    }
}
