public class Ex42 {
    public static int binariaIterativa(char[] v, char chave) {
        int ini = 0, fim = v.length - 1;
        while (ini <= fim) {
            int meio = (ini + fim) / 2;
            if (v[meio] == chave) return meio;
            if (v[meio] < chave) ini = meio + 1;
            else fim = meio - 1;
        }
        return v.length;
    }
}