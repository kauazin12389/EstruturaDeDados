import java.util.Scanner;
class No27 {
    int item;
    No27 anterior;
    No27 proximo;
}
public class Ex27 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        No27 inicio = null;
        No27 atual = null;
        int op = 0;
        while (op != 6) {
            System.out.println("\n1-Inserir Final\n2-Remover Ultimo\n3-Mostrar Atual\n4-Mostrar Proximo\n5-Mostrar Anterior\n6-Sair");
            System.out.print("Escolha: ");
            op = leitor.nextInt();
            if (op == 1) {
                No27 novo = new No27();
                System.out.print("Item: ");
                novo.item = leitor.nextInt();
                novo.proximo = null;
                if (inicio == null) {
                    novo.anterior = null;
                    inicio = novo;
                } else {
                    No27 aux = inicio;
                    while (aux.proximo != null) aux = aux.proximo;
                    aux.proximo = novo;
                    novo.anterior = aux;
                }
                atual = inicio;
            } else if (op == 2) {
                if (inicio != null) {
                    if (inicio.proximo == null) inicio = null;
                    else {
                        No27 aux = inicio;
                        while (aux.proximo != null) aux = aux.proximo;
                        aux.anterior.proximo = null;
                    }
                    atual = inicio;
                }
            } else if (op == 3) {
                if (atual != null) System.out.println("Atual: " + atual.item);
                else System.out.println("Lista Vazia");
            } else if (op == 4) {
                if (atual == null || atual.proximo == null) System.out.println("Lista Encerrada");
                else {
                    atual = atual.proximo;
                    System.out.println("Conteudo: " + atual.item);
                }
            } else if (op == 5) {
                if (atual == null || atual.anterior == null) System.out.println("Lista Encerrada");
                else {
                    atual = atual.anterior;
                    System.out.println("Conteudo: " + atual.item);
                }
            }
        }
        leitor.close();
    }
}