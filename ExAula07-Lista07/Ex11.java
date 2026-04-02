import java.util.Scanner;
class FilaInvTAD {
    char[] dados = new char[10];
    int total = 0;
    void inserir(char c) { if (total < 10) dados[9 - total++] = c; }
    char retirar() {
        if (total == 0) return '\0';
        char aux = dados[9];
        for (int i = 9; i > 10 - total; i--) dados[i] = dados[i - 1];
        total--;
        return aux;
    }
}
public class Ex11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        FilaInvTAD f = new FilaInvTAD();
        int op = 0;
        while (op != 4) {
            op = leitor.nextInt();
            if (op == 1) f.inserir(leitor.next().charAt(0));
            else if (op == 3) System.out.println(f.retirar());
        }
        leitor.close();
    }
}