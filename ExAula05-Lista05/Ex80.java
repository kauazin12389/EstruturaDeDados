import java.util.Scanner;

public class Ex80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) v[i] = sc.nextInt();
        mergeSort(v, 0, n - 1);
        for (int i : v) System.out.print(i + " ");
    }

    public static void mergeSort(int[] v, int e, int d) {
        if (e < d) {
            int m = (e + d) / 2;
            mergeSort(v, e, m);
            mergeSort(v, m + 1, d);
            merge(v, e, m, d);
        }
    }

    public static void merge(int[] v, int e, int m, int d) {
        int n1 = m - e + 1;
        int n2 = d - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++) L[i] = v[e + i];
        for (int j = 0; j < n2; j++) R[j] = v[m + 1 + j];
        int i = 0, j = 0, k = e;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) { v[k] = L[i]; i++; }
            else { v[k] = R[j]; j++; }
            k++;
        }
        while (i < n1) { v[k] = L[i]; i++; k++; }
        while (j < n2) { v[k] = R[j]; j++; k++; }
    }
}