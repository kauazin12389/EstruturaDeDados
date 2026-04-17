import java.util.Scanner;
class No23 {
    int elemento;
    No23 proximo;
}
public class Ex23 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        No23 inicio = null;
        int op = 0;
        while (op != 4) {
            System.out.println("\n1-Inserir\n2-Consultar Todos\n3-Remover Ultimo\n4-Sair");
            op = leitor.nextInt();
            if (op == 1) {
                No23 novo = new No23();
                novo.elemento = leitor.nextInt();
                novo.proximo = null;
                if (inicio == null) inicio = novo;
                else {
                    No23 aux = inicio;
                    while (aux.proximo != null) aux = aux.proximo;
                    aux.proximo = novo;
                }
            } else if (op == 2) {
                No23 aux = inicio;
                while (aux != null) {
                    System.out.print(aux.elemento + " ");
                    aux = aux.proximo;
                }
                System.out.println();
            } else if (op == 3) {
                if (inicio != null) {
                    if (inicio.proximo == null) inicio = null;
                    else {
                        No23 aux = inicio;
                        while (aux.proximo.proximo != null) aux = aux.proximo;
                        aux.proximo = null;
                    }
                }
            }
        }
        leitor.close();
    }
}