import java.util.Scanner;

class No36 {
    String nome;
    No36 proximo;
}

public class Ex36 {
    static No36[] tabela = new No36[10];

    static int funcaoHash(String nome) {
        int chave = nome.length();
        return chave % 10;
    }

    static void inserir(String nome) {
        int posicao = funcaoHash(nome);
        No36 novo = new No36();
        novo.nome = nome;
        novo.proximo = null;

        if (tabela[posicao] == null) {
            tabela[posicao] = novo;
        } else {
            No36 aux = tabela[posicao];
            while (aux.proximo != null) {
                aux = aux.proximo;
            }
            aux.proximo = novo;
        }
    }

    static void exibirTabela() {
        for (int i = 0; i < 10; i++) {
            System.out.print("Posição " + i + ": ");
            No36 aux = tabela[i];
            while (aux != null) {
                System.out.print("[" + aux.nome + "] -> ");
                aux = aux.proximo;
            }
            System.out.println("Nulo");
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String entrada = "";
        
        while (true) {
            System.out.print("Digite um nome para inserir (ou 'SAIR'): ");
            entrada = leitor.nextLine();
            if (entrada.equalsIgnoreCase("SAIR")) {
                break;
            }
            inserir(entrada);
        }

        System.out.println("\n Estado da tabela hash");
        exibirTabela();
        leitor.close();
    }
}