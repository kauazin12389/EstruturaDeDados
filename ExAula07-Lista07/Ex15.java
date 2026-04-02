import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        char[] f = new char[10];
        int i = 0, fim = 0, t = 0, op = 0;
        while (op != 4) {
            op = leitor.nextInt();
            if (op == 1 && t < 10) {
                f[fim] = leitor.next().charAt(0);
                fim = (fim + 1) % 10;
                t++;
            } else if (op == 3 && t > 0) {
                System.out.println(f[i]);
                i = (i + 1) % 10;
                t--;
            }
        }
        leitor.close();
    }
}