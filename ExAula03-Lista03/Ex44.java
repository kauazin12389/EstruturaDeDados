import java.util.Scanner;
import java.util.Arrays;

public class Ex44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dados = new int[15];

        for (int i = 0; i < 15; i++) {
            dados[i] = sc.nextInt();
        }
        
        Arrays.sort(dados);

        int busca = sc.nextInt();
        int resultado = buscaBinaria(dados, busca);
        System.out.println(resultado);
    }

    public static int buscaBinaria(int[] v, int chave) {
        int ini = 0;
        int fim = v.length - 1;

        while (ini <= fim) {
            int meio = (ini + fim) / 2;
            if (v[meio] == chave) {
                return meio;
            } else if (v[meio] < chave) {
                ini = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return v.length;
    }
}
