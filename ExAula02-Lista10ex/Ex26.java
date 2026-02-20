import java.util.Scanner;
public class Ex26 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int n1 = leitor.nextInt();
        System.out.println("Digite o segundo número inteiro");
        int n2 = leitor.nextInt();

        int resultado = calculoMdc (n1, n2);
        System.out.println("O MDC de " + n1 + " com " + n2 + " é: " + resultado);
        
        leitor.close();

    }
    public static int calculoMdc (int a, int b){
        if (b == 0){
            return a;
        }
        else{
            return calculoMdc(b, a % b);
        }
    }

}
