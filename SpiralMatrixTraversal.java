import java.util.Scanner;

public class SpiralMatrixTraversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        printSpiralOrder(matrix, n);
    }

    public static void printSpiralOrder(int[][] matrix, int n) {
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        StringBuilder result = new StringBuilder();

        while (top <= bottom && left <= right) {
           
            for (int i = left; i <= right; i++) {
                result.append(matrix[top][i]).append(" ");
            }
            top++;
            
            for (int i = top; i <= bottom; i++) {
                result.append(matrix[i][right]).append(" ");
            }
            right--;
            
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.append(matrix[bottom][i]).append(" ");
                }
                bottom--;
            }
           
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.append(matrix[i][left]).append(" ");
                }
                left++;
            }
        }
        System.out.println(result.toString().trim());
    }
}
