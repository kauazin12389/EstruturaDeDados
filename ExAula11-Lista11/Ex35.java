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

    static No35 eliminar(No35 atual, int valor) {
        if (atual == null) return null;
        if (valor < atual.item) atual.esq = eliminar(atual.esq, valor);
        else if (valor > atual.item) atual.dir = eliminar(atual.dir, valor);
        else {
            if (atual.esq == null) return atual.dir;
            if (atual.dir == null) return atual.esq;
            No35 aux = atual.esq;
            while (aux.dir != null) aux = aux.dir;
            atual.item = aux.item;
            atual.esq = eliminar(atual.esq, aux.item);
        }
        return atual;
    }

    static void apresentar(No35 atual, int nivel) {
        if (atual != null) {
            apresentar(atual.dir, nivel + 1);
            for (int i = 0; i < nivel; i++) System.out.print("   ");
            System.out.println(atual.item);
            apresentar(atual.esq, nivel + 1);
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        char op = ' ';
        while (op != 'D') {
            System.out.println("\nA-Inserir\nB-Apresentar\nC-Eliminar\nD-Sair");
            System.out.print("Opção: ");
            op = leitor.next().toUpperCase().charAt(0);

            if (op == 'A') {
                System.out.print("Valor: ");
                raiz = inserir(raiz, leitor.nextInt());
            } else if (op == 'B') {
                apresentar(raiz, 0);
            } else if (op == 'C') {
                System.out.print("Eliminar: ");
                raiz = eliminar(raiz, leitor.nextInt());
                System.out.println("Nó Eliminado");
            }
        }
        leitor.close();
    }
}