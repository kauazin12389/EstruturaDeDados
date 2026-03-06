public class Ex58 {
    public static int buscaRARecursiva(int[] ra, int chave, int ini, int fim) {
        if (ini > fim) return -1;
        int meio = (ini + fim) / 2;
        if (ra[meio] == chave) return meio;
        if (ra[meio] < chave) return buscaRARecursiva(ra, chave, meio + 1, fim);
        return buscaRARecursiva(ra, chave, ini, meio - 1);
    }
}