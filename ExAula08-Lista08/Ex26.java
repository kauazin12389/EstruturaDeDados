import java.util.Scanner;
class No26 {
    char caractere;
    No26 proximo;
}
public class Ex26 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        No26 inicio = null;  
        System.out.print("Passo 1: Digite uma frase completa: ");
        String frase = leitor.nextLine();       
        for (int i = 0; i < frase.length(); i++) {
            No26 novo = new No26();
            novo.caractere = frase.charAt(i);
            novo.proximo = null;
            if (inicio == null) inicio = novo;
            else {
                No26 aux = inicio;
                while (aux.proximo != null) aux = aux.proximo;
                aux.proximo = novo;
            }
        }
        if (inicio != null) {
            System.out.print("Passo 2: Digite o caractere que deseja remover da frase: ");
            char remover = leitor.nextLine().charAt(0);
            while (inicio != null && inicio.caractere == remover) {
                inicio = inicio.proximo;
            }
            No26 aux = inicio;
            while (aux != null && aux.proximo != null) {
                if (aux.proximo.caractere == remover) {
                    aux.proximo = aux.proximo.proximo;
                } else {
                    aux = aux.proximo;
                }
            }
            System.out.print("Resultado final: ");
            No26 temp = inicio;
            while (temp != null) {
                System.out.print(temp.caractere);
                temp = temp.proximo;
            }
            System.out.println();
        } else {
            System.out.println("Nenhuma frase foi digitada.");
        }
        leitor.close();
    }
}