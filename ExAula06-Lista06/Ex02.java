import java.util.Scanner;
class PilhaTAD {
    public int iTAM = 10;
    public char[] cPilha = new char[iTAM];
    public int iPos = 0;
    public void push(char c) {
        cPilha[iPos] = c;
        iPos++;
    }
    public char pop() {
        iPos--;
        return cPilha[iPos];
    }
    public char top() {
        return cPilha[iPos - 1];
    }
    public int size() {
        return iPos;
    }
}

public class Ex02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        PilhaTAD  minhaPilha = new PilhaTAD (); // Criando o objeto da pilha
        int opcao = 0;
        do {
            System.out.println("\n--- MENU TAD ---");
            System.out.println("1. Inserir");
            System.out.println("2. Consultar");
            System.out.println("3. Retirar");
            System.out.println("4. Sair");
            System.out.print("Escolha: ");
            opcao = leitor.nextInt();

            if (opcao == 1) {
                if (minhaPilha.iPos < minhaPilha.iTAM) {
                    System.out.print("Digite o caractere: ");
                    char c = leitor.next().charAt(0);
                    minhaPilha.push(c);
                } else {
                    System.out.println("Pilha cheia!");
                }
            } 
            else if (opcao == 2) {
                if (minhaPilha.size() > 0) {
                    System.out.println("Topo: " + minhaPilha.top());
                    System.out.println("Quantidade: " + minhaPilha.size());
                } else {
                    System.out.println("Pilha vazia!");
                }
            } 
            else if (opcao == 3) {
                if (minhaPilha.size() > 0) {
                    System.out.println("Retirado: " + minhaPilha.pop());
                } else {
                    System.out.println("Pilha vazia!");
                }
            }
        } while (opcao != 4);

        leitor.close();
    }
}