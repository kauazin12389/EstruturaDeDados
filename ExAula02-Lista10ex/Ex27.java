import java.util.Scanner;
public class Ex27 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = leitor.nextInt();
        System.out.println("Digite o expoente");
        int expoente = leitor.nextInt();

        int resultado = elevacao (n, expoente);
        if (n < 0 || expoente < 0){
            System.out.println("Digite somente números positivos");
        }
        else{
            System.out.println("O valor de " + n + " elevado a " + expoente + " é: " + resultado);
        }
        
        leitor.close();

    }
    public static int elevacao (int n, int expoente){
        if ( expoente== 0){
            return 1;
        }
        else{
            return n * elevacao(n, expoente -1);
        }
    }

}
