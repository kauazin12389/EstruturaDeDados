import java.util.Scanner;
class No28 {
    String nome;
    long ra;
    No28 anterior;
    No28 proximo;
}
public class Ex28 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        No28 inicio = null;
        No28 atual = null;
        int op = 0;
        while (op != 6) {
            System.out.println("\n1-Inicializar\n2-Exibir Proximo\n3-Exibir Anterior\n4-Inserir Corrente\n5-Eliminar Apresentado\n6-Sair");
            op = leitor.nextInt();
            if (op == 1) {
                atual = inicio;
                System.out.println("Lista Inicializada");
            } else if (op == 2) {
                if (inicio == null) System.out.println("Lista Vazia");
                else if (atual == null) System.out.println("Lista Encerrada");
                else {
                    System.out.println("Nome: " + atual.nome + " RA: " + atual.ra);
                    if (atual.proximo == null) System.out.println("Ultimo No da Lista");
                    atual = atual.proximo;
                }
            } else if (op == 3) {
                if (inicio == null) System.out.println("Lista Vazia");
                else {
                    No28 temp = (atual == null) ? inicio : atual;
                    if (temp.anterior == null) System.out.println("Lista Encerrada");
                    else {
                        atual = temp.anterior;
                        System.out.println("Nome: " + atual.nome + " RA: " + atual.ra);
                    }
                }
            } else if (op == 4) {
                No28 novo = new No28();
                System.out.print("Nome: "); novo.nome = leitor.next();
                System.out.print("RA: "); novo.ra = leitor.nextLong();       
                if (inicio == null || atual == inicio || atual == null) {
                    novo.proximo = inicio;
                    if (inicio != null) inicio.anterior = novo;
                    inicio = novo;
                    novo.anterior = null;
                } else {
                    No28 anterior = atual.anterior;
                    novo.proximo = atual;
                    novo.anterior = anterior;
                    anterior.proximo = novo;
                    atual.anterior = novo;
                }
                atual = inicio;
            } else if (op == 5) {
                if (inicio == null || atual == null || atual == inicio) {
                    System.out.println("Nao ha no a ser Eliminado");
                } else {
                    No28 alvo = atual.anterior;
                    if (alvo == inicio) {
                        inicio = inicio.proximo;
                        if (inicio != null) inicio.anterior = null;
                    } else {
                        alvo.anterior.proximo = alvo.proximo;
                        alvo.proximo.anterior = alvo.anterior;
                    }
                    System.out.println("No Eliminado");
                    atual = inicio;
                }
            }
        }
        leitor.close();
    }
}