import java.util.Scanner;

public class Ex62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] v = new char[5];
        int trocas = 0;
        for (int i = 0; i < 5; i++) v[i] = sc.next().charAt(0);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if (v[j] > v[j+1]) {
                    char t = v[j];
                    v[j] = v[j+1];
                    v[j+1] = t;
                    trocas++;
                }
            }
        }
        System.out.println("Trocas: " + trocas);
        System.out.println("Melhor caso: 0");
        System.out.println("Pior caso: 10");
    }
}