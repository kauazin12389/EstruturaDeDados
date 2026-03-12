import java.util.Scanner;

public class Ex68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] v = new char[10];
        for (int i = 0; i < 10; i++) v[i] = sc.next().charAt(0);
        for (int i = 0; i < 9; i++) {
            int m = i;
            for (int j = i + 1; j < 10; j++) if (v[j] < v[m]) m = j;
            char t = v[i]; v[i] = v[m]; v[m] = t;
        }
        char a = sc.next().charAt(0);
        System.out.println(busca(v, a, 0, 9));
    }
    public static int busca(char[] v, char a, int i, int f) {
        if (i > f) return -1;
        int m = (i + f) / 2;
        if (v[m] == a) return m;
        if (v[m] > a) return busca(v, a, i, m - 1);
        return busca(v, a, m + 1, f);
    }
}