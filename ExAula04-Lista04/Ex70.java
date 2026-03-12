import java.util.Scanner;

public class Ex70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) v[i] = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int k = v[i];
            int j = i - 1;
            while (j >= 0 && v[j] > k) {
                v[j+1] = v[j];
                j--;
            }
            v[j+1] = k;
        }
        for (int i = 0; i < n; i++) System.out.print(v[i] + " ");
    }
}