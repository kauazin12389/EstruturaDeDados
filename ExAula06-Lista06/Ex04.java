import java.util.Scanner;

class PilhaTADInvertida {
    public int iTAM = 10;
    public char[] cPilha = new char[iTAM];
    public int iPos = 10; 
    public void push(char c) {
        iPos--;
        cPilha[iPos] = c;
    }
    public char pop() {
        char aux = cPilha[iPos];
        iPos++;
        return aux;
    }
    public char top() {
        return cPilha[iPos];
    }
    public int size() {
        return 10 - iPos;
    }
}

public class Ex04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        PilhaTADInvertida minhaPilha = new PilhaTADInvertida();
        int opcao = 0;
        do {
            System.out.println("\n--- MENU TAD INVERTIDO ---");
            System.out.println("1. Inserir Elemento");
            System.out.println("2. Consultar Elemento");
            System.out.println("3. Retirar Elemento");
            System.out.println("4. Sair");
            System.out.print("Escolha: ");
            opcao = leitor.nextInt();
            if (opcao == 1) {
                if (minhaPilha.iPos > 0) {
                    System.out.print("Digite o caractere: ");
                    char c = leitor.next().charAt(0);
                    minhaPilha.push(c);
                } else {
                    System.out.println("Pilha cheia!");
                }
            } 
            else if (opcao == 2) {
                if (minhaPilha.size() > 0) {
                    System.out.println("Topo atual: " + minhaPilha.top());
                    System.out.println("Quantidade total: " + minhaPilha.size());
                } else {
                    System.out.println("Pilha vazia!");
                }
            } 
            else if (opcao == 3) {
                if (minhaPilha.size() > 0) {
                    System.out.println("Removido: " + minhaPilha.pop());
                } else {
                    System.out.println("Pilha vazia!");
                }
            }
        } while (opcao != 4);
        leitor.close();
    }
}
