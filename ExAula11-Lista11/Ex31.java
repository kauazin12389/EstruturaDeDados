import java.util.Scanner;

class No31 {
    int item;
    No31 esq, dir;
}

public class Ex31 {
    static No31 raiz = null;

    static No31 inserir(No31 atual, int valor) {
        if (atual == null) {
            No31 novo = new No31();
            novo.item = valor;
            return novo;
        }
        if (valor < atual.item) atual.esq = inserir(atual.esq, valor);
        else atual.dir = inserir(atual.dir, valor);
        return atual;
    }

    static void exibirPre(No31 atual) {
        if (atual != null) {
            System.out.print(atual.item + " ");
            exibirPre(atual.esq);
            exibirPre(atual.dir);
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            raiz = inserir(raiz, leitor.nextInt());
        }
        System.out.print("Apresentação (Pré-Ordenado): ");
        exibirPre(raiz);
        System.out.println();
        leitor.close();
    }
}