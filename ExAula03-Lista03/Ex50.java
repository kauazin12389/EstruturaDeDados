public class Ex50 {
    public static int binariaDecrescente(char[] v, char chave, int ini, int fim) {
        if (ini > fim) return -1;
        int meio = (ini + fim) / 2;
        if (v[meio] == chave) return meio;
        if (v[meio] < chave) return binariaDecrescente(v, chave, ini, meio - 1);
        return binariaDecrescente(v, chave, meio + 1, fim);
    }
}
