import java.util.Scanner;

public class Ex10 {
    static int[][] teatro = new int[30][100];

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- GESTAO DE TEATRO ---");
            System.out.println("1 - Alterar Status de Assento");
            System.out.println("2 - Relatorio de Ocupacao");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");
            opcao = leitor.nextInt();

            if (opcao == 1) {
                System.out.print("Fileira (0-29): ");
                int f = leitor.nextInt();
                System.out.print("Cadeira (0-99): ");
                int c = leitor.nextInt();

                if (f >= 0 && f < 30 && c >= 0 && c < 100) {
                    System.out.print("Status (0-Livre, 1-Reservado, 2-Vendido): ");
                    int status = leitor.nextInt();
                    if (status >= 0 && status <= 2) {
                        teatro[f][c] = status;
                        System.out.println("Sucesso!");
                    } else {
                        System.out.println("Status invalido.");
                    }
                } else {
                    System.out.println("Posicao inexistente.");
                }
            } else if (opcao == 2) {
                int livres = 0, reservados = 0, vendidos = 0;
                for (int i = 0; i < 30; i++) {
                    for (int j = 0; j < 100; j++) {
                        if (teatro[i][j] == 0) livres++;
                        else if (teatro[i][j] == 1) reservados++;
                        else if (teatro[i][j] == 2) vendidos++;
                    }
                }
                System.out.println("\n--- ESTADO ATUAL ---");
                System.out.println("Livres: " + livres);
                System.out.println("Reservados: " + reservados);
                System.out.println("Vendidos: " + vendidos);
            }
        } while (opcao != 0);

        leitor.close();
    }
}