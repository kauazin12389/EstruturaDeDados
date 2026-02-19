import java.util.Scanner;

public class Ex15 {
    static int numeroSecreto = -1;
    static int contadorPalpites = 0;
    static int ultimoResultado = 0;
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        char opcao = ' ';

        while (opcao != 'D') {
            System.out.println("\n--- MENU DE JOGO ---");
            System.out.println("A - Inserir numero secreto");
            System.out.println("B - Jogar");
            System.out.println("C - Apresentar resultados");
            System.out.println("D - Sair");
            System.out.print("Escolha: ");
            opcao = Character.toUpperCase(leitor.next().charAt(0));

            if (opcao == 'A') {
                inserirNumeroSecreto();
            } else if (opcao == 'B') {
                jogar();
            } else if (opcao == 'C') {
                apresentarResultados();
            }
        }
    }

    public static void inserirNumeroSecreto() {
        System.out.print("Defina o numero secreto (inteiro e positivo): ");
        int num = leitor.nextInt();
        if (num >= 0) {
            numeroSecreto = num;
        } else {
            System.out.println("Valor invalido!");
        }
    }

    public static void jogar() {
        if (numeroSecreto == -1) {
            System.out.println("Erro: Defina o numero secreto na opcao A primeiro.");
            return;
        }

        contadorPalpites = 0;
        int palpite = 0;

        while (true) {
            System.out.print("Digite seu palpite (negativo para desistir): ");
            palpite = leitor.nextInt();

            if (palpite < 0) break;

            contadorPalpites++;

            if (palpite > numeroSecreto) {
                System.out.println("ALTO");
            } else if (palpite < numeroSecreto) {
                System.out.println("BAIXO");
            } else {
                System.out.println("ACERTOU!");
                ultimoResultado = contadorPalpites;
                break;
            }
        }
    }

    public static void apresentarResultados() {
        System.out.println("Palpites necessarios no ultimo acerto: " + ultimoResultado);
    }
}