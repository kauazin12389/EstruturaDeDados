import java.util.Scanner;
public class Ex28 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int n1 = leitor.nextInt();
        System.out.println("Digite o segundo número inteiro");
        int n2 = leitor.nextInt();
        if (n1 < 0 || n2 < 0){
            System.out.println("Digite somente números positivos");
        }
        else{
            System.out.println("O resultado é :" +multiplicacao(n1, n2));
        }
        leitor.close();
    
    }
    public static int multiplicacao(int n1, int n2){
        if(n1 == 0){
            return 0;
        }
        else{
            return n2 + multiplicacao(n1 - 1, n2);
        }
    }
}
