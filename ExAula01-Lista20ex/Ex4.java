public class Ex4 {
    public static void main(String[] args) {
        char[] alfabeto = new char[26];
        char letra = 'A';
        for (int i = 0; i < 26; i++) {
            alfabeto[i] = letra;
            letra++;
        }

        for (int i = 0; i < 26; i += 2) {
            char temp = alfabeto[i];
            alfabeto[i] = alfabeto[i + 1];
            alfabeto[i + 1] = temp;
        }

        int j = 0;
        while (j < 26) {
            char temp = alfabeto[j];
            alfabeto[j] = alfabeto[j + 1];
            alfabeto[j + 1] = temp;
            j += 2;
        }

        int k = 0;
        do {
            char temp = alfabeto[k];
            alfabeto[k] = alfabeto[k + 1];
            alfabeto[k + 1] = temp;
            k += 2;
        } while (k < 26);

        for (int i = 0; i < 26; i++) {
            System.out.print(alfabeto[i] + " ");
        }
    }
}