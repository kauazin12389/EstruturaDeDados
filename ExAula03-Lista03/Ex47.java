import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;

public class Ex47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matriz = new int[n][3];

        for (int i = 0; i < n; i++) {
            matriz[i][0] = sc.nextInt(); // Inscricao
            matriz[i][1] = sc.nextInt(); // Posicao
            matriz[i][2] = sc.nextInt(); // Tempo
        }

        Arrays.sort(matriz, Comparator.comparingInt(a -> a[0]));

        int idBusca = sc.nextInt();
        int indice = buscaBinariaMatriz(matriz, idBusca);

        if (indice != -1) {
            System.out.println("Pos: " + matriz[indice][1] + " Tempo: " + matriz[indice][2]);
        }
    }

    public static int buscaBinariaMatriz(int[][] m, int chave) {
        int ini = 0, fim = m.length - 1;
        while (ini <= fim) {
            int meio = (ini + fim) / 2;
            if (m[meio][0] == chave) return meio;
            if (m[meio][0] < chave) ini = meio + 1;
            else fim = meio - 1;
        }
        return -1;
    }
}
