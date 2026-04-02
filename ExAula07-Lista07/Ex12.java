import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] fila = new int[5];
        for (int i = 0; i < 5; i++) fila[i] = leitor.nextInt();
        for (int i = 0; i < 4; i++) {
            char op = leitor.next().charAt(0);
            if (op == '+') fila[1] = fila[0] + fila[1];
            else if (op == '-') fila[1] = fila[0] - fila[1];
            else if (op == '*') fila[1] = fila[0] * fila[1];
            else if (op == '/') fila[1] = fila[0] / fila[1];
            System.out.println(fila[1]);
            for (int j = 0; j < 4; j++) fila[j] = fila[j + 1];
        }
        leitor.close();
    }
}