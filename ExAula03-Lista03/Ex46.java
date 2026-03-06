import java.util.Scanner;
import java.util.Arrays;

public class Ex46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] dados = new char[15];
        String entrada = sc.next();
        int tam = entrada.length();

        for (int i = 0; i < tam; i++) {
            dados[i] = entrada.charAt(i);
        }

        Arrays.sort(dados, 0, tam);

        char busca = sc.next().charAt(0);
        int resultado = binariaLimitada(dados, busca, tam);
        System.out.println(resultado);
    }

    public static int binariaLimitada(char[] v, char chave, int n) {
        int ini = 0;
        int fim = n - 1;

        while (ini <= fim) {
            int meio = (ini + fim) / 2;
            if (v[meio] == chave) return meio;
            if (v[meio] < chave) ini = meio + 1;
            else fim = meio - 1;
        }
        return n;
    }
}
