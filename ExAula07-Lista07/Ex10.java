import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        char[] fila = new char[10];
        int total = 0, op = 0;
        while (op != 4) {
            op = leitor.nextInt();
            if (op == 1 && total < 10) {
                fila[9 - total++] = leitor.next().charAt(0);
            } else if (op == 3 && total > 0) {
                System.out.println(fila[9]);
                for (int i = 9; i > 10 - total; i--) fila[i] = fila[i - 1];
                total--;
            }
        }
        leitor.close();
    }
}