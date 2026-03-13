import java.util.Scanner;

public class Ex76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] v = new double[20];
        for (int i = 0; i < 20; i++) v[i] = sc.nextDouble();
        quickSort(v, 0, 19);
        for (int i = 0; i < 20; i++) System.out.print(v[i] + " ");
    }

    public static void quickSort(double[] v, int esq, int dir) {
        if (esq < dir) {
            int p = particao(v, esq, dir);
            quickSort(v, esq, p - 1);
            quickSort(v, p + 1, dir);
        }
    }

    public static int particao(double[] v, int esq, int dir) {
        double pivo = v[dir];
        int i = esq - 1;
        for (int j = esq; j < dir; j++) {
            if (v[j] >= pivo) {
                i++;
                double t = v[i]; v[i] = v[j]; v[j] = t;
            }
        }
        double t = v[i + 1]; v[i + 1] = v[dir]; v[dir] = t;
        return i + 1;
    }
}