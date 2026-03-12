import java.util.Scanner;

public class Ex69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] v = new char[5];
        for (int i = 0; i < 5; i++) v[i] = sc.next().charAt(0);
        for (int i = 1; i < 5; i++) {
            char k = v[i];
            int j = i - 1;
            while (j >= 0 && v[j] > k) {
                v[j+1] = v[j];
                j--;
            }
            v[j+1] = k;
        }
        for (int i = 0; i < 5; i++) System.out.print(v[i] + " ");
    }
}