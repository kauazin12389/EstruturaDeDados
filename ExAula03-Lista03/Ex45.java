import java.util.Scanner;
import java.util.Arrays;

public class Ex45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] dados = new char[15];
        String entrada = sc.next();

        for (int i = 0; i < 15; i++) {
            dados[i] = entrada.charAt(i);
        }
        
        Arrays.sort(dados);

        char busca = sc.next().charAt(0);
        int resultado = binariaChar(dados, busca);
        System.out.println(resultado);
    }

    public static int binariaChar(char[] v, char chave) {
        int ini = 0;
        int fim = v.length - 1;

        while (ini <= fim) {
            int meio = (ini + fim) / 2;
            if (v[meio] == chave) return meio;
            if (v[meio] < chave) ini = meio + 1;
            else fim = meio - 1;
        }
        return v.length;
    }
}
