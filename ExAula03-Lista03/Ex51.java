public class Ex51 {
    public static int buscaBinRecCrescente(char[] v, char chave, int ini, int fim) {
        if (ini > fim) return -1;
        int meio = (ini + fim) / 2;
        if (v[meio] == chave) return meio;
        if (v[meio] < chave) return buscaBinRecCrescente(v, chave, meio + 1, fim);
        return buscaBinRecCrescente(v, chave, ini, meio - 1);
    }

    public static void main(String[] args) {
        char[] v = {'a', 'b', 'c', 'd', 'f', 'g', 'k'};
        System.out.println(buscaBinRecCrescente(v, 'd', 0, v.length - 1));
    }
}
