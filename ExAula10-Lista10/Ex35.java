import java.util.Scanner;

class No35 {
    int item;
    No35 esq, dir;
}

public class Ex35 {
    static No35 raiz = null;

    static No35 inserir(No35 atual, int valor) {
        if (atual == null) {
            No35 n = new No35();
            n.item = valor;
            return n;
        }
        if (valor < atual.item) atual.esq = inserir(atual.esq, valor);
        else atual.dir = inserir(atual.dir, valor);
        return atual;
    }

    static No35 remover(No35 atual, int valor) {
        if (atual == null) return null;
        if (valor < atual.item) atual.esq = remover(atual.esq, valor);
        else if (valor > atual.item) atual.dir = remover(atual.dir, valor);
        else {
            if (atual.esq == null) return atual.dir;
            if (atual.dir == null) return atual.esq;
            No35 sub = atual.esq;
            while (sub.dir != null) sub = sub.dir;
            atual.item = sub.item;
            atual.esq = remover(atual.esq, sub.item);
        }
        return atual;
    }

    static void mostrar(No35 atual, int n) {
        if (atual != null) {
            mostrar(atual.dir, n + 1);
            for (int i = 0; i < n; i++) System.out.print("   ");
            System.out.println(atual.item);
            mostrar(atual.esq, n + 1);
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        char op = ' ';
        while (op != 'D') {
            System.out.println("\nA-Inserir\nB-Apresentar\nC-Eliminar\nD-Sair");
            op = leitor.next().toUpperCase().charAt(0);
            if (op == 'A') {
                raiz = inserir(raiz, leitor.nextInt());
            } else if (op == 'B') {
                mostrar(raiz, 0);
            } else if (op == 'C') {
                System.out.print("Eliminar: ");
                raiz = remover(raiz, leitor.nextInt());
                System.out.println("Nó Eliminado");
            }
        }
        leitor.close();
    }
}