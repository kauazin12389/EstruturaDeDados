public class Ex54 {
    public static int buscaRec(int[] v, int chave, int ini, int fim) {
        if (ini > fim) return v.length;
        int meio = (ini + fim) / 2;
        if (v[meio] == chave) return meio;
        if (v[meio] < chave) return buscaRec(v, chave, meio + 1, fim);
        return buscaRec(v, chave, ini, meio - 1);
    }
}
