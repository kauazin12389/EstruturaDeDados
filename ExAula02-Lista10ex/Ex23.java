import java.util.Scanner;
public class Ex23 {
    public static int soma (int[] v, int indice){
        if (indice == 0) 
            return v[0];
        else 
            return v[indice] + soma(v, indice - 1);
    }
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[10];
        System.out.println("Digite 10 numeros: ");

        for (int i = 0; i < 10; i++) {
            System.out.print("Posição [" + i + "]: ");
            vetor[i] = leitor.nextInt();
        }
        
        int resultado = soma(vetor, 9);
        System.out.println("\nA soma de todos os elementos é: " + resultado);
        leitor.close();
    }
}
