import java.util.Scanner;
class FilaNomesTAD {
    String[] s = new String[10];
    int t = 0;
    void in(String x) { if (t < 10) s[t++] = x; }
    String out() {
        if (t == 0) return "";
        String aux = s[0];
        for (int i = 0; i < t - 1; i++) s[i] = s[i + 1];
        t--;
        return aux;
    }
}
public class Ex14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        FilaNomesTAD f = new FilaNomesTAD();
        int op = 0;
        while (op != 4) {
            op = leitor.nextInt();
            if (op == 1) f.in(leitor.next());
            else if (op == 3) System.out.println(f.out());
        }
        leitor.close();
    }
}