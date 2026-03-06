import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ras = new int[n];
        double[] notas = new double[n];
        int opcao;

        do {
            opcao = sc.nextInt();
            if (opcao == 1) {
                for (int i = 0; i < n; i++) ras[i] = sc.nextInt();
            } else if (opcao == 2) {
                for (int i = 0; i < n; i++) notas[i] = sc.nextDouble();
            } else if (opcao == 3) {
                int busca = sc.nextInt();
                buscarNota(ras, notas, busca);
            }
        } while (opcao != 4);
    }

    public static void buscarNota(int[] r, double[] n, int chave) {
        for (int i = 0; i < r.length; i++) {
            if (r[i] == chave) {
                System.out.println(n[i]);
                return;
            }
        }
    }
}
