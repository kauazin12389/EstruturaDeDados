import java.util.Scanner;
class No29 {
    char caractere;
    No29 anterior;
    No29 proximo;
}
public class Ex29 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        No29 inicio = null;
        No29 fim = null;
        System.out.print("Frase: ");
        String frase = leitor.nextLine();
        for (int i = 0; i < frase.length(); i++) {
            No29 novo = new No29();
            novo.caractere = frase.charAt(i);
            novo.proximo = null;
            if (inicio == null) {
                novo.anterior = null;
                inicio = novo;
                fim = novo;
            } else {
                fim.proximo = novo;
                novo.anterior = fim;
                fim = novo;
            }
        }
        System.out.print("Remover: ");
        char remover = leitor.nextLine().charAt(0);
        No29 aux = inicio;
        while (aux != null) {
            if (aux.caractere == remover) {
                if (aux == inicio) {
                    inicio = inicio.proximo;
                    if (inicio != null) inicio.anterior = null;
                } else if (aux == fim) {
                    fim = fim.anterior;
                    if (fim != null) fim.proximo = null;
                } else {
                    aux.anterior.proximo = aux.proximo;
                    aux.proximo.anterior = aux.anterior;
                }
            }
            aux = aux.proximo;
        }
        System.out.print("L -> R: ");
        No29 t1 = inicio;
        while (t1 != null) {
            System.out.print(t1.caractere);
            t1 = t1.proximo;
        }
        System.out.print("\nR -> L: ");
        No29 t2 = fim;
        while (t2 != null) {
            System.out.print(t2.caractere);
            t2 = t2.anterior;
        }
        System.out.println();
        leitor.close();
    }
}