public class Ex55 {
    public static int localizarRec(char[] v, char chave, int ini, int fim) {
        if (ini > fim) return 15;
        int meio = (ini + fim) / 2;
        if (v[meio] == chave) return meio;
        if (v[meio] < chave) return localizarRec(v, chave, meio + 1, fim);
        return localizarRec(v, chave, ini, meio - 1);
    }
}
