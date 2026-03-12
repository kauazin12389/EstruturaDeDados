import java.util.Scanner;

public class Ex72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] v = new char[5];
        int ins = 0;
        for (int i = 0; i < 5; i++) v[i] = sc.next().charAt(0);
        for (int i = 1; i < 5; i++) {
            char k = v[i];
            int j = i - 1;
            while (j >= 0 && v[j] > k) {
                v[j+1] = v[j];
                j--;
                ins++;
            }
            v[j+1] = k;
        }
        System.out.println("Inserções: " + ins);
        System.out.println("Melhor caso: 0");
        System.out.println("Pior caso: 10");
    }
}