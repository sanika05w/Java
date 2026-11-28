public class HollowRectangle
{
    public static void main(String[] args) {
        int rows = 5, cols = 9;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) System.out.print((i == 0 || i == rows - 1 || j == 0 || j == cols - 1) ? "*" : " ");
            System.out.println();
        }
    }
}
