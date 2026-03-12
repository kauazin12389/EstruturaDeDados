import java.util.Scanner;

public class Ex66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] v = new double[20];
        for (int i = 0; i < 20; i++) v[i] = sc.nextDouble();
        for (int i = 0; i < 19; i++) {
            int m = i;
            for (int j = i + 1; j < 20; j++) {
                if (v[j] > v[m]) m = j;
            }
            double t = v[i];
            v[i] = v[m];
            v[m] = t;
        }
        for (int i = 0; i < 20; i++) System.out.print(v[i] + " ");
    }
}