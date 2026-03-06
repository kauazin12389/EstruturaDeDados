import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd = sc.nextInt();
        int[][] prova = new int[qtd][3];

        for (int i = 0; i < qtd; i++) {
            prova[i][0] = sc.nextInt();
            prova[i][1] = sc.nextInt();
            prova[i][2] = sc.nextInt();
        }

        int buscaInscricao = sc.nextInt();
        buscarAtleta(prova, buscaInscricao);
    }

    public static void buscarAtleta(int[][] m, int id) {
        for (int i = 0; i < m.length; i++) {
            if (m[i][0] == id) {
                System.out.println("Posição: " + m[i][1]);
                System.out.println("Tempo: " + m[i][2]);
                return;
            }
        }
    }
}