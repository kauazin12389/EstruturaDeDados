public class Ex39 {
    public static int buscaRecImpar(int[] v, int chave, int i) {
        if (i >= v.length) return -1;
        if (v[i] == chave) return i;
        return buscaRecImpar(v, chave, i + 2);
    }
    
    public static void main(String[] args) {
        int[] v = {7, 3, 4, 5, 8, 4, 7, 8, 9, 4};
        System.out.println(buscaRecImpar(v, 4, 1));
    }
}