import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro (maior): ");
        int n1 = leitor.nextInt();
        System.out.println("Digite o segundo número inteiro (menor): ");
        int n2 = leitor.nextInt();
        if (n1 < n2){
            System.out.println("Digite somente números em que o primeiro é maior que o segundo");
        }
        else{
            System.out.println("O resultado é :" +subtracao(n1, n2));
        }
        leitor.close();
    }
    public static int subtracao(int n1, int n2){
        if (n1 == n2){
            return 0;
        }
        else{
            return 1 + subtracao(n1, n2 +1);
        }
    }
}
