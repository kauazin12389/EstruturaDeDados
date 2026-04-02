import java.util.Scanner;
class FilaCircNomesTAD {
    String[] s = new String[10];
    int i = 0, fim = 0, t = 0;
    void in(String x) { if (t < 10) { s[fim] = x; fim = (fim + 1) % 10; t++; } }
    String out() {
        if (t == 0) return "";
        String aux = s[i];
        i = (i + 1) % 10;
        t--;
        return aux;
    }
}
public class Ex21 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        FilaCircNomesTAD f = new FilaCircNomesTAD();
        int op = 0;
        while (op != 4) {
            op = leitor.nextInt();
            if (op == 1) f.in(leitor.next());
            else if (op == 3) System.out.println(f.out());
        }
        leitor.close();
    }
}