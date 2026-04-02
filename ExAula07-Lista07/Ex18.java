import java.util.Scanner;
class CircInvTAD {
    char[] f = new char[10];
    int i = 9, fim = 9, t = 0;
    void in(char c) { if (t < 10) { f[fim] = c; fim = (fim == 0) ? 9 : fim - 1; t++; } }
    char out() {
        if (t == 0) return '\0';
        char c = f[i];
        i = (i == 0) ? 9 : i - 1;
        t--;
        return c;
    }
}
public class Ex18 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        CircInvTAD f = new CircInvTAD();
        int op = 0;
        while (op != 4) {
            op = leitor.nextInt();
            if (op == 1) f.in(leitor.next().charAt(0));
            else if (op == 3) System.out.println(f.out());
        }
        leitor.close();
    }
}