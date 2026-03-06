public class Ex53 {
    public static int tentativas = 0;

    public static int binRecContador(int[] v, int chave, int ini, int fim) {
        tentativas++;
        if (ini > fim) return -1;
        int meio = (ini + fim) / 2;
        if (v[meio] == chave) return meio;
        if (v[meio] < chave) return binRecContador(v, chave, meio + 1, fim);
        return binRecContador(v, chave, ini, meio - 1);
    }
}