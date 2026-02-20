import java.util.Scanner;
public class Ex21 {
    public static int calcularFatorial(int n){
        if (n == 1)
            return 1;
        else 
            return n * calcularFatorial(n - 1);
    }
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");
        int numero = leitor.nextInt();

        if (numero < 0){
            System.out.println("Não existe fatorial de número negativo");
        }
        else if (numero == 0){
            System.out.println("Oif (<=1) fatorial de zero é 1");
        }
        else{
            int resultado = calcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " é " + resultado);
        }

    }
}