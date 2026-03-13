import java.util.Scanner;

public class Ex79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] v = new char[5];
        for (int i = 0; i < 5; i++) v[i] = sc.next().charAt(0);
        mergeSort(v, 0, 4);
        for (char c : v) System.out.print(c + " ");
    }

    public static void mergeSort(char[] v, int e, int d) {
        if (e < d) {
            int m = (e + d) / 2;
            mergeSort(v, e, m);
            mergeSort(v, m + 1, d);
            merge(v, e, m, d);
        }
    }

    public static void merge(char[] v, int e, int m, int d) {
        int n1 = m - e + 1;
        int n2 = d - m;
        char[] L = new char[n1];
        char[] R = new char[n2];
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