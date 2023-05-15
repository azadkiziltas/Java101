package pratik.MatrisTranspose;

public class MatrisTranspose {

  public static void main(String[] args) {
    int[][] matris = { { 1, 2, 3 }, { 4, 5, 6 } };
    int row = matris.length;
    int col = matris[0].length;

    int[][] transposeMatris = new int[col][row];

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        transposeMatris[j][i] = matris[i][j];
      }
    }

    // Transpoze matrisini yazdırma
    for (int i = 0; i < col; i++) {
      for (int j = 0; j < row; j++) {
        System.out.print(transposeMatris[i][j] + " ");
      }
      System.out.println();
    }
  }
}
