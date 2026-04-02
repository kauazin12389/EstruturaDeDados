import java.util.Scanner;
class CalcCircTAD {
    int[] f = new int[5];
    int i = 0, fim = 0;
    void in(int x) { f[fim++] = x; }
    int calc(char op) {
        int n1 = f[i];
        i = (i + 1) % 5;
        if (op == '+') f[i] = n1 + f[i];
        else if (op == '-') f[i] = n1 - f[i];
        else if (op == '*') f[i] = n1 * f[i];
        else if (op == '/') f[i] = n1 / f[i];
        return f[i];
    }
}
public class Ex20 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        CalcCircTAD c = new CalcCircTAD();
        for (int k = 0; k < 5; k++) c.in(leitor.nextInt());
        for (int k = 0; k < 4; k++) System.out.println(c.calc(leitor.next().charAt(0)));
        leitor.close();
    }
}