import java.util.Scanner;

public class Ex71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] v = new double[20];
        for (int i = 0; i < 20; i++) v[i] = sc.nextDouble();
        for (int i = 1; i < 20; i++) {
            double k = v[i];
            int j = i - 1;
            while (j >= 0 && v[j] < k) {
                v[j+1] = v[j];
                j--;
            }
            v[j+1] = k;
        }
        for (int i = 0; i < 20; i++) System.out.print(v[i] + " ");
    }
}