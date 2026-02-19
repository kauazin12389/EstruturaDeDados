import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] vetor = new double[10];
        
        carregarVetor(vetor, leitor);

        int indiceAtual = 0;
        char opcao = ' ';

        System.out.println("\nElemento atual [" + indiceAtual + "]: " + vetor[indiceAtual]);

        while (opcao != '.') {
            System.out.print("Comando (+ proximo, - anterior, . sair): ");
            opcao = leitor.next().charAt(0);

            if (opcao == '+') {
                if (indiceAtual < 9) {
                    indiceAtual++;
                    System.out.println("Elemento [" + indiceAtual + "]: " + vetor[indiceAtual]);
                } else {
                    System.out.println("Voce ja esta no ultimo elemento.");
                }
            } else if (opcao == '-') {
                if (indiceAtual > 0) {
                    indiceAtual--;
                    System.out.println("Elemento [" + indiceAtual + "]: " + vetor[indiceAtual]);
                } else {
                    System.out.println("Voce ja esta no primeiro elemento.");
                }
            } else if (opcao != '.') {
                System.out.println("Opcao invalida.");
            }
        }

        leitor.close();
    }

    public static void carregarVetor(double[] v, Scanner sc) {
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor para a posicao " + i + ": ");
            v[i] = sc.nextDouble();
        }
    }
}