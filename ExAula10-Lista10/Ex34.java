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
            novo.esq = null;
            novo.dir = null;
            return novo;
        }
        if (valor < atual.item) {
            atual.esq = inserir(atual.esq, valor);
        } else {
            atual.dir = inserir(atual.dir, valor);
        }
        return atual;
    }

    static void exibirArvore(No34 atual, int nivel) {
        if (atual != null) {
            exibirArvore(atual.dir, nivel + 1);
            for (int i = 0; i < nivel; i++) System.out.print("   ");
            System.out.println(atual.item);
            exibirArvore(atual.esq, nivel + 1);
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        char op = ' ';
        while (op != 'D') {
            System.out.println("\nA-Inserir\nB-Apresentar\nC-Buscar (Nao implementado)\nD-Sair");
            System.out.print("Opcao: ");
            op = leitor.next().toUpperCase().charAt(0);

            if (op == 'A') {
                System.out.print("Valor: ");
                raiz = inserir(raiz, leitor.nextInt());
            } else if (op == 'B') {
                exibirArvore(raiz, 0);
            } else if (op == 'C') {
                System.out.println("");
            } else if (op == 'D'){
                System.out.println("");
            }
        }
        leitor.close();
    }
}