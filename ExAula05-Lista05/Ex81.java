import java.util.Scanner;

public class Ex81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] v = new double[20];
        for (int i = 0; i < 20; i++) v[i] = sc.nextDouble();
        mergeSort(v, 0, 19);
        for (double d : v) System.out.print(d + " ");
    }

    public static void mergeSort(double[] v, int e, int d) {
        if (e < d) {
            int m = (e + d) / 2;
            mergeSort(v, e, m);
            mergeSort(v, m + 1, d);
            merge(v, e, m, d);
        }
    }

    public static void merge(double[] v, int e, int m, int d) {
        int n1 = m - e + 1;
        int n2 = d - m;
        double[] L = new double[n1];
        double[] R = new double[n2];
        for (int i = 0; i < n1; i++) L[i] = v[e + i];
        for (int j = 0; j < n2; j++) R[j] = v[m + 1 + j];
        int i = 0, j = 0, k = e;
        while (i < n1 && j < n2) {
            if (L[i] >= R[j]) { v[k] = L[i]; i++; }
            else { v[k] = R[j]; j++; }
            k++;
        }
        while (i < n1) { v[k] = L[i]; i++; k++; }
        while (j < n2) { v[k] = R[j]; j++; k++; }
    }
}