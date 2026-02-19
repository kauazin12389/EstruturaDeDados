import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] vetor = new double[10];
        int indiceAtual = 0;
        char opcao = ' ';

        carregarVetor(vetor, leitor);

        exibirElemento(vetor, indiceAtual);

        while (opcao != '.') {
            System.out.print("Comando (+, -, .): ");
            opcao = leitor.next().charAt(0);

            if (opcao == '+') {
                indiceAtual = navegarProximo(vetor, indiceAtual);
            } else if (opcao == '-') {
                indiceAtual = navegarAnterior(vetor, indiceAtual);
            } else if (opcao != '.') {
                System.out.println("Opcao invalida.");
            }
        }

        leitor.close();
    }

    public static void carregarVetor(double[] v, Scanner sc) {
        for (int i = 0; i < v.length; i++) {
            System.out.print("Vetor[" + i + "]: ");
            v[i] = sc.nextDouble();
        }
    }

    public static void exibirElemento(double[] v, int i) {
        System.out.println("Elemento atual [" + i + "]: " + v[i]);
    }

    public static int navegarProximo(double[] v, int i) {
        if (i < v.length - 1) {
            i++;
            exibirElemento(v, i);
        } else {
            System.out.println("Fim do vetor.");
        }
        return i;
    }

    public static int navegarAnterior(double[] v, int i) {
        if (i > 0) {
            i--;
            exibirElemento(v, i);
        } else {
            System.out.println("Inicio do vetor.");
        }
        return i;
    }
}