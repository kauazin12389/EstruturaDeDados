import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um numero inteiro maior que zero: ");
        int numero = leitor.nextInt();

        if (numero <= 0) {
            System.out.println("Valor invalido.");
        } else {
            if (verificarSePrimo(numero)) {
                System.out.println("O numero " + numero + " e primo.");
            } else {
                System.out.println("O numero " + numero + " nao e primo.");
            }
        }

        leitor.close();
    }

    public static boolean verificarSePrimo(int n) {
        if (n == 1) return false;
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}