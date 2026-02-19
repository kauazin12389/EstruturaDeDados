public class Ex6 {
    static final int LINHAS = 5;
    static final int COLUNAS = 5;
    static int[][] matriz = new int[LINHAS][COLUNAS];

    public static void main(String[] args) {
        
        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                matriz[i][j] = -1;
            }
        }

        int r = 0;
        while (r < LINHAS) {
            int c = 0;
            while (c < COLUNAS) {
                matriz[r][c] = -1;
                c++;
            }
            r++;
        }

        int row = 0;
        do {
            int col = 0;
            do {
                matriz[row][col] = -1;
                col++;
            } while (col < COLUNAS);
            row++;
        } while (row < LINHAS);

        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}