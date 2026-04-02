import java.util.Scanner;
public class Ex17 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        char[] f = new char[10];
        int i = 9, fim = 9, t = 0, op = 0;
        while (op != 4) {
            op = leitor.nextInt();
            if (op == 1 && t < 10) {
                f[fim] = leitor.next().charAt(0);
                fim = (fim == 0) ? 9 : fim - 1;
                t++;
            } else if (op == 3 && t > 0) {
                System.out.println(f[i]);
                i = (i == 0) ? 9 : i - 1;
                t--;
            }
        }
        leitor.close();
    }
}