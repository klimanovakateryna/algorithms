
package matrix;

public class FloodFill {

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        // IF the starting pixel is already the new color, return the original matrix
        if (image[sr][sc] == newColor)
            return image;

        // CALL the helper method
        fill(image, sr, sc, image[sr][sc], newColor);

        // RETURN the modified matrix
        return image;
    }

    public static void fill(int[][] image, int sr, int sc, int color, int newColor) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != color) {
            return;
        }

        // SET the color of the current index to the new color
        image[sr][sc] = newColor;

        // STORE the coordinates of the neighbors
        int topRowNeighbor = sr - 1;
        int bottomRowNeighbor = sr + 1;
        int leftColumnNeigbour = sc - 1;
        int rightColumnNeighbor = sc + 1;

        // CALL the flood fill algorithm RECURSIVELY
        fill(image, topRowNeighbor, sc, color, newColor);
        fill(image, bottomRowNeighbor, sc, color, newColor);
        fill(image, sr, leftColumnNeigbour, color, newColor);
        fill(image, sr, rightColumnNeighbor, color, newColor);

    }

    //TEST the method
    public static void main(String[] args) {
        int[][] testImage = {
                { 1, 1, 1 },
                { 1, 1, 0 },
                { 1, 0, 1 }
        };

        int sr = 1, sc = 1, newColor = 2;

        System.out.println("Original image: ");

        for (int[] row : testImage) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        int[][] result = floodFill(testImage, sr, sc, newColor);

        System.out.println("\nModified Image: ");

        for (int[] row : result) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
