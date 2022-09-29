package connectFour;

// Red vs Blue

import connectFour.Player;

public class Board{
   private int size = 8;
   private String[][] board;
   private String nonPlayedPosition = "-";
   Board(){
      board = new String[size][size];
      for(int i = 0;i<size;i++){
           for(int j = 0;j<size;j++){
               board[i][j] = nonPlayedPosition;
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
   
   public void play(int position,Player player){
      if (position>=0 && position <8){
         for(int i = 0;i<size;i++){
            if (board[i][position] == nonPlayedPosition ){
               if (i == size-1){
                  board[i][position] = player.representation;
               }
           }
         }
      }
   }


}