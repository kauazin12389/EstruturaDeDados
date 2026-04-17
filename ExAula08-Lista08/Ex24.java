import java.util.Scanner;
class No24 {
    String elemento;
    No24 proximo;
}
public class Ex24 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        No24 inicio = null;
        int op = 0;
        while (op != 4) {
            System.out.println("1 - Inserir Nome");
            System.out.println("2 - Consultar Todos");
            System.out.println("3 - Remover Ultimo");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opcao: ");     
            if (leitor.hasNextInt()) {
                op = leitor.nextInt();
                leitor.nextLine(); 
                if (op == 1) {
                    No24 novo = new No24();
                    System.out.print("Digite o nome para inserir: ");
                    novo.elemento = leitor.nextLine();
                    novo.proximo = null;
                    if (inicio == null) inicio = novo;
                    else {
                        No24 aux = inicio;
                        while (aux.proximo != null) aux = aux.proximo;
                        aux.proximo = novo;
                    }
                } else if (op == 2) {
                    System.out.println("Elementos na lista:");
                    No24 aux = inicio;
                    while (aux != null) {
                        System.out.println("- " + aux.elemento);
                        aux = aux.proximo;
                    }
                } else if (op == 3) {
                    if (inicio != null) {
                        if (inicio.proximo == null) inicio = null;
                        else {
                            No24 aux = inicio;
                            while (aux.proximo.proximo != null) aux = aux.proximo;
                            aux.proximo = null;
                        }
                        System.out.println("Ultimo elemento removido.");
                    } else {
                        System.out.println("Lista vazia!");
                    }
                }
            } else {
                leitor.nextLine();
            }
        }
        leitor.close();
    }
}