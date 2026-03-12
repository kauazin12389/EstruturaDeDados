import java.util.Scanner;

public class Ex65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) v[i] = sc.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int m = i;
            for (int j = i + 1; j < n; j++) {
                if (v[j] < v[m]) m = j;
            }
            int t = v[i];
            v[i] = v[m];
            v[m] = t;
        }
        for (int i = 0; i < n; i++) System.out.print(v[i] + " ");
    }
}