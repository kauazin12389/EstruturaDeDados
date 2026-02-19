import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um numero inteiro e positivo: ");
        int valor = leitor.nextInt();

        if (valor > 0) {
            if (ePrimo(valor)) {
                System.out.println("O numero " + valor + " e primo.");
            } else {
                System.out.println("O numero " + valor + " nao e primo.");
            }
        } else {
            System.out.println("Erro: O numero deve ser maior que zero.");
        }

        leitor.close();
    }

    public static boolean ePrimo(int n) {
        if (n == 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}