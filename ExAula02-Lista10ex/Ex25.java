import java.util.Scanner;

public class Ex25 {
    
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    float[] vetor = new float[10];
    
    System.out.println("Digite os 10 elementos do vetor:");
    preencher(vetor, 0, leitor);
    
    System.out.print("Digite o número a ser buscado: ");
        float buscar = leitor.nextFloat();

        int indiceEncontrado = buscarIndice(vetor, buscar, 0);

        if (indiceEncontrado == -1) {
            System.out.println("O número " + buscar + " não foi encontrado no vetor.");
        } else {
            System.out.println("O número " + buscar + " está localizado no índice " + indiceEncontrado + " do vetor.");
        }
        
        leitor.close();
    }

    public static void preencher(float[] v, int i, Scanner sc) {
        if (i < 10) {
            v[i] = sc.nextFloat();
            preencher(v, i + 1, sc);
        }
    }

    public static int buscarIndice(float[] v, float alvo, int i) {
        if (i >= 10) {
            return -1;
        }
        if (v[i] == alvo) {
            return i;
        }
        return buscarIndice(v, alvo, i + 1);
    }
}