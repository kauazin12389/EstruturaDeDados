import java.util.Scanner;

class No30 {
    int item;
    No30 esq, dir;
}

public class Ex30 {
    static No30 raiz = null;

    static No30 inserir(No30 atual, int valor) {
        if (atual == null) {
            No30 novo = new No30();
            novo.item = valor;
            return novo;
        }
        if (valor < atual.item) atual.esq = inserir(atual.esq, valor);
        else atual.dir = inserir(atual.dir, valor);
        return atual;
    }

    static void exibirOrdenado(No30 atual) {
        if (atual != null) {
            exibirOrdenado(atual.esq);
            System.out.print(atual.item + " ");
            exibirOrdenado(atual.dir);
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a quantidade de nós: ");
        int n = leitor.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Valor: ");
            raiz = inserir(raiz, leitor.nextInt());
        }
        System.out.print("Ordenado: ");
        exibirOrdenado(raiz);
        System.out.println();
        leitor.close();
    }
}