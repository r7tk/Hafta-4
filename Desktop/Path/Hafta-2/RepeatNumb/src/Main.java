import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {2, 2, 4, 4, 5, 5, 6, 6, 77, 12, 34, 55, 22, 22};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++){
            for (int j = i+1; j < list.length; j++){
                if(list[i] == list[j] && list[i] %2 ==0){ // eğer iki eleman birbirine eşit ve çift ise
                    System.out.println(list[i]);
                    break;
                }
                }
            }

        }
    }