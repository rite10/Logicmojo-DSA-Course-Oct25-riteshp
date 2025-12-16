import java.util.*;

public class MatrixLayerRotation {

    public static void matrixRotation(int[][] matrix, int r) {
        int m = matrix.length;
        int n = matrix[0].length;

        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {

            List<Integer> elements = new ArrayList<>();

            int top = layer;
            int bottom = m - 1 - layer;
            int left = layer;
            int right = n - 1 - layer;

            // top row
            for (int j = left; j <= right; j++)
                elements.add(matrix[top][j]);

            // right column
            for (int i = top + 1; i <= bottom; i++)
                elements.add(matrix[i][right]);

            // bottom row
            for (int j = right - 1; j >= left; j--)
                elements.add(matrix[bottom][j]);

            // left column
            for (int i = bottom - 1; i > top; i--)
                elements.add(matrix[i][left]);

            int len = elements.size();
            int rot = r % len;

            // Rotate the elements
            Collections.rotate(elements, -rot); 

            // Put back rotated values into matrix
            int idx = 0;

            // top row
            for (int j = left; j <= right; j++)
                matrix[top][j] = elements.get(idx++);

            // right column
            for (int i = top + 1; i <= bottom; i++)
                matrix[i][right] = elements.get(idx++);

            // bottom row
            for (int j = right - 1; j >= left; j--)
                matrix[bottom][j] = elements.get(idx++);

            // left column
            for (int i = bottom - 1; i > top; i--)
                matrix[i][left] = elements.get(idx++);
        }

        // print the rotated matrix
        for (int[] row : matrix) {
            for (int v : row) System.out.print(v + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        matrixRotation(matrix, r);
    }
}
