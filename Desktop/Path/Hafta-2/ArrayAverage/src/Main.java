import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner getData = new Scanner(System.in);

        System.out.print("Lütfen Bir Sayı Giriniz : ");

        int number = getData.nextInt();

        double harmonicSum = 0.0;

        for (int i = 1; i <= number; i++) {

            harmonicSum += 1.0 / i;

        }

        System.out.println(number + " sayısının harmonik serisi : " + harmonicSum);
    }

}