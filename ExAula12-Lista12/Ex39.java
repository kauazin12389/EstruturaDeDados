import java.util.Scanner;

public class Ex39 {
    static int[][] tabela = new int[10][5];
    static int[] contadores = new int[10]; 

    static void inicializarTabela() {
        for (int i = 0; i < 10; i++) {
            contadores[i] = 0;
            for (int j = 0; j < 5; j++) {
                tabela[i][j] = -1;
            }
        }
    }

    static int contarDigitos(int num) {
        if (num == 0) return 1;
        int cont = 0;
        int n = Math.abs(num);
        while (n > 0) {
            cont++;
            n /= 10;
        }
        return cont;
    }

    static int funcaoHash(int num) {
        int chave = contarDigitos(num);
        return chave % 10;
    }

    static void inserir(int num) {
        int posicao = funcaoHash(num);
        int totalNaPosicao = contadores[posicao];

        if (totalNaPosicao < 5) {
            tabela[posicao][totalNaPosicao] = num;
            contadores[posicao]++;
            System.out.println("Número " + num + " inserido com sucesso na posição " + posicao);
        } else {
            System.out.println("A posição " + posicao + " já atingiu o limite máximo de 5 elementos.");
        }
    }

    static void exibirTabela() {
        for (int i = 0; i < 10; i++) {
            System.out.print("Posição " + i + ": ");
            for (int j = 0; j < 5; j++) {
                if (tabela[i][j] != -1) {
                    System.out.print("[" + tabela[i][j] + "] ");
                } else {
                    System.out.print("[ ] ");
                }
            }
            System.out.println("(Total: " + contadores[i] + ")");
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        inicializarTabela();
        int num;

        while (true) {
            System.out.print("Digite um número positivo (ou -1 para sair): ");
            num = leitor.nextInt();
            if (num == -1) break;
            inserir(num);
        }

        System.out.println("\n--- Tabela hash fechada ");
        exibirTabela();
        leitor.close();
    }
}