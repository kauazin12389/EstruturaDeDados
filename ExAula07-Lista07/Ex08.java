import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        char[] fila = new char[10];
        int total = 0;
        int opcao = 0;
        while (opcao != 4) {
            opcao = leitor.nextInt();
            if (opcao == 1 && total < 10) {
                fila[total++] = leitor.next().charAt(0);
            } else if (opcao == 2 && total > 0) {
                System.out.println(fila[0] + " " + total);
            } else if (opcao == 3 && total > 0) {
                System.out.println(fila[0]);
                for (int i = 0; i < total - 1; i++) fila[i] = fila[i + 1];
                total--;
            }
        }
        leitor.close();
    }
}