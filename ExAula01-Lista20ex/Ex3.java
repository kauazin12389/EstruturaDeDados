public class Ex3 {
    public static void main(String[] args) {
        char[] alfabeto = new char[26];

        // FOR
        char letraFor = 'A';
        for (int i = 0; i < 26; i++) {
            alfabeto[i] = letraFor;
            letraFor++;
        }

        // WHILE
        int j = 0;
        char letraWhile = 'A';
        while (j < 26) {
            alfabeto[j] = letraWhile;
            letraWhile++;
            j++;
        }

        // DO-WHILE
        int k = 0;
        char letraDo = 'A';
        do {
            alfabeto[k] = letraDo;
            letraDo++;
            k++;
        } while (k < 26);

        for (int i = 0; i < 26; i++) {
            System.out.print(alfabeto[i] + " ");
        }
    }
}