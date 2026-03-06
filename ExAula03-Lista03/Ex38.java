import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] v = new double[10];
        for (int i = 0; i < 10; i++) v[i] = sc.nextDouble();
        double busca = sc.nextDouble();
        
        int maiorIndice = -1;
        for (int i = 0; i < 10; i++) {
            if (v[i] == busca) maiorIndice = i;
        }
        System.out.println(maiorIndice);
    }
}
