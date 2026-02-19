import java.util.Scanner;

public class Ex9 {
    static final int TAMANHO = 3;
    static int[][] matriz = new int[TAMANHO][TAMANHO];

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean ehIdentidade = true;

        for (int i = 0; i < TAMANHO; i++) {
            for (int j = 0; j < TAMANHO; j++) {
                matriz[i][j] = leitor.nextInt();
            }
        }

        for (int i = 0; i < TAMANHO; i++) {
            for (int j = 0; j < TAMANHO; j++) {
                if (i == j) {
                    if (matriz[i][j] != 1) {
                        ehIdentidade = false;
                    }
                } else {
                    if (matriz[i][j] != 0) {
                        ehIdentidade = false;
                    }
                }
            }
        }

        if (ehIdentidade) {
            System.out.println("A matriz e identidade.");
        } else {
            System.out.println("A matriz nao e identidade.");
        }

        leitor.close();
    }
}