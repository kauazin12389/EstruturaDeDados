import java.util.Scanner;
public class Ex22 {
    public static int fibonacci (int n){
        if (n<=2)
            return 1;
        else
            return fibonacci(n -1) + fibonacci (n-2);
    }
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo");
        int n = leitor.nextInt();
        if (n<1){
            System.out.println("Digite um número maior que zero");
        }
        else if (n == 1 || n ==2){
            System.out.println("O resultado é 1");
        }
        else{
            System.out.println("O " +n+ "° elmento é :" +fibonacci(n));
        }
         leitor.close();
    }
}
