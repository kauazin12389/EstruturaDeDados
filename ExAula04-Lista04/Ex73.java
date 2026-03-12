import java.util.Scanner;

public class Ex73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] v = new char[10];
        for (int i = 0; i < 10; i++) v[i] = sc.next().charAt(0);
        for (int i = 1; i < 10; i++) {
            char k = v[i];
            int j = i - 1;
            while (j >= 0 && v[j] > k) {
                v[j+1] = v[j];
                j--;
            }
            v[j+1] = k;
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