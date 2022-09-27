package connectFour;

public class Board{
   private int size = 8;
   private String[][] board;
   Board(){
      board = new String[size][size];
      for(int i = 0;i<size;i++){
           for(int j = 0;j<size;j++){
               board[i][j] = "-";
           }
      }
   }
   public void print(){
       for(int i = 0;i<size;i++){
           for(int j = 0;j<size;j++){
               System.out.print(board[i][j] + " ");
           }
           System.out.println("");
      }        
   }


}