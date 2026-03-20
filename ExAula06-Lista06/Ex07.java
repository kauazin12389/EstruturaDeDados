import java.util.Scanner;
class PilhaNomesTAD {
    public int iTAM = 10;
    public String[] sPilha = new String[iTAM];
    public int iPos = 0;
    public void push(String nome) {
        sPilha[iPos] = nome;
        iPos++;
    }
    public String pop() {
        iPos--;
        return sPilha[iPos];
    }
    public String top() {
        return sPilha[iPos - 1];
    }
    public int size() {
        return iPos;
    }
}

public class Ex07 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        PilhaNomesTAD p = new PilhaNomesTAD();
        int opcao = 0;
        do {
            System.out.println("\n--- MENU NOMES ---");
            System.out.println("1. Inserir Nome");
            System.out.println("2. Consultar Nome");
            System.out.println("3. Retirar Nome");
            System.out.println("4. Sair");
            System.out.print("Escolha: ");
            opcao = leitor.nextInt();
            leitor.nextLine(); 
            if (opcao == 1) {
                if (p.iPos < p.iTAM) {
                    System.out.print("Digite o nome: ");
                    String nome = leitor.nextLine();
                    p.push(nome);
                } else {
                    System.out.println("Pilha cheia!");
                }
            } 
            else if (opcao == 2) {
                if (p.size() > 0) {
                    System.out.println("Ultimo nome: " + p.top());
                    System.out.println("Quantidade: " + p.size());
                } else {
                    System.out.println("Pilha vazia!");
                }
            } 
            else if (opcao == 3) {
                if (p.size() > 0) {
                    System.out.println("Nome retirado: " + p.pop());
                } else {
                    System.out.println("Pilha vazia!");
                }
            }
        } while (opcao != 4);

        leitor.close();
    }
}