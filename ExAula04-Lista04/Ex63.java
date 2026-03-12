import java.util.Scanner;

public class Ex63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] v = new char[10];
        for (int i = 0; i < 10; i++) v[i] = sc.next().charAt(0);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (v[j] > v[j+1]) {
                    char t = v[j]; v[j] = v[j+1]; v[j+1] = t;
                }
            }
        }
        char alvo = sc.next().charAt(0);
        System.out.println(busca(v, alvo, 0, 9));
    }
    public static int busca(char[] v, char a, int i, int f) {
        if (i > f) return -1;
        int m = (i + f) / 2;
        if (v[m] == a) return m;
        if (v[m] > a) return busca(v, a, i, m - 1);
        return busca(v, a, m + 1, f);
    }
}