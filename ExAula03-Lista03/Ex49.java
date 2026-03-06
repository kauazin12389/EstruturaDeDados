public class Ex49 {
    public static int binariaRecursiva(int[] v, int chave, int ini, int fim) {
        if (ini > fim) return -1;
        int meio = (ini + fim) / 2;
        if (v[meio] == chave) {
            int esq = binariaRecursiva(v, chave, ini, meio - 1);
            return (esq != -1) ? esq : meio;
        }
        if (v[meio] < chave) return binariaRecursiva(v, chave, meio + 1, fim);
        return binariaRecursiva(v, chave, ini, meio - 1);
    }
}