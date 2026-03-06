public class Ex43 {
    public static void comparar(int[] v, int chave) {
        int contL = 0;
        for (int i = 0; i < v.length; i++) {
            contL++;
            if (v[i] == chave) break;
        }

        int contB = 0;
        int ini = 0, fim = v.length - 1;
        while (ini <= fim) {
            contB++;
            int meio = (ini + fim) / 2;
            if (v[meio] == chave) break;
            if (v[meio] < chave) ini = meio + 1;
            else fim = meio - 1;
        }
        System.out.println("Linear: " + contL + " | Binaria: " + contB);
    }
}
