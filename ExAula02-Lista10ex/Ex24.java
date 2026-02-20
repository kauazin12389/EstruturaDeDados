import java.util.Scanner;
public class Ex24 {
    public static boolean verificarPrimo(int n, int divisor) {
        if (divisor == 1) {
            return true;
        } 
        if (n % divisor == 0) {
            return false;
        } 
        return verificarPrimo(n, divisor - 1);
    }
        public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = leitor.nextInt();

        if (numero <= 1) {
            System.out.println(numero + " não é primo");
        } 
        else if (verificarPrimo(numero, numero / 2)) {
            System.out.println(numero + " é primo");
        } 
        else {
            System.out.println(numero + " não é primo");
        }

        leitor.close();
    }
}
