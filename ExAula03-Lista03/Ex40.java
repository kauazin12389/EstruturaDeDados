public class Ex40 {
    public static int buscaRecInversa(char[] v, char chave, int i) {
        if (i < 0) return -1;
        if (v[i] == chave) return i;
        return buscaRecInversa(v, chave, i - 1);
    }
    
    public static void main(String[] args) {
        char[] v = {'c', 'd', 'a', 'b', 'k', 'a', 'f', 'g', 'a', 'w'};
        System.out.println(buscaRecInversa(v, 'a', 9));
    }
}