import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dados = new int[15];

        for (int i = 0; i < 15; i++) {
            dados[i] = sc.nextInt();
        }

        int busca = sc.nextInt();
        int resultado = buscaLinear(dados, busca);
        System.out.println(resultado);
    }

    public static int buscaLinear(int[] v, int chave) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == chave) {
                return i;
            }
        }
        return v.length;
    }
}