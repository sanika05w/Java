public class TicTacToeBoardPrint
{
    public static void main(String[] args) {
        char[][] b = {{'X', 'O', 'X'}, {' ', 'X', 'O'}, {'O', ' ', 'X'}};
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + b[i][0] + " | " + b[i][1] + " | " + b[i][2]);
            if (i < 2) System.out.println("---+---+---");
        }
    }
}
