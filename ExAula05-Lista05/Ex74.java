import java.util.Scanner;

public class Ex74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] v = new char[5];
        for (int i = 0; i < 5; i++) v[i] = sc.next().charAt(0);
        quickSort(v, 0, 4);
        for (int i = 0; i < 5; i++) System.out.print(v[i] + " ");
    }

    public static void quickSort(char[] v, int esq, int dir) {
        if (esq < dir) {
            int p = particao(v, esq, dir);
            quickSort(v, esq, p - 1);
            quickSort(v, p + 1, dir);
        }
    }

    public static int particao(char[] v, int esq, int dir) {
        char pivo = v[dir];
        int i = esq - 1;
        for (int j = esq; j < dir; j++) {
            if (v[j] <= pivo) {
                i++;
                char t = v[i]; v[i] = v[j]; v[j] = t;
            }
        }
        char t = v[i + 1]; v[i + 1] = v[dir]; v[dir] = t;
        return i + 1;
    }
}