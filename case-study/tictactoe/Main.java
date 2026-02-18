import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String gameBoard[][] = initGameBoard();
        String currPlayer = "X";
        boolean gameOver = false;

        while(!gameOver){
            display(gameBoard);
            System.out.print(currPlayer+"'s chance to play : ");
            int box = sc.nextInt();
            gameBoard = fillGameBoard(gameBoard, box, currPlayer);
            String winner = findWinner(gameBoard);
            if(winner.equals("X") || winner.equals("O")){
                System.out.println(winner+" has won the game!");
                display(gameBoard);
                gameOver = true;
            }else{
                if(checkForDraw(gameBoard)){
                    System.out.println("DRAW!");
                    System.exit(0);
                }
                else if(currPlayer.equals("X")){
                    currPlayer = "O";
                }else if(currPlayer.equals("O")){
                    currPlayer = "X";
                }
            }
        }
    }

    static String[][] initGameBoard(){
        String[][] gameBoard = new String[3][3];
        int num = 1;
        for(int i = 0; i<3; i++){
            for(int j = 0;j<3; j++){
                gameBoard[i][j] = String.valueOf(num++);
            }
        }
        return gameBoard;
    }

    static void display(String[][] gameBoard){
        System.out.println("-----------------");
        for(int i = 0; i<3; i++){
            for(int j = 0;j<3; j++){
                System.out.print("| "+gameBoard[i][j]+" | ");
            }
            System.out.println();
        }
        System.out.println("-----------------");
    }

    static String[][] fillGameBoard(String[][] gameBoard, int num, String sign){
        for(int i = 0; i<3; i++){
            for(int j = 0;j<3; j++){
                try{
                    if(Integer.parseInt(gameBoard[i][j])==num){
                        gameBoard[i][j] = sign;
                    }
                }catch(NumberFormatException e){
                    continue;
                }
            }
        }
        return gameBoard;
    }

    static String findWinner(String[][] gameBoard){
        String winner = "";
        String diag1[] = new String[3];
        int diag1Index = 0;
        String diag2[] = new String[3];
        int diag2Index = 0;
        for(int i = 0; i<3; i++){
            String rowArr[] = new String[3];
            String colArr[] = new String[3];
            int colIndex = 0;
            System.arraycopy(gameBoard[i], 0, rowArr, 0, 3);
            boolean allRowEqual = Arrays.stream(rowArr).allMatch(n -> n.equals(rowArr[0]));
            
            for(int j = 0; j<3; j++){
                colArr[colIndex++] = gameBoard[j][i];

                if(i==j){
                    diag1[diag1Index++] = gameBoard[i][j];
                }else if((i+j)==2){
                    diag2[diag2Index++] = gameBoard[i][j];
                }

            }
            boolean allColEqual = Arrays.stream(colArr).allMatch(n -> n.equals(colArr[0]));

            if(allRowEqual){
                winner = rowArr[0];
            }else if(allColEqual){
                winner = colArr[0];
            }
        }
        boolean diag1Equal = Arrays.stream(diag1).allMatch(n -> n.equals(diag1[0]));
        boolean diag2Equal = Arrays.stream(diag2).allMatch(n -> n.equals(diag2[0]));

        if(diag1Equal){
            winner = diag1[0];
        }else if(diag2Equal){
            winner = diag2[0];
        }

        return winner;
    }

    static boolean checkForDraw(String[][] gameBoard){
        int filledBoxes = 0;
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                if(gameBoard[i][j].equals("X") || gameBoard[i][j].equals("O")){
                    ++filledBoxes;
                }
            }
        }
        if(filledBoxes==9){
            return true;
        }
        return false;
    }
}