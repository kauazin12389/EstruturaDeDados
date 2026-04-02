import java.util.Scanner;
class CircTAD {
    char[] f = new char[10];
    int i = 0, fim = 0, t = 0;
    void in(char c) { if (t < 10) { f[fim] = c; fim = (fim + 1) % 10; t++; } }
    char out() {
        if (t == 0) return '\0';
        char c = f[i];
        i = (i + 1) % 10;
        t--;
        return c;
    }
}
public class Ex16 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        CircTAD f = new CircTAD();
        int op = 0;
        while (op != 4) {
            op = leitor.nextInt();
            if (op == 1) f.in(leitor.next().charAt(0));
            else if (op == 3) System.out.println(f.out());
        }
        leitor.close();
    }
}