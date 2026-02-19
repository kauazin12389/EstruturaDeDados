public class InicializaVetorManual {
    public static void main(String[] args) {
        final int TAMANHO = 100;
        int[] vetor = new int[TAMANHO];
//for
        for (int i = 0; i < 100; i++) {
            vetor[i] = 0;
        }
        System.out.println("Finalizado com for.");
//while
        int j = 0;
        while (j < 100) {
            vetor[j] = 0;
            j++;
        }
        System.out.println("Finalizado com while.");
//do while
        int k = 0;
        do {
            vetor[k] = 0;
            k++;
        } while (k < 100);
        System.out.println("Finalizado com do-while.");
    }
}