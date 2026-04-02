import java.util.Scanner;
public class Ex19 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] f = new int[5];
        int i = 0, fim = 0;
        for (int k = 0; k < 5; k++) f[fim++] = leitor.nextInt();
        for (int k = 0; k < 4; k++) {
            char op = leitor.next().charAt(0);
            int n1 = f[i];
            i = (i + 1) % 5;
            if (op == '+') f[i] = n1 + f[i];
            else if (op == '-') f[i] = n1 - f[i];
            else if (op == '*') f[i] = n1 * f[i];
            else if (op == '/') f[i] = n1 / f[i];
            System.out.println(f[i]);
        }
        leitor.close();
    }
}