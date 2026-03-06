import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] dados = new char[15];
        String entrada = sc.next();

        for (int i = 0; i < 15; i++) {
            dados[i] = entrada.charAt(i);
        }

        char busca = sc.next().charAt(0);
        int resultado = localizar(dados, busca);
        System.out.println(resultado);
    }

    public static int localizar(char[] v, char chave) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == chave) {
                return i;
            }
        }
        return v.length;
    }
}