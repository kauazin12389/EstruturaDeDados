import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] assentos = new int[50];
        int op;

        do {
            op = sc.nextInt();
            switch (op) {
                case 1:
                    reservar(assentos, sc);
                    break;
                case 2:
                    localizarRG(assentos, sc.nextInt());
                    break;
                case 3:
                    assentos[sc.nextInt()] = 0;
                    break;
                case 4:
                    for (int i = 0; i < 50; i++) assentos[i] = 0;
                    break;
            }
        } while (op != 0);
    }

    public static void reservar(int[] a, Scanner s) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                System.out.println("Assento: " + i);
                a[i] = s.nextInt();
                return;
            }
        }
        System.out.println("Lotado");
    }

    public static void localizarRG(int[] a, int rg) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == rg) {
                System.out.println(i);
                return;
            }
        }
    }
}