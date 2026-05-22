import java.util.Scanner;

class No34 {
    int item;
    No34 esq, dir;
}

public class Ex34 {
    static No34 raiz = null;

    static No34 inserir(No34 atual, int valor) {
        if (atual == null) {
            No34 novo = new No34();
            novo.item = valor;
            return novo;
        }
        if (valor < atual.item) atual.esq = inserir(atual.esq, valor);
        else atual.dir = inserir(atual.dir, valor);
        return atual;
    }

    static void apresentar(No34 atual, int nivel) {
        if (atual != null) {
            apresentar(atual.dir, nivel + 1);
            for (int i = 0; i < nivel; i++) System.out.print("   ");
            System.out.println(atual.item);
            apresentar(atual.esq, nivel + 1);
        }
    }

    static boolean buscar(No34 atual, int valor) {
        if (atual == null) return false;
        if (atual.item == valor) return true;
        if (valor < atual.item) return buscar(atual.esq, valor);
        return buscar(atual.dir, valor);
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        char op = ' ';
        while (op != 'D') {
            System.out.println("\nA-Inserir\nB-Apresentar\nC-Buscar\nD-Sair");
            System.out.print("Opção: ");
            op = leitor.next().toUpperCase().charAt(0);

            if (op == 'A') {
                System.out.print("Valor: ");
                raiz = inserir(raiz, leitor.nextInt());
            } else if (op == 'B') {
                apresentar(raiz, 0);
            } else if (op == 'C') {
                System.out.print("Buscar: ");
                int v = leitor.nextInt();
                if (buscar(raiz, v)) System.out.println("Nó encontrado");
                else System.out.println("Nó não encontrado");
            }
        }
        leitor.close();
    }
}