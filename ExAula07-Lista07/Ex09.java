import java.util.Scanner;
class FilaCharTAD {
    char[] dados = new char[10];
    int total = 0;
    void inserir(char c) { if (total < 10) dados[total++] = c; }
    char retirar() {
        if (total == 0) return '\0';
        char aux = dados[0];
        for (int i = 0; i < total - 1; i++) dados[i] = dados[i + 1];
        total--;
        return aux;
    }
}
public class Ex09 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        FilaCharTAD f = new FilaCharTAD();
        int op = 0;
        while (op != 4) {
            op = leitor.nextInt();
            if (op == 1) f.inserir(leitor.next().charAt(0));
            else if (op == 3) System.out.println(f.retirar());
        }
        leitor.close();
    }
}