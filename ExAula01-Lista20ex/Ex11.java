import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Valor de a: ");
        double a = leitor.nextDouble();
        System.out.print("Valor de b: ");
        double b = leitor.nextDouble();
        System.out.print("Valor de c: ");
        double c = leitor.nextDouble();

        double delta = calcularDelta(a, b, c);
        System.out.println("Delta: " + delta);

        if (delta < 0) {
            System.out.println("Raizes imaginarias.");
        } else if (delta == 0) {
            System.out.println("Raizes reais iguais.");
            System.out.println("x1 = x2 = " + calcularRaiz1(a, b, delta));
        } else {
            System.out.println("Raizes reais diferentes.");
            System.out.println("x1 = " + calcularRaiz1(a, b, delta));
            System.out.println("x2 = " + calcularRaiz2(a, b, delta));
        }

        leitor.close();
    }

    public static double calcularDelta(double a, double b, double c) {
        return (b * b) - (4 * a * c);
    }

    public static double calcularRaiz1(double a, double b, double delta) {
        return (-b + Math.sqrt(delta)) / (2 * a);
    }

    public static double calcularRaiz2(double a, double b, double delta) {
        return (-b - Math.sqrt(delta)) / (2 * a);
    }
}