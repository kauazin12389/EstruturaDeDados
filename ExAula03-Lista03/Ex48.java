import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ra = new int[n];
        double[] nota = new double[n];
        int op;
        do {
            op = sc.nextInt();
            if (op == 1) {
                for(int i=0; i<n; i++) ra[i] = sc.nextInt();
            } else if (op == 2) {
                for(int i=0; i<n; i++) nota[i] = sc.nextDouble();
            } else if (op == 3) {
                int busca = sc.nextInt();
                int idx = buscaBinariaRA(ra, busca);
                if (idx != -1) System.out.println(nota[idx]);
            }
        } while (op != 4);
    }

    public static int buscaBinariaRA(int[] v, int chave) {
        int ini = 0, fim = v.length - 1;
        while (ini <= fim) {
            int meio = (ini + fim) / 2;
            if (v[meio] == chave) return meio;
            if (v[meio] < chave) ini = meio + 1;
            else fim = meio - 1;
        }
        return -1;
    }
}