import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] comprimentos = new double[10];
        double[] diametros = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Amostra " + (i + 1) + " - Comprimento (mm): ");
            comprimentos[i] = leitor.nextDouble();
            System.out.print("Amostra " + (i + 1) + " - Diametro (mm): ");
            diametros[i] = leitor.nextDouble();
        }

        apresentarResultados(comprimentos, diametros);
        
        leitor.close();
    }

    public static double calcularMedia(double[] valores) {
        double soma = 0;
        for (double v : valores) soma += v;
        return soma / valores.length;
    }

    public static int encontrarMaisLongo(double[] comprimentos) {
        int indiceMaior = 0;
        for (int i = 1; i < comprimentos.length; i++) {
            if (comprimentos[i] > comprimentos[indiceMaior]) {
                indiceMaior = i;
            }
        }
        return indiceMaior;
    }

    public static int encontrarMaisFino(double[] diametros) {
        int indiceMenor = 0;
        for (int i = 1; i < diametros.length; i++) {
            if (diametros[i] < diametros[indiceMenor]) {
                indiceMenor = i;
            }
        }
        return indiceMenor;
    }

    public static void apresentarResultados(double[] c, double[] d) {
        int longo = encontrarMaisLongo(c);
        int fino = encontrarMaisFino(d);

        System.out.println("\n--- ANALISE DE QUALIDADE ---");
        System.out.printf("Comprimento Medio: %.2f mm\n", calcularMedia(c));
        System.out.printf("Diametro Medio: %.2f mm\n", calcularMedia(d));
        System.out.println("Mais longo: Amostra " + (longo + 1) + " (" + c[longo] + " mm)");
        System.out.println("Mais fino: Amostra " + (fino + 1) + " (" + d[fino] + " mm)");
    }
}