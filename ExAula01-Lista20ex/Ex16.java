import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = leitor.nextInt();

        if (ehPar(numero)) {
            System.out.println("O numero " + numero + " e par.");
        } else {
            System.out.println("O numero " + numero + " e impar.");
        }

        leitor.close();
    }

    public static boolean ehPar(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}