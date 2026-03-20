import java.util.Scanner;
public class Ex01 {
    public static int iTAM = 10;
    public static char[] cPilha = new char[iTAM];
    public static int iPos = 0;
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Inserir Elemento");
            System.out.println("2. Consultar Elemento");
            System.out.println("3. Retirar Elemento");
            System.out.println("4. Sair");
            System.out.print("Opção: ");
            opcao = leitor.nextInt();
            if (opcao == 1) {
                if (iPos < iTAM) {
                    System.out.print("Digite o caractere: ");
                    char c = leitor.next().charAt(0);
                    push(c);
                } else {
                    System.out.println("Pilha cheia!");
                }
            } 
            else if (opcao == 2) {
                if (iPos > 0) {
                    System.out.println("Topo: " + top());
                    System.out.println("Quantidade: " + size());
                } else {
                    System.out.println("Pilha vazia!");
                }
            } 
            else if (opcao == 3) {
                if (iPos > 0) {
                    System.out.println("Retirado: " + pop());
                } else {
                    System.out.println("Pilha vazia!");
                }
            }

        } while (opcao != 4);

        leitor.close();
    }

    public static void push(char c) {
        cPilha[iPos] = c;
        iPos++;
    }
    public static char pop() {
        iPos--;
        return cPilha[iPos];
    }
    public static char top() {
        return cPilha[iPos - 1];
    }
    public static int size() {
        return iPos;
    }
}