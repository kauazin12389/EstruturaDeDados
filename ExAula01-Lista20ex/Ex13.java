import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double somaComprimento = 0;
        double somaDiametro = 0;
        
        double maiorComprimento = -1;
        int numMaisLongo = 0;
        
        double menorDiametro = Double.MAX_VALUE;
        int numMaisFino = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Amostra " + i + " - Comprimento: ");
            double c = leitor.nextDouble();
            System.out.print("Amostra " + i + " - Diametro: ");
            double d = leitor.nextDouble();

            somaComprimento += c;
            somaDiametro += d;

            if (c > maiorComprimento) {
                maiorComprimento = c;
                numMaisLongo = i;
            }

            if (d < menorDiametro) {
                menorDiametro = d;
                numMaisFino = i;
            }
        }

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Comprimento Medio: " + (somaComprimento / 10));
        System.out.println("Diametro Medio: " + (somaDiametro / 10));
        System.out.println("Amostra mais longa: Numero " + numMaisLongo + " com " + maiorComprimento + "mm");
        System.out.println("Amostra mais fina: Numero " + numMaisFino + " com " + menorDiametro + "mm");

        leitor.close();
    }
}