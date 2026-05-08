import java.util.Scanner;

class No33 {
    int item;
    No33 esq, dir;
}

public class Ex33 {
    static No33 raiz = null;

    static No33 inserir(No33 atual, int valor) {
        if (atual == null) {
            No33 novo = new No33();
            novo.item = valor;
            return novo;
        }
        if (valor < atual.item) atual.esq = inserir(atual.esq, valor);
        else atual.dir = inserir(atual.dir, valor);
        return atual;
    }

    static void exibirArvore(No33 atual, int nivel) {
        if (atual != null) {
            exibirArvore(atual.dir, nivel + 1);
            for (int i = 0; i < nivel; i++) System.out.print("   ");
            System.out.println(atual.item);
            exibirArvore(atual.esq, nivel + 1);
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite os 7 valores (Pré-Ordenado):");
        for (int i = 0; i < 7; i++) {
            raiz = inserir(raiz, leitor.nextInt());
        }
        System.out.println("Estrutura da Arvore:");
        exibirArvore(raiz, 0);
        leitor.close();
    }
}