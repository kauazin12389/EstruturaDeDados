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

    static void exibirVisual(No33 atual, int nivel) {
        if (atual != null) {
            exibirVisual(atual.dir, nivel + 1);
            for (int i = 0; i < nivel; i++) System.out.print("   ");
            System.out.println(atual.item);
            exibirVisual(atual.esq, nivel + 1);
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            raiz = inserir(raiz, leitor.nextInt());
        }
        exibirVisual(raiz, 0);
        leitor.close();
    }
}