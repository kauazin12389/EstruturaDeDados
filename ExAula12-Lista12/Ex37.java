import java.util.Scanner;

class No37 {
    int numero;
    No37 proximo;
}

public class Ex37 {
    static No37[] tabela = new No37[5];

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
        return chave % 5;
    }

    static void inserir(int num) {
        int posicao = funcaoHash(num);
        No37 novo = new No37();
        novo.numero = num;
        novo.proximo = null;

        if (tabela[posicao] == null) {
            tabela[posicao] = novo;
        } else {
            No37 aux = tabela[posicao];
            while (aux.proximo != null) {
                aux = aux.proximo;
            }
            aux.proximo = novo;
        }
    }

    static void exibirTabela() {
        for (int i = 0; i < 5; i++) {
            System.out.print("Posição " + i + ": ");
            No37 aux = tabela[i];
            while (aux != null) {
                System.out.print("[" + aux.numero + "] -> ");
                aux = aux.proximo;
            }
            System.out.println("Nulo");
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num;
        
        while (true) {
            System.out.print("Digite um número inteiro (ou -1 para sair): ");
            num = leitor.nextInt();
            if (num == -1) break;
            inserir(num);
        }

        System.out.println("\n Estado da tabela hash");
        exibirTabela();
        leitor.close();
    }
}