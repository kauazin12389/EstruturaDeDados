public class Ex57 {
    public static int buscaMatrizRec(int[][] m, int id, int ini, int fim) {
        if (ini > fim) return -1;
        int meio = (ini + fim) / 2;
        if (m[meio][0] == id) return meio;
        if (m[meio][0] < id) return buscaMatrizRec(m, id, meio + 1, fim);
        return buscaMatrizRec(m, id, ini, meio - 1);
    }
}
