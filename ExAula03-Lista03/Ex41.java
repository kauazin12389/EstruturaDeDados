public class Ex41 {
    public static int buscaMaiorIndiceRec(double[] v, double chave, int i, int melhor) {
        if (i == v.length) return melhor;
        if (v[i] == chave) melhor = i;
        return buscaMaiorIndiceRec(v, chave, i + 1, melhor);
    }
    
    public static void main(String[] args) {
        double[] v = {7, 3, 4, 5, 8, 4, 7, 4, 9, 8};
        System.out.println(buscaMaiorIndiceRec(v, 4.0, 0, -1));
    }
}