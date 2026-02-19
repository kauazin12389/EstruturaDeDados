import java.util.Scanner;

public class Ex8 {
    static final int TAMANHO = 3;
    static int[][] matriz = new int[TAMANHO][TAMANHO];

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean ehSimetrica = true;

        for (int i = 0; i < TAMANHO; i++) {
            for (int j = 0; j < TAMANHO; j++) {
                matriz[i][j] = leitor.nextInt();
            }
        }

        for (int i = 0; i < TAMANHO; i++) {
            for (int j = 0; j < TAMANHO; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    ehSimetrica = false;
                    break;
                }
            }
        }

        if (ehSimetrica) {
            System.out.println("A matriz e simetrica.");
        } else {
            System.out.println("A matriz nao e simetrica.");
        }

        leitor.close();
    }
}