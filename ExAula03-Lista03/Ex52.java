import java.util.Scanner;

public class Ex52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] v = new char[10];
        for (int i = 0; i < 10; i++) v[i] = sc.next().charAt(0);
        char busca = sc.next().charAt(0);
        int res = binRec(v, busca, 0, 9);
        System.out.println(res == -1 ? v.length : res);
    }

    public static int binRec(char[] v, char c, int i, int f) {
        if (i > f) return -1;
        int m = (i + f) / 2;
        if (v[m] == c) return m;
        if (v[m] < c) return binRec(v, c, m + 1, f);
        return binRec(v, c, i, m - 1);
    }
}