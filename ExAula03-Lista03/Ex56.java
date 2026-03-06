public class Ex56 {
    public static int buscaCharRec(char[] v, char chave, int ini, int fim, int tamMax) {
        if (ini > fim) return tamMax;
        int meio = (ini + fim) / 2;
        if (v[meio] == chave) return meio;
        if (v[meio] < chave) return buscaCharRec(v, chave, meio + 1, fim, tamMax);
        return buscaCharRec(v, chave, ini, meio - 1, tamMax);
    }
}