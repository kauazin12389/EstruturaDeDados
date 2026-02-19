public class Ex2 {
    public static void main(String[] args) {
        int[] vetor = new int[100];

//for
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                vetor[i] = 0; 
            } else {
                vetor[i] = i; 
            }
        }

//while
        int j = 0;
        while (j < 100) {
            if (j % 2 == 0) {
                vetor[j] = 0;
            } else {
                vetor[j] = j;
            }
            j++;
        }

//do while
        int k = 0;
        do {
            if (k % 2 == 0) {
                vetor[k] = 0;
            } else {
                vetor[k] = k;
            }
            k++;
        } while (k < 100);

        System.out.print("Resultado (primeiros 10): ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}