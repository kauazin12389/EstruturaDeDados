import java.util.Scanner;
class No22 {
    int elemento;
    No22 proximo;
}
public class Ex22 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        No22 inicio = null;
        int op = 0;
        while (op != 3) {
            System.out.println("\n1-Inserir Final\n2-Remover Ultimo\n3-Sair");
            op = leitor.nextInt();
            if (op == 1) {
                No22 novo = new No22();
                System.out.print("Elemento: ");
                novo.elemento = leitor.nextInt();
                novo.proximo = null;
                if (inicio == null) {
                    inicio = novo;
                } else {
                    No22 aux = inicio;
                    while (aux.proximo != null) aux = aux.proximo;
                    aux.proximo = novo;
                }
            } else if (op == 2) {
                if (inicio == null) {
                    System.out.println("Lista Vazia");
                } else if (inicio.proximo == null) {
                    inicio = null;
                } else {
                    No22 aux = inicio;
                    while (aux.proximo.proximo != null) aux = aux.proximo;
                    aux.proximo = null;
                }
            }
        }
        leitor.close();
    }
}