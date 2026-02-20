import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a quantidade das parcelas: ");
        int n = leitor.nextInt();
        if (n <= 0) {
            System.out.println("Quantidade inválida.");
        } 
        else {
            double resultado = somaSerie(n, 0);
            System.out.println("O valor é: " + resultado);
        }
        leitor.close();
    }
    public static double somaSerie(int n, int i) {
        if (i == n) {
            return 0;
        } 
        else {
            return (1.0 / potenciaDois(i)) + somaSerie(n, i + 1);
        }
    }
    public static long potenciaDois(int exp) {
        if (exp == 0) {
            return 1;
        }
        return 2 * potenciaDois(exp - 1);
    }
}