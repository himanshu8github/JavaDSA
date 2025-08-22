package BitManipulation;

public class FlipImage {
    public static void main(String[] args) {

        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        Solution sol = new Solution();
        int[][] result = sol.flipAndInvertImage(image);
        System.out.println("Flipped & Inverted Image:");
        printMatrix(result);

    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

// Your Solution class
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;

        for (int[] row : image) {
            for (int i = 0; i <= (n - 1) / 2; i++) {
                int j = n - 1 - i;

                // Invert both sides
                int left = row[i] ^ 1;
                int right = row[j] ^ 1;

                // Swap while placing inverted values
                row[i] = right;
                row[j] = left;
            }
        }
        return image;
    }
}
