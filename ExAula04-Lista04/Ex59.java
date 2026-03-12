import java.util.Scanner;

public class Ex59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] vetor = new char[5];

        for (int i = 0; i < 5; i++) {
            vetor[i] = sc.next().charAt(0);
        }

        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    char temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        for (char c : vetor) {
            System.out.print(c + " ");
        }
    }
}