import java.util.Scanner;

class PilhaCalculadora {
    public int iTAM = 10;
    public int[] iPilha = new int[iTAM];
    public int iPos = 0;
    public void push(int valor) {
        iPilha[iPos] = valor;
        iPos++;
    }
    public int pop() {
        iPos--;
        return iPilha[iPos];
    }
    public int size() {
        return iPos;
    }
}

public class Ex05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        PilhaCalculadora p = new PilhaCalculadora();
        System.out.println("Digite 5 numeros inteiros:");
        for (int i = 0; i < 5; i++) {
            int num = leitor.nextInt();
            p.push(num);
        }
        System.out.println("Digite a operacao (+, -, *, /) ou S para sair:");
        while (true) {
            String op = leitor.next();
            if (op.equalsIgnoreCase("S")) {
                break;
            }
            if (p.size() >= 2) {
                int n2 = p.pop();
                int n1 = p.pop();
                int res = 0;
                if (op.equals("+")) {
                    res = n1 + n2;
                } else if (op.equals("-")) {
                    res = n1 - n2;
                } else if (op.equals("*")) {
                    res = n1 * n2;
                } else if (op.equals("/")) {
                    res = n1 / n2;
                }
                System.out.println("Resultado: " + res);
                p.push(res);
            } else {
                System.out.println("Pilha insuficiente!");
            }
        }
        leitor.close();
    }
}
