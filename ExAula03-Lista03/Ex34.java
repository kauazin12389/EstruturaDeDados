import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] dados = new char[15];
        String entrada = sc.next();
        int tamEfetivo = entrada.length();

        for (int i = 0; i < tamEfetivo; i++) {
            dados[i] = entrada.charAt(i);
        }

        char busca = sc.next().charAt(0);
        int resultado = realizarBusca(dados, busca, tamEfetivo);
        System.out.println(resultado);
    }

    public static int realizarBusca(char[] v, char chave, int limite) {
        for (int i = 0; i < limite; i++) {
            if (v[i] == chave) {
                return i;
            }
        }
        return limite;
    }
}