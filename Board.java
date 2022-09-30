package connectFour;

// Red vs Blue

import connectFour.Player;

public class Board{
   private int size = 8;
   private String[][] board;
   private String nonPlayedPosition = "-";
   private Boolean terminated = false;
   private Player[] players;
   Board(Player player1, Player player2){
      players = new Player[2];
      players[0] = player1;
      players[1] = player2;
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
   
   private Boolean PlayerInGame(Player player){
        for(Player pl:players){
               if (pl == player){
                  return true;
               }
        }
        return false;
   }
   
   public void play(int position,Player player){
      //System.out.println(PlayerInGame(player);
      if (PlayerInGame(player)){
         if (position>=0 && position <8){
            for(int i = 0;i<size;i++){
               if (board[i][position] == nonPlayedPosition ){
                  if (i == size-1){
                     board[i][position] = player.representation;
                     break;
                   }
               }
               if (board[i][position] != nonPlayedPosition){
                     if(i>=1){
                          board[i-1][position] = player.representation;
                          break;
                     }
                  }
            }
         }
         else{
            System.out.println("No in players");
         }
      }
   }


}