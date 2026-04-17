import java.util.Scanner;
class No25 {
    String nome;
    long ra;
    No25 proximo;
}
public class Ex25 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        No25 inicio = null;
        No25 atual = null;
        No25 anteriorAoAtual = null;
        int op = 0;
        while (op != 5) {
            System.out.println("a-1, b-2, c-3, d-4, sair-5");
            op = leitor.nextInt();
            if (op == 1) {
                atual = inicio;
                anteriorAoAtual = null;
                System.out.println("Lista Inicializada");
            } else if (op == 2) {
                if (inicio == null) System.out.println("Lista Vazia");
                else if (atual == null) System.out.println("Lista Encerrada");
                else {
                    System.out.println("Nome: " + atual.nome + " RA: " + atual.ra);
                    if (atual.proximo == null) System.out.println("Último Nó da Lista");
                    anteriorAoAtual = atual;
                    atual = atual.proximo;
                }
            } else if (op == 3) {
                No25 novo = new No25();
                novo.nome = leitor.next();
                novo.ra = leitor.nextLong();
                
                if (inicio == null || anteriorAoAtual == null) {
                    novo.proximo = inicio;
                    inicio = novo;
                } else {
                    novo.proximo = anteriorAoAtual.proximo;
                    anteriorAoAtual.proximo = novo;
                }
                atual = inicio;
                anteriorAoAtual = null;
            } else if (op == 4) {
                if (inicio == null || anteriorAoAtual == null) {
                    System.out.println("Não há nó a ser Eliminado");
                } else {
                    if (anteriorAoAtual == inicio) inicio = inicio.proximo;
                    else {
                        No25 aux = inicio;
                        while (aux.proximo != anteriorAoAtual) aux = aux.proximo;
                        aux.proximo = anteriorAoAtual.proximo;
                    }
                    System.out.println("Nó Eliminado");
                }
                atual = inicio;
                anteriorAoAtual = null;
            }
        }
        leitor.close();
    }
}