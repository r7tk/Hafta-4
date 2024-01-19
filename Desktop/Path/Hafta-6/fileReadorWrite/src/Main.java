import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            int toplam = 0;
            FileReader dosyaOku = new FileReader("src/numbers.txt");
            BufferedReader bufferOku = new BufferedReader(dosyaOku);

            String line;
            while ((line = bufferOku.readLine()) !=null){
                int number = Integer.parseInt(line);
                toplam += number;

            }
            bufferOku.close();
            System.out.println("Toplam : "+toplam);

        }catch (IOException e){
            e.printStackTrace();
        }

    }

}