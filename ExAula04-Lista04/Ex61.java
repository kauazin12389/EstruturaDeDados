import java.util.Scanner;

public class Ex61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] v = new double[20];
        for (int i = 0; i < 20; i++) v[i] = sc.nextDouble();
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19 - i; j++) {
                if (v[j] < v[j+1]) {
                    double t = v[j];
                    v[j] = v[j+1];
                    v[j+1] = t;
                }
            }
        }
        for (int i = 0; i < 20; i++) System.out.print(v[i] + " ");
    }
}