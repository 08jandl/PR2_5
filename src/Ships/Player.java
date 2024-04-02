package Ships;

import java.util.Arrays;
import java.util.Random;

public class Player {
    Random random = new Random();
    private char[][] myBoard = new char[10][10];
    private char[][] opponentBoard = fillBoardWithWater();

    public char[][] fillBoardWithWater () {
        for (char[] chars : myBoard) {
            Arrays.fill(chars, 'W');
        }
        return myBoard;
    }

    public char[][] setShipOnBoard(char[] ship, boolean horizontal) {
        myBoard = fillBoardWithWater();
        for (int i = 0; i < myBoard.length; i++) {
            for (int j = 0; j < myBoard[i].length; j++) {
                int x = random.nextInt(0,9);
                int y = random.nextInt(0,9);
                if (checkIfFree(horizontal, ship, x, y)) {
                    myBoard[x][y] = 'S';
                }
            }
        }
        return myBoard;
    }

    public boolean checkIfFree(boolean horizontal, char[] ship, int x, int y) {
        if (horizontal) {
            for (int k = 0; k < ship.length; k++) {
                x = x + k;
                if (myBoard[x][y] == 'W') {
                    if (myBoard[x][y + 1] == 'W' && myBoard[x][y-1] == 'W'){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
