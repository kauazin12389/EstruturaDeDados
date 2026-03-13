import java.util.Scanner;

public class Ex75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) v[i] = sc.nextInt();
        quickSort(v, 0, n - 1);
        for (int i = 0; i < n; i++) System.out.print(v[i] + " ");
    }

    public static void quickSort(int[] v, int esq, int dir) {
        if (esq < dir) {
            int p = particao(v, esq, dir);
            quickSort(v, esq, p - 1);
            quickSort(v, p + 1, dir);
        }
    }

    public static int particao(int[] v, int esq, int dir) {
        int pivo = v[dir];
        int i = esq - 1;
        for (int j = esq; j < dir; j++) {
            if (v[j] <= pivo) {
                i++;
                int t = v[i]; v[i] = v[j]; v[j] = t;
            }
        }
        int t = v[i + 1]; v[i + 1] = v[dir]; v[dir] = t;
        return i + 1;
    }
}