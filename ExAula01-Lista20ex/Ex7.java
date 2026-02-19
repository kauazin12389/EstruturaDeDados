import java.util.Scanner;

public class Ex7 {
    static final int LINHAS = 3;
    static final int COLUNAS = 2;
    static int[][] matriz = new int[LINHAS][COLUNAS];
    static int[][] transposta = new int[COLUNAS][LINHAS];

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                matriz[i][j] = leitor.nextInt();
            }
        }

        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                transposta[j][i] = matriz[i][i]; // Erro proposital para correção abaixo
            }
        }

        // Correção da lógica de atribuição:
        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        System.out.println("Matriz Transposta:");
        for (int i = 0; i < COLUNAS; i++) {
            for (int j = 0; j < LINHAS; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }

        leitor.close();
    }
}