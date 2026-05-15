import java.util.Scanner;

class No35 {
    int item;
    No35 esq, dir;
}

public class Ex35 {
    static No35 raiz = null;

    static No35 inserir(No35 atual, int valor) {
        if (atual == null) {
            No35 novo = new No35();
            novo.item = valor;
            return novo;
        }
        if (valor < atual.item) atual.esq = inserir(atual.esq, valor);
        else atual.dir = inserir(atual.dir, valor);
        return atual;
    }

    static void exibirVisual(No35 atual, int nivel) {
        if (atual != null) {
            exibirVisual(atual.dir, nivel + 1);
            for (int i = 0; i < nivel; i++) System.out.print("   ");
            System.out.println(atual.item);
            exibirVisual(atual.esq, nivel + 1);
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        char op = ' ';
        while (op != 'D') {
            System.out.println("\nA-Inserir\nB-Apresentar\nC-Eliminar (Nao implementado)\nD-Sair");
            System.out.print("Opcao: ");
            op = leitor.next().toUpperCase().charAt(0);

            if (op == 'A') {
                System.out.print("Valor: ");
                raiz = inserir(raiz, leitor.nextInt());
            } else if (op == 'B') {
                exibirVisual(raiz, 0);
            } else if (op == 'C') {
                System.out.println("");
            } else if (op == 'D'){
                System.out.println("");
            }
        }
        leitor.close();
    }
}