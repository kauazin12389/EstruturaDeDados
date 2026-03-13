import java.util.Scanner;

public class Ex78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] v = new char[10];
        for (int i = 0; i < 10; i++) v[i] = sc.next().charAt(0);
        quickSort(v, 0, 9);
        char alvo = sc.next().charAt(0);
        System.out.println(busca(v, alvo, 0, 9));
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

    public static int busca(char[] v, char a, int i, int f) {
        if (i > f) return -1;
        int m = (i + f) / 2;
        if (v[m] == a) return m;
        return (v[m] > a) ? busca(v, a, i, m - 1) : busca(v, a, m + 1, f);
    }
}