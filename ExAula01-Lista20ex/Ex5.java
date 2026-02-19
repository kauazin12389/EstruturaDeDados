import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[16];
        int total = 0;

        for (int i = 0; i < 16; i++) {
            vetor[i] = leitor.nextInt();
        }

        for (int i = 0; i <= 12; i++) {
            if (vetor[i] == vetor[i + 3] && vetor[i + 1] == vetor[i + 2]) {
                total++;
            }
        }

        int j = 0;
        while (j <= 12) {
            j++;
        }

        int k = 0;
        do {
            k++;
        } while (k <= 12);

        System.out.println("Total de Capicuas: " + total);
        
        leitor.close();
    }
}