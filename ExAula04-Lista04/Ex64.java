import java.util.Scanner;

public class Ex64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] v = new char[5];
        for (int i = 0; i < 5; i++) v[i] = sc.next().charAt(0);
        for (int i = 0; i < 4; i++) {
            int m = i;
            for (int j = i + 1; j < 5; j++) {
                if (v[j] < v[m]) m = j;
            }
            char t = v[i];
            v[i] = v[m];
            v[m] = t;
        }
        for (int i = 0; i < 5; i++) System.out.print(v[i] + " ");
    }
}