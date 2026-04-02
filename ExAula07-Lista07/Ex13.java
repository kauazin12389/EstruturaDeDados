import java.util.Scanner;
class CalcTAD {
    int[] v = new int[5];
    int n = 0;
    void add(int x) { v[n++] = x; }
    int calc(char op) {
        if (op == '+') v[1] = v[0] + v[1];
        else if (op == '-') v[1] = v[0] - v[1];
        else if (op == '*') v[1] = v[0] * v[1];
        else if (op == '/') v[1] = v[0] / v[1];
        int res = v[1];
        for (int i = 0; i < 4; i++) v[i] = v[i + 1];
        return res;
    }
}
public class Ex13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        CalcTAD c = new CalcTAD();
        for (int i = 0; i < 5; i++) c.add(leitor.nextInt());
        for (int i = 0; i < 4; i++) System.out.println(c.calc(leitor.next().charAt(0)));
        leitor.close();
    }
}