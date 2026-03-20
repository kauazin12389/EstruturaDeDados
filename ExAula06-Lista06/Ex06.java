import java.util.Scanner;
class CalculadoraTAD {
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
    public int calcular(String op) {
        int n2 = pop();
        int n1 = pop();
        int res = 0;
        if (op.equals("+")) res = n1 + n2;
        else if (op.equals("-")) res = n1 - n2;
        else if (op.equals("*")) res = n1 * n2;
        else if (op.equals("/")) res = n1 / n2;
        push(res);
        return res;
    }
}

public class Ex06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        CalculadoraTAD calc = new CalculadoraTAD();
        System.out.println("Digite 5 numeros:");
        for (int i = 0; i < 5; i++) {
            calc.push(leitor.nextInt());
        }
        System.out.println("Operacoes (+, -, *, /) ou S para sair:");
        while (true) {
            String op = leitor.next();
            if (op.equalsIgnoreCase("S")) {
                break;
            }
            if (calc.size() >= 2) {
                int resultado = calc.calcular(op);
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Pilha insuficiente!");
            }
        }
        leitor.close();
    }
}