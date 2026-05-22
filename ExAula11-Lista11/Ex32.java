import java.util.Scanner;

class No32 {
    int item;
    No32 esq, dir;
}

public class Ex32 {
    static No32 raiz = null;

    static No32 inserir(No32 atual, int valor) {
        if (atual == null) {
            No32 novo = new No32();
            novo.item = valor;
            return novo;
        }
        if (valor < atual.item) atual.esq = inserir(atual.esq, valor);
        else atual.dir = inserir(atual.dir, valor);
        return atual;
    }

    static void exibirPos(No32 atual) {
        if (atual != null) {
            exibirPos(atual.esq);
            exibirPos(atual.dir);
            System.out.print(atual.item + " ");
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            raiz = inserir(raiz, leitor.nextInt());
        }
        System.out.print("Apresentação (Pós-Ordenado): ");
        exibirPos(raiz);
        System.out.println();
        leitor.close();
    }
}